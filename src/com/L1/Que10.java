package com.L1;

import java.util.HashSet;
import java.util.Set;

public class Que10 {

	public static void main(String[] args) {
		
//		Union and Intersection of two sorted arrays
		
		int arr1[] = {1, 3, 4, 5, 7};
	    int arr2[] = {2, 3, 5, 6};
	    
	    Set<Integer> set = new HashSet<Integer>();
	    
	    for(int i = 0; i < arr1.length; i++) {
	    	set.add(arr1[i]); 
	    	for(int j = 0; j < arr2.length; j++) {
	    		set.add(arr2[j]);
	    		if(arr1[i]==arr2[j]) {
	    			System.out.print("Intersection--> "+arr2[j]);
	    		}
	    	}
	    }
	    System.out.println("Union--> "+set);
	}

}
