package com.L1;



public class KSmallLarge {
//K’th Smallest/Largest Element in Unsorted Array
	public static void main(String[] args) {
		int a [] = {7, 10, 4, 3, 20, 15};
		int k = 4;
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				
				if(a[i]<a[j]) {
					
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+",");
		}
		System.out.println("");
		System.out.println("Smallest element");
		System.out.println(a[a.length-k]);

		
	}

}
