package com.array.practice;

public class CountPairs {
	
	
	//Count pairs with given sum

	public static void main(String[] args) {
		int arr[]= { 1, 5, 7, -1, 5 };
		int sum=6;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//compare 2 element with sum
				if(arr[i]+arr[j]==sum) {
					count++;
				}
			}
		}
		System.out.println("count of pairs are :"+count);
	}

}
