package com.moayad.deal_with_string;

public class ReplaceCharacters {

	public static void main(String[] args) {
		String text = "The replace() method searches a string for a specified character, and returns a new string where the specified character(s) are replaced.";
		
		//Replace specific character
		text = text.replace('(', '[');
		
		//Replace specific string
		text = text.replace(')', ']');
		text = text.replaceAll("method", "function");
		
		System.out.println(text);
	}

}
