package com.moayad.problems;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{6,4,8},{9,1,2},{3,6,4}};
		//for(int row=0;row<matrix.length;row++)
		//{
			/*for(int col=0;col<matrix.length;col++)
			{
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();*/
		//}
		
		int row = 0;
		int col = 0;
		for(col=0;col<matrix.length;col++)
		{
			System.out.print(matrix[row][col]+" ");
		}
		col = matrix.length - 1;
		for(row=1;row<matrix.length;row++)
		{
			System.out.print(matrix[row][col]+" ");
		}
		row = matrix.length - 1;
		for(col=matrix.length-2;col>=0;col--)
		{
			System.out.print(matrix[row][col]+" ");
		}
		row = matrix.length/2;
		for(col=0;col<=matrix.length/2;col++)
		{
			System.out.print(matrix[row][col]+" ");
		}
	}

}
