package com.moayad.data_structure;

import java.util.*;
import java.util.PriorityQueue;

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

		System.out.println("\nPriority Queue:");
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(5);
		pq.add(1);
		pq.add(12);
		pq.add(3);
		pq.add(17);
		System.out.println(pq.poll());
		//System.out.println(pq.peek()); //Print the value in the front

		System.out.println("\nVector:");
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
