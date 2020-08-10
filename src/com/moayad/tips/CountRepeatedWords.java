package com.moayad.tips;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedWords {

	public static void main(String[] args) {
		String text = "Fuzzy logic is a form of many-valued logic in which the truth values of variables may be any real number between 0 and 1 both inclusive. It is employed to handle the concept of partial truth, where the truth value may range between completely true and completely false.";
		text = text.replace(",", "").replace(".", "").replace("-", " ");
		String[] words = text.split(" ");
		HashMap<String,Integer> hm = new HashMap<>();
		int value = 0;
		for(String word:words) {
			if(hm.containsKey(word)) {
				value = hm.get(word);
				hm.put(word, ++value);
			}
			else
				hm.put(word, 1);
		}
		for(Map.Entry word : hm.entrySet()) {
			System.out.println(word.getKey()+" "+word.getValue());
		}

	}

}
