package com.moayad.data_structure_and_algorithms.collections;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(82);
        al.add(2);
        al.remove(1);
        for(int value:al) {
            System.out.println(value);
        }
    }
}
