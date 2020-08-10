package com.moayad.data_structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class JavaClasses {

	public static void main(String[] args) {
		System.out.println("Array List:");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(82);
		al.add(2);
		al.remove(1);
		for(int value:al) {
			System.out.println(value);
		}
		System.out.println("\nLinked List:");
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Moayad");
		ls.add("Eyad");
		ls.remove();
		for(Object value:ls) {
			System.out.println(value);
		}
		System.out.println("\nHash Map:");
		HashMap<Integer,String> hm = new HashMap<>(2);
		hm.put(2, "Moayad");
		hm.put(8, "Eyad");
		hm.put(3, "Mohanned");
		hm.remove(2);
		System.out.println(hm.get(2));
		for(Map.Entry<Integer, String> m:hm.entrySet()) {
			System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
		}
		System.out.println("\nHash Set:");
		HashSet<Integer> hs = new HashSet<>();
		hs.add(8);
		hs.add(3);
		hs.add(15);
		for(int val:hs) {
			System.out.println(val);
		}
		System.out.println("\nTree Set:");
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(8);
		ts.add(3);
		ts.add(15);
		for(int val:ts) {
			System.out.println(val);
		}
		
	}

}
