package com.moayad.deal_with_string;

public class CombineStrings {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Numbers: ");
		for(int i = 0;i < 50;i++)
		{
			sb.append(i+1+"|");
		}
		String text = sb.toString();
		System.out.println(text);
	}

}
