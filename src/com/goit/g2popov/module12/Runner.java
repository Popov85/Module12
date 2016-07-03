package com.goit.g2popov.module12;

/**
 * Demonstrates the usage of MyArrayList class, specifically methods:
 * size(), isEmpty(), add(), get(index)
 */
public class Runner {

        public static void main(String[] args) {

                MyList list = new MyArrayList();

                System.out.println("Size: "+list.size());
                System.out.println("IsEmpty: "+list.isEmpty());

                list.add("A");
                list.add("B");
                list.add("C");

                System.out.println("Size: "+list.size());
                System.out.println("IsEmpty: "+list.isEmpty());

                System.out.println("MyArrayList contains: ");
                for (int i=0;i<list.size();i++) {
                        System.out.println(i+"-th = " +list.get(i));
                }
        }
}
