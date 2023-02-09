package com.velocity;

public class Occurrence {
	// Number of occurrence 
	
	public static void main(String[] args) {
		int arr[]= {1, 1, 2, 2, 2, 2, 3};
		int count=0;
		int x=3;
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				count++;
			}
		}
		System.out.println(x+"  occur at "+count);
		
		
	}

}
