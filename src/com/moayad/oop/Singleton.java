package com.moayad.oop;

//Singleton design pattern
public class Singleton {
	String name;
	private Singleton() {}
	
	private static Singleton obj = new Singleton();
	public static Singleton getSingleton() {
		return obj;
	}
}
