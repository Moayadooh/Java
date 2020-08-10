package com.moayad.tips;

public class StrongNumber {

	public static void main(String[] args) {
		int input = 145;
		int temp = input;
		int sum = 0, r, fact;
		while(temp>0) {
			r = temp % 10;
			fact = 1;
			for(int i=1;i<=r;i++) {
				fact = fact * i;
			}
			temp = temp / 10;
			sum += fact;
		}
		if(sum==input)
			System.out.println(input+" is a strong number.");
		else
			System.out.println(input+" is not a strong number!!");

	}

}
