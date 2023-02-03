package com.velocity;

//Find the occurance of Integer in given array
public class OccuranceOfArray {

	public static void main(String[] args) {
		int Occurance = 3;
		int count =0;
		int [] a = {1,4,6,3,7,8,9,2,3,4,5,7,9,3,8,6,4};
		for (int i =0; i<a.length; i++) {
			if(a[i]==3) {
				count++;
			}
		}
		System.out.println(Occurance+" = "+count);
		
	}

}
