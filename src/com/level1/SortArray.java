package com.level1;

public class SortArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,55,6,11};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted array is::");
		for(int s:arr) {
			System.out.print(s+" ");
		}
	}

}
