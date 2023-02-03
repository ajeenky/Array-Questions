package com.velocity;

public class ReverseArray {
	public static void getReverseArray(int[] arr,int n) {
		int i=0,temp;
		int j=n-1;
		
		while(i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
	}
	

	public static void main(String[] args) {
	int[] arr= {6,7,3,67,23,3,243,87};
	int n=arr.length;
	getReverseArray(arr, n);

	}

}
