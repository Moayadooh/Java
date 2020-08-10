package com.moayad.oop.practise;

public class Student implements Comparable<Student> {
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student arg0) {
		return this.age - arg0.age;
	}
}
