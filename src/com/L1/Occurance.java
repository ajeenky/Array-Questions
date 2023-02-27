package com.L1;
//find the occurance of the array
public class Occurance {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,2,3,2,5,7};
		int n=arr.length;
		int x=2;
		int res=0;
		 for (int i=0; i<n; i++) {
	            if (x == arr[i])
	              res++;
		 }
System.out.println("the Occurrences of the given number="+res);
	}

}
