package com.level1;

//Write a program to reverse an array
public class Reverse {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 0 };
		  for(int i=a.length-1; i>=0; i--) { 
			  System.out.print(" "+a[i]);
		 }
	}
}
