package com.velocity;
//Find the missing element in array
public class MissingElement {
	
	
	public static void findMissing(int a[], int n) {
		
		int  temp[]= new int[n+1];
		
		for(int i=0;i<=n;i++) {
			temp[i] =0;
		}
		for(int i=0;i<n;i++) {
			temp[a[i]-1]=1;
		}
		int miss=0;
		for(int i=0;i<n;i++ ) {
			if(temp[i]==0) {
				miss= i+1;
			}	
		}
		System.out.println(miss);
		
	}

	public static void main(String[] args) {
		
		int  a[]= {1, 4, 5, 2, 6,};
		int n = a.length;
		System.out.println("Missing Element is :: ");
		findMissing(a, n);

	}

}
