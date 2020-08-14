package com.moayad.data_structure_and_algorithms.collections;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("Moayad");
        ls.add("Eyad");
        ls.remove();
        for(Object value:ls) {
            System.out.println(value);
        }
    }
}
