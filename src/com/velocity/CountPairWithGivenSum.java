package com.velocity;

public class CountPairWithGivenSum {

	public static void main(String[] args) {
		
		int []a = { 1, 5, 7, -1};
		int count = 0;
		int sum = 6;
		
		for(int i = 0 ; i<a.length ; i++) {
			for(int j = i+1 ; j<a.length ; j++) {
				if(a[i]+a[j]==sum) {
					count++;
				}
			}
		}
		System.out.println("Count of pair is : "+ count);
	}

}
