/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2003, 2005, Oracle and/or its affiliates. All rights reserved.
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

package javax.xml.xpath;

/**
 * <code>XPathFunctionException</code> represents an error with an XPath function.</p>
 *
 * <p>
 *  <code> XPathFunctionException </code>表示XPath函数的错误</p>
 * 
 * 
 * @author  <a href="mailto:Norman.Walsh@Sun.com">Norman Walsh</a>
 * @author  <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 * @since 1.5
 */
public class XPathFunctionException extends XPathExpressionException {

    /**
     * <p>Stream Unique Identifier.</p>
     * <p>
     *  <p>流唯一标识符</p>
     * 
     */
    private static final long serialVersionUID = -1837080260374986980L;

    /**
     * <p>Constructs a new <code>XPathFunctionException</code> with the specified detail <code>message</code>.</p>
     *
     * <p>The <code>cause</code> is not initialized.</p>
     *
     * <p>If <code>message</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * <p>
     *  <p>使用指定的详细信息<code> message </code>构造新的<code> XPathFunctionException </code> </p>
     * 
     *  <p> <code>原因</code>未初始化</p>
     * 
     *  <p>如果<code> message </code>是<code> null </code>,则会抛出<code> NullPointerException </code> </p>
     * 
     * 
     * @param message The detail message.
     *
     * @throws NullPointerException When <code>message</code> is
     *   <code>null</code>.
     */
    public XPathFunctionException(String message) {
        super(message);
    }

    /**
     * <p>Constructs a new <code>XPathFunctionException</code> with the specified <code>cause</code>.</p>
     *
     * <p>If <code>cause</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * <p>
     * 
     * @param cause The cause.
     *
     * @throws NullPointerException if <code>cause</code> is <code>null</code>.
     */
    public XPathFunctionException(Throwable cause) {
        super(cause);
    }
}
