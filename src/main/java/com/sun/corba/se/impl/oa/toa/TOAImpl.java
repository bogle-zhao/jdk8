/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2001, 2004, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.corba.se.impl.oa.toa ;

import org.omg.CORBA.Policy ;
import org.omg.PortableInterceptor.ObjectReferenceTemplate ;
import org.omg.PortableInterceptor.ObjectReferenceFactory ;
import org.omg.PortableInterceptor.ACTIVE;
import org.omg.PortableServer.ServantLocatorPackage.CookieHolder ;

import com.sun.corba.se.pept.protocol.ClientDelegate ;

import com.sun.corba.se.spi.copyobject.CopierManager ;
import com.sun.corba.se.spi.copyobject.ObjectCopier ;
import com.sun.corba.se.spi.copyobject.ObjectCopierFactory ;
import com.sun.corba.se.spi.ior.ObjectKeyTemplate ;
import com.sun.corba.se.spi.ior.iiop.IIOPAddress ;
import com.sun.corba.se.spi.ior.iiop.IIOPFactories ;
import com.sun.corba.se.spi.oa.OAInvocationInfo ;
import com.sun.corba.se.spi.oa.OADestroyed ;
import com.sun.corba.se.spi.oa.ObjectAdapterBase ;
import com.sun.corba.se.spi.orb.ORB ;
import com.sun.corba.se.spi.presentation.rmi.StubAdapter ;
import com.sun.corba.se.spi.protocol.RequestDispatcherRegistry ;
import com.sun.corba.se.spi.protocol.LocalClientRequestDispatcher ;
import com.sun.corba.se.spi.transport.CorbaContactInfoList ;

import com.sun.corba.se.impl.ior.JIDLObjectKeyTemplate ;
import com.sun.corba.se.impl.oa.NullServantImpl;
import com.sun.corba.se.impl.oa.poa.Policies;
import com.sun.corba.se.impl.oa.toa.TransientObjectManager ;
import com.sun.corba.se.impl.orbutil.ORBConstants ;
import com.sun.corba.se.impl.protocol.JIDLLocalCRDImpl ;

/** The Transient Object Adapter (TOA) represents the OA for purely transient
* objects.  It is used for standard RMI-IIOP as well as backwards compatible
* server support (i.e. the ORB.connect() method)
* Its characteristics include:
* <UL>
* <LI>There is only one OA instance of the TOA.  Its OAId is { "TOA" }</LI>
* <LI>There is not adapter manager.  The TOA manager ID is fixed.<LI>
* <LI>State is the same as ORB state (TBD)</LI>
* </UL>
* Other requirements:
* <UL>
* <LI>All object adapters must invoke ORB.adapterCreated when they are created.
* </LI>
* <LI>All adapter managers must invoke ORB.adapterManagerStateChanged when
* their state changes, mapping the internal state to an ORT state.</LI>
* <LI>AdapterStateChanged must be invoked (from somewhere) whenever
* an adapter state changes that is not due to an adapter manager state change.</LI>
* </UL>
* <p>
*  对象。它用于标准RMI-IIOP以及向后兼容的服务器支持(即ORB.connect()方法)其特性包括：
* <UL>
*  <LI> TOA只有一个OA实例。其OAId为{"TOA"} </LI> <LI>没有适配器管理器。 TOA管理器ID是固定的。<LI> <LI>状态与ORB状态(TBD)相同</LI>
* </UL>
*  其他需求：
* <UL>
*  <LI>所有对象适配器在创建时都必须调用ORB.adapterCreated。
* </LI>
*/
public class TOAImpl extends ObjectAdapterBase implements TOA
{
    private TransientObjectManager servants ;

    public TOAImpl( ORB orb, TransientObjectManager tom, String codebase )
    {
        super( orb ) ;
        servants = tom ;

        // Make the object key template
        int serverid = ((ORB)getORB()).getTransientServerId();
        int scid = ORBConstants.TOA_SCID ;

        ObjectKeyTemplate oktemp = new JIDLObjectKeyTemplate( orb, scid, serverid ) ;

        // REVISIT - POA specific
        Policies policies = Policies.defaultPolicies;

        // REVISIT - absorb codebase into a policy
        initializeTemplate( oktemp, true,
                            policies,
                            codebase,
                            null, // manager id
                            oktemp.getObjectAdapterId()
                            ) ;
    }

    // Methods required for dispatching requests

    public ObjectCopierFactory getObjectCopierFactory()
    {
        CopierManager cm = getORB().getCopierManager() ;
        return cm.getDefaultObjectCopierFactory() ;
    }

    public org.omg.CORBA.Object getLocalServant( byte[] objectId )
    {
        return (org.omg.CORBA.Object)(servants.lookupServant( objectId ) ) ;
    }

    /** Get the servant for the request given by the parameters.
    * This will update thread Current, so that subsequent calls to
    * returnServant and removeCurrent from the same thread are for the
    * same request.
    * <p>
    *  <LI>所有适配器管理器必须在其状态改变时调用ORB.adapterManagerStateChanged,将内部状态映射到ORT状态。
    * </LI> <LI> AdapterStateChanged必须在适配器状态更改时调用(从某处)适配器管理器状态更改。</LI>。
    * </UL>
    * 
    * @param request is the request containing the rest of the request
    */
    public void getInvocationServant( OAInvocationInfo info )
    {
        java.lang.Object servant = servants.lookupServant( info.id() ) ;
        if (servant == null)
            // This is expected to result in an RMI-IIOP NoSuchObjectException.
            // See bug 4973160.
            servant = new NullServantImpl( lifecycleWrapper().nullServant() ) ;
        info.setServant( servant ) ;
    }

    public void returnServant()
    {
        // NO-OP
    }

    /** Return the most derived interface for the given servant and objectId.
    /* <p>
    /*  这将更新线程Current,以便后续调用returnServant和removeCurrent从同一线程是为同一请求。
    /* 
    */
    public String[] getInterfaces( Object servant, byte[] objectId )
    {
        return StubAdapter.getTypeIds( servant ) ;
    }

    // XXX For now, this does nothing.
    // This will need fixing once we support ORB and thread level policies,
    // but for now, there is no way to associate policies with the TOA, so
    // getEffectivePolicy must always return null.
    public Policy getEffectivePolicy( int type )
    {
        return null ;
    }

    public int getManagerId()
    {
        return -1 ;
    }

    public short getState()
    {
        return ACTIVE.value ;
    }

    public void enter() throws OADestroyed
    {
    }

    public void exit()
    {
    }

    // Methods unique to the TOA

    public void connect( org.omg.CORBA.Object objref)
    {
        // Store the objref and get a userkey allocated by the transient
        // object manager.
        byte[] key = servants.storeServant(objref, null);

        // Find out the repository ID for this objref.
        String id = StubAdapter.getTypeIds( objref )[0] ;

        // Create the new objref
        ObjectReferenceFactory orf = getCurrentFactory() ;
        org.omg.CORBA.Object obj = orf.make_object( id, key ) ;

        // Copy the delegate from the new objref to the argument
        // XXX handle the case of an attempt to connect a local object.

        org.omg.CORBA.portable.Delegate delegate = StubAdapter.getDelegate(
            obj ) ;
        CorbaContactInfoList ccil = (CorbaContactInfoList)
            ((ClientDelegate)delegate).getContactInfoList() ;
        LocalClientRequestDispatcher lcs =
            ccil.getLocalClientRequestDispatcher() ;

        if (lcs instanceof JIDLLocalCRDImpl) {
            JIDLLocalCRDImpl jlcs = (JIDLLocalCRDImpl)lcs ;
            jlcs.setServant( objref ) ;
        } else {
            throw new RuntimeException(
                "TOAImpl.connect can not be called on " + lcs ) ;
        }

        StubAdapter.setDelegate( objref, delegate ) ;
    }

    public void disconnect( org.omg.CORBA.Object objref )
    {
        // Get the delegate, then ior, then transientKey, then delete servant
        org.omg.CORBA.portable.Delegate del = StubAdapter.getDelegate(
            objref ) ;
        CorbaContactInfoList ccil = (CorbaContactInfoList)
            ((ClientDelegate)del).getContactInfoList() ;
        LocalClientRequestDispatcher lcs =
            ccil.getLocalClientRequestDispatcher() ;

        if (lcs instanceof JIDLLocalCRDImpl) {
            JIDLLocalCRDImpl jlcs = (JIDLLocalCRDImpl)lcs ;
            byte[] oid = jlcs.getObjectId() ;
            servants.deleteServant(oid);
            jlcs.unexport() ;
        } else {
            throw new RuntimeException(
                "TOAImpl.disconnect can not be called on " + lcs ) ;
        }
    }
}
