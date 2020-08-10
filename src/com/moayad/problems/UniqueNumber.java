package com.moayad.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueNumber {

	public static void main(String[] args) {
		//Find unique number in array
		ArrayList<Integer> array = new ArrayList<>();
		array.add(5);
		array.add(5);
		array.add(3);
		array.add(3);
		array.add(3);
		array.add(3);
		array.add(2);
		array.add(2);
		array.add(2);
		array.add(7);
		array.add(8);
		array.add(8);
		array.add(8);
		array.add(9);
		array.add(0);
		
		ArrayList<Integer> UK = UniqueNum(array);
		for(int i=0;i<UK.size();i++)
		{
			System.out.println(UK.get(i));
		}

	}
	public static ArrayList<Integer> UniqueNum(ArrayList<Integer> arr)
	{
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(Integer key: arr)
		{
			if(hm.containsKey(key))
			{
				int oldKey = hm.get(key);
				hm.put(key, ++oldKey);
			}
			else
				hm.put(key, 1);
		}
		ArrayList<Integer> UK = new ArrayList<>();
		for(Map.Entry val : hm.entrySet())
		{
			if((int)val.getValue()==1)
			{
				UK.add((int) val.getKey());
			}
		}
		return UK;
	}

}
