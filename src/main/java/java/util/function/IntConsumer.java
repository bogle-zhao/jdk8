/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2010, 2013, Oracle and/or its affiliates. All rights reserved.
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
package java.util.function;

import java.util.Objects;

/**
 * Represents an operation that accepts a single {@code int}-valued argument and
 * returns no result.  This is the primitive type specialization of
 * {@link Consumer} for {@code int}.  Unlike most other functional interfaces,
 * {@code IntConsumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(int)}.
 *
 * <p>
 *  表示接受单个{@code int}值参数并且不返回结果的操作。这是{@link消费者}的{@code int}的原始类型专门化。
 * 与大多数其他功能接口不同,{@code IntConsumer}预计通过副作用操作。
 * 
 *  <p>这是一个<a href="package-summary.html">功能介面</a>,其功能方法为{@link #accept(int)}。
 * 
 * 
 * @see Consumer
 * @since 1.8
 */
@FunctionalInterface
public interface IntConsumer {

    /**
     * Performs this operation on the given argument.
     *
     * <p>
     *  对给定的参数执行此操作。
     * 
     * 
     * @param value the input argument
     */
    void accept(int value);

    /**
     * Returns a composed {@code IntConsumer} that performs, in sequence, this
     * operation followed by the {@code after} operation. If performing either
     * operation throws an exception, it is relayed to the caller of the
     * composed operation.  If performing this operation throws an exception,
     * the {@code after} operation will not be performed.
     *
     * <p>
     *  返回一个组成的{@code IntConsumer},按顺序执行此操作,然后执行{@code after}操作。如果执行任一操作抛出异常,则将其中继到组合操作的调用者。
     * 如果执行此操作抛出异常,将不会执行{@code after}操作。
     * 
     * @param after the operation to perform after this operation
     * @return a composed {@code IntConsumer} that performs in sequence this
     * operation followed by the {@code after} operation
     * @throws NullPointerException if {@code after} is null
     */
    default IntConsumer andThen(IntConsumer after) {
        Objects.requireNonNull(after);
        return (int t) -> { accept(t); after.accept(t); };
    }
}
