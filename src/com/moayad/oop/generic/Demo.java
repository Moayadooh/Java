package com.moayad.oop.generic;

public class Demo {
    public static void main(String[] args) {
        Employee<String> emp = new Employee<>();
		System.out.println(emp.Display("Moayad"));
    }
}
