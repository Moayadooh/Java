package com.moayad.oop;

//Nested class
public class Outer {
	private String name = "Moayad";
	class Nested{
		void Display() {
			System.out.println(name);
		}
	}
}
