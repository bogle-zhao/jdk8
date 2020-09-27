/***** Lobxxx Translate Finished ******/
package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ClientRequestInfoOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Thursday, April 30, 2015 12:42:09 PM PDT
*/


/**
   * Request Information, accessible to client-side request interceptors.
   * <p>
   * Some attributes and operations on <code>ClientRequestInfo</code> are 
   * not valid at all interception points.  The following table shows the 
   * validity of each attribute or operation.  If it is not valid, attempting 
   * to access it will result in a <code>BAD_INV_ORDER</code> being thrown
   * with a standard minor code of 14.
   * <p>
   *
   * <table border=1 summary="Shows the validity of each attribute or operation">
   *  <thead>
   *    <tr>
   *      <th>&nbsp;</th>
   *      <th id="send_req">send_request</th>
   *      <th id="send_poll">send_poll</th>
   *      <th id="rec_reply">receive_reply</th>
   *      <th id="rec_ex">receive_exception</th>
   *      <th id="rec_oth">receive_other</th>
   *    </tr>
   *  </thead>
   *  <tbody>
   *
   *  <tr>
   *     <td id="ri" colspan=6><i>Inherited from RequestInfo:</i></td>
   *  </tr>
   * 
   *  <tr><th id="req_id"><p align="left">request_id</p></th>
   *  <td headers="ri req_id send_req">yes</td> 
   *  <td headers="ri req_id send_poll">yes</td> 
   *  <td headers="ri req_id rec_reply">yes</td> 
   *  <td headers="ri req_id rec_ex">yes</td> 
   *  <td headers="ri req_id rec_oth">yes</td></tr>
   * 
   *  <tr><th id="op"><p align="left">operation</p></th>
   *  <td headers="ri op send_req">yes</td> 
   *  <td headers="ri op send_poll">yes</td> 
   *  <td headers="ri op rec_reply">yes</td> 
   *  <td headers="ri op rec_ex">yes</td> 
   *  <td headers="ri op rec_oth">yes</td></tr>
   *
   *  <tr><th id="arg"><p align="left">arguments</p></th>
   *  <td headers="ri arg send_req">yes<sub>1</sub></td>
   *  <td headers="ri arg send_poll">no </td> 
   *  <td headers="ri arg rec_reply">yes</td> 
   *  <td headers="ri arg rec_ex">no </td> 
   *  <td headers="ri arg rec_oth">no </td></tr>
   *
   *  <tr><th id="exc"><p align="left">exceptions</p></th>
   *  <td headers="ri exc send_req">yes</td> 
   *  <td headers="ri exc send_poll">no </td> 
   *  <td headers="ri exc rec_reply">yes</td> 
   *  <td headers="ri exc rec_ex">yes</td> 
   *  <td headers="ri exc rec_oth">yes</td></tr>
   *
   *  <tr><th id="con"><p align="left">contexts</p></th>
   *  <td headers="ri con send_req">yes</td> 
   *  <td headers="ri con send_poll">no </td> 
   *  <td headers="ri con rec_reply">yes</td> 
   *  <td headers="ri con rec_ex">yes</td> 
   *  <td headers="ri con rec_oth">yes</td></tr>
   *
   *  <tr><th id="op_con"><p align="left">operation_context</p></th>
   *  <td headers="ri op_con send_req">yes</td> 
   *  <td headers="ri op_con send_poll">no </td> 
   *  <td headers="ri op_con rec_reply">yes</td> 
   *  <td headers="ri op_con rec_ex">yes</td> 
   *  <td headers="ri op_con rec_oth">yes</td>
   *  </tr>
   *
   *  <tr><th id="result"><p align="left">result</p></th>
   *  <td headers="ri result send_req">no </td> 
   *  <td headers="ri result send_poll">no </td> 
   *  <td headers="ri result rec_reply">yes</td> 
   *  <td headers="ri result rec_ex">no </td> 
   *  <td headers="ri result rec_oth">no </td>
   *  </tr>
   *
   *  <tr><th id="res_exp"><p align="left">response_expected</p></th>
   *  <td headers="ri res_exp send_req">yes</td> 
   *  <td headers="ri res_exp send_poll">yes</td> 
   *  <td headers="ri res_exp rec_reply">yes</td> 
   *  <td headers="ri res_exp rec_ex">yes</td> 
   *  <td headers="ri res_exp rec_oth">yes</td></tr>
   *
   *  <tr><th id="sync_sco"><p align="left">sync_scope</p></th>
   *  <td headers="ri sync_sco send_req">yes</td> 
   *  <td headers="ri sync_sco send_poll">no </td> 
   *  <td headers="ri sync_sco rec_reply">yes</td> 
   *  <td headers="ri sync_sco rec_ex">yes</td> 
   *  <td headers="ri sync_sco rec_oth">yes</td>
   *  </tr>
   *
   *  <tr><th id="rep_stat"><p align="left">reply_status</p></th>
   *  <td headers="ri rep_stat send_req">no </td> 
   *  <td headers="ri rep_stat send_poll">no </td> 
   *  <td headers="ri rep_stat rec_reply">yes</td> 
   *  <td headers="ri rep_stat rec_ex">yes</td> 
   *  <td headers="ri rep_stat rec_oth">yes</td></tr>
   *
   *  <tr><th id="for_ref"><p align="left">forward_reference</p></th>
   *  <td headers="ri for_ref send_req">no </td>
   *  <td headers="ri for_ref send_poll">no </td> 
   *  <td headers="ri for_ref rec_reply">no </td> 
   *  <td headers="ri for_ref rec_ex">no </td> 
   *  <td headers="ri for_ref rec_oth">yes<sub>2</sub>
   *  </td></tr>
   *
   *  <tr><th id="get_slot"><p align="left">get_slot</p></th>
   *  <td headers="ri get_slot send_req">yes</td> 
   *  <td headers="ri get_slot send_poll">yes</td> 
   *  <td headers="ri get_slot rec_reply">yes</td> 
   *  <td headers="ri get_slot rec_ex">yes</td> 
   *  <td headers="ri get_slot rec_oth">yes</td></tr>
   *
   *  <tr><th id="grsc"><p align="left">get_request_service_context</p></th>
   *  <td headers="ri grsc send_req">yes</td> 
   *  <td headers="ri grsc send_poll">no </td> 
   *  <td headers="ri grsc rec_reply">yes</td> 
   *  <td headers="ri grsc rec_ex">yes</td> 
   *  <td headers="ri grsc rec_oth">yes</td></tr>
   *
   *  <tr><th id="gpsc"><p align="left">get_reply_service_context</p></th>
   *  <td headers="ri gpsc send_req">no </td> 
   *  <td headers="ri gpsc send_poll">no </td> 
   *  <td headers="ri gpsc rec_reply">yes</td> 
   *  <td headers="ri gpsc rec_ex">yes</td> 
   *  <td headers="ri gpsc rec_oth">yes</td>
   *  </tr>
   *
   *  <tr>
   *    <td id="cri" colspan=6><i>ClientRequestInfo-specific:</i></td>
   *  </tr>
   *
   *  <tr><th id="target"><p align="left">target</p></th>
   *  <td headers="cri target send_req">yes</td> 
   *  <td headers="cri target send_poll">yes</td> 
   *  <td headers="cri target rec_reply">yes</td> 
   *  <td headers="cri target rec_ex">yes</td> 
   *  <td headers="cri target rec_oth">yes</td></tr>
   *
   *  <tr><th id="eftarget"><p align="left">effective_target</p></th>
   *  <td headers="cri eftarget send_req">yes</td> 
   *  <td headers="cri eftarget send_poll">yes</td> 
   *  <td headers="cri eftarget rec_reply">yes</td> 
   *  <td headers="cri eftarget rec_ex">yes</td> 
   *  <td headers="cri eftarget rec_oth">yes</td>
   *  </tr>
   *
   *  <tr><th id="efprof"><p align="left">effective_profile</p></th>
   *  <td headers="cri efprof send_req">yes</td> 
   *  <td headers="cri efprof send_poll">yes</td> 
   *  <td headers="cri efprof rec_reply">yes</td> 
   *  <td headers="cri efprof rec_ex">yes</td> 
   *  <td headers="cri efprof rec_oth">yes</td></tr>
   *
   *  <tr><th id="rxp"><p align="left">received_exception</p></th>
   *  <td headers="cri rxp send_req">no </td> 
   *  <td headers="cri rxp send_poll">no </td> 
   *  <td headers="cri rxp rec_reply">no </td> 
   *  <td headers="cri rxp rec_ex">yes</td> 
   *  <td headers="cri rxp rec_oth">no </td></tr>
   *
   *  <tr><th id="rei"><p align="left">received_exception_id</p></th>
   *  <td headers="cri rei send_req">no </td> 
   *  <td headers="cri rei send_poll">no </td> 
   *  <td headers="cri rei rec_reply">no </td> 
   *  <td headers="cri rei rec_ex">yes</td> 
   *  <td headers="cri rei rec_oth">no </td></tr>
   *
   *  <tr><th id="gec"><p align="left">get_effective_component</p></th>
   *  <td headers="cri gec send_req">yes</td> 
   *  <td headers="cri gec send_poll">no </td> 
   *  <td headers="cri gec rec_reply">yes</td> 
   *  <td headers="cri gec rec_ex">yes</td> 
   *  <td headers="cri gec rec_oth">yes</td></tr>
   *
   *  <tr><th id="gecs"><p align="left">get_effective_components</p></th>
   *  <td headers="cri gecs send_req">yes</td> 
   *  <td headers="cri gecs send_poll">no </td> 
   *  <td headers="cri gecs rec_reply">yes</td> 
   *  <td headers="cri gecs rec_ex">yes</td> 
   *  <td headers="cri gecs rec_oth">yes</td></tr>
   *
   *  <tr><th id="grpcy"><p align="left">get_request_policy</p></th>
   *  <td headers="cri grpcy send_req">yes</td>
   *  <td headers="cri grpcy send_poll">no </td> 
   *  <td headers="cri grpcy rec_reply">yes</td> 
   *  <td headers="cri grpcy rec_ex">yes</td> 
   *  <td headers="cri grpcy rec_oth">yes</td></tr>
   *
   *  <tr><th id="arsc"><p align="left">add_request_service_context</p></th>
   *    <td headers="cri arsc send_req">yes</td> 
   *    <td headers="cri arsc send_poll">no </td> 
   *    <td headers="cri arsc rec_reply">no </td> 
   *    <td headers="cri arsc rec_ex">no </td> 
   *    <td headers="cri arsc rec_oth">no </td></tr>
   *
   *   </tbody>
   * </table>
   *
   * <ol>
   *   <li>When <code>ClientRequestInfo</code> is passed to 
   *       <code>send_request</code>, there is an entry in the list for every 
   *       argument, whether in, inout, or out.  But only the in and inout 
   *       arguments will be available.</li>
   *   <li>If the <code>reply_status</code> atribute is not 
   *       <code>LOCATION_FORWARD</code>, accessing this attribute will 
   *       throw <code>BAD_INV_ORDER</code> with a standard minor code of 
   *       14.</li>
   * </ol>
   *
   * <p>
   *  请求信息,客户端请求拦截器可访问
   * <p>
   *  <code> ClientRequestInfo </code>上的某些属性和操作在所有拦截点都无效下表显示了每个属性或操作的有效性如果它无效,则尝试访问它将导致一个<code> BAD_INV_OR
   * DER < / code>以标准次要代码14抛出。
   * <p>
   * 
   * <table border=1 summary="Shows the validity of each attribute or operation">
   * <thead>
   * <tr>
   * <th> </th> <th id ="send_req"> send_request </th> <th id ="send_poll"> send_poll </th> <th id ="rec_reply">
   *  receive_reply </th> <th id ="rec_ex"> receive_exception </th> <th id ="rec_oth"> receive_other </th>
   * 。
   * </tr>
   * </thead>
   * <tbody>
   * 
   * <tr>
   *  <td id ="ri"colspan = 6> <i>继承自RequestInfo：</i> </td>
   * </tr>
   * 
   *  <tr> <th id ="req_id"> <p align ="left"> request_id </p> </th> <td headers ="ri req_id send_req"> ye
   * s </td> <td headers ="ri req_id send"> yes </td> <td header ="ri req_id rec_oth"> yes </td> <td header ="ri req_id rec_reply">
   *  yes </td> <td headers ="ri req_id rec_ex" / td> </tr>。
   * 
   *  <tr> <th id ="op"> <p align ="left">操作</p> </th> <td headers ="ri op send_req"> yes </td> <td headers ="ri op send_poll">
   *  yes </td> <td headers ="ri op rec_oth"> yes </td> <td header ="ri op rec_ex"> yes </td> / td> </tr>。
   * 
   * <tr> <th id ="arg"> <p align ="left">参数</p> </th> <td headers ="ri arg send_req"> yes <sub> 1 </sub> 
   * </td > <td header ="ri arg send_toll"> no </td> <td header ="ri arg rec_reply"> yes </td> <td headers = "ri arg rec_oth">
   *  no </td> </tr>。
   * 
   *  <tr> <th id ="exc"> <p align ="left">例外</p> </th> <td headers ="ri exc send_req"> yes </td> <td headers ="ri exc "</td>
   * "</td> <td header ="ri exc rec_oth"> yes </td> <td header = / td> </tr>。
   * 
   *  <tr> <th id ="con"> <p align ="left">上下文</p> </th> <td headers ="ri con send_req"> yes </td> <td headers ="ri con </td>
   *  <td header ="ri con rec_oth"> yes </td> </td> </td> </td> </td> / td> </tr>。
   * 
   * <tr> <th id ="op_con"> <p align ="left"> operation_context </p> </th> <td headers ="ri op_con send_req">
   *  yes </td> <td headers ="ri op_con "</td> <td header ="ri op_con rec_oth"> yes </td> <td header ="ri op_con rec_ex">
   *  yes </td> / td>。
   * </tr>
   * 
   *  <tr> <th id ="result"> <p align ="left"> result </p> </th> <td headers ="ri result send_req"> no </td>
   *  <td headers ="ri result </td> <td header ="ri result rec_ex"> no </td> <td header ="ri result rec_oth">
   *  no </td> <td header ="ri result rec_reply" / td>。
   * </tr>
   * 
   * <tr> <th id ="res_exp"> <p align ="left"> response_expected </p> </th> <td headers ="ri res_exp send_req">
   *  yes </td> <td headers ="ri res_exp </td> <td header ="ri res_exp rec_ex"> yes </td> <td headers ="ri res_exp rec_oth">
   *  yes </td> </td> / td> </tr>。
   * 
   *  <tr> <th id ="sync_sco"> <p align ="left"> sync_scope </p> </th> <td headers ="ri sync_sco send_req">
   *  yes </td> <td headers ="ri sync_sco send_poll>> </td> <td header ="ri sync_sco rec_oth"> yes </td> <td header ="ri sync_sco rec_reply">
   *  yes </td> <td headers ="ri sync_sco rec_ex" / td>。
   * </tr>
   * 
   * <tr> <th id ="rep_stat"> <p align ="left"> reply_status </p> </th> <td headers ="ri rep_stat send_req">
   *  no </td> <td headers ="ri rep_stat </td> <td header ="ri rep_stat rec_ex"> yes </td> <td headers ="ri rep_stat rec_oth">
   *  yes </td> <td header = / td> </tr>。
   * 
   *  <tr> <th id ="for_ref"> <p align ="left"> forward_reference </p> </th> <td headers ="ri for_ref send_req">
   *  no </td> <td headers ="ri for_ref send_poll"> no </td> <td headers ="ri for_ref rec_oth"> no </td> <td headers ="ri for_ref rec_ex">
   *  no </td> sub> 2 </sub> </td> </tr>。
   * 
   * <tr> <th> </span> </span> </span> </span> </span> </span> </td> <td header ="ri get_slot rec_ex"> yes
   *  </td> <td header ="ri get_slot rec_oth"> yes </td> </td> / td> </tr>。
   * 
   *  <tr> <th id ="grsc"> <p align ="left"> get_request_service_context </p> </th> <td headers ="ri grsc send_req">
   *  yes </td> <td headers ="ri grsc "</td> <td header ="ri grsc rec_ex"> yes </td> <td headers ="ri grsc rec_oth">
   *  yes </td> / td> </tr>。
   * 
   * <tr> <th> </span> </span> </span> </span> </span> </td> <td header ="ri gpsc rec_ex"> yes </td> <td header ="ri gpsc rec_oth">
   *  yes </td> </td> / td>。
   * </tr>
   * 
   * <tr>
   *  <td id ="cri"colspan = 6> <i> ClientRequestInfo-specific：</i> </td>
   * </tr>
   * 
   * 
   * @see ClientRequestInterceptor
   */
public interface ClientRequestInfoOperations  extends org.omg.PortableInterceptor.RequestInfoOperations
{

  /**
     * Returns the object which the client called to perform the 
     * operation. 
     *
     * <p>
     *  <tr> <th id ="target"> <p align ="left"> target </p> </th> <td headers ="cri target send_req"> yes </td>
     *  <td headers ="cri target "</td> <td header ="cri target rec_ex"> yes </td> <td header ="cri target rec_oth">
     *  yes </td> / td> </tr>。
     * 
     * <tr> <th id ="eftarget"> <p align ="left"> effective_target </p> </th> <td headers ="cri eftarget send_req">
     *  yes </td> <td headers ="cri eftarget "</td> <td header ="cri eftarget rec_ex"> yes </td> <td headers ="cri eftarget rec_oth">
     *  yes </td> / td>。
     * </tr>
     * 
     *  <tr> <th id ="efprof"> <p align ="left"> effective_profile </p> </th> <td headers ="cri efprof send_req">
     *  yes </td> <td headers ="cri efprof "</td> <td headers ="cri efprof rec_ex"> yes </td> <td headers ="cri efprof rec_oth">
     *  yes </td> / td> </tr>。
     * 
     * <tr> <th> </span> </p> </p> <td header ="cri rxp send_req">没有</td> <td headers ="cri rxp "</td>"<td header ="cri rxp rec_oth">
     *  no </td> <td header ="cri rxp rec_ex"> no </td> / td> </tr>。
     * 
     *  <tr> <th> <th> </span> </span> </span> </span> </span> "</td> <td header ="cri rei rec_ex"> no </td>
     *  <td header ="cri rei rec_oth"> no </td> / td> </tr>。
     * 
     * <tr> <th id ="gec"> <p align ="left"> get_effective_component </p> </th> <td headers ="cri gec send_req">
     *  yes </td> <td headers ="cri gec "</td> <td header ="cri gec rec_ex"> yes </td> <td header ="cri gec rec_oth">
     *  yes </td> / td> </tr>。
     * 
     *  <tr> <th> <th id ="gecs"> <p align ="left"> get_effective_components </p> </th> <td headers ="cri gecs send_req">
     *  yes </td> <td headers ="cri gecs "</td> <td header ="cri gecs rec_ex"> yes </td> <td headers ="cri gecs rec_oth">
     *  yes </td> / td> </tr>。
     * 
     * <tr> <th> <th id ="grpcy"> <p align ="left"> get_request_policy </p> </th> <td headers ="cri grpcy send_req">
     *  yes </td> <td headers ="cri grpcy </td> <td header ="cri grpcy rec_ex"> yes </td> <td headers ="cri grpcy rec_oth">
     *  yes </td> / td> </tr>。
     * 
     *  <tr> <th> <th id ="arsc"> <p align ="left"> add_request_service_context </p> </th> <td headers ="cri arsc send_req">
     *  yes </td> <td headers ="cri arsc send_poll"> no </td> <td headers ="cri arsc rec_oth"> no </td> <td headers ="cri arsc rec_release">
     *  no </td> / td> </tr>。
     * 
     * </tbody>
     * </table>
     * 
     * <ol>
     * <li>当<code> ClientRequestInfo </code>传递给<code> send_request </code>时,列表中的每个参数都有一个条目,无论是in,inout还是out,
     * 
     * @see #effective_target
     */
  org.omg.CORBA.Object target ();

  /**
     * Returns the actual object on which the operation will be invoked. 
     * If the <code>reply_status</code> is <code>LOCATION_FORWARD</code>, 
     * then on subsequent requests, <code>effective_target</code> will 
     * contain the forwarded IOR while target will remain unchanged. 
     *
     * <p>
     * 但只有in和inout参数</li> <li>如果<code> reply_status </code>属性不是<code> LOCATION_FORWARD </code>,访问此属性将会抛出<code>
     *  BAD_INV_ORDER </code> 14 </li>。
     * </ol>
     * 
     * 
     * @see #target
     */
  org.omg.CORBA.Object effective_target ();

  /**
     * Returns the profile that will be used to send the request. If a 
     * location forward has occurred for this operation's object and 
     * that object's profile changed accordingly, then this profile will 
     * be that located profile.
     * <p>
     *  返回客户机调用以执行操作的对象
     * 
     */
  org.omg.IOP.TaggedProfile effective_profile ();

  /** 
     * Returns an any which contains the exception to be returned to 
     * the client. 
     * <p>
     * If the exception is a user exception which cannot be inserted 
     * into an any (e.g., it is unknown or the bindings don t provide 
     * the <code>TypeCode</code>), then this attribute will be an any 
     * containing the system exception <code>UNKNOWN</code> with a 
     * standard minor code of 1. However, the repository id of 
     * the exception is available in the <code>received_exception_id</code> 
     * attribute.
     * 
     * <p>
     *  返回将调用操作的实际对象如果<code> reply_status </code>是<code> LOCATION_FORWARD </code>,则在后续请求中,<code> effective_t
     * arget </code>将包含转发的IOR,目标将保持不变。
     * 
     * 
     * @see #received_exception_id
     */
  org.omg.CORBA.Any received_exception ();

  /**
     * Returns the repository id of the exception to be returned to 
     * the client.
     *
     * <p>
     * 返回将用于发送请求的配置文件如果此操作的对象发生了位置转移,并且该对象的配置文件已相应更改,则此配置文件将位于配置文件
     * 
     * 
     * @see #received_exception
     * @see <a href="package-summary.html#unimpl">
     *     <code>PortableInterceptor</code> package comments for 
     *     limitations / unimplemented features</a>
     */
  String received_exception_id ();

  /** 
     * Returns the <code>IOP.TaggedComponent</code> with the given ID from 
     * the profile selected for this request. 
     * <p>
     * If there is more than one component for a given component ID, it 
     * is undefined which component this operation returns. If there is 
     * more than one component for a given component ID, 
     * <code>get_effective_components</code> should be called instead. 
     * 
     * <p>
     *  返回包含要返回给客户端的异常的任何内容
     * <p>
     *  如果异常是不能插入任何(例如,未知或绑定不提供<code> TypeCode </code>)的用户异常,则该属性将是包含系统异常<code > UNKNOWN </code>,标准次要代码为1但是,
     * 异常的存储库ID在<code> received_exception_id </code>属性中可用。
     * 
     * 
     * @param id The component id of the component which 
     *     is to be returned. 
     * @return The <code>IOP.TaggedComponent</code> obtained with the 
     *     given identifier.
     * @exception BAD_PARAM thrown, with a standard minor code of 28, if
     *     no component exists for the given component ID.
     * @see #get_effective_components
     */
  org.omg.IOP.TaggedComponent get_effective_component (int id);

  /**
     * Returns an array of all tagged components with the given ID from the 
     * profile selected for this request. 
     * 
     * <p>
     *  返回要返回到客户端的异常的存储库标识
     * 
     * 
     * @param id The component id of the components which are to be returned. 
     * @return An array of <code>TaggedComponent</code> objects, each of 
     *     which contains the given identifier.
     * @exception BAD_PARAM thrown, with a standard minor code of 28, if
     *     no component exists for the given component ID.
     * @see #get_effective_component
     */
  org.omg.IOP.TaggedComponent[] get_effective_components (int id);

  /**
     * Returns the given policy in effect for this operation. 
     * 
     * <p>
     * 从为此请求选择的配置文件中返回具有给定ID的<code> IOPTaggedComponent </code>
     * <p>
     *  如果给定组件ID有多个组件,则未定义此操作返回的组件如果给定组件ID有多个组件,则应调用<code> get_effective_components </code>
     * 
     * 
     * @exception INV_POLICY thrown, with a standard minor code of 1, if the 
     *     policy type is not valid either because the specified type is 
     *     not supported by this ORB or because a policy object of that type 
     *     is not associated with this Object
     * @param type The policy type which specifies the policy to be 
     *     returned. 
     * @return The <code>CORBA.Policy</code> obtained with the given type.
     * @see <a href="package-summary.html#unimpl">
     *     <code>PortableInterceptor</code> package comments for 
     *     limitations / unimplemented features</a>
     */
  org.omg.CORBA.Policy get_request_policy (int type);

  /** 
     * Allows Interceptors to add service contexts to the request. 
     * <p>
     * There is no declaration of the order of the service contexts. 
     * They may or may not appear in the order that they are added. 
     *
     * <p>
     *  返回从为此请求选择的配置文件中具有给定ID的所有已标记组件的数组
     * 
     * 
     * @param service_context The <code>IOP.ServiceContext</code> to be 
     *     added to the request. 
     * @param replace Indicates the behavior of this operation when a 
     *     service context already exists with the given ID. If false, 
     *     then <code>BAD_INV_ORDER</code> with a standard minor code of 15 
     *     is thrown. If true, then the existing service context is 
     *     replaced by the new one.
     */
  void add_request_service_context (org.omg.IOP.ServiceContext service_context, boolean replace);
} // interface ClientRequestInfoOperations