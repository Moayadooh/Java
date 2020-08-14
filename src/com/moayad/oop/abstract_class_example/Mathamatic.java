package com.moayad.oop.abstract_class_example;

//Abstract class
//Directly creating instance from outside abstract class is NOT ALLOWED
//Directly creating instance from inside abstract class is ALLOWED
public abstract class Mathamatic {
	int num;
	abstract int Add(int num1, int num2);
	void getEquation() {
		System.out.println("2 + 2 = 4");
	}
	/*public static void main(String[] args) {
		Mathamatic[] m = new Mathamatic[2];
    }*/
}

class Calculate extends Mathamatic {
	@Override
	int Add(int num1, int num2) {
		return (num1 + num2) * 2;
	}
}
