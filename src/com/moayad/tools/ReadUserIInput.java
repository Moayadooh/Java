package com.moayad.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserIInput {

	public static void main(String[] args) throws IOException {
		//BufferedReader br = null;
		int value = 0;
		
		/*try
		{
			System.out.print("Enter a number: ");
			br = new BufferedReader(new InputStreamReader(System.in));
			value = Integer.parseInt(br.readLine());
			System.out.println(value);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			br.close();
		}*/
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) //will close the buffered automatically
		{
			System.out.print("Enter a number: ");
			value = Integer.parseInt(br.readLine());
			System.out.println(value);
		}

	}

}
