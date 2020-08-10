package com.moayad.problems;

import java.util.ArrayList;

public class CapitalizeLastLetter {

	public static void main(String[] args) {
		String text = "Engineering requires many building blocks and tools. To produce real world results, one must practically apply mathematics and sciences to tangible problems and scenarios. Included in this category are the various technical topics which cut across engineering disciplines, encompassing many branches of mathematics and scientific disciplines.";
		
		String[] words = text.split(" ");
		int size = 0;
		int lastLetterPosition = 0;
		String word, capitalizedLetter;
		ArrayList<String> toRemove = new ArrayList<>();
		toRemove.add(",");
		toRemove.add(".");
		for(int i=0;i<words.length;i++)
		{
			size = words[i].length();
			lastLetterPosition = size - 1;
			word = words[i];
			capitalizedLetter = word.substring(lastLetterPosition, word.length());
			if(toRemove.contains(capitalizedLetter))
			{
				word = word.substring(0, word.length()-1);
				capitalizedLetter = word.substring(lastLetterPosition-1, word.length());
			}
			capitalizedLetter = capitalizedLetter.toUpperCase();
			word = word.substring(0, word.length()-1) + capitalizedLetter;
			words[i] = word;
		}
		System.out.println(text);
		//String result = Arrays.toString(words);
		//System.out.println(result.toString());
		String result = "";
		for(int i=0;i<words.length;i++)
		{
			result += words[i]+" ";
		}
		System.out.println(result);

	}

}
