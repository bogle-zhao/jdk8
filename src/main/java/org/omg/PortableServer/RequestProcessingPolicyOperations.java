/***** Lobxxx Translate Finished ******/
package org.omg.PortableServer;


/**
* org/omg/PortableServer/RequestProcessingPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, April 30, 2015 12:42:10 PM PDT
*/


/**
	 * This policy specifies how requests are processed by 
	 * the created POA.  The default is 
	 * USE_ACTIVE_OBJECT_MAP_ONLY.
	 * <p>
	 *  此策略指定如何由创建的POA处理请求。默认值为USE_ACTIVE_OBJECT_MAP_ONLY。
	 * 
	 */
public interface RequestProcessingPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
	 * specifies the policy value
	 * <p>
	 *  指定策略值
	 */
  org.omg.PortableServer.RequestProcessingPolicyValue value ();
} // interface RequestProcessingPolicyOperations
