package com.moayad.data_structure_and_algorithms.collections;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(8);
        hs.add(3);
        hs.add(15);
        for(int val:hs) {
            System.out.println(val);
        }
    }
}
