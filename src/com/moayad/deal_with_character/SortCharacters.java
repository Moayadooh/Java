package com.moayad.deal_with_character;

import java.util.Arrays;

public class SortCharacters {

	public static void main(String[] args) {
		//Input
		String word1 = "cool";
		String word2 = "loco";
		
		//Convert the strings to character array and sort the letters
		char[] arr1 = word1.toCharArray();
		char[] arr2 = word2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//Convert the character array to strings
		String res1 = new String(arr1);
		String res2 = new String(arr2);
		
		if(res1.equals(res2))
			System.out.println("the letters in both words are matches");
		else
			System.out.println("the letters in both words are not matches");
	}

}
