package com.velocity;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {16,59,34,86,42,61};
		
		for(int i=0;i<arr.length/2;i++) {
			//Swap 2 no. values using 3rd variable
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println("Reverse Order is:");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
