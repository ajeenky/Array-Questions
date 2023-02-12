package com.array.practice;

import java.util.*;

public class NonRepeate {
	
	//Find first non-repeating element in a given Array of integers

	public static void main(String[] args) {
		int arr[]={-1, 2, -1, 3, 0};
		int temp=0;
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])==false)) {
				temp=arr[i];
				
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
