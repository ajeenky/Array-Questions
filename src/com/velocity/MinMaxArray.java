package com.velocity;

public class MinMaxArray {

	public static void main(String[] args) {
		
		int arr[] = {5,8,6,2,3,9,10,15};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("maximum number is : " +max);
		System.out.println("minimum number is : " +min);
	}
}
