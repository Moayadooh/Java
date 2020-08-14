package com.moayad.oop.comparable_class;

//Comparable class
//if it return 1 'first element is grater than second element' //Ascending order
//if it return -1 'first element is less than second element' //Descending order
//if it return 0 'both elements equal'
public class Family implements Comparable<Family> {
	String name;
	int age;
	Family(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Family o) {
		return this.age - o.age;
		//return name.compareTo(o.name);
	}
}
