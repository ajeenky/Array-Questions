package com.l1;

public class FindKthEleArray {
	// Find the kth smaller element in array
	
	public static void main(String[] args) {
		int a[] = {7, 10, 4, 3 ,20, 15};
		int k=4;
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				//Compare 2 element of array
				if(a[i] < a[j]) {
					
				//Sort array in ascending order			
			int 	temp = a[i];         
					a[i] = a[j];
					a[j] = temp ;
				}
			}	
		}
		//Represent the element [length - element position]		
		System.out.println(a[a.length -k]);
	}
}
