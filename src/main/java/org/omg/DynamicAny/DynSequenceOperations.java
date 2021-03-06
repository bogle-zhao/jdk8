/***** Lobxxx Translate Finished ******/
package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynSequenceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Thursday, April 30, 2015 12:42:08 PM PDT
*/


/**
    * DynSequence objects support the manipulation of IDL sequences.
    * <p>
    *  DynSequence对象支持对IDL序列的操作。
    * 
    */
public interface DynSequenceOperations  extends org.omg.DynamicAny.DynAnyOperations
{

  /**
        * Returns the current length of the sequence.
        * <p>
        *  返回序列的当前长度。
        * 
        */
  int get_length ();

  /**
        * Sets the length of the sequence.
        * Increasing the length of a sequence adds new elements at the tail without affecting the values
        * of already existing elements. Newly added elements are default-initialized.
        * Increasing the length of a sequence sets the current position to the first newly-added element
        * if the previous current position was -1. Otherwise, if the previous current position was not -1,
        * the current position is not affected.
        * Decreasing the length of a sequence removes elements from the tail without affecting the value
        * of those elements that remain. The new current position after decreasing the length of a sequence
        * is determined as follows:
        * <UL>
        * <LI>If the length of the sequence is set to zero, the current position is set to -1.
        * <LI>If the current position is -1 before decreasing the length, it remains at -1.
        * <LI>If the current position indicates a valid element and that element is not removed when the length
        *     is decreased, the current position remains unaffected.
        * <LI>If the current position indicates a valid element and that element is removed,
        *     the current position is set to -1.
        * </UL>
        *
        * <p>
        *  设置序列的长度。增加序列的长度在尾部添加新元素而不影响已经存在的元素的值。新添加的元素是默认初始化的。如果前一当前位置为-1,则增加序列长度可将当前位置设置为第一个新添加的元素。
        * 否则,如果前一当前位置不是-1,则当前位置不受影响。减少序列长度会从尾部删除元素,而不会影响剩余元素的值。在减小序列的长度之后的新的当前位置确定如下：。
        * <UL>
        *  <LI>如果序列的长度设置为零,则当前位置设置为-1。 <LI>如果在减小长度之前当前位置为-1,它保持为-1。
        *  <LI>如果当前位置指示有效元素,并且当长度减小时不会删除该元素,则当前位置保持不受影响。 <LI>如果当前位置指示有效元素,并且该元素被删除,则当前位置设置为-1。
        * </UL>
        * 
        * 
        * @exception InvalidValue if this is a bounded sequence and len is larger than the bound
        */
  void set_length (int len) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;

  /**
        * Returns the elements of the sequence.
        * <p>
        * 返回序列的元素。
        * 
        */
  org.omg.CORBA.Any[] get_elements ();

  /**
        * Sets the elements of a sequence.
        * The length of the DynSequence is set to the length of value. The current position is set to zero
        * if value has non-zero length and to -1 if value is a zero-length sequence.
        *
        * <p>
        *  设置序列的元素。 DynSequence的长度设置为值的长度。如果值具有非零长度,则将当前位置设置为零,如果值为零长度序列,则将当前位置设置为-1。
        * 
        * 
        * @exception TypeMismatch if value contains one or more elements whose TypeCode is not equivalent
        *            to the element TypeCode of the DynSequence
        * @exception InvalidValue if the length of value exceeds the bound of a bounded sequence
        */
  void set_elements (org.omg.CORBA.Any[] value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue;

  /**
        * Returns the DynAnys representing the elements of the sequence.
        * <p>
        *  返回表示序列元素的DynAnys。
        * 
        */
  org.omg.DynamicAny.DynAny[] get_elements_as_dyn_any ();

  /**
        * Sets the elements of a sequence using DynAnys.
        * The length of the DynSequence is set to the length of value. The current position is set to zero
        * if value has non-zero length and to -1 if value is a zero-length sequence.
        *
        * <p>
        *  使用DynAnys设置序列的元素。 DynSequence的长度设置为值的长度。如果值具有非零长度,则将当前位置设置为零,如果值为零长度序列,则将当前位置设置为-1。
        * 
        * @exception TypeMismatch if value contains one or more elements whose TypeCode is not equivalent
        *            to the element TypeCode of the DynSequence
        * @exception InvalidValue if the length of value exceeds the bound of a bounded sequence
        */
  void set_elements_as_dyn_any (org.omg.DynamicAny.DynAny[] value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue;
} // interface DynSequenceOperations
