package com.moayad.tips;

public class Fibonacci {

	public static void main(String[] args) {
		int input = 6;
		int n1 = 0, n2 = 1, sum = 1;
		for(int i=1;i<input;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(sum+" ");
				sum = n1 + n2;
				n1 = n2;
				n2 = sum;
			}
			System.out.println();
		}

	}

}
