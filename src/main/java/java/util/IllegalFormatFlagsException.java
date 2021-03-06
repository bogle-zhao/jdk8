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

package java.util;

/**
 * Unchecked exception thrown when an illegal combination flags is given.
 *
 * <p> Unless otherwise specified, passing a <tt>null</tt> argument to any
 * method or constructor in this class will cause a {@link
 * NullPointerException} to be thrown.
 *
 * <p>
 *  当给出非法组合标志时抛出未经检查的异常。
 * 
 *  <p>除非另有说明,否则将<tt> null </tt>参数传递给此类中的任何方法或构造函数都会导致抛出{@link NullPointerException}。
 * 
 * 
 * @since 1.5
 */
public class IllegalFormatFlagsException extends IllegalFormatException {

    private static final long serialVersionUID = 790824L;

    private String flags;

    /**
     * Constructs an instance of this class with the specified flags.
     *
     * <p>
     *  构造具有指定标志的此类的实例。
     * 
     * 
     * @param  f
     *         The set of format flags which contain an illegal combination
     */
    public IllegalFormatFlagsException(String f) {
        if (f == null)
            throw new NullPointerException();
        this.flags = f;
    }

    /**
     * Returns the set of flags which contains an illegal combination.
     *
     * <p>
     *  返回包含非法组合的标志集。
     * 
     * @return  The flags
     */
    public String getFlags() {
        return flags;
    }

    public String getMessage() {
        return "Flags = '" + flags + "'";
    }
}
