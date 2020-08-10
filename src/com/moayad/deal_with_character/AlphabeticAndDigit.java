package com.moayad.deal_with_character;

public class AlphabeticAndDigit {

	public static void main(String[] args) {
		String sentence = "I'm 23 years old";
		char[] sentenceCharArray = sentence.toCharArray();
		
		int numOfAlphabets = 0;
		int numOfDigits = 0;
		for(int i=0;i<sentenceCharArray.length;i++) {
			if(Character.isAlphabetic(sentenceCharArray[i]))
				numOfAlphabets++;
			if(Character.isDigit(sentenceCharArray[i]))
				numOfDigits++;
		}
		System.out.println("Number of alphabets in the sentence is "+numOfAlphabets);
		System.out.println("Number of digits in the sentence is "+numOfDigits);

	}

}
