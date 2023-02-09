package com.velocity;

public class NegativeNumber {
	
	// Move all negative numbers to beginning 
	//and positive to end with constant extra space

	public static void main(String[] args) {
		int arr[]= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
			
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
