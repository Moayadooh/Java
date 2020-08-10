package com.moayad.exceptions;

import java.util.ArrayList;

public class Exceptions {
	public static void main(String[] args) {
		Exceptions ex = new Exceptions();
		myclass m = ex.new myclass();
		ArrayList<myclass> al = new ArrayList<>();
		al.add(m);
		al.add(m);
		//myclass m1 = null;
		try {
			//System.out.println(m1.getX());
			//System.out.println(al.get(2).getX());
			System.out.println(m.getX());
			System.out.println(m.getY());
			System.out.println(m.getX()+m.getY().length());
			
		}
		catch(IndexOutOfBoundsException | ArithmeticException e) //Adding multiple exceptions
		{
			System.out.println("Index out of bounds exception");
		}
		catch(NullPointerException e) 
		{
			System.out.println("Null pointer exception");
		}
		catch(RuntimeException e) 
		{
			System.out.println("Run time exception");
		}
		catch(Exception e) //Preferable to put exception class in the last
		{
			System.out.println("something went wrong!");
		}
		/*catch(NullPointerException e) 
		{
		System.out.println("Null pointer exception");
		}*/ //Null pointer exception cannot be after the Run time exception or exception classes
		finally {
			System.out.println("Finally");
		}
		
	}
	class myclass{
		private int x; //by default = 0
		private String y; //by default = null
		public myclass(){
			
		}
		public int getX() {
			return x;
		}
		public String getY() {
			return y;
		}
	}
}
