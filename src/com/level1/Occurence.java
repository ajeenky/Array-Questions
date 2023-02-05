package com.level1;
//Find the Occurrence of an integer in the array.
public class Occurence {

	public static void main(String[] args) {
		int x= 6;
		int a[]= {5,7,5,3,9,7,0,1,6,6,5};
		int count =0;
		for(int i=0;i<a.length;i++) {
			 if(a[i]==x) {
				count++;
			}
		}
		System.out.println(x +"="+ count);
	}
}


