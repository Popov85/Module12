package com.goit.g2popov.module12;

/**
 * Resizable-array implementation of the <tt>MyList</tt> interface. Implements
 * all optional list operations: size, isEmpty, add, get
 * It permits all elements, including
 * <tt>null</tt>.
 *
 *  @author  Popov Andrii
 */
public class MyArrayList implements MyList {

        private Object[] temp;

        public MyArrayList() {
                this.temp = new Object[0];
        }

        @Override
        public int size() {
               return temp.length;
        }

        @Override
        public boolean isEmpty() {
                if (size() == 0) {
                        return true;
                }
                else {
                        return false;
                }
        }


        @Override
        public boolean add(Object e){

                Object[] t = temp.clone();

                temp = new Object[size()+1];

                for (int i=0; i<size()-1;i++) {
                        temp[i] = t[i];
                }

                temp[size()-1] = e;

                return true;
        }

        @Override
        public Object get(int index) throws IndexOutOfBoundsException{
                if (!isEmpty()) {
                        return this.temp[index];
                } else {
                        throw new IndexOutOfBoundsException("Failed to reach this element!");
                }
        }
}
