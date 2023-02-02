package com.velocity;

public class Sort0s1s2s {
	
	// Sort an array of 0s, 1s and 2s

	public static void main(String[] args) {
		int arr[]= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int temp;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
			for(int k:arr) {
				System.out.print(k+" ");
			}
	}

}
