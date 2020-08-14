package com.moayad.data_structure_and_algorithms.Sorting;

public class HeapSort {

	public static void main(String[] args) {
		int[] array = {6, 2, 8, 1, 33, 7, 4, 5};
		sort(array);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");

	}
	
	static int lastIndex = 0; //last index in the array
	static int parent = 0; //index of the parent node in the array
	static int left = 0; //index of the left node in the array
	static int right = 0; //index of the right node in the array
	public static void heapify(int[] array, int i)
	{
		parent = i;
		left = 2 * i + 1;
		right = 2 * i + 2;
		if(left <= lastIndex && array[left] >= array[parent])
			parent = left;
		if(right <= lastIndex && array[right] >= array[parent])
			parent = right;
		if(parent!=i)
		{
			swap(array, parent, i);
			heapify(array, parent);
		}
	}
	
	public static void swap(int[] array, int parent, int i)
	{
		int temp = array[parent];
		array[parent] = array[i];
		array[i] = temp;
	}
	
	public static void sort(int[] array)
	{
		lastIndex = array.length - 1;
		for(int i=lastIndex/2;i>=0;i--)
			heapify(array, i);
		while(lastIndex>0)
		{
			swap(array, 0, lastIndex);
			lastIndex--;
			heapify(array, 0);
		}
	}

}
