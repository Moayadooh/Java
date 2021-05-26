package com.moayad.deal_with_string;

import java.util.ArrayList;
import java.util.Collections;

public class SortWords {

	public static void main(String[] args) {
		ArrayList<String> listOfWords = new ArrayList<>();
		listOfWords.add("Moayad");
		listOfWords.add("Eyad");
		listOfWords.add("Salim");

		Collections.sort(listOfWords);

		for(String name:listOfWords)
			System.out.println(name);
	}

}
