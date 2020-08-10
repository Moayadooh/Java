package com.moayad.problems;

import java.util.ArrayList;

public class WordDistance {

	public static void main(String[] args) {
		ArrayList<String> listOfWords = new ArrayList<>();
		listOfWords.add("hot");
		listOfWords.add("dot");
		listOfWords.add("dog");
		listOfWords.add("lot");
		listOfWords.add("log");
		listOfWords.add("cog");
		
		String from = "doc";
		String goal = "cog";
		
		boolean isPossible = false;
		for(int i=0;i<listOfWords.size();i++) 
		{
			if(listOfWords.contains(goal)) 
			{
				isPossible = true;
				break;
			}
		}
		
		if(!isPossible)
			System.out.println("The path for "+goal+" cannot be found!!");
		else 
		{
			System.out.print("-->"+from);
			String nearestWord = "";
			while(!nearestWord.equals(goal)) 
			{
				int smallest = 0;
				int j = 0;
				int totDistance = 0;
				if(!listOfWords.isEmpty())
				{
					totDistance = TotalDistance(listOfWords.get(0), from);
					smallest = totDistance;
				}
				for(int i=0;i<listOfWords.size();i++) 
				{
					totDistance = TotalDistance(listOfWords.get(i), from);
					if(totDistance<smallest) 
					{
						smallest = totDistance;
						j = i;
					}
				}
				if(!listOfWords.isEmpty())
					nearestWord = listOfWords.remove(j);
				from = nearestWord;
				System.out.print("-->"+nearestWord);
			}
			
		}

	}
	public static int TotalDistance(String word, String start)
	{
		int totDistance = 0;
		for(int k=0;k<word.length();k++)
		{
			int distance = Math.abs(String.valueOf(word.charAt(k)).compareTo(String.valueOf(start.charAt(k))));
			totDistance += distance;
		}
		return totDistance;
	}

}
