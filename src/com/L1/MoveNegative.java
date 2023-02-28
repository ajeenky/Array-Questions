package com.L1;

import java.util.Arrays;

//program for move all negative to  beginning
public class MoveNegative {

	public static void main(String[] args) {
		int[] arr = {-12,17, 16,8,-9,8,-7,-6,5,-4,-2,1};
		Arrays.sort(arr);
		for(int i :arr) {
			System.out.print(i+" ");
		}
		
	}

}
