package com.l1;

import java.util.HashSet;
import java.util.Set;

public class FindUnionOfArray {

	public static void main(String[] args) {
		// Find the union of an  two array
		
		int a[]= {1 ,2 ,3, 4 ,9};
		int b[] = {4,5,7,1,2};
		
		Set<Integer> set = new HashSet<Integer>();
		//Find the union of an array
		
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
			}
		
		//Traverse one array +add elements into array
		
		for(int j=0;j<b.length;j++) {
			set.add(b[j]);	
		}
		
		System.out.println(" Union :: "+set);
		
		//Find the Intersection of an  two array
		Set<Integer> set2 = new HashSet<Integer>();

		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				
				if(a[i]==b[j]) {
					
					set2.add(a[i]);
				}
			}
			}
		System.out.println("Intersection :: "+set2);
		
	}

}
