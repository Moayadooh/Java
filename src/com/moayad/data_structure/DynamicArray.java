package com.moayad.data_structure;

import java.util.Arrays;

class Array{
	int currentSize;
	int newSize;
	int currentIndex;
	Object[] array;
	Array(){
		array = new Object[1];
		this.currentIndex = 0;
	}
	public void put(Object value) {
		CheckSize();
		array[currentIndex++] = value;
	}
	private void CheckSize() {
		currentSize = array.length;
		if(currentIndex==currentSize) {
			newSize = currentSize * 2;
			array = Arrays.copyOf(array, newSize);
		}
	}
	public void Display() {
		for(int i=0;i<currentIndex;i++) {
			System.out.println(array[i]);
		}
	}
	public int getSize() {
		return array.length;
	}
}

public class DynamicArray {

	public static void main(String[] args) {
		Array arr = new Array();
		arr.put("Eyad");
		arr.put("Salim");
		arr.put("Muna");
		arr.put("Eyad");
		arr.put(5);
		arr.put("Eyad");
		arr.put("Eyad");
		arr.put("Eyad");
		arr.put("Eyad");
		arr.Display();
		System.out.println(arr.getSize());

	}

}
