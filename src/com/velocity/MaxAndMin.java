package com.velocity;

public class MaxAndMin {

	public static void main(String[] args) {
		int [] arr = {1,11,22,6,7,9};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) 
			{
				max=arr[i];
				
				}
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}	
			System.out.println("max number ::"+max);
			System.out.println("min number ::"+min);
		
	}

}
