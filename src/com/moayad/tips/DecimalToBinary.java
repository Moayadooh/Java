package com.moayad.tips;

public class DecimalToBinary {

	public static void main(String[] args) {
		int input = 8;
		double temp = input;
		String result = "";
		while(temp!=0) {
			temp /= 2;
			if(temp==Math.floor(temp))
				result = "0" + result;
			else
				result = "1" + result;
			temp = Math.floor(temp);
		}
		if(result.equals(""))
			result = "0";
		System.out.println("The binary number of "+input+": "+result);
	}

}
