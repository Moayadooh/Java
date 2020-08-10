package com.moayad.tips;

public class Capitalize {

	public static void main(String[] args) {
		String text = "my name is Moayad. i'm from Barka";
		String letter;
		letter = text.substring(0,1).toUpperCase();
		text = letter + text.substring(1);
		
		StringBuilder result = new StringBuilder(text.length());
		boolean cap = false;
		for(int i=0;i<text.length();i++) {
			char c = text.charAt(i);
			if(c=='.')
				cap = true;
			if(cap && Character.isAlphabetic(c)) {
				c = Character.toUpperCase(c);
				cap = false;
			}
			result.append(c);
		}
		System.out.println(result);

	}

}
