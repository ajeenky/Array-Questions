package com.level1;
// sort the array of 0's, 1's,2's.
public class Sort123 {

	public static void main(String[] args) {
		int [] a= {0,1,2,0,0,2,1,2,1,0};
		int temp;
		for(int i =0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(" "+a[i]);
		}
	}
}
