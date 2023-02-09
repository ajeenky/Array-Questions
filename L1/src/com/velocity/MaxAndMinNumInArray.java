package com.velocity;

public class MaxAndMinNumInArray {

	//Find the minimum and maximum element in an array
	public static void main(String[] args) {
		int arr[]= {3, 1, 10, 59, 10000, 167};
		int min=arr[0];
		int max=arr[0];
		
		
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]<min){
					min=arr[i];
				}
				if(arr[i]>max) {
					max=arr[i];
				}
			
			
		}
		
		System.out.println("Minimum Number::"+min+"  maximum number::"+max);
	}

}
