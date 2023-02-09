package com.velocity;
//Find the Kth smallest ELement
import java.util.Arrays;

public class KthElement {
	
	public  static int findKthElement(int a[], int k) {
	
		
		Arrays.sort(a);
		
		return a[k-1];
	}

	public static void main(String[] args) {
		
		int  a[] = {12, 3, 5, 7, 19};
		int k=1;
		
        System.out.println("Kth Smallest Element is");
        System.out.println(findKthElement(a, k));
	}

}
