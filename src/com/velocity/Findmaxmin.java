package com.velocity;

public class Findmaxmin {

	public static void main(String[] args) {
		int a[]= {2,8,6,11,4,7};
		int max =a[0];
		int min =a[0];
		for (int i = 1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
			if (a[i]<min) {
				min=a[i];
			}
		}
         System.out.println(max+" "+min);
	}

}
