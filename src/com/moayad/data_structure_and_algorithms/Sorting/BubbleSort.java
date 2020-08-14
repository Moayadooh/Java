package com.moayad.data_structure_and_algorithms.Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] values = {6, 2, 8, 1, 33, 7, 4, 5};
		Sort(values);
		for(int i=0;i<values.length;i++)
			System.out.print(values[i]+" ");
		
	}
	public static void Sort(int[] arr)
	{
		int last = arr.length - 1;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<last;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			last--;
		}
	}

}
