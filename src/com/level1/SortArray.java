package com.level1;

import java.util.ArrayList;
import java.util.Collections;
 
 

public class SortArray {
	
	public ArrayList<Integer> getSortedArray(int [] arr){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int l = arr.length;
		for(int i=0;i<l;i++) {
			 result.add(arr[i]);
		}
		Collections.sort(result);
		return result;
	}
	public static void main(String[] args) {
		 int[] array = {4,5,6,8,6,3,6,9,1,2,7};
		 SortArray sortArray = new SortArray();
		 ArrayList<Integer> set = sortArray.getSortedArray(array);
		 System.out.println(set);
	}

}
