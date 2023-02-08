package com.level2;

public class FirstRepeatingInt {

	//Find the first repeating element in an array of integers
//	Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
//	Output: 5 
//	Explanation: 5 is the first element that repeats
	public static void main(String[] args) {
		int arr[] = {10, 5, 3, 4, 3, 5, 6};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("the first repeating element in an array of integers is "+arr[i]);
					System.exit(1);
				}
			}
		}
		

	}

}
