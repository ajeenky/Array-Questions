package com.velocity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionIntersection {

	public static void union(int[] arr1, int[] arr2) {
		Set<Integer> union = new HashSet<>();
		
		for(int i :arr1) {
			union.add(i);
		}
		
		for(int i :arr2) {
			union.add(i);
		}
		
		for(int i :union) {
			System.out.print(i+" ");
		}
	}

	public static void intersection(int[] arr1, int[] arr2) {
		Set<Integer> intersection = new HashSet<>();
		for(int i: arr1) {
			for(int j :arr2) {
				if(i==j) {
					intersection.add(i);
				}
			}
		}
		
		for(int i :intersection) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 4, 5, 7 };
		int arr2[] = { 2, 3, 5, 6 };

		union(arr1, arr2);
		System.out.println();
		intersection(arr1, arr2);
	}

}
