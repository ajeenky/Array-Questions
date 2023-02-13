package com.L2;

public class DuplicatesInArray {
//Find duplicates in O(n) time and O(1) extra space
	public static void main(String[] args) {
		int []a = {1, 2, 3, 6, 3, 6, 1};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
 					System.out.println(" Duplicates are>> " +a[j]);

				}

			}

		}


	}

}
