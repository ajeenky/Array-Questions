package com.level2;

import java.util.HashSet;
import java.util.Set;

public class CommonElemets {

//Find common elements in three sorted arrays

//	Input: 
//		ar1[] = {1, 5, 10, 20, 40, 80} 
//		ar2[] = {6, 7, 20, 80, 100} 
//		ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
//		Output: 20, 80

	public static void main(String[] args) {
		int ar1[] = { 1, 5, 10, 20, 40, 80 };
		int ar2[] = { 6, 7, 20, 80, 100 };
		int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> commonele = new HashSet<Integer>();

		for (int s : ar1) {
			set1.add(Integer.valueOf(s));
		}

		for (int s : ar2) {
			if (set1.add(Integer.valueOf(s)) == false) {
				commonele.add(Integer.valueOf(s));
			}
		}

		for (int s : ar3) {
			if (set1.add(Integer.valueOf(s)) == false) {
				commonele.add(Integer.valueOf(s));
			}
		}

		System.out.println("Common Element sin this arrays are:: ");
		for (Integer s : commonele) {
			System.out.print(s + " ");
		}

	}

}
