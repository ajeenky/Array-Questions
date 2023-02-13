package com.velocity;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		int []a= {1, 2, 3, 6, 3, 6, 1};
		int count = 0 ;
		
		System.out.print("Duplicate Elements are : ");
		for(int i = 0 ; i<a.length ; i++) {
			count = 1;
			for(int j = i+1 ; j<a.length ; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.print(a[i]+ " ");
			}
		}
	}

}
