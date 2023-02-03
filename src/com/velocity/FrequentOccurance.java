package com.velocity;

public class FrequentOccurance {

	public static void occurance(int arr[], int n) {
		int count=0;
		for(int i :arr){
			if(i==n) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(-1);
		}else {
			System.out.println(count);
		}
		
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 2, 2, 3 };
		occurance(arr, 3);
	}

}
