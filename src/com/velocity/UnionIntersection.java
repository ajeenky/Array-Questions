package com.velocity;

import java.util.HashSet;
import java.util.Set;
// find union and intersection of array
public class UnionIntersection {

	public static void union(int[] arr1, int[] arr2) {
		Set<Integer> union = new HashSet<Integer>();
		for (int i : arr1) {
			union.add(i);
		}
		for (int i : arr2) {
			union.add(i);
		}
		System.out.println("union of array");
		for (int i : union) {
			System.out.print(i + "  ");
		}
	}

	public static void intersection(int[] arr1, int[] arr2) {
		Set<Integer> intersection = new HashSet<Integer>();
		for (int i : arr1) {
			for (int j : arr2) {
				if(i==j)
				intersection.add(i);

			}
		}
		System.out.println("intersection of array");
		for (int x : intersection) {
			System.out.print(x + "  ");
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int arr2[] = { 4, 5, 6, 7, 10, 12, 11 };
		union(arr1, arr2);
		intersection(arr1, arr2);
	}

}
