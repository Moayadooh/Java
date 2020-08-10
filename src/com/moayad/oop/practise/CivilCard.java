package com.moayad.oop.practise;

public abstract class CivilCard {
	abstract void Display(int id);
}

class MyCivilCard extends CivilCard {

	@Override
	void Display(int id) {
		System.out.println("Card ID: "+id);
		
	}
	
}