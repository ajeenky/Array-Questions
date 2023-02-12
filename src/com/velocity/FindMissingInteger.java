package com.velocity;

public class FindMissingInteger {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,7,8,9,10};
		
		int sum1 = 0;
		for(int i = 0; i<a.length ; i++) {
			sum1= sum1 + a[i];
		}
		System.out.println("Sum of given Array : "+ sum1);
		
		int sum2 = 0;
		for(int i = 1; i<=10 ; i++) {
			sum2 = sum2 +i;
		}
		System.out.println("Sum of given Whole Number Series : "+ sum2);
		System.out.println("\n");
		int missingNum = sum2-sum1;
		System.out.println("Missing Number ==> " + missingNum);
	}

}
