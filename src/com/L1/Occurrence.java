package com.L1;

public class Occurrence {
//Count number of occurrences (or frequency) in a sorted array
	public static void main(String[] args) {
		int a []= {1,8,9,16,16,5,1,2,16,2,5,16};
		int x =16;
		int count =0;
		for(int i=0; i<a.length; i++) {
			if(x==a[i]) {
				count++;
			}
		}
		System.out.println("Count of occurrences of "+x+" >> "+count);

	}

}
