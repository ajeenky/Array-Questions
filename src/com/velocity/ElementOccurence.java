package com.velocity;

import java.util.Scanner;

public class ElementOccurence {

	public static void main(String[] args) {
		int[]  arr= {1,2,3,4,1,2,3,1,4,2,7,3,9,7,8,5};
		int count=0;
		System.out.println("enter number whose occupancy is to be find");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n)
				count++;
			
		}
		System.out.println("Given number is "+count+" times occure in an arrray");
		
		
		

	}

}
