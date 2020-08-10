package com.moayad.data_structure;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {6, 2, 8, 1, 33, 7, 4, 5};
		sort(array, 0, array.length-1);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");

	}
	
	public static void sort(int[] array, int firstIndex, int lastIndex)
	{
		if(firstIndex<lastIndex)
		{
			int i = firstIndex;
			int j = lastIndex;
			int mid = (firstIndex+lastIndex) / 2;
			int pivot = array[mid];
			while(i<=j)
			{
				while(array[i]<pivot)
				{
					i++;
				}
				while(array[j]>pivot)
				{
					j--;
				}
				if(i<=j)
				{
					swap(array, i, j);
					i++;
					j--;
				}
			}
			sort(array,firstIndex,j);
			sort(array,i,lastIndex);
		}
	}
	
	public static void swap(int[] array, int item1, int item2)
	{
		int temp = array[item1];
		array[item1] = array[item2];
		array[item2] = temp;
	}

}
