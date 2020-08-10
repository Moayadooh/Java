package com.moayad.tips;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt((80+1) - 10) + 10; // Range form 10 to 80
		System.out.println(num);
	}

}
