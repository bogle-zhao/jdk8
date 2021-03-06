/***** Lobxxx Translate Finished ******/
package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/CurrentOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Thursday, April 30, 2015 12:42:09 PM PDT
*/


/**
   * Portable Interceptors Current (also known as <code>PICurrent</code>) 
   * is merely a slot table, the slots of which are used by each service to 
   * transfer their context data between their context and the request's or 
   * reply's service context. Each service which wishes to use PICurrent 
   * reserves a slot or slots at initialization time and uses those slots 
   * during the processing of requests and replies.
   * <p>
   * Before an invocation is made, PICurrent is obtained via a call to 
   * <code>ORB.resolve_initial_references( "PICurrent" )</code>. From within 
   * the interception points, the data on PICurrent that has moved from the 
   * thread scope to the request scope is available via the 
   * <code>get_slot</code> operation on the <code>RequestInfo</code> object. 
   * A PICurrent can still be obtained via 
   * <code>resolve_initial_references</code>, but that is the Interceptor's 
   * thread scope PICurrent.
   * <p>
   *  便携式拦截器当前(也称为<code> PICurrent </code>)仅仅是一个时隙表,其时隙由每个服务用于在其上下文和请求或应答的服务上下文之间传输其上下文数据。
   * 希望使用PICurrent的每个服务在初始化时保留一个或多个插槽,并在处理请求和回复期间使用这些插槽。
   * <p>
   *  在进行调用之前,通过调用<code> ORB.resolve_initial_references("PICurrent")</code>获得PICurrent。
   * 在截取点内,PICurrent上从线程范围移动到请求范围的数据可通过<code> RequestInfo </code>对象上的<code> get_slot </code>操作获得。
   *  PICurrent仍然可以通过<code> resolve_initial_references </code>获取,但这是Interceptor的线程作用域PICurrent。
   * 
   */
public interface CurrentOperations  extends org.omg.CORBA.CurrentOperations
{

  /**
     * Retrieves the slot data the application set in PICurrent via 
     * <code>get_slot</code>.  The data is in the form of an Any. 
     * <p>
     * If the given slot has not been set, an Any containing a type code 
     * with a <code>TCKind</code> value of <code>tk_null</code> and no value 
     * is returned. 
     *
     * <p>
     *  通过<code> get_slot </code>检索PICurrent中设置的应用程序的插槽数据。数据以Any的形式。
     * <p>
     *  如果未设置给定时隙,则包含具有<code> TCKind </code>值<code> tk_null </code>的类型代码且不返回任何值的Any包含在内。
     * 
     * 
     * @param id The <code>SlotId</code> of the slot from which the data will 
     *     be returned. 
     * @return The data, in the form of an Any, of the given slot identifier.
     * @exception InvalidSlot thrown if get_slot is called on a slot that 
     *     has not been allocated. 
     * @exception BAD_INV_ORDER thrown if <code>get_slot</code> is called 
     *     from within an ORB initializer 
     */
  org.omg.CORBA.Any get_slot (int id) throws org.omg.PortableInterceptor.InvalidSlot;

  /**
     * Sets data in a slot. The data is in the form of an Any. If data 
     * already exists in that slot, it is overridden. 
     *
     * <p>
     * 
     * @param id The <code>SlotId</code> of the slot to which the data will 
     *     be set. 
     * @param data The data, in the form of an Any, which will be set 
     *     to the identified slot. 
     * @exception InvalidSlot thrown if <code>set_slot</code> is called on 
     *     a slot that has not been allocated.
     * @exception BAD_INV_ORDER thrown if <code>set_slot</code> is called 
     *     from within an ORB initializer. 
     */
  void set_slot (int id, org.omg.CORBA.Any data) throws org.omg.PortableInterceptor.InvalidSlot;
} // interface CurrentOperations
