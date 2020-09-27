/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 1996, 1998, Oracle and/or its affiliates. All rights reserved.
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
package java.rmi;

/**
 * A <code>NotBoundException</code> is thrown if an attempt
 * is made to lookup or unbind in the registry a name that has
 * no associated binding.
 *
 * <p>
 *  如果尝试在注册表中查找或取消绑定没有关联绑定的名称,则会抛出<code> NotBoundException </code>。
 * 
 * 
 * @since   JDK1.1
 * @author  Ann Wollrath
 * @author  Roger Riggs
 * @see     java.rmi.Naming#lookup(String)
 * @see     java.rmi.Naming#unbind(String)
 * @see     java.rmi.registry.Registry#lookup(String)
 * @see     java.rmi.registry.Registry#unbind(String)
 */
public class NotBoundException extends java.lang.Exception {

    /* indicate compatibility with JDK 1.1.x version of class */
    private static final long serialVersionUID = -1857741824849069317L;

    /**
     * Constructs a <code>NotBoundException</code> with no
     * specified detail message.
     * <p>
     *  构造一个没有指定详细消息的<code> NotBoundException </code>。
     * 
     * 
     * @since JDK1.1
     */
    public NotBoundException() {
        super();
    }

    /**
     * Constructs a <code>NotBoundException</code> with the specified
     * detail message.
     *
     * <p>
     *  用指定的详细消息构造一个<code> NotBoundException </code>。
     * 
     * @param s the detail message
     * @since JDK1.1
     */
    public NotBoundException(String s) {
        super(s);
    }
}
