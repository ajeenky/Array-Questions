package com.L1;

public class Que9 {

	public static void main(String[] args) {
		
//		Move all the negative elements to one side of the array
		
		int arr [] = {-12,23,78,-88,1,2,3,4,5,6,-5,-9,-6,-11};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		
	}

}
