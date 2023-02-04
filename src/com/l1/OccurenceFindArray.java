package com.l1;

public class OccurenceFindArray {
	//Find The Occurence of the Element in an Array
	public static void main(String[] args) {
		int a[] = {1, 1, 2, 2, 2, 2, 3,3};
		int k = 2;
		int count = 0;
		//for loop use to traverse an array 
		for(int i=0; i<a.length; i++) { 
			//If statement check that element in array is equal to given element
			if(a[i] == k) {
				count++;
			}
		}
		System.out.println(count);

	}

}
