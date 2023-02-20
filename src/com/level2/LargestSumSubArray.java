package com.level2;

public class LargestSumSubArray {
////KADAN'S Algorithm///
	
	
	public static int kadans(int[] arr) {
		int ms=Integer.MIN_VALUE;  //Maximum Sum
		int cs=0;				   //Current Sum
		for(int i:arr) {
			cs=cs+i;
			if(cs<0) {
				cs=0;
			}
			ms=Math.max(ms, cs);
		}
		
		
		
		return ms;
	}
	
	public static void main(String[] args) {
	
		int[] arr= {-1,5,6,3,1,-5,22,5,3};
		int ms=kadans(arr);
		System.out.println("Maximum sum of subarray: "+ms);
		
		
		
	}

}
