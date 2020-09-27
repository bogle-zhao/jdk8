/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2005, 2010, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javax.xml.ws.handler.soap;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.Handler;
import java.util.Set;

/** The <code>SOAPHandler</code> class extends <code>Handler</code>
 *  to provide typesafety for the message context parameter and add a method
 *  to obtain access to the headers that may be processed by the handler.
 *
 * <p>
 *  为消息上下文参数提供类型安全,并添加一个方法来获取对可由处理程序处理的标头的访问。
 * 
 * 
 *  @since JAX-WS 2.0
**/
public interface SOAPHandler<T extends SOAPMessageContext>
    extends Handler<T> {

  /** Gets the header blocks that can be processed by this Handler
   *  instance.
   *
   * <p>
   *  实例。
   * 
   *  @return Set of <code>QNames</code> of header blocks processed by this
   *           handler instance. <code>QName</code> is the qualified
   *           name of the outermost element of the Header block.
  **/
  Set<QName> getHeaders();
}