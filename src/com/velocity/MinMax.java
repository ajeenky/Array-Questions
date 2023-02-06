package com.velocity;
//Find Max and Min From Given Array
public class MinMax {
	
	public static void findMinMax(int a[]) {	
		int max = a[0];
		int min = a[0];
		
		for (int i=1;i<=a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			else if(a[i]< min){
				min=a[i];		
			}
		}
		System.out.println("Max element is "+max);
		System.out.println("Min element is "+min);

	}
	public static void main(String[] args) {
		
		int a[]= {2,6,7,8,9};
		findMinMax(a);
	}
}
