package com.moayad.problems;

import java.util.HashMap;
import java.util.Map;

public class FindWordinListofCharacters {

	public static void main(String[] args) {
		String input = "cool";
		String letters = "abcolmolf";
		
		HashMap<Character,Integer> listOfLetters = new HashMap<Character,Integer>();
		for(int i=0;i<letters.length();i++) {
			if(listOfLetters.containsKey(letters.charAt(i))) {
				int oldValue = listOfLetters.get(letters.charAt(i));
				listOfLetters.put(letters.charAt(i), ++oldValue);
			}
			else
				listOfLetters.put(letters.charAt(i), 1);
		}
		
		HashMap<Character,Integer> inputLetters = new HashMap<Character,Integer>();
		for(int i=0;i<input.length();i++) {
			if(inputLetters.containsKey(input.charAt(i))) {
				int oldValue = inputLetters.get(input.charAt(i));
				inputLetters.put(input.charAt(i), ++oldValue);
			}
			else
				inputLetters.put(input.charAt(i), 1);
		}
		
		boolean isPossible = true;;
		for(int i=0;i<input.length();i++) {
			if(listOfLetters.containsKey(input.charAt(i))) {
				int inputValue = inputLetters.get(input.charAt(i));
				int letterValue = listOfLetters.get(input.charAt(i));
				if(letterValue>=inputValue)
					continue;
				else {
					isPossible = false;
					break;
				}
			}
			else {
				isPossible = false;
				break;
			}
		}
		if(isPossible)
			System.out.println("yes");
		else
			System.out.println("no");
		
	}

}
