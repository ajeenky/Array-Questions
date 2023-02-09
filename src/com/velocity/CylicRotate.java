package com.velocity;
//Cyclic rotate of an array by one
import java.util.Arrays;

public class CylicRotate {
	
	
	static void rotate(int array[], int len) {
		
		int temp = array[len-1];
		for(int i=len-1;i>0;i--) {
			array[i] = array[i-1];		
		}
		array[0] =temp;
		
	}

	public static void main(String[] args) {
		
		int  array[] = {1, 2, 3, 4, 5};
		int len = array.length;
		
		System.out.println("Rotated Array is ::");
		rotate(array, len);
		System.out.println(Arrays.toString(array));
	}

}
