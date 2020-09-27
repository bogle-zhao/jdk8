/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2003, Oracle and/or its affiliates. All rights reserved.
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
/*
 * Licensed Materials - Property of IBM
 * RMI-IIOP v1.0
 * Copyright IBM Corp. 1998 1999  All Rights Reserved
 *
 * <p>
 *  许可的材料 -  IBM RMI-IIOP v1.0的属性版权所有IBM Corp. 1998 1999保留所有权利
 * 
 */

package com.sun.corba.se.impl.ior;

import java.io.ObjectInputStream ;
import java.io.ObjectOutputStream ;
import java.io.IOException ;
import java.io.StringWriter ;

import org.omg.CORBA.ORB ;

import org.omg.CORBA.portable.Delegate ;
import org.omg.CORBA.portable.InputStream ;
import org.omg.CORBA.portable.OutputStream ;

// Be very careful: com.sun.corba imports must not depend on
// PEORB internal classes in ways that prevent portability to
// other vendor's ORBs.
import com.sun.corba.se.spi.presentation.rmi.StubAdapter ;
import com.sun.corba.se.impl.orbutil.HexOutputStream ;

/**
 * This class implements a very simply IOR representation
 * which must be completely ORBImpl free so that this class
 * can be used in the implementation of a portable StubDelegateImpl.
 * <p>
 *  这个类实现了一个非常简单的IOR表示,它必须是完全ORBImpl自由的,以便这个类可以用于实现一个可移植的StubDelegateImpl。
 * 
 */
public class StubIORImpl
{
    // cached hash code
    private int hashCode;

    // IOR components
    private byte[] typeData;
    private int[] profileTags;
    private byte[][] profileData;

    public StubIORImpl()
    {
        hashCode = 0 ;
        typeData = null ;
        profileTags = null ;
        profileData = null ;
    }

    public String getRepositoryId()
    {
        if (typeData == null)
            return null ;

        return new String( typeData ) ;
    }

    public StubIORImpl( org.omg.CORBA.Object obj )
    {
        // write the IOR to an OutputStream and get an InputStream
        OutputStream ostr = StubAdapter.getORB( obj ).create_output_stream();
        ostr.write_Object(obj);
        InputStream istr = ostr.create_input_stream();

        // read the IOR components back from the stream
        int typeLength = istr.read_long();
        typeData = new byte[typeLength];
        istr.read_octet_array(typeData, 0, typeLength);
        int numProfiles = istr.read_long();
        profileTags = new int[numProfiles];
        profileData = new byte[numProfiles][];
        for (int i = 0; i < numProfiles; i++) {
            profileTags[i] = istr.read_long();
            profileData[i] = new byte[istr.read_long()];
            istr.read_octet_array(profileData[i], 0, profileData[i].length);
        }
    }

    public Delegate getDelegate( ORB orb )
    {
        // write the IOR components to an org.omg.CORBA.portable.OutputStream
        OutputStream ostr = orb.create_output_stream();
        ostr.write_long(typeData.length);
        ostr.write_octet_array(typeData, 0, typeData.length);
        ostr.write_long(profileTags.length);
        for (int i = 0; i < profileTags.length; i++) {
            ostr.write_long(profileTags[i]);
            ostr.write_long(profileData[i].length);
            ostr.write_octet_array(profileData[i], 0, profileData[i].length);
        }

        InputStream istr = ostr.create_input_stream() ;

        // read the IOR back from the stream
        org.omg.CORBA.Object obj = (org.omg.CORBA.Object)istr.read_Object();
        return StubAdapter.getDelegate( obj ) ;
    }

    public  void doRead( java.io.ObjectInputStream stream )
        throws IOException, ClassNotFoundException
    {
        // read the IOR from the ObjectInputStream
        int typeLength = stream.readInt();
        typeData = new byte[typeLength];
        stream.readFully(typeData);
        int numProfiles = stream.readInt();
        profileTags = new int[numProfiles];
        profileData = new byte[numProfiles][];
        for (int i = 0; i < numProfiles; i++) {
            profileTags[i] = stream.readInt();
            profileData[i] = new byte[stream.readInt()];
            stream.readFully(profileData[i]);
        }
    }

    public  void doWrite( ObjectOutputStream stream )
        throws IOException
    {
        // write the IOR to the ObjectOutputStream
        stream.writeInt(typeData.length);
        stream.write(typeData);
        stream.writeInt(profileTags.length);
        for (int i = 0; i < profileTags.length; i++) {
            stream.writeInt(profileTags[i]);
            stream.writeInt(profileData[i].length);
            stream.write(profileData[i]);
        }
    }

    /**
     * Returns a hash code value for the object which is the same for all stubs
     * that represent the same remote object.
     * <p>
     *  返回对于表示同一远程对象的所有存根都相同的对象的哈希代码值。
     * 
     * 
     * @return the hash code value.
     */
    public synchronized int hashCode()
    {
        if (hashCode == 0) {

            // compute the hash code
            for (int i = 0; i < typeData.length; i++) {
                hashCode = hashCode * 37 + typeData[i];
            }

            for (int i = 0; i < profileTags.length; i++) {
                hashCode = hashCode * 37 + profileTags[i];
                for (int j = 0; j < profileData[i].length; j++) {
                    hashCode = hashCode * 37 + profileData[i][j];
                }
            }
        }

        return hashCode;
    }

    private boolean equalArrays( int[] data1, int[] data2 )
    {
        if (data1.length != data2.length)
            return false ;

        for (int ctr=0; ctr<data1.length; ctr++) {
            if (data1[ctr] != data2[ctr])
                return false ;
        }

        return true ;
    }

    private boolean equalArrays( byte[] data1, byte[] data2 )
    {
        if (data1.length != data2.length)
            return false ;

        for (int ctr=0; ctr<data1.length; ctr++) {
            if (data1[ctr] != data2[ctr])
                return false ;
        }

        return true ;
    }

    private boolean equalArrays( byte[][] data1, byte[][] data2 )
    {
        if (data1.length != data2.length)
            return false ;

        for (int ctr=0; ctr<data1.length; ctr++) {
            if (!equalArrays( data1[ctr], data2[ctr] ))
                return false ;
        }

        return true ;
    }

    public boolean equals(java.lang.Object obj)
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof StubIORImpl)) {
            return false;
        }

        StubIORImpl other = (StubIORImpl) obj;
        if (other.hashCode() != this.hashCode()) {
            return false;
        }

        return equalArrays( typeData, other.typeData ) &&
            equalArrays( profileTags, other.profileTags ) &&
            equalArrays( profileData, other.profileData ) ;
    }

    private void appendByteArray( StringBuffer result, byte[] data )
    {
        for ( int ctr=0; ctr<data.length; ctr++ ) {
            result.append( Integer.toHexString( data[ctr] ) ) ;
        }
    }

    /**
     * Returns a string representation of this stub. Returns the same string
     * for all stubs that represent the same remote object.
     * "SimpleIORImpl[<typeName>,[<profileID>]data, ...]"
     * <p>
     *  返回此存根的字符串表示形式。为表示同一远程对象的所有存根返回相同的字符串。 "SimpleIORImpl [<typeName>,[<profileID>] data,...]
     * 
     * @return a string representation of this stub.
     */
    public String toString()
    {
        StringBuffer result = new StringBuffer() ;
        result.append( "SimpleIORImpl[" ) ;
        String repositoryId = new String( typeData ) ;
        result.append( repositoryId ) ;
        for (int ctr=0; ctr<profileTags.length; ctr++) {
            result.append( ",(" ) ;
            result.append( profileTags[ctr] ) ;
            result.append( ")" ) ;
            appendByteArray( result,  profileData[ctr] ) ;
        }

        result.append( "]" ) ;
        return result.toString() ;
    }
}
