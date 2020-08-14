package com.moayad.oop.design_pattern;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton obj = Singleton.getSingleton();
		obj.name = "Moayad";
		System.out.println(obj.name);
		Singleton obj1 = Singleton.getSingleton();
		System.out.println(obj1.name);
    }
}
