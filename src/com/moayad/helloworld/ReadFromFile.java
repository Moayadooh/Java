package com.moayad.helloworld;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		
		
		String line1 = br.readLine();
		String values[] = line1.split(" ");
		
		ArrayList<Integer> a = new ArrayList<>();
		for(String val : values) {
			a.add(Integer.parseInt(val));
		}
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		a.clear();
		
		long b = Long.parseLong(br.readLine());
		System.out.println(b);
		
		String n = br.readLine();
		System.out.println(n);
		br.close();
		
		/*String a = String.valueOf(s.nextInt());
		String b = String.valueOf(s.nextInt());
		String c = String.valueOf(s.nextInt());
		
		System.out.println(a+" "+b+" "+c);*/

	}

}
