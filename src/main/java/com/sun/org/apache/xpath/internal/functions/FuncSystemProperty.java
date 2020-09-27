/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2007, 2015, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
/*
 * Copyright 1999-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 *  版权所有1999-2004 Apache软件基金会。
 * 
 *  根据Apache许可证2.0版("许可证")授权;您不能使用此文件,除非符合许可证。您可以通过获取许可证的副本
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  除非适用法律要求或书面同意,否则根据许可证分发的软件按"原样"分发,不附带任何明示或暗示的担保或条件。请参阅管理许可证下的权限和限制的特定语言的许可证。
 * 
 */
/*
 * $Id: FuncSystemProperty.java,v 1.2.4.2 2005/09/14 20:18:45 jeffsuttor Exp $
 * <p>
 *  $ Id：FuncSystemProperty.java,v 1.2.4.2 2005/09/14 20:18:45 jeffsuttor Exp $
 * 
 */
package com.sun.org.apache.xpath.internal.functions;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.sun.org.apache.xpath.internal.XPathContext;
import com.sun.org.apache.xpath.internal.objects.XNumber;
import com.sun.org.apache.xpath.internal.objects.XObject;
import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.res.XPATHErrorResources;
import com.sun.org.apache.xalan.internal.utils.ObjectFactory;
import com.sun.org.apache.xalan.internal.utils.SecuritySupport;

/**
 * Execute the SystemProperty() function.
 * @xsl.usage advanced
 * <p>
 *  执行SystemProperty()函数。 @ xsl.usage advanced
 * 
 */
public class FuncSystemProperty extends FunctionOneArg
{
    static final long serialVersionUID = 3694874980992204867L;
  /**
   * The path/filename of the property file: XSLTInfo.properties
   * Maintenance note: see also
   * com.sun.org.apache.xalan.internal.processor.TransformerFactoryImpl.XSLT_PROPERTIES
   * <p>
   *  属性文件的路径/文件名：XSLTInfo.properties维护说明：另请参见com.sun.org.apache.xalan.internal.processor.TransformerFacto
   * ryImpl.XSLT_PROPERTIES。
   * 
   */
  static final String XSLT_PROPERTIES =
            "com/sun/org/apache/xalan/internal/res/XSLTInfo.properties";

  /**
   * Execute the function.  The function must return
   * a valid object.
   * <p>
   *  执行该功能。函数必须返回有效的对象。
   * 
   * 
   * @param xctxt The current execution context.
   * @return A valid XObject.
   *
   * @throws javax.xml.transform.TransformerException
   */
  public XObject execute(XPathContext xctxt) throws javax.xml.transform.TransformerException
  {

    String fullName = m_arg0.execute(xctxt).str();
    int indexOfNSSep = fullName.indexOf(':');
    String result;
    String propName = "";

    // List of properties where the name of the
    // property argument is to be looked for.
    Properties xsltInfo = new Properties();

    loadPropertyFile(XSLT_PROPERTIES, xsltInfo);

    if (indexOfNSSep > 0)
    {
      String prefix = (indexOfNSSep >= 0)
                      ? fullName.substring(0, indexOfNSSep) : "";
      String namespace;

      namespace = xctxt.getNamespaceContext().getNamespaceForPrefix(prefix);
      propName = (indexOfNSSep < 0)
                 ? fullName : fullName.substring(indexOfNSSep + 1);

      if (namespace.startsWith("http://www.w3.org/XSL/Transform")
              || namespace.equals("http://www.w3.org/1999/XSL/Transform"))
      {
        result = xsltInfo.getProperty(propName);

        if (null == result)
        {
          warn(xctxt, XPATHErrorResources.WG_PROPERTY_NOT_SUPPORTED,
               new Object[]{ fullName });  //"XSL Property not supported: "+fullName);

          return XString.EMPTYSTRING;
        }
      }
      else
      {
        warn(xctxt, XPATHErrorResources.WG_DONT_DO_ANYTHING_WITH_NS,
             new Object[]{ namespace,
                           fullName });  //"Don't currently do anything with namespace "+namespace+" in property: "+fullName);

        try
        {
          result = SecuritySupport.getSystemProperty(propName);

          if (null == result)
          {

            // result = System.getenv(propName);
            return XString.EMPTYSTRING;
          }
        }
        catch (SecurityException se)
        {
          warn(xctxt, XPATHErrorResources.WG_SECURITY_EXCEPTION,
               new Object[]{ fullName });  //"SecurityException when trying to access XSL system property: "+fullName);

          return XString.EMPTYSTRING;
        }
      }
    }
    else
    {
      try
      {
        result = SecuritySupport.getSystemProperty(fullName);

        if (null == result)
        {

          // result = System.getenv(fullName);
          return XString.EMPTYSTRING;
        }
      }
      catch (SecurityException se)
      {
        warn(xctxt, XPATHErrorResources.WG_SECURITY_EXCEPTION,
             new Object[]{ fullName });  //"SecurityException when trying to access XSL system property: "+fullName);

        return XString.EMPTYSTRING;
      }
    }

    if (propName.equals("version") && result.length() > 0)
    {
      try
      {
        // Needs to return the version number of the spec we conform to.
        return new XString("1.0");
      }
      catch (Exception ex)
      {
        return new XString(result);
      }
    }
    else
      return new XString(result);
  }

  /**
   * Retrieve a propery bundle from a specified file
   *
   * <p>
   *  从指定的文件检索属性包
   * 
   * @param file The string name of the property file.  The name
   * should already be fully qualified as path/filename
   * @param target The target property bag the file will be placed into.
   */
  public void loadPropertyFile(String file, Properties target)
  {
    try
    {
      // Use SecuritySupport class to provide priveleged access to property file
      InputStream is = SecuritySupport.getResourceAsStream(ObjectFactory.findClassLoader(),
                                              file);

      // get a buffered version
      BufferedInputStream bis = new BufferedInputStream(is);

      target.load(bis);  // and load up the property bag from this
      bis.close();  // close out after reading
    }
    catch (Exception ex)
    {
      // ex.printStackTrace();
      throw new com.sun.org.apache.xml.internal.utils.WrappedRuntimeException(ex);
    }
  }
}
