package com.l1;

public class ReverseString {
	// Write a program to reverse an array or string
	
	public static void main(String[] args) {
		
		String str = "Greek";
		char[] array = str.toCharArray();
		
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}
      
	}

}
