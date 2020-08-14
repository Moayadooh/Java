package com.moayad.oop.nested_class;

//Nested class
public class Outer {
	private String name = "Moayad";
	class Nested{
		void Display() {
			System.out.println(name);
		}
	}
}
