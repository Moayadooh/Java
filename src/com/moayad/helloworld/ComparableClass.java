package com.moayad.helloworld;

public class ComparableClass {

	public static void main(String[] args) {
		Integer num = 1;
		Comparable val = 5;
		System.out.println(val.compareTo(num));
		
		//Comparable class
		//if it return 1 'first element is grater than second element' //Ascending order
		//if it return -1 'first element is less than second element' //Descending order
		//if it return 0 'both elements equal'
	}

}
