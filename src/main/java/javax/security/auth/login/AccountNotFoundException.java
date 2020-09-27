/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2003, Oracle and/or its affiliates. All rights reserved.
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

package javax.security.auth.login;

/**
 * Signals that an account was not found.
 *
 * <p> This exception may be thrown by a LoginModule if it is unable
 * to locate an account necessary to perform authentication.
 *
 * <p>
 *  表示找不到帐户。
 * 
 *  <p>如果LoginModule无法找到执行身份验证所需的帐户,则可能会抛出此异常。
 * 
 * 
 * @since 1.5
 */
public class AccountNotFoundException extends AccountException {

    private static final long serialVersionUID = 1498349563916294614L;

    /**
     * Constructs a AccountNotFoundException with no detail message.
     * A detail message is a String that describes this particular exception.
     * <p>
     *  构造一个没有详细消息的AccountNotFoundException。详细消息是描述此特殊异常的字符串。
     * 
     */
    public AccountNotFoundException() {
        super();
    }

    /**
     * Constructs a AccountNotFoundException with the specified
     * detail message. A detail message is a String that describes
     * this particular exception.
     *
     * <p>
     *
     * <p>
     *  构造具有指定详细消息的AccountNotFoundException。详细消息是描述此特殊异常的字符串。
     * 
     * 
     * @param msg the detail message.
     */
    public AccountNotFoundException(String msg) {
        super(msg);
    }
}
