package com.moayad.oop;

import com.moayad.helloworld.*; //import all classes from com.moayad.helloworld
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		/*MasterCard mc = new MasterCard();
		mc.Score(23);*/
		
		/*Calculate cal = new Calculate();
		System.out.println(cal.Add(5, 2));
		cal.getEquation();*/
		
		ArrayList<Family> persons = new ArrayList<Family>();
		persons.add(new Family("Moayad",23));
		persons.add(new Family("Eyad",1));
		persons.add(new Family("Salim",45));
		Collections.sort(persons);
		for(Family person:persons)
		{
			System.out.println("Name: "+person.name);
			System.out.println("Age: "+person.age);
		}
		
		//Array of object
		/*Student[] obj = new Student[2];
		for(int i=0;i<obj.length;i++) {
			System.out.print("Enter Student ID: ");
			int id = scan.nextInt();
			System.out.print("Enter Student Name: ");
			String name = scan.next();
			obj[i] = new Student(name,id);
		}
		for(Student st:obj) {
			System.out.println("ID: "+st.id);
			System.out.println("Name: "+st.name);
		}*/
		
		/*Directions dir = Directions.EAST;
		if(dir==Directions.WEST)
			System.out.println("He went to west");
		else
			System.out.println("I don't know where he went!");*/
		
		/*Employee<String> emp = new Employee<>();
		System.out.println(emp.Display("Moayad"));*/
		
		/*Outer out = new Outer();
		Outer.Nested nest = out.new Nested();
		nest.Display();*/
		
		/*Singleton obj = Singleton.getSingleton();
		obj.name = "Moayad";
		System.out.println(obj.name);
		Singleton obj1 = Singleton.getSingleton();
		System.out.println(obj1.name);*/

	}

}
