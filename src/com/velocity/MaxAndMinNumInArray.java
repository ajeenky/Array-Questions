package com.velocity;

public class MaxAndMinNumInArray {

	public static void main(String[] args) {
		int[] arr = {65,15,138,53,6,75,68};
		int max = arr[0];
		int min = arr[0];
		for(int i =0;i<arr.length;i++) {	
			//for max element
			if(arr[i]>max) {
				max = arr[i];
			}
			//for min element
			if(arr[i]<min) {
				min = arr[i];
			}
		}System.out.println(max);
		 System.out.println(min);

	}

}
