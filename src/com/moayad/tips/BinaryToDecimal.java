package com.moayad.tips;

public class BinaryToDecimal {

	public static void main(String[] args) {
		String input = "10001110";
		int number = 0;
		int result = 0;
		for(int i=input.length()-1;i>=0;i--) {
			if(number==0)
				number = 1;
			else
				number *= 2;
			
			if(input.charAt(i)=='1')
				result += number;
			else
				continue;
		}
		System.out.println("The decimal number of "+input+": "+result);

	}

}
