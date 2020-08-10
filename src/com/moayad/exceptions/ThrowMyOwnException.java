package com.moayad.exceptions;

public class ThrowMyOwnException {

	public static void main(String[] args) {
		
		try
		{
			int[] arr = new int[5];
			arr[2] = 9;
			if(arr[0]==0)
				throw new MoayadException("First index must no be equal to zero!!");
		}
		catch(MoayadException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
