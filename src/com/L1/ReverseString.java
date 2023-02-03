package com.L1;

public class ReverseString {
//Write a program to reverse an array or string
	public static void main(String[] args) {
		String str = "Hello java";
		char ch [] =str.toCharArray();
		
		for(int i = ch.length-1; i>=0; i-- ) {
			System.out.print(ch[i]);
		}

	}

}
