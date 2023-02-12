package com.velocity;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 7 };
		int b[] = { 2, 4, 5, 6 };
		
		System.out.println("Union Array is");
		Set<Integer> union = new HashSet<>();
		
			for(int i :a) {
				union.add(i);
			}
			
			for(int i :b) {
				union.add(i);
			}
			
			for(int m :union) {
				System.out.print(m+" ");
			}
		
		System.out.println("\n");
		System.out.println("Intersection Array is");
		Set<Integer> intersection = new HashSet<>();
		for(int i: a) {
			for(int j :b) {
				if(i==j) {
					intersection.add(i);
				}
			}
		}
		
		for(int m :intersection) {
			System.out.print(m+" ");
		}
	}
}
