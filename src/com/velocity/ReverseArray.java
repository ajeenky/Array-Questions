package com.velocity;

public class ReverseArray {

	public static void main(String[] args) 
	{
		/*Write a program to reverse the array
		 * int[] a={2,3,4,5,6,7}
		 * int[] a={7,6,5,4,3,2}
		 */
		
		int[] a= {2,3,4,5,6,7}; 
		
		System.out.println("given array is:");
		for(int i:a) {
			System.out.println(i+" ");
		}
		
		System.out.print("reverse array:");
		
		for(int i=a.length-1;i>=0;i--) 
		{
			System.out.println(a[i]+" ");
		}
		
		
		}

}
