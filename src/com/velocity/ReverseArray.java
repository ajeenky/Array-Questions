package com.velocity;

//reverse the array
public class ReverseArray {

		public static void main(String[] args) {
			
			int arr[]= {5,3,22,45,21,8,11};
			int arrlength = arr.length;
			System.out.println("Unsorted array ::");
			for(int r : arr) {
			System.out.print(" "+r);
			}
			System.out.println();
			System.out.println("sorted array ::");
			for(int i=arrlength-1;i>=0;i--) {
				
				System.out.print(" "+arr[i]);
			}
			
	}
}