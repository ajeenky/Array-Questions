package com.velocity;

public class SubArrayEqualSum {
//find subarray with the Given Sum
	public static void findSum(int[]arr,int n) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum==n) {
					System.out.println("Sum is found between "+i+" and "+j);
				}
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		int [] array= {1,4,20,3,10};
		int sum=13;
		findSum(array,sum);
	

	}

}
