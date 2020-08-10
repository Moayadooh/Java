package com.moayad.tips;

public class base {

	public static void main(String[] args) {
		int input = 23;
		int base = 3;
		int temp = input;
		int sum = 0, r;
		while(temp>0) {
			r = temp % base;
			sum = sum * base + r;
			temp = temp / base;
			System.out.print(r);
		}
		System.out.println();
		if(sum==input)
			System.out.println(input+" base 3 is a palindrome.");
		else
			System.out.println(input+" base 3 is not a palindrome.");

	}

}
