package com.moayad.exceptions;

public class ThrowExceptions {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 0;
		
		try
		{
			if(y==0)
				throw new ArithmeticException();
			//int z = x / y;
		}
		catch(ArithmeticException e)
		{
			System.out.println("y must not be equal to zero!!");
		}

	}

}
