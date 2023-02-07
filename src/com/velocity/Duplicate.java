package com.velocity;
//Find the Duplicate elements in the array

public class Duplicate {

	public static void main(String[] args) {
		
		int a[]= {2,1,1,4,3,4,3,5,6,5}; 
		System.out.println("Duplicate elements are: ");
		
		
		for(int i=0;i<a.length;i++) 
			for(int j=i+1;j<a.length;j++) 
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
		
	}

}
