package com.velocity;

public class Occurance {
	public static void main(String[] args) {
		int arr[]= {11, 10, 22, 22, 24, 24, 11};
		int count=0;
		int x=22;
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				count++;
			}
		}
		System.out.println(x+"  occur at:: "+count);


	}

}
