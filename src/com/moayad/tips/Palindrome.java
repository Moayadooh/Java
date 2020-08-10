package com.moayad.tips;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("\nPalindrome Numbers:");
		int input = 151;
		int temp = input;
		int sum = 0, r;
		while(temp!=0) {
			r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if(sum==input)
			System.out.println(input+" is a palindrome.");
		else
			System.out.println(input+" is not a palindrome!!");
		
		System.out.println("\nPalindrome Letters:");
		String word = "MoaoM";
		int firstIndex = 0;
		int lastIndex = word.length() - 1;
		boolean isPalindrome = true;
		while(lastIndex>firstIndex) {
			if(word.charAt(firstIndex)!=word.charAt(lastIndex)) {
				isPalindrome = false;
				break;
			}
			firstIndex++;
			lastIndex--;
		}
		if(isPalindrome)
			System.out.println(word+" is a palindrome.");
		else
			System.out.println(word+" is not a palindrome!!");

	}

}
