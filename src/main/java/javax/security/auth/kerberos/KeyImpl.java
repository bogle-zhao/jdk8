/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.
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

package javax.security.auth.kerberos;

import java.io.*;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.security.auth.Destroyable;
import javax.security.auth.DestroyFailedException;
import sun.misc.HexDumpEncoder;
import sun.security.krb5.Asn1Exception;
import sun.security.krb5.PrincipalName;
import sun.security.krb5.EncryptionKey;
import sun.security.krb5.EncryptedData;
import sun.security.krb5.KrbException;
import sun.security.krb5.KrbCryptoException;
import sun.security.util.DerValue;

/**
 * This class encapsulates a Kerberos encryption key. It is not associated
 * with a principal and may represent an ephemeral session key.
 *
 * <p>
 *  此类封装了Kerberos加密密钥。它不与主体相关联,并且可以表示短暂的会话密钥。
 * 
 * 
 * @author Mayank Upadhyay
 * @since 1.4
 *
 * @serial include
 */
class KeyImpl implements SecretKey, Destroyable, Serializable {

    private static final long serialVersionUID = -7889313790214321193L;

    private transient byte[] keyBytes;
    private transient int keyType;
    private transient volatile boolean destroyed = false;


    /**
     * Constructs a KeyImpl from the given bytes.
     *
     * <p>
     *  从给定的字节构造KeyImpl。
     * 
     * 
     * @param keyBytes the raw bytes for the secret key
     * @param keyType the key type for the secret key as defined by the
     * Kerberos protocol specification.
     */
    public KeyImpl(byte[] keyBytes,
                       int keyType) {
        this.keyBytes = keyBytes.clone();
        this.keyType = keyType;
    }

    /**
     * Constructs a KeyImpl from a password.
     *
     * <p>
     *  从密码构造KeyImpl。
     * 
     * 
     * @param principal the principal from which to derive the salt
     * @param password the password that should be used to compute the
     * key.
     * @param algorithm the name for the algorithm that this key wil be
     * used for. This parameter may be null in which case "DES" will be
     * assumed.
     */
    public KeyImpl(KerberosPrincipal principal,
                   char[] password,
                   String algorithm) {

        try {
            PrincipalName princ = new PrincipalName(principal.getName());
            EncryptionKey key =
                new EncryptionKey(password, princ.getSalt(), algorithm);
            this.keyBytes = key.getBytes();
            this.keyType = key.getEType();
        } catch (KrbException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    /**
     * Returns the keyType for this key as defined in the Kerberos Spec.
     * <p>
     *  返回在Kerberos Spec中定义的此键的keyType。
     * 
     */
    public final int getKeyType() {
        if (destroyed)
            throw new IllegalStateException("This key is no longer valid");
        return keyType;
    }

    /*
     * Methods from java.security.Key
     * <p>
     *  java.security.Key中的方法
     * 
     */

    public final String getAlgorithm() {
        return getAlgorithmName(keyType);
    }

    private String getAlgorithmName(int eType) {
        if (destroyed)
            throw new IllegalStateException("This key is no longer valid");

        switch (eType) {
        case EncryptedData.ETYPE_DES_CBC_CRC:
        case EncryptedData.ETYPE_DES_CBC_MD5:
            return "DES";

        case EncryptedData.ETYPE_DES3_CBC_HMAC_SHA1_KD:
            return "DESede";

        case EncryptedData.ETYPE_ARCFOUR_HMAC:
            return "ArcFourHmac";

        case EncryptedData.ETYPE_AES128_CTS_HMAC_SHA1_96:
            return "AES128";

        case EncryptedData.ETYPE_AES256_CTS_HMAC_SHA1_96:
            return "AES256";

        case EncryptedData.ETYPE_NULL:
            return "NULL";

        default:
            throw new IllegalArgumentException(
                "Unsupported encryption type: " + eType);
        }
    }

    public final String getFormat() {
        if (destroyed)
            throw new IllegalStateException("This key is no longer valid");
        return "RAW";
    }

    public final byte[] getEncoded() {
        if (destroyed)
            throw new IllegalStateException("This key is no longer valid");
        return keyBytes.clone();
    }

    public void destroy() throws DestroyFailedException {
        if (!destroyed) {
            destroyed = true;
            Arrays.fill(keyBytes, (byte) 0);
        }
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    /**
    /* <p>
    /* 
     * @serialData this {@code KeyImpl} is serialized by
     * writing out the ASN1 Encoded bytes of the encryption key.
     * The ASN1 encoding is defined in RFC4120 and as  follows:
     * EncryptionKey   ::= SEQUENCE {
     *          keytype    [0] Int32 -- actually encryption type --,
     *          keyvalue   [1] OCTET STRING
     * }
     */
    private void writeObject(ObjectOutputStream ois)
                throws IOException {
        if (destroyed) {
           throw new IOException("This key is no longer valid");
        }

        try {
           ois.writeObject((new EncryptionKey(keyType, keyBytes)).asn1Encode());
        } catch (Asn1Exception ae) {
           throw new IOException(ae.getMessage());
        }
    }

    private void readObject(ObjectInputStream ois)
                throws IOException, ClassNotFoundException {
        try {
            EncryptionKey encKey = new EncryptionKey(new
                                     DerValue((byte[])ois.readObject()));
            keyType = encKey.getEType();
            keyBytes = encKey.getBytes();
        } catch (Asn1Exception ae) {
            throw new IOException(ae.getMessage());
        }
    }

    public String toString() {
        HexDumpEncoder hd = new HexDumpEncoder();
        return "EncryptionKey: keyType=" + keyType
                          + " keyBytes (hex dump)="
                          + (keyBytes == null || keyBytes.length == 0 ?
                             " Empty Key" :
                             '\n' + hd.encodeBuffer(keyBytes)
                          + '\n');


    }

    public int hashCode() {
        int result = 17;
        if(isDestroyed()) {
            return result;
        }
        result = 37 * result + Arrays.hashCode(keyBytes);
        return 37 * result + keyType;
    }

    public boolean equals(Object other) {

        if (other == this)
            return true;

        if (! (other instanceof KeyImpl)) {
            return false;
        }

        KeyImpl otherKey = ((KeyImpl) other);
        if (isDestroyed() || otherKey.isDestroyed()) {
            return false;
        }

        if(keyType != otherKey.getKeyType() ||
                !Arrays.equals(keyBytes, otherKey.getEncoded())) {
            return false;
        }

        return true;
    }
}
