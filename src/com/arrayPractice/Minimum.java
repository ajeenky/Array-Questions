package com.arrayPractice;

public class Minimum {

	public static void main(String[] args) {
		int a[]= {10,40,30,20};
		int min=a[0];
		for(int i=0; i<=a.length-1;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("minimum value = "+min);

	}	
	}


