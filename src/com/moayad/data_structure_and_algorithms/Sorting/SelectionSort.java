package com.moayad.data_structure_and_algorithms.Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] values = {4,2,9,1,5,4,3,7};
		Sort(values);
		for(int i=0;i<values.length;i++)
			System.out.print(values[i]+" ");
		
	}
	public static void Sort(int[] arr)
	{
		int smallest;
		int index = 0;
		boolean smallestFuond = false;
		for(int i=0;i<arr.length;i++)
		{
			smallest = arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<smallest)
				{
					smallest = arr[j];
					index = j;
					smallestFuond = true;
				}
			}
			if(smallestFuond)
			{
				int temp = arr[i];
				arr[i] = smallest;
				arr[index] = temp;
				smallestFuond = false;
			}
		}
	}

}
