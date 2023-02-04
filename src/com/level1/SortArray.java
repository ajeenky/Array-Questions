package com.level1;

import java.util.TreeSet;

public class SortArray {
	
	public TreeSet<Integer> getSortedArray(int [] arr){
		TreeSet<Integer> result = new TreeSet<Integer>();
		int l = arr.length;
		for(int i=0;i<l-1;i++) {
			 result.add(arr[i]);
		}
		
		return result;
	}
	public static void main(String[] args) {
		 int[] array = {4,5,6,8,3,6,9,1,2,7};
		 SortArray sortArray = new SortArray();
		 TreeSet<Integer> set = sortArray.getSortedArray(array);
		 System.out.println(set);
	}

}
