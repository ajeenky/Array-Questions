package com.L2;

public class Test2 {

	public static void main(String[] args) {
		int[] arr= {2,3,4,2,3,2};
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
				
			}
		}
		System.out.println("number of duplicates::"+count);

	}

}
