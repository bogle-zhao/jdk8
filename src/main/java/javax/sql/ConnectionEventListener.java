/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2000, 2001, Oracle and/or its affiliates. All rights reserved.
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

package javax.sql;

/**
 * <P>
 * An object that registers to be notified of events generated by a
 * <code>PooledConnection</code> object.
 * <P>
 * The <code>ConnectionEventListener</code> interface is implemented by a
 * connection pooling component.  A connection pooling component will
 * usually be provided by a JDBC driver vendor or another system software
 * vendor.  A JDBC driver notifies a <code>ConnectionEventListener</code>
 * object when an application is finished using a pooled connection with
 * which the listener has registered.  The notification
 * occurs after the application calls the method <code>close</code> on
 * its representation of a <code>PooledConnection</code> object.  A
 * <code>ConnectionEventListener</code> is also notified when a
 * connection error occurs due to the fact that the <code>PooledConnection</code>
 * is unfit for future use---the server has crashed, for example.
 * The listener is notified by the JDBC driver just before the driver throws an
 * <code>SQLException</code> to the application using the
 * <code>PooledConnection</code> object.
 *
 * <p>
 * <P>
 *  注册要通知由<code> PooledConnection </code>对象生成的事件的对象。
 * <P>
 *  <code> ConnectionEventListener </code>接口由连接池组件实现。连接池组件通常由JDBC驱动程序供应商或另一个系统软件供应商提供。
 * 当应用程序完成使用侦听器已注册的池连接时,JDBC驱动程序通知<code> ConnectionEventListener </code>对象。
 * 通知发生在应用程序在<code> PooledConnection </code>对象的表示上调用<code> close </code>方法之后。
 * 当发生连接错误时,由于<code> PooledConnection </code>不适合将来使用---例如服务器已崩溃,因此也会通知<code> ConnectionEventListener </code>
 * 。
 * 通知发生在应用程序在<code> PooledConnection </code>对象的表示上调用<code> close </code>方法之后。
 * 
 * @since 1.4
 */

public interface ConnectionEventListener extends java.util.EventListener {

  /**
   * Notifies this <code>ConnectionEventListener</code> that
   * the application has called the method <code>close</code> on its
   * representation of a pooled connection.
   *
   * <p>
   * 在驱动程序使用<code> PooledConnection </code>对象向应用程序抛出<code> SQLException </code>之前,JDBC驱动程序会通知侦听器。
   * 
   * 
   * @param event an event object describing the source of
   * the event
   */
  void connectionClosed(ConnectionEvent event);

  /**
   * Notifies this <code>ConnectionEventListener</code> that
   * a fatal error has occurred and the pooled connection can
   * no longer be used.  The driver makes this notification just
   * before it throws the application the <code>SQLException</code>
   * contained in the given <code>ConnectionEvent</code> object.
   *
   * <p>
   *  通知此<code> ConnectionEventListener </code>,应用程序已在池表示的连接上调用<code> close </code>方法。
   * 
   * 
   * @param event an event object describing the source of
   * the event and containing the <code>SQLException</code> that the
   * driver is about to throw
   */
  void connectionErrorOccurred(ConnectionEvent event);

 }
