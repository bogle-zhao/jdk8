/***** Lobxxx Translate Finished ******/
package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/CurrentHelper.java .
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
   */
abstract public class CurrentHelper
{
  private static String  _id = "IDL:omg.org/PortableInterceptor/Current:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.PortableInterceptor.Current that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.PortableInterceptor.Current extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.PortableInterceptor.CurrentHelper.id (), "Current");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.PortableInterceptor.Current read (org.omg.CORBA.portable.InputStream istream)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.PortableInterceptor.Current value)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static org.omg.PortableInterceptor.Current narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.PortableInterceptor.Current)
      return (org.omg.PortableInterceptor.Current)obj;
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  public static org.omg.PortableInterceptor.Current unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.PortableInterceptor.Current)
      return (org.omg.PortableInterceptor.Current)obj;
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

}
