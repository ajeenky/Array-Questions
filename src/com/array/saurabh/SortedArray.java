package com.array.saurabh;
//Sort an Array:

import java.util.Arrays;

public class SortedArray {
	public static void main(String[] args) {{
		int[] a = { 15, 12, 21, 16, 19, 36, 8 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {									//for descending order >>>> if(a[i] < a[j])
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	}
	
	/*
	 * Sorting in ascending order by using .sort() method: public static void
	 * main(String[] args) {{ int[] a = { 15, 12, 21, 16, 19, 36, 8 };
	 * Arrays.sort(a); 
	 * for (int i : a) 
	 * { System.out.print(i + " "); } }
	 */
	
	/* Sorting in descending order by using .sort() method: 
	 * public static void main(String[] args) { int[] a = { 15, 12, 21, 16, 19, 36,
	 * 8 }; Arrays.sort(a); for(int i = a.length-1; i >= 0; i--) {
	 * System.out.print(a[i] + " "); }
	 * 
	 * }
	 */
}
