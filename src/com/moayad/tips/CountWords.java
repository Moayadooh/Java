package com.moayad.tips;

import java.util.ArrayList;

public class CountWords {

	public static void main(String[] args) {
		String text = "Fuzzy logic is a form of many-valued logic in which the truth values of variables may be any real number between 0 and 1 both inclusive. It is employed to handle the concept of partial truth, where the truth value may range between completely true and completely false.";
		text = text.replace(",", "").replace(".", "").replace("-", " ");
		String[] words = text.split(" ");
		ArrayList<String> wordsToExclude = new ArrayList<>();
		wordsToExclude.add("is");
		wordsToExclude.add("a");
		wordsToExclude.add("of");
		wordsToExclude.add("in");
		wordsToExclude.add("the");
		wordsToExclude.add("be");
		wordsToExclude.add("and");
		wordsToExclude.add("it");
		wordsToExclude.add("to");
		int count = 0;
		for(String word:words) {
			if(wordsToExclude.contains(word) || word.matches(".*\\d.*"))
				continue;
			else {
				System.out.println(word);
				count++;
			}
		}
		System.out.println(count);

	}

}
