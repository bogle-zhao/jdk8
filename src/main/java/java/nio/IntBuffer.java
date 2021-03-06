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

// -- This file was mechanically generated: Do not edit! -- //

package java.nio;










/**
 * An int buffer.
 *
 * <p> This class defines four categories of operations upon
 * int buffers:
 *
 * <ul>
 *
 *   <li><p> Absolute and relative {@link #get() <i>get</i>} and
 *   {@link #put(int) <i>put</i>} methods that read and write
 *   single ints; </p></li>
 *
 *   <li><p> Relative {@link #get(int[]) <i>bulk get</i>}
 *   methods that transfer contiguous sequences of ints from this buffer
 *   into an array; and</p></li>
 *
 *   <li><p> Relative {@link #put(int[]) <i>bulk put</i>}
 *   methods that transfer contiguous sequences of ints from an
 *   int array or some other int
 *   buffer into this buffer;&#32;and </p></li>
 *












 *
 *   <li><p> Methods for {@link #compact compacting}, {@link
 *   #duplicate duplicating}, and {@link #slice slicing}
 *   an int buffer.  </p></li>
 *
 * </ul>
 *
 * <p> Int buffers can be created either by {@link #allocate
 * <i>allocation</i>}, which allocates space for the buffer's
 *






 *
 * content, by {@link #wrap(int[]) <i>wrapping</i>} an existing
 * int array  into a buffer, or by creating a
 * <a href="ByteBuffer.html#views"><i>view</i></a> of an existing byte buffer.
 *

 *



































































































*

 *
 * <p> Like a byte buffer, an int buffer is either <a
 * href="ByteBuffer.html#direct"><i>direct</i> or <i>non-direct</i></a>.  A
 * int buffer created via the <tt>wrap</tt> methods of this class will
 * be non-direct.  An int buffer created as a view of a byte buffer will
 * be direct if, and only if, the byte buffer itself is direct.  Whether or not
 * an int buffer is direct may be determined by invoking the {@link
 * #isDirect isDirect} method.  </p>
 *

*








 *



 *
 * <p> Methods in this class that do not otherwise have a value to return are
 * specified to return the buffer upon which they are invoked.  This allows
 * method invocations to be chained.
 *































 *
 *
 * <p>
 *  一个int缓冲区。
 * 
 *  <p>此类在int缓冲区定义四种操作类别：
 * 
 * <ul>
 * 
 *  <li> <p>读取和写入单个int的绝对和相对{@link #get()<i> get </i>}和{@link #put(int)<i> put </i> ; </p> </li>
 * 
 *  <li> <p>相对{@link #get(int [])<i>批量get </i>}方法将int缓冲区的连续序列传送到数组中;和</p> </li>
 * 
 *  <li> <p>相对{@link #put(int [])<i>批量放入</i>}方法将int数组或其他int缓冲区的连续序列传送到此缓冲区;和</p> </li>
 * 
 *  <li> <p> {@link #compact compacting},{@link #duplicate duplicating}和{@link #slice slicing}一个int缓冲区的方
 * 法。
 *  </p> </li>。
 * 
 * </ul>
 * 
 *  <p>可以通过{@link #allocate <i>分配</i>}创建Int缓冲区,它为缓冲区分配空间
 * 
 *  内容,通过{@link #wrap(int [])<i>包装</i>}将现有的int数组导入缓冲区,或创建<a href="ByteBuffer.html#views"> <i> </i> </a>。
 * 
 * <p>像字节缓冲区一样,int缓冲区是<a href="ByteBuffer.html#direct"> <i>直接</i>或<i>非直接</i> </a>。
 * 通过此类的<tt> wrap </tt>方法创建的int缓冲区将是非直接的。作为字节缓冲区视图创建的int缓冲区将是直接的,如果且仅当字节缓冲区本身是直接的。
 * 可以通过调用{@link #isDirect isDirect}方法来确定int缓冲区是否是直接的。 </p>。
 * 
 *  <p>此类中没有返回值的方法被指定为返回调用它们的缓冲区。这允许方法调用链接。
 * 
 * 
 * @author Mark Reinhold
 * @author JSR-51 Expert Group
 * @since 1.4
 */

public abstract class IntBuffer
    extends Buffer
    implements Comparable<IntBuffer>
{

    // These fields are declared here rather than in Heap-X-Buffer in order to
    // reduce the number of virtual method invocations needed to access these
    // values, which is especially costly when coding small buffers.
    //
    final int[] hb;                  // Non-null only for heap buffers
    final int offset;
    boolean isReadOnly;                 // Valid only for heap buffers

    // Creates a new buffer with the given mark, position, limit, capacity,
    // backing array, and array offset
    //
    IntBuffer(int mark, int pos, int lim, int cap,   // package-private
                 int[] hb, int offset)
    {
        super(mark, pos, lim, cap);
        this.hb = hb;
        this.offset = offset;
    }

    // Creates a new buffer with the given mark, position, limit, and capacity
    //
    IntBuffer(int mark, int pos, int lim, int cap) { // package-private
        this(mark, pos, lim, cap, null, 0);
    }

























    /**
     * Allocates a new int buffer.
     *
     * <p> The new buffer's position will be zero, its limit will be its
     * capacity, its mark will be undefined, and each of its elements will be
     * initialized to zero.  It will have a {@link #array backing array},
     * and its {@link #arrayOffset array offset} will be zero.
     *
     * <p>
     *  分配一个新的int缓冲区。
     * 
     *  <p>新缓冲区的位置将为零,其限制将是其容量,其标记将是未定义的,并且其每个元素将初始化为零。
     * 它将有一个{@link #array返回数组},其{@link #arrayOffset数组偏移量}将为零。
     * 
     * 
     * @param  capacity
     *         The new buffer's capacity, in ints
     *
     * @return  The new int buffer
     *
     * @throws  IllegalArgumentException
     *          If the <tt>capacity</tt> is a negative integer
     */
    public static IntBuffer allocate(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException();
        return new HeapIntBuffer(capacity, capacity);
    }

    /**
     * Wraps an int array into a buffer.
     *
     * <p> The new buffer will be backed by the given int array;
     * that is, modifications to the buffer will cause the array to be modified
     * and vice versa.  The new buffer's capacity will be
     * <tt>array.length</tt>, its position will be <tt>offset</tt>, its limit
     * will be <tt>offset + length</tt>, and its mark will be undefined.  Its
     * {@link #array backing array} will be the given array, and
     * its {@link #arrayOffset array offset} will be zero.  </p>
     *
     * <p>
     *  将int数组包装到缓冲区中。
     * 
     *  <p>新的缓冲区将由给定的int数组支持;也就是说,对缓冲区的修改将导致数组被修改,反之亦然。
     * 新缓冲区的容量将为<tt> array.length </tt>,其位置将为<tt> offset </tt>,其限制将为<tt> offset + length </tt>,其标记将为未定义。
     * 它的{@link #array backing array}将是给定的数组,其{@link #arrayOffset数组偏移量}将为零。 </p>。
     * 
     * 
     * @param  array
     *         The array that will back the new buffer
     *
     * @param  offset
     *         The offset of the subarray to be used; must be non-negative and
     *         no larger than <tt>array.length</tt>.  The new buffer's position
     *         will be set to this value.
     *
     * @param  length
     *         The length of the subarray to be used;
     *         must be non-negative and no larger than
     *         <tt>array.length - offset</tt>.
     *         The new buffer's limit will be set to <tt>offset + length</tt>.
     *
     * @return  The new int buffer
     *
     * @throws  IndexOutOfBoundsException
     *          If the preconditions on the <tt>offset</tt> and <tt>length</tt>
     *          parameters do not hold
     */
    public static IntBuffer wrap(int[] array,
                                    int offset, int length)
    {
        try {
            return new HeapIntBuffer(array, offset, length);
        } catch (IllegalArgumentException x) {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Wraps an int array into a buffer.
     *
     * <p> The new buffer will be backed by the given int array;
     * that is, modifications to the buffer will cause the array to be modified
     * and vice versa.  The new buffer's capacity and limit will be
     * <tt>array.length</tt>, its position will be zero, and its mark will be
     * undefined.  Its {@link #array backing array} will be the
     * given array, and its {@link #arrayOffset array offset>} will
     * be zero.  </p>
     *
     * <p>
     *  将int数组包装到缓冲区中。
     * 
     * <p>新的缓冲区将由给定的int数组支持;也就是说,对缓冲区的修改将导致数组被修改,反之亦然。新缓冲区的容量和限制将为<tt> array.length </tt>,其位置将为零,其标记将为未定义。
     * 它的{@link #array backing array}将是给定的数组,其{@link #arrayOffset数组偏移量}将为零。 </p>。
     * 
     * 
     * @param  array
     *         The array that will back this buffer
     *
     * @return  The new int buffer
     */
    public static IntBuffer wrap(int[] array) {
        return wrap(array, 0, array.length);
    }






























































































    /**
     * Creates a new int buffer whose content is a shared subsequence of
     * this buffer's content.
     *
     * <p> The content of the new buffer will start at this buffer's current
     * position.  Changes to this buffer's content will be visible in the new
     * buffer, and vice versa; the two buffers' position, limit, and mark
     * values will be independent.
     *
     * <p> The new buffer's position will be zero, its capacity and its limit
     * will be the number of ints remaining in this buffer, and its mark
     * will be undefined.  The new buffer will be direct if, and only if, this
     * buffer is direct, and it will be read-only if, and only if, this buffer
     * is read-only.  </p>
     *
     * <p>
     *  创建一个新的int缓冲区,其内容是此缓冲区内容的共享子序列。
     * 
     *  <p>新缓冲区的内容将从此缓冲区的当前位置开始。对此缓冲区内容的更改将在新缓冲区中可见,反之亦然;两个缓冲器的位置,限制和标记值将是独立的。
     * 
     *  <p>新缓冲区的位置将为零,其容量和限制将是此缓冲区中剩余的整数,其标记将为未定义。新缓冲区将是直接的,如果且仅当这个缓冲区是直接的,并且只有当且仅当这个缓冲区是只读时,它才是只读的。 </p>
     * 
     * 
     * @return  The new int buffer
     */
    public abstract IntBuffer slice();

    /**
     * Creates a new int buffer that shares this buffer's content.
     *
     * <p> The content of the new buffer will be that of this buffer.  Changes
     * to this buffer's content will be visible in the new buffer, and vice
     * versa; the two buffers' position, limit, and mark values will be
     * independent.
     *
     * <p> The new buffer's capacity, limit, position, and mark values will be
     * identical to those of this buffer.  The new buffer will be direct if,
     * and only if, this buffer is direct, and it will be read-only if, and
     * only if, this buffer is read-only.  </p>
     *
     * <p>
     *  创建共享此缓冲区内容的新int缓冲区。
     * 
     *  <p>新缓冲区的内容将是此缓冲区的内容。对此缓冲区内容的更改将在新缓冲区中可见,反之亦然;两个缓冲器的位置,限制和标记值将是独立的。
     * 
     * <p>新缓冲区的容量,限制,位置和标记值将与此缓冲区的容量,限制,位置和标记值相同。新缓冲区将是直接的,如果且仅当这个缓冲区是直接的,并且只有当且仅当这个缓冲区是只读时,它才是只读的。 </p>
     * 
     * 
     * @return  The new int buffer
     */
    public abstract IntBuffer duplicate();

    /**
     * Creates a new, read-only int buffer that shares this buffer's
     * content.
     *
     * <p> The content of the new buffer will be that of this buffer.  Changes
     * to this buffer's content will be visible in the new buffer; the new
     * buffer itself, however, will be read-only and will not allow the shared
     * content to be modified.  The two buffers' position, limit, and mark
     * values will be independent.
     *
     * <p> The new buffer's capacity, limit, position, and mark values will be
     * identical to those of this buffer.
     *
     * <p> If this buffer is itself read-only then this method behaves in
     * exactly the same way as the {@link #duplicate duplicate} method.  </p>
     *
     * <p>
     *  创建一个新的只读int缓冲区,该缓冲区共享此缓冲区的内容。
     * 
     *  <p>新缓冲区的内容将是此缓冲区的内容。对此缓冲区内容的更改将在新缓冲区中可见;但是,新的缓冲区本身将是只读的,不允许修改共享内容。两个缓冲区的位置,极限和标记值将是独立的。
     * 
     *  <p>新缓冲区的容量,限制,位置和标记值将与此缓冲区的容量,限制,位置和标记值相同。
     * 
     *  <p>如果此缓冲区本身是只读的,那么此方法的行为方式与{@link #duplicate duplicate}方法完全相同。 </p>
     * 
     * 
     * @return  The new, read-only int buffer
     */
    public abstract IntBuffer asReadOnlyBuffer();


    // -- Singleton get/put methods --

    /**
     * Relative <i>get</i> method.  Reads the int at this buffer's
     * current position, and then increments the position.
     *
     * <p>
     *  相对<i> get </i>方法。读取该缓冲区当前位置的int,然后增加位置。
     * 
     * 
     * @return  The int at the buffer's current position
     *
     * @throws  BufferUnderflowException
     *          If the buffer's current position is not smaller than its limit
     */
    public abstract int get();

    /**
     * Relative <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p> Writes the given int into this buffer at the current
     * position, and then increments the position. </p>
     *
     * <p>
     *  相对<i> put </i>方法&nbsp;&nbsp; <i>(可选操作)</i>。
     * 
     *  <p>将给定的int写入到当前位置的缓冲区中,然后递增位置。 </p>
     * 
     * 
     * @param  i
     *         The int to be written
     *
     * @return  This buffer
     *
     * @throws  BufferOverflowException
     *          If this buffer's current position is not smaller than its limit
     *
     * @throws  ReadOnlyBufferException
     *          If this buffer is read-only
     */
    public abstract IntBuffer put(int i);

    /**
     * Absolute <i>get</i> method.  Reads the int at the given
     * index.
     *
     * <p>
     *  绝对<i> get </i>方法。读取给定索引处的int。
     * 
     * 
     * @param  index
     *         The index from which the int will be read
     *
     * @return  The int at the given index
     *
     * @throws  IndexOutOfBoundsException
     *          If <tt>index</tt> is negative
     *          or not smaller than the buffer's limit
     */
    public abstract int get(int index);














    /**
     * Absolute <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p> Writes the given int into this buffer at the given
     * index. </p>
     *
     * <p>
     *  绝对<i> put </i>方法&nbsp;&nbsp; <i>(可选操作)</i>。
     * 
     *  <p>在给定索引处将给定的int写入此缓冲区。 </p>
     * 
     * 
     * @param  index
     *         The index at which the int will be written
     *
     * @param  i
     *         The int value to be written
     *
     * @return  This buffer
     *
     * @throws  IndexOutOfBoundsException
     *          If <tt>index</tt> is negative
     *          or not smaller than the buffer's limit
     *
     * @throws  ReadOnlyBufferException
     *          If this buffer is read-only
     */
    public abstract IntBuffer put(int index, int i);


    // -- Bulk get operations --

    /**
     * Relative bulk <i>get</i> method.
     *
     * <p> This method transfers ints from this buffer into the given
     * destination array.  If there are fewer ints remaining in the
     * buffer than are required to satisfy the request, that is, if
     * <tt>length</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>, then no
     * ints are transferred and a {@link BufferUnderflowException} is
     * thrown.
     *
     * <p> Otherwise, this method copies <tt>length</tt> ints from this
     * buffer into the given array, starting at the current position of this
     * buffer and at the given offset in the array.  The position of this
     * buffer is then incremented by <tt>length</tt>.
     *
     * <p> In other words, an invocation of this method of the form
     * <tt>src.get(dst,&nbsp;off,&nbsp;len)</tt> has exactly the same effect as
     * the loop
     *
     * <pre>{@code
     *     for (int i = off; i < off + len; i++)
     *         dst[i] = src.get():
     * }</pre>
     *
     * except that it first checks that there are sufficient ints in
     * this buffer and it is potentially much more efficient.
     *
     * <p>
     *  相对批量<i> get </i>方法。
     * 
     * <p>此方法将int从此缓冲区传输到给定的目标数组。
     * 如果缓冲器中剩余的int小于满足请求所需的int,也就是说,如果<tt> length </tt> <tt>&gt; </tt>&lt; tt> remaining() tt>,那么不会传输任何int并
     * 抛出{@link BufferUnderflowException}。
     * <p>此方法将int从此缓冲区传输到给定的目标数组。
     * 
     *  <p>否则,此方法会将此缓冲区中的<tt>长度</tt> int复制到给定数组中,从此缓冲区的当前位置开始,到数组中给定的偏移量。然后,该缓冲区的位置增加<tt> length </tt>。
     * 
     *  <p>换句话说,对形式为<tt> src.get(dst,&nbsp; off,&nbsp; len)</tt>的此方法的调用与循环具有完全相同的效果
     * 
     *  <pre> {@ code for(int i = off; i <off + len; i ++)dst [i] = src.get()：} </pre>
     * 
     *  除了它首先检查在这个缓冲区中有足够的int,并且它可能更有效率。
     * 
     * 
     * @param  dst
     *         The array into which ints are to be written
     *
     * @param  offset
     *         The offset within the array of the first int to be
     *         written; must be non-negative and no larger than
     *         <tt>dst.length</tt>
     *
     * @param  length
     *         The maximum number of ints to be written to the given
     *         array; must be non-negative and no larger than
     *         <tt>dst.length - offset</tt>
     *
     * @return  This buffer
     *
     * @throws  BufferUnderflowException
     *          If there are fewer than <tt>length</tt> ints
     *          remaining in this buffer
     *
     * @throws  IndexOutOfBoundsException
     *          If the preconditions on the <tt>offset</tt> and <tt>length</tt>
     *          parameters do not hold
     */
    public IntBuffer get(int[] dst, int offset, int length) {
        checkBounds(offset, length, dst.length);
        if (length > remaining())
            throw new BufferUnderflowException();
        int end = offset + length;
        for (int i = offset; i < end; i++)
            dst[i] = get();
        return this;
    }

    /**
     * Relative bulk <i>get</i> method.
     *
     * <p> This method transfers ints from this buffer into the given
     * destination array.  An invocation of this method of the form
     * <tt>src.get(a)</tt> behaves in exactly the same way as the invocation
     *
     * <pre>
     *     src.get(a, 0, a.length) </pre>
     *
     * <p>
     *  相对批量<i> get </i>方法。
     * 
     *  <p>此方法将int从此缓冲区传输到给定的目标数组。调用此方法的形式<tt> src.get(a)</tt>的行为与调用的方式完全相同
     * 
     * <pre>
     *  src.get(a,0,a.length)</pre>
     * 
     * 
     * @param   dst
     *          The destination array
     *
     * @return  This buffer
     *
     * @throws  BufferUnderflowException
     *          If there are fewer than <tt>length</tt> ints
     *          remaining in this buffer
     */
    public IntBuffer get(int[] dst) {
        return get(dst, 0, dst.length);
    }


    // -- Bulk put operations --

    /**
     * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p> This method transfers the ints remaining in the given source
     * buffer into this buffer.  If there are more ints remaining in the
     * source buffer than in this buffer, that is, if
     * <tt>src.remaining()</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>,
     * then no ints are transferred and a {@link
     * BufferOverflowException} is thrown.
     *
     * <p> Otherwise, this method copies
     * <i>n</i>&nbsp;=&nbsp;<tt>src.remaining()</tt> ints from the given
     * buffer into this buffer, starting at each buffer's current position.
     * The positions of both buffers are then incremented by <i>n</i>.
     *
     * <p> In other words, an invocation of this method of the form
     * <tt>dst.put(src)</tt> has exactly the same effect as the loop
     *
     * <pre>
     *     while (src.hasRemaining())
     *         dst.put(src.get()); </pre>
     *
     * except that it first checks that there is sufficient space in this
     * buffer and it is potentially much more efficient.
     *
     * <p>
     *  相对批量<i> put </i>方法&nbsp;&nbsp; <i>(可选操作)</i>。
     * 
     * <p>此方法将保留在给定源缓冲区中的int传输到此缓冲区。
     * 如果源缓冲区中有比此缓冲区更多的int,也就是说,如果<tt> src.remaining()</tt>&nbsp; <tt>&gt; </tt> </tt>,则不会传输任何int,并且会抛出{@link BufferOverflowException}
     * 。
     * <p>此方法将保留在给定源缓冲区中的int传输到此缓冲区。
     * 
     *  <p>否则,此方法会从指定缓冲区中将<i> n </i>&nbsp; =&nbsp; <tt> src.remaining()</tt> int从每个缓冲区的当前位置开始复制到此缓冲区中。
     * 然后,两个缓冲器的位置增加n n。
     * 
     *  <p>换句话说,对形式<tt> dst.put(src)</tt>的此方法的调用具有与循环完全相同的效果
     * 
     * <pre>
     *  while(src.hasRemaining())dst.put(src.get()); </pre>
     * 
     *  除了它首先检查在这个缓冲器中有足够的空间并且它可能更有效率。
     * 
     * 
     * @param  src
     *         The source buffer from which ints are to be read;
     *         must not be this buffer
     *
     * @return  This buffer
     *
     * @throws  BufferOverflowException
     *          If there is insufficient space in this buffer
     *          for the remaining ints in the source buffer
     *
     * @throws  IllegalArgumentException
     *          If the source buffer is this buffer
     *
     * @throws  ReadOnlyBufferException
     *          If this buffer is read-only
     */
    public IntBuffer put(IntBuffer src) {
        if (src == this)
            throw new IllegalArgumentException();
        if (isReadOnly())
            throw new ReadOnlyBufferException();
        int n = src.remaining();
        if (n > remaining())
            throw new BufferOverflowException();
        for (int i = 0; i < n; i++)
            put(src.get());
        return this;
    }

    /**
     * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p> This method transfers ints into this buffer from the given
     * source array.  If there are more ints to be copied from the array
     * than remain in this buffer, that is, if
     * <tt>length</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>, then no
     * ints are transferred and a {@link BufferOverflowException} is
     * thrown.
     *
     * <p> Otherwise, this method copies <tt>length</tt> ints from the
     * given array into this buffer, starting at the given offset in the array
     * and at the current position of this buffer.  The position of this buffer
     * is then incremented by <tt>length</tt>.
     *
     * <p> In other words, an invocation of this method of the form
     * <tt>dst.put(src,&nbsp;off,&nbsp;len)</tt> has exactly the same effect as
     * the loop
     *
     * <pre>{@code
     *     for (int i = off; i < off + len; i++)
     *         dst.put(a[i]);
     * }</pre>
     *
     * except that it first checks that there is sufficient space in this
     * buffer and it is potentially much more efficient.
     *
     * <p>
     *  相对批量<i> put </i>方法&nbsp;&nbsp; <i>(可选操作)</i>。
     * 
     *  <p>此方法将int从给定源数组传输到此缓冲区。
     * 如果有更多的int要从数组复制而不是保留在这个缓冲区,也就是说,如果<tt> length </tt>&lt; tt&gt; </tt>&lt; tt>,那么不会传输任何int,并且会抛出{@link BufferOverflowException}
     * 。
     *  <p>此方法将int从给定源数组传输到此缓冲区。
     * 
     *  <p>否则,此方法会从给定数组中的<tt>长度</tt> int复制到此缓冲区,从数组中给定的偏移量和此缓冲区的当前位置开始。然后,该缓冲区的位置增加<tt> length </tt>。
     * 
     * <p>换句话说,对形式为<tt> dst.put(src,&nbsp; off,&nbsp; len)</tt>的此方法的调用与循环具有完全相同的效果
     * 
     *  <pre> {@ code for(int i = off; i <off + len; i ++)dst.put(a [i]); } </pre>
     * 
     *  除了它首先检查在这个缓冲器中有足够的空间并且它可能更有效率。
     * 
     * 
     * @param  src
     *         The array from which ints are to be read
     *
     * @param  offset
     *         The offset within the array of the first int to be read;
     *         must be non-negative and no larger than <tt>array.length</tt>
     *
     * @param  length
     *         The number of ints to be read from the given array;
     *         must be non-negative and no larger than
     *         <tt>array.length - offset</tt>
     *
     * @return  This buffer
     *
     * @throws  BufferOverflowException
     *          If there is insufficient space in this buffer
     *
     * @throws  IndexOutOfBoundsException
     *          If the preconditions on the <tt>offset</tt> and <tt>length</tt>
     *          parameters do not hold
     *
     * @throws  ReadOnlyBufferException
     *          If this buffer is read-only
     */
    public IntBuffer put(int[] src, int offset, int length) {
        checkBounds(offset, length, src.length);
        if (length > remaining())
            throw new BufferOverflowException();
        int end = offset + length;
        for (int i = offset; i < end; i++)
            this.put(src[i]);
        return this;
    }

    /**
     * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p> This method transfers the entire content of the given source
     * int array into this buffer.  An invocation of this method of the
     * form <tt>dst.put(a)</tt> behaves in exactly the same way as the
     * invocation
     *
     * <pre>
     *     dst.put(a, 0, a.length) </pre>
     *
     * <p>
     *  相对批量<i> put </i>方法&nbsp;&nbsp; <i>(可选操作)</i>。
     * 
     *  <p>此方法将给定源int数组的整个内容传输到此缓冲区。调用此方法的形式<tt> dst.put(a)</tt>的行为与调用的方式完全相同
     * 
     * <pre>
     *  dst.put(a,0,a.length)</pre>
     * 
     * 
     * @param   src
     *          The source array
     *
     * @return  This buffer
     *
     * @throws  BufferOverflowException
     *          If there is insufficient space in this buffer
     *
     * @throws  ReadOnlyBufferException
     *          If this buffer is read-only
     */
    public final IntBuffer put(int[] src) {
        return put(src, 0, src.length);
    }































































































    // -- Other stuff --

    /**
     * Tells whether or not this buffer is backed by an accessible int
     * array.
     *
     * <p> If this method returns <tt>true</tt> then the {@link #array() array}
     * and {@link #arrayOffset() arrayOffset} methods may safely be invoked.
     * </p>
     *
     * <p>
     *  告诉这个缓冲区是否由可访问的int数组支持。
     * 
     *  <p>如果此方法返回<tt> true </tt>,则可以安全地调用{@link #array()数组}和{@link #arrayOffset()arrayOffset}方法。
     * </p>
     * 
     * 
     * @return  <tt>true</tt> if, and only if, this buffer
     *          is backed by an array and is not read-only
     */
    public final boolean hasArray() {
        return (hb != null) && !isReadOnly;
    }

    /**
     * Returns the int array that backs this
     * buffer&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p> Modifications to this buffer's content will cause the returned
     * array's content to be modified, and vice versa.
     *
     * <p> Invoke the {@link #hasArray hasArray} method before invoking this
     * method in order to ensure that this buffer has an accessible backing
     * array.  </p>
     *
     * <p>
     *  返回用于回退此缓冲区的int数组&nbsp;&nbsp; <i>(可选操作)</i>。
     * 
     *  <p>修改此缓冲区的内容将导致返回的数组的内容被修改,反之亦然。
     * 
     *  <p>在调用此方法之前调用{@link #hasArray hasArray}方法,以确保此缓冲区具有可访问的后备数组。 </p>
     * 
     * 
     * @return  The array that backs this buffer
     *
     * @throws  ReadOnlyBufferException
     *          If this buffer is backed by an array but is read-only
     *
     * @throws  UnsupportedOperationException
     *          If this buffer is not backed by an accessible array
     */
    public final int[] array() {
        if (hb == null)
            throw new UnsupportedOperationException();
        if (isReadOnly)
            throw new ReadOnlyBufferException();
        return hb;
    }

    /**
     * Returns the offset within this buffer's backing array of the first
     * element of the buffer&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p> If this buffer is backed by an array then buffer position <i>p</i>
     * corresponds to array index <i>p</i>&nbsp;+&nbsp;<tt>arrayOffset()</tt>.
     *
     * <p> Invoke the {@link #hasArray hasArray} method before invoking this
     * method in order to ensure that this buffer has an accessible backing
     * array.  </p>
     *
     * <p>
     *  返回缓冲区的第一个元素(可选操作)</i>在此缓冲区的后备数组中的偏移量。
     * 
     *  <p>如果此缓冲区由数组支持,则缓冲区位置<i> p </i>对应于数组索引<i> p </i>&nbsp; <tt> arrayOffset()</tt>。
     * 
     * <p>在调用此方法之前调用{@link #hasArray hasArray}方法,以确保此缓冲区具有可访问的后备数组。 </p>
     * 
     * 
     * @return  The offset within this buffer's array
     *          of the first element of the buffer
     *
     * @throws  ReadOnlyBufferException
     *          If this buffer is backed by an array but is read-only
     *
     * @throws  UnsupportedOperationException
     *          If this buffer is not backed by an accessible array
     */
    public final int arrayOffset() {
        if (hb == null)
            throw new UnsupportedOperationException();
        if (isReadOnly)
            throw new ReadOnlyBufferException();
        return offset;
    }

    /**
     * Compacts this buffer&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p> The ints between the buffer's current position and its limit,
     * if any, are copied to the beginning of the buffer.  That is, the
     * int at index <i>p</i>&nbsp;=&nbsp;<tt>position()</tt> is copied
     * to index zero, the int at index <i>p</i>&nbsp;+&nbsp;1 is copied
     * to index one, and so forth until the int at index
     * <tt>limit()</tt>&nbsp;-&nbsp;1 is copied to index
     * <i>n</i>&nbsp;=&nbsp;<tt>limit()</tt>&nbsp;-&nbsp;<tt>1</tt>&nbsp;-&nbsp;<i>p</i>.
     * The buffer's position is then set to <i>n+1</i> and its limit is set to
     * its capacity.  The mark, if defined, is discarded.
     *
     * <p> The buffer's position is set to the number of ints copied,
     * rather than to zero, so that an invocation of this method can be
     * followed immediately by an invocation of another relative <i>put</i>
     * method. </p>
     *
















     *
     * <p>
     *  压缩此缓冲区&nbsp;&nbsp; <i>(可选操作)</i>。
     * 
     *  <p>缓冲区当前位置和其限制(如果有)之间的整数被复制到缓冲区的开头。
     * 也就是说,将索引<i> p </i>&nbsp; =&nbsp; <tt> position()</tt>处的int复制到索引零,int在索引<i> p </i> +&nbsp; 1复制到索引1,依此类
     * 推,直到索引<tt> limit()</tt>&nbsp;  - &nbsp; 1的int被复制到索引<i> n </i>&nbsp; =&nbsp; ; <tt> limit()</tt>&nbsp;
     *   - &nbsp; <tt> 1 </tt>&nbsp;  - &nbsp; <i> p </i>。
     *  <p>缓冲区当前位置和其限制(如果有)之间的整数被复制到缓冲区的开头。然后将缓冲器的位置设置为<n> n + 1,并将其限制设置为其容量。如果定义,标记将被丢弃。
     * 
     *  <p>缓冲区的位置设置为复制的int数量,而不是零,因此可以立即调用另一个相对</i>方法来调用此方法。 </p>
     * 
     * 
     * @return  This buffer
     *
     * @throws  ReadOnlyBufferException
     *          If this buffer is read-only
     */
    public abstract IntBuffer compact();

    /**
     * Tells whether or not this int buffer is direct.
     *
     * <p>
     *  告诉这个int缓冲区是否是直接的。
     * 
     * 
     * @return  <tt>true</tt> if, and only if, this buffer is direct
     */
    public abstract boolean isDirect();



    /**
     * Returns a string summarizing the state of this buffer.
     *
     * <p>
     *  返回汇总此缓冲区状态的字符串。
     * 
     * 
     * @return  A summary string
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(getClass().getName());
        sb.append("[pos=");
        sb.append(position());
        sb.append(" lim=");
        sb.append(limit());
        sb.append(" cap=");
        sb.append(capacity());
        sb.append("]");
        return sb.toString();
    }






    /**
     * Returns the current hash code of this buffer.
     *
     * <p> The hash code of a int buffer depends only upon its remaining
     * elements; that is, upon the elements from <tt>position()</tt> up to, and
     * including, the element at <tt>limit()</tt>&nbsp;-&nbsp;<tt>1</tt>.
     *
     * <p> Because buffer hash codes are content-dependent, it is inadvisable
     * to use buffers as keys in hash maps or similar data structures unless it
     * is known that their contents will not change.  </p>
     *
     * <p>
     *  返回此缓冲区的当前散列码。
     * 
     *  <p> int缓冲区的哈希码仅取决于其剩余元素;即从<tt> position()</tt>到<tt> limit()</tt>&nbsp; <tt> 1 </tt>的元素,并包含该元素。
     * 
     * <p>因为缓冲区哈希码是内容相关的,所以不宜使用缓冲区作为哈希映射或类似数据结构中的键,除非知道它们的内容不会改变。 </p>
     * 
     * 
     * @return  The current hash code of this buffer
     */
    public int hashCode() {
        int h = 1;
        int p = position();
        for (int i = limit() - 1; i >= p; i--)

            h = 31 * h + get(i);



        return h;
    }

    /**
     * Tells whether or not this buffer is equal to another object.
     *
     * <p> Two int buffers are equal if, and only if,
     *
     * <ol>
     *
     *   <li><p> They have the same element type,  </p></li>
     *
     *   <li><p> They have the same number of remaining elements, and
     *   </p></li>
     *
     *   <li><p> The two sequences of remaining elements, considered
     *   independently of their starting positions, are pointwise equal.







     *   </p></li>
     *
     * </ol>
     *
     * <p> A int buffer is not equal to any other type of object.  </p>
     *
     * <p>
     *  告诉这个缓冲区是否等于另一个对象。
     * 
     *  <p>两个int缓冲区是相等的,如果,只有,
     * 
     * <ol>
     * 
     *  <li> <p>它们具有相同的元素类型,</p> </li>
     * 
     *  <li> <p>它们具有相同数量的剩余元素,</p> </li>
     * 
     *  <li> <p>剩余元素的两个序列,独立于其起始位置考虑,是逐点相等的。
     * 
     *  </p> </li>
     * 
     * </ol>
     * 
     *  <p> int缓冲区不等于任何其他类型的对象。 </p>
     * 
     * @param  ob  The object to which this buffer is to be compared
     *
     * @return  <tt>true</tt> if, and only if, this buffer is equal to the
     *           given object
     */
    public boolean equals(Object ob) {
        if (this == ob)
            return true;
        if (!(ob instanceof IntBuffer))
            return false;
        IntBuffer that = (IntBuffer)ob;
        if (this.remaining() != that.remaining())
            return false;
        int p = this.position();
        for (int i = this.limit() - 1, j = that.limit() - 1; i >= p; i--, j--)
            if (!equals(this.get(i), that.get(j)))
                return false;
        return true;
    }

    private static boolean equals(int x, int y) {



        return x == y;

    }

    /**
     * Compares this buffer to another.
     *
     * <p> Two int buffers are compared by comparing their sequences of
     * remaining elements lexicographically, without regard to the starting
     * position of each sequence within its corresponding buffer.








     * Pairs of {@code int} elements are compared as if by invoking
     * {@link Integer#compare(int,int)}.

     *
     * <p> A int buffer is not comparable to any other type of object.
     *
     * <p>
     * 
     * 
     * @return  A negative integer, zero, or a positive integer as this buffer
     *          is less than, equal to, or greater than the given buffer
     */
    public int compareTo(IntBuffer that) {
        int n = this.position() + Math.min(this.remaining(), that.remaining());
        for (int i = this.position(), j = that.position(); i < n; i++, j++) {
            int cmp = compare(this.get(i), that.get(j));
            if (cmp != 0)
                return cmp;
        }
        return this.remaining() - that.remaining();
    }

    private static int compare(int x, int y) {






        return Integer.compare(x, y);

    }

    // -- Other char stuff --


































































































































































































    // -- Other byte stuff: Access to binary data --



    /**
     * Retrieves this buffer's byte order.
     *
     * <p> The byte order of an int buffer created by allocation or by
     * wrapping an existing <tt>int</tt> array is the {@link
     * ByteOrder#nativeOrder native order} of the underlying
     * hardware.  The byte order of an int buffer created as a <a
     * href="ByteBuffer.html#views">view</a> of a byte buffer is that of the
     * byte buffer at the moment that the view is created.  </p>
     *
     * <p>
     *  将此缓冲区与另一个进行比较。
     * 
     *  <p>两个int缓冲器通过按字典顺序比较其剩余元素的序列来进行比较,而不考虑每个序列在其相应缓冲器内的起始位置。
     * 
     *  对{@code int}元素进行比较,如同通过调用{@link Integer#compare(int,int)}。
     * 
     *  <p> int缓冲区与任何其他类型的对象都不可比。
     * 
     * @return  This buffer's byte order
     */
    public abstract ByteOrder order();

































































}
