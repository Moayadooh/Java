package com.moayad.problems;

public class LongestSequence {

	public static void main(String[] args) {
		//Find longest sequence of 1’s with one flip
		int[] arr = {1,1,0,1,1,1,0,1,0,1,1,0,1,1,1,1};
		int num = 0;
		int k = 0;
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				num = 1;
				k = i - 1;
				while(arr[k]>0)
				{
					num++;
					k--;
					if(k==-1)
						break;
				}
				k = i + 1;
				while(arr[k]>0)
				{
					num++;
					k++;
					if(k==arr.length)
						break;
				}
				if(num>max)
					max = num;
			}
		}
		System.out.println(max);

	}

}
