package com.moayad.problems;

import java.util.LinkedList;

public class DivisibleBy3or5 {

	public static void main(String[] args) {
		LinkedList<Integer> nums = divisibleBy3or5();
		for(Integer value:nums)
			System.out.println(value);
	}
	public static LinkedList<Integer> divisibleBy3or5() {
		LinkedList<Integer> numbers = new LinkedList<>();
		boolean isDivisibleBy3 = false;
		boolean isDivisibleBy5 = false;
		int num = 0;
		double result = 0;
		for(int i = 1;i <= 100;i++) {
			num = i;
			
			//divide the number by 3
			result = Double.parseDouble(String.valueOf(i)) / 3;
			
			//check if there is no remaining numbers after point in the decimal format
			if(result==Math.floor(result))
				isDivisibleBy3 = true;
			
			//divide the number by 5
			result = Double.parseDouble(String.valueOf(i)) / 5;
			
			//check if there is no remaining numbers after point in the decimal format
			if(result==Math.floor(result))
				isDivisibleBy5 = true;
			
			if(isDivisibleBy3 && isDivisibleBy5) //check if the number is divisible by both 3 and 5
			{
				isDivisibleBy3 = false;
				isDivisibleBy5 = false;
				continue;
			}
			else if(!isDivisibleBy3 && !isDivisibleBy5) //check if the number is not divisible by both 3 and 5
			{
				isDivisibleBy3 = false;
				isDivisibleBy5 = false;
				continue;
			}
			else //add the number to the linked list if it is divisible by either 3 or 5
				numbers.add(num);
			isDivisibleBy3 = false;
			isDivisibleBy5 = false;
		}
		return numbers;
	}
	/*
	 * I have used linked list data structure because:
	 * - it avoid allocate extra space in the memory
	 * - the data already sorted.
	 */

}
