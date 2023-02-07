package com.velocity;
//Count number of occurrences in a sorted array
public class CountOccurence {
	
	static int countOccur(int a[], int n ,int x) {
		
		int count =0;
		for(int i=1;i<=n-1;i++) {
			if (x==a[i]) 
				count++;		
	}
		return count;
}
	public static void main(String[] args) {
	    
		int a[]= {1,3,3,3,4,6,7,8,3,3,9};
		int x=3;
		int n = a.length;
		System.out.println(countOccur(a, n, x));
	}

}
