package com.level1;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {10, 20, 15, 2, 23, 90, 67};
		
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
System.out.println("Reversed Array is ::");
		for(int s:arr) {
			System.out.print(s+" ");
			
		}
	}

}
