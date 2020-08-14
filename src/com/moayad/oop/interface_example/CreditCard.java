package com.moayad.oop.interface_example;

//Interface
//Object oriented design
public interface CreditCard {
	int num = 0;
	void Score(int age);
	/*default void Score(int age) {
		//Implementation
	}*/
}

class MasterCard implements CreditCard {
	@Override
	public void Score(int age) {
		if(age>40)
			System.out.println("Negative");
		else
			System.out.println("Positive");
	}
}
