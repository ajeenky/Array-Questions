package com.codepractice;

public class ReverseArrayElements {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		
		for(int i=a.length-1;i>=0;i--)
		{
		 int b=a[i];
		System.out.print(" "+b);	
		}
		
	}
}
