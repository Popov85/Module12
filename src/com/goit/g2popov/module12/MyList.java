package com.goit.g2popov.module12;

import java.util.Collection;

/**
 * An ordered collection (also known as a <i>sequence</i>).  The user of this
 * interface has precise control over where in the list each element is
 * inserted.  The user can access elements by their integer index (position in
 * the list), and search for elements in the list.<p>
 *
 * @author  Popov Andrii
 */
public interface MyList {
        /**
         * Returns the number of elements in this list.  If this list contains
         * more than <tt>Integer.MAX_VALUE</tt> elements, returns
         * <tt>Integer.MAX_VALUE</tt>.
         *
         * @return the number of elements in this list
         */
        int size();

        /**
         * Returns <tt>true</tt> if this list contains no elements.
         *
         * @return <tt>true</tt> if this list contains no elements
         */
        boolean isEmpty();

        /**
         * Appends the specified element to the end of this list (optional
         * operation).
         *
         * <p>Lists that support this operation may place limitations on what
         * elements may be added to this list.  In particular, some
         * lists will refuse to add null elements, and others will impose
         * restrictions on the type of elements that may be added.  List
         * classes should clearly specify in their documentation any restrictions
         * on what elements may be added.
         *
         * @param e element to be appended to this list
         * @return <tt>true</tt> (as specified by {@link Collection#add})
         * @throws UnsupportedOperationException if the <tt>add</tt> operation
         *         is not supported by this list
         * @throws ClassCastException if the class of the specified element
         *         prevents it from being added to this list
         * @throws NullPointerException if the specified element is null and this
         *         list does not permit null elements
         * @throws IllegalArgumentException if some property of this element
         *         prevents it from being added to this list
         */
        boolean add(Object e);

        /**
         * Returns the element at the specified position in this list.
         *
         * @param index index of the element to return
         * @return the element at the specified position in this list
         * @throws IndexOutOfBoundsException if the index is out of range
         *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
         */
        Object get(int index);
}
