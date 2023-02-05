package com.L1;

public class NegativeNosToBeginning {
//Move all negative numbers to beginning and positive to end with constant extra space
	public static void main(String[] args) {
		int a [] = {10 , 25 , -25 , -15 , -9 , -8 , 8 , 6};
		int temp = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.print(a[i]+",");
		}

	}

}
