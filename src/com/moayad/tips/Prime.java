package com.moayad.tips;

public class Prime {

	public static void main(String[] args) {
		/*for(int i=2;i<=100;i++) {
			boolean isPrime = true;
			for(int j=i;j>2;j--) {
				if(i%(j-1)==0) {
					isPrime  = false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i);
		}*/
		
		boolean isPrime = true;
		int num = 91;
		for(int i=num;i>2;i--) {
			if(num%(i-1)==0) {
				isPrime  = false;
				System.out.println(i-1);
				break;
			}
		}
		if(isPrime)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");

	}

}
