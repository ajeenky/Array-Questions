package com.velocity;

public class NonRepeatating {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 1,2,3,6,8};
		int count;
		System.out.println("Non repeatating element in an array is");
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			int j=0;
			for (; j < arr.length; j++) {
				if (arr[i] == arr[j]&&i!=j) {
					count++;
					
					
				}
				if(arr[i]!=arr[j] ){
					continue;
				}
			}
			if(count==0) {
				System.out.println(arr[i]);
			
			}
		}


	}
}
