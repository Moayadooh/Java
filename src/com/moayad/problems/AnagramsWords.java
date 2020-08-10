package com.moayad.problems;

public class AnagramsWords {

	public static void main(String[] args) {
		anagrams("thear", "earth");
	}
	public static void anagrams(String str1, String str2) {
		if(str1.length()!=str2.length()) //check if the length of both strings are not equals
			return;
		else if(str1.equals(str2)) //check if the both strings are equals
			return;
		else {
			boolean isAnagrams = false;
			
			//take the first letter
			String firstLetter = str1.substring(0,1);
			
			//take the remaining letters except the first letter
			String remainingLetters = str1.substring(1,str1.length());
			
			//combine the remaining letters and the first letter (the first letter will be in the last)
			String newWord = remainingLetters+firstLetter;
			for(int i=0;i<str1.length();i++) {
				if(newWord.equals(str2)) //check if both strings are equals
				{
					isAnagrams = true;
					break;
				}
				//take the first letter
				firstLetter = newWord.substring(0,1);
				//take the remaining letters except the first letter
				remainingLetters = newWord.substring(1,str1.length());
				//combine the remaining letters and the first letter (the first letter will be in the last)
				newWord = remainingLetters+firstLetter;
			}
			if(isAnagrams) //check if the strings are anagrams after check in the loop
				System.out.println("the two character strings are anagrams");
		}
	}
}
