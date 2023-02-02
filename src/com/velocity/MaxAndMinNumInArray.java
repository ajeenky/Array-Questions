package com.velocity;

public class MaxAndMinNumInArray {

	public static void main(String[] args) {
		int [] a = {12,19,45,60,23,45,90};
		int max=a[0];
		int min =a[0];
        for (int i =0; i<a.length; i++) {
        	if (a[i]>max) {
        		max = a[i];
        	}
        	if(a[i]<min) {
        		min= a[i];
        	}
        }
        System.out.println("Max Number : "+max);
        System.out.println("Min Number :"+min);
	}

}
