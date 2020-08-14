package com.moayad.data_structure_and_algorithms.collections;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>(2);
        hm.put(2, "Moayad");
        hm.put(8, "Eyad");
        hm.put(3, "Mohanned");
        hm.remove(2);
        System.out.println(hm.get(2));
        for(Map.Entry<Integer, String> m:hm.entrySet()) {
            System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
        }
    }
}
