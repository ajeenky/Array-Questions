package com.level1;

public class MoveNegElement {

	public static void main(String[] args) {
		
		int a[]= {3,6,-7,5,-2,1,9,-8};
		int num ;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a.length) {
				num=a[i];
				System.out.println(num);
			}
		}
	}

}
