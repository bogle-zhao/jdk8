/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 1996, 2000, Oracle and/or its affiliates. All rights reserved.
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

package java.awt;

import java.awt.event.*;

/**
 * The interface for objects which contain a set of items for
 * which zero or more can be selected.
 *
 * <p>
 *  包含可以选择零个或多个项目的一组项目的对象的界面。
 * 
 * 
 * @author Amy Fowler
 */

public interface ItemSelectable {

    /**
     * Returns the selected items or <code>null</code> if no
     * items are selected.
     * <p>
     *  如果未选择任何项目,则返回所选项目或<code> null </code>。
     * 
     */
    public Object[] getSelectedObjects();

    /**
     * Adds a listener to receive item events when the state of an item is
     * changed by the user. Item events are not sent when an item's
     * state is set programmatically.  If <code>l</code> is
     * <code>null</code>, no exception is thrown and no action is performed.
     *
     * <p>
     *  添加监听器以在用户更改项目的状态时接收项目事件。当以编程方式设置项目的状态时,不会发送项目事件。
     * 如果<code> l </code>是<code> null </code>,则不抛出异常,并且不执行任何操作。
     * 
     * 
     * @param    l the listener to receive events
     * @see ItemEvent
     */
    public void addItemListener(ItemListener l);

    /**
     * Removes an item listener.
     * If <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     *
     * <p>
     * 
     * @param   l the listener being removed
     * @see ItemEvent
     */
    public void removeItemListener(ItemListener l);
}