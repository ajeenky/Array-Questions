package com.L2;

public class Que4 {

	public static void main(String[] args) {
//		Find duplicates in an array
		int [] arr = {2,2,5,5,6,7,8,9,1,1,0};
		
		System.out.println("Duplicates are-->");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j]+",");
				}
			}
		}
	}

}
