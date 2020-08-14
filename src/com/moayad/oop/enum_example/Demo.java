package com.moayad.oop.enum_example;

public class Demo {
    public static void main(String[] args) {
        Directions dir = Directions.EAST;
		if(dir==Directions.WEST)
			System.out.println("He went to west");
		else
			System.out.println("I don't know where he went!");
    }
}
