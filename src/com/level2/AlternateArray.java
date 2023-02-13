package com.level2;

import java.util.ArrayList;
import java.util.List;

//Input:  arr[] = {1, 2, 3, -4, -1, 4}
//Output: arr[] = {-4, 1, -1, 2, 3, 4}

public class AlternateArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, -4, -1, 4};
		rearrangeArr(arr);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	
	}

	private static void rearrangeArr(int[] arr) {
		List<Integer> negativeArr=new ArrayList<Integer>();
		List<Integer> positiveArr=new ArrayList<Integer>();
		for(int i:arr) {
			if(i<0) {
			
				negativeArr.add(i);
			}	
		}
		
		
		for(int i:arr) {
			if(i>=0) {
				
				positiveArr.add(i);
			}	
		}
		int j=0;
		int k=0;
	for(int i=1;i<arr.length+1;i++) {

		if(i%2!=0  && i/2<negativeArr.size()) {
			arr[i-1]=negativeArr.get(j);
			j++;
		}else {
			arr[i-1]=positiveArr.get(k);
			k++;
		}
		
		
	}
		
		
	}

}
