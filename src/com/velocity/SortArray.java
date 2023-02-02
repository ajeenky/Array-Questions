package com.velocity;

public class SortArray {
	
	public static int[] sort(int[] arr) {
		int l=arr.length;
		int temp;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,2,7,3,9,10,45,21,31};
		
		int[] a =sort(arr);
		for(int i:a) {
			System.out.println(i);
		}
	}

}
