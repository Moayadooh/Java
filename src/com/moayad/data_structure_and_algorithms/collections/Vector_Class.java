package com.moayad.data_structure_and_algorithms.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Class {
    public static void main(String[] args) {
        /* Vector of initial capacity(size) of 2 */
        Vector<String> vec = new Vector<>(2);

        /* Adding elements to a vector*/
        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");
        vec.addElement("Fig");

        /* check size and capacityIncrement*/
        System.out.println("Size is: "+vec.size());
        System.out.println("Default capacity increment is: "+vec.capacity());

        /*Display Vector elements*/
        Enumeration en = vec.elements();
        System.out.println("\nElements are:");
        while(en.hasMoreElements())
            System.out.print(en.nextElement() + " ");
    }
}
