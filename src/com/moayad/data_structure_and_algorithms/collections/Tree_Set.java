package com.moayad.data_structure_and_algorithms.collections;

import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(8);
        ts.add(3);
        ts.add(15);
        for(int val:ts) {
            System.out.println(val);
        }
    }
}
