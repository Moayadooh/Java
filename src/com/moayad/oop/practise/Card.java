package com.moayad.oop.practise;

public interface Card {
	public void Data(String owner, int number);
}

class MyCard implements Card{

	@Override
	public void Data(String owner, int number) {
		System.out.println("Card Owner: "+owner);
		System.out.println("Card Number: "+number);
	}
	
}