/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2011, 2013, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.source.doctree;

/**
 * An embedded HTML comment.
 *
 * <p>
 * {@literal <!-- text --> }
 *
 * <p>
 *  嵌入式HTML注释。
 * 
 * <p>
 * 
 * @since 1.8
 */
@jdk.Exported
public interface CommentTree extends DocTree {
    String getBody();
}

