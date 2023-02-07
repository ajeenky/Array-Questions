package com.L1;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
//Union and Intersection of two sorted arrays
	public static void main(String[] args) {
		int a1[]= {1, 3, 4, 5, 7};
		int a2[]= {2, 3, 5, 6};
		
		Set<Integer> set =new HashSet<Integer>();
		
		for(int i =0; i<a1.length; i++) {
			set.add(a1[i]);
			for(int j=0; j<a2.length; j++) {
				set.add(a2[j]);
				if(a1[i]==a2[j]) {
					System.out.print("Intersection"+a2[j]);
				}
				
			}
		}
		System.out.println("");
		System.out.println("Union>>"+set);
		
		
	}
}
