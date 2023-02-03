package com.velocity;

public class Occurance {

	public static void main(String[] args) {
		int arr[]= {0,1,2,5,7,2,6,2,9,6,4,5,2,1,9,6};
		int x = 6;
		int count=0;
		for (int i = 0; i<arr.length;i++) {
			if(x==arr[i]) {
				count++;
			}
		}
		System.out.println("Occurance of "+ x +" is " + count + " times.");
	}

}
