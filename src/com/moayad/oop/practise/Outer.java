package com.moayad.oop.practise;

public class Outer {
	String name;
	Outer(){
		
	}
	class Nested {
		Nested(String name){
			Outer.this.name = name;
		}
	}
	public String getName() {
		return name;
	}
}
