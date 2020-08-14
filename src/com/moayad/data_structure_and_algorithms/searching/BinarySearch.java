package com.moayad.data_structure_and_algorithms.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = new int[1000];
		for(int i=0;i<array.length;i++) {
			array[i] = i + 1;
		}
		int num = 50;
		int first = 0;
		int last = array.length - 1;
		int numOfTry = 0;
		boolean isFound = false;
		for(int i=0;i<array.length;i++) {
			int mid = (first + last) / 2;
			numOfTry++;
			if(num==array[mid]) {
				isFound = true;
				break;
			}
			else if(num>array[mid])
				first = mid + 1;
			else if(num<array[mid])
				last = mid - 1;
		}
		if(isFound)
			System.out.println("Number is found after "+numOfTry+" try");
		else
			System.out.println("Number is not found");
	}

}
