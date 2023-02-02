package com.velocity;

public class MaxAndMinNumInArray {

	public static void main(String[] args) {
		int[] arr = {4,2,7,8,6,1,10};
		int min = Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		
		for(int i :arr) {
			if(i>max) {
				max=i;
			}else if(i<min) {
				min=i;
			}
		}
		System.out.println(max+" "+min);
	}

}
