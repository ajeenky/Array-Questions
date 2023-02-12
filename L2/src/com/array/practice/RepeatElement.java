package com.array.practice;


import java.util.*;


public class RepeatElement {

	
	//Find the first repeating element in an array of integers
	
	public static void main(String[] args) {
		int arr[] = {10, 5, 3, 4, 3, 5, 6};
		int temp=0;
		
		Set<Integer> set=new  HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				temp= arr[i];
			}
			else {
			set.add(arr[i]);
			}
		}
	
		if(temp!=0) {
			System.out.println(temp);
		}

	}

}
