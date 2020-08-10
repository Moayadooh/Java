package com.moayad.data_structure;

class Data{
	int size;
	int[] array;
	Data(int size){
		this.size = size;
		array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = i + 1;
		}
	}
	int getSize() {
		return this.size;
	}
}

public class LinearSearch {

	public static void main(String[] args) {
		Data obj = new Data(1000);
		int num = 50;
		int numOfTry = 0;
		boolean isFound = false;
		for(int i=0;i<obj.size;i++) {
			numOfTry++;
			if(obj.array[i]==num)
			{
				System.out.println("Number is found after "+numOfTry+" try");
				isFound = true;
				break;
			}
		}
		if(!isFound)
			System.out.println("Number is not found");
	}
}