package com.moayad.data_structure;

class Sort{
	int[] array;
	int[] tempArray;
	Sort(int[] array){
		this.array = array;
		this.tempArray = new int[array.length];
	}
	public void DoMergeSort(int lowerIndex, int higherIndex) {
		if(lowerIndex<higherIndex)
		{
			int midIndex = (higherIndex+lowerIndex) / 2;
			DoMergeSort(lowerIndex,midIndex);
			DoMergeSort(midIndex+1,higherIndex);
			MergePart(lowerIndex,midIndex,higherIndex);
		}
	}
	public void MergePart(int lowerIndex, int midIndex, int higherIndex) {
		for(int i=lowerIndex;i<=higherIndex;i++)
		{
			tempArray[i] = array[i];
		}
		int i = lowerIndex;
		int j = midIndex + 1;
		int k = lowerIndex;
		while(i<=midIndex && j<=higherIndex)
		{
			if(tempArray[i]<=tempArray[j]) {
				array[k] = tempArray[i];
				i++;
			}
			else {
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}
		while(i<=midIndex) {
			array[k] = tempArray[i];
			i++;
			k++;
		}
		while(j<=higherIndex) {
			array[k] = tempArray[j];
			j++;
			k++;
		}
	}
}

public class MergeSort {

	public static void main(String[] args) {
		int[] array = {6, 2, 8, 1, 33, 7, 4, 5};
		new Sort(array).DoMergeSort(0, array.length - 1);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");

	}

}
