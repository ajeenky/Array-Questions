package com.velocity;
//Count pairs with given sum
public class Count {

	public static void main(String[] args) {
		int a[]= {1,5,7,-1,5};
		int sum =6;		
        getPairsCount(a, sum);
	}
	
	public static void getPairsCount(int a[],int sum) {
		
		int count =0;
		for (int  i = 0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]+a[j]==sum)) {
					count ++;
					
				}
			}
		}
		System.out.println("Count of pair is "+ count);
		
	}

}
