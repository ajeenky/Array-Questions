package com.level1;

public class OccuOfInt {

	public static void main(String[] args) {
		
		int [] a = {3,7,1,6,8,3,7,2,8,9,4,3,7,5};
		int Occurance = 7;
		int count =0;
		
		for (int i =0; i<a.length; i++) {
			if(a[i]==7) {
				count++;
			}
		}
		System.out.println(Occurance+" = "+count);
		
		
	}

}
