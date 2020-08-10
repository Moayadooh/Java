package com.moayad.oop.practise;

public class Singleton {
	String name;
	private Singleton() {
		
	}
	
	private static Singleton obj = new Singleton();
	static Singleton getSingleton() {
		return obj;
	}
}
