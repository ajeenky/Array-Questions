package com.l1;

public class MoveNegativeEleArray {

	public static void main(String[] args) {
		// Move all negative elements to end
		
		int a[] = {1, -1, 3, 2, -7, -5, 11, 6};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				//Compare 2 elements   
					 if(a[i] > a[j]) {
					
						//Swap the elements
			              int temp = a[i];
			              a[i] = a[j];
			              a[j] = temp;
					 }
			}
			System.out.println(a[i]);
		}
	}

}
