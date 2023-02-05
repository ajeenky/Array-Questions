package com.level2;

public class PairWithSum {
	//Count Pairs with given sum
	// arr[] = {1, 5, 7, -1}, sum = 6
	public static void main(String[] args) {
	int  arr[] = {1, 5, 7, -1,1,5,4,2};
	int sum=6;
	int count=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(arr[i]+arr[j]==sum) {
				System.out.println("{"+i+","+j+"}");
				count++;
			}
		}		
	}
	System.out.println("Number of subarrays with given sum are: "+count);	
	}
}
