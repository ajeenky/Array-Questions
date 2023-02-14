package com.l2;

public class DuplicateEle {
	//Find the duplicate in an array
	
	public static void main(String[] args) {
	 int a[] = {4,3,8,6,4,8,9,1,2};
	 
	 for(int i=0; i<a.length; i++) {
		 for(int j=i+1; j<a.length; j++) {
			 
			 if(a[i] == a[j]) {
				System.out.println("Duplicate Elements >> "+a[i]);
				 
			 }
		 }
	 }

	}

}
