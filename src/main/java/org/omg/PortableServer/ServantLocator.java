/***** Lobxxx Translate Finished ******/
package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantLocator.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, April 30, 2015 12:42:10 PM PDT
*/


/**
	 * When the POA has the NON_RETAIN policy it uses servant 
	 * managers that are ServantLocators. Because the POA 
	 * knows that the servant returned by this servant 
	 * manager will be used only for a single request, 
	 * it can supply extra information to the servant 
	 * manager's operations and the servant manager's pair 
	 * of operations may be able to cooperate to do 
	 * something different than a ServantActivator. 
	 * When the POA uses the ServantLocator interface, 
	 * immediately after performing the operation invocation 
	 * on the servant returned by preinvoke, the POA will 
	 * invoke postinvoke on the servant manager, passing the 
	 * ObjectId value and the Servant value as parameters 
	 * (among others). This feature may be used to force 
	 * every request for objects associated with a POA to 
	 * be mediated by the servant manager.
	 * <p>
	 *  当POA具有NON_RETAIN策略时,它使用作为ServantLocator的servant管理器。
	 * 因为POA知道由此仆人管理器返回的服务人员将仅用于单个请求,所以它可以向服务方管理器的操作提供额外的信息,并且服务方管理器的操作对可能能够合作以执行与ServantActivator不同的操作。
	 * 当POA使用ServantLocator接口时,在对preinvoke返回的servant执行操作调用之后,POA将立即在servant管理器上调用postinvoke,并将ObjectId值和Serv
	 * ant值作为参数传递。
	 */
public interface ServantLocator extends ServantLocatorOperations, org.omg.PortableServer.ServantManager, org.omg.CORBA.portable.IDLEntity 
{
} // interface ServantLocator
