/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
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
 * (C) Copyright Taligent, Inc. 1996 - All Rights Reserved
 * (C) Copyright IBM Corp. 1996 - All Rights Reserved
 *
 *   The original version of this source code and documentation is copyrighted
 * and owned by Taligent, Inc., a wholly-owned subsidiary of IBM. These
 * materials are provided under terms of a License Agreement between Taligent
 * and Sun. This technology is protected by multiple US and International
 * patents. This notice and attribution to Taligent may not be removed.
 *   Taligent is a registered trademark of Taligent, Inc.
 *
 * <p>
 *  (C)版权Taligent,Inc. 1996  - 保留所有权利(C)版权所有IBM Corp. 1996  - 保留所有权利
 * 
 *  此源代码和文档的原始版本由IBM的全资子公司Taligent,Inc.拥有版权和所有权。这些材料是根据Taligent和Sun之间的许可协议的条款提供的。该技术受多项美国和国际专利保护。
 * 此通知和归因于Taligent不得删除。 Taligent是Taligent,Inc.的注册商标。
 * 
 */

package java.text;

/**
 * A RuleBasedCollationKey is a concrete implementation of CollationKey class.
 * The RuleBasedCollationKey class is used by the RuleBasedCollator class.
 * <p>
 *  RuleBasedCollat​​ionKey是Collat​​ionKey类的具体实现。 RuleBasedCollat​​ionKey类由RuleBasedCollat​​or类使用。
 * 
 */

final class RuleBasedCollationKey extends CollationKey {
    /**
     * Compare this RuleBasedCollationKey to target. The collation rules of the
     * Collator object which created these keys are applied. <strong>Note:</strong>
     * RuleBasedCollationKeys created by different Collators can not be compared.
     * <p>
     *  将此RuleBasedCollat​​ionKey与目标比较。应用创建这些键的Collat​​or对象的排序规则。
     *  <strong>注意：</strong>无法比较不同Collat​​or创建的RuleBasedCollat​​ionKey。
     * 
     * 
     * @param target target RuleBasedCollationKey
     * @return Returns an integer value. Value is less than zero if this is less
     * than target, value is zero if this and target are equal and value is greater than
     * zero if this is greater than target.
     * @see java.text.Collator#compare
     */
    public int compareTo(CollationKey target)
    {
        int result = key.compareTo(((RuleBasedCollationKey)(target)).key);
        if (result <= Collator.LESS)
            return Collator.LESS;
        else if (result >= Collator.GREATER)
            return Collator.GREATER;
        return Collator.EQUAL;
    }

    /**
     * Compare this RuleBasedCollationKey and the target for equality.
     * The collation rules of the Collator object which created these keys are applied.
     * <strong>Note:</strong> RuleBasedCollationKeys created by different Collators can not be
     * compared.
     * <p>
     *  比较此RuleBasedCollat​​ionKey和目标的相等性。应用创建这些键的Collat​​or对象的排序规则。
     *  <strong>注意：</strong>无法比较不同Collat​​or创建的RuleBasedCollat​​ionKey。
     * 
     * 
     * @param target the RuleBasedCollationKey to compare to.
     * @return Returns true if two objects are equal, false otherwise.
     */
    public boolean equals(Object target) {
        if (this == target) return true;
        if (target == null || !getClass().equals(target.getClass())) {
            return false;
        }
        RuleBasedCollationKey other = (RuleBasedCollationKey)target;
        return key.equals(other.key);
    }

    /**
     * Creates a hash code for this RuleBasedCollationKey. The hash value is calculated on the
     * key itself, not the String from which the key was created.  Thus
     * if x and y are RuleBasedCollationKeys, then x.hashCode(x) == y.hashCode() if
     * x.equals(y) is true.  This allows language-sensitive comparison in a hash table.
     * See the CollatinKey class description for an example.
     * <p>
     * 为此RuleBasedCollat​​ionKey创建哈希代码。哈希值是对键本身计算的,而不是从中创建键的字符串。
     * 因此,如果x和y是RuleBasedCollat​​ionKeys,则x.hashCode(x)== y.hashCode()如果x.equals(y)为true。这允许在散列表中进行语言敏感的比较。
     * 有关示例,请参阅Collat​​inKey类描述。
     * 
     * 
     * @return the hash value based on the string's collation order.
     */
    public int hashCode() {
        return (key.hashCode());
    }

    /**
     * Converts the RuleBasedCollationKey to a sequence of bits. If two RuleBasedCollationKeys
     * could be legitimately compared, then one could compare the byte arrays
     * for each of those keys to obtain the same result.  Byte arrays are
     * organized most significant byte first.
     * <p>
     *  将RuleBasedCollat​​ionKey转换为位序列。如果两个RuleBasedCollat​​ionKeys可以合法比较,则可以比较这些键中的每一个的字节数组以获得相同的结果。
     * 字节数组首先组织为最高有效字节。
     * 
     */
    public byte[] toByteArray() {

        char[] src = key.toCharArray();
        byte[] dest = new byte[ 2*src.length ];
        int j = 0;
        for( int i=0; i<src.length; i++ ) {
            dest[j++] = (byte)(src[i] >>> 8);
            dest[j++] = (byte)(src[i] & 0x00ff);
        }
        return dest;
    }

    /**
     * A RuleBasedCollationKey can only be generated by Collator objects.
     * <p>
     */
    RuleBasedCollationKey(String source, String key) {
        super(source);
        this.key = key;
    }
    private String key = null;

}
