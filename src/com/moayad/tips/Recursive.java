package com.moayad.tips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive {

	public static void main(String[] args) throws IOException {
		System.out.print("Enter a number: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = fibo(num);
		System.out.println("Fibonacci sequence for "+num+" is "+result);

	}
	public static int fibo(int num)
	{
		if(num<=1)
			return num;
		else
			return fibo(num-1) + fibo(num-2);
	}

}
