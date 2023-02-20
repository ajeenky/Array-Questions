package com.level2;

import java.math.BigInteger;

public class FactorialofMAX {
	
	public static void factorial(int n) {
		
		BigInteger bi = new BigInteger("1");
		
		for(int i =2;i<=n;i++) {
			
		bi=bi.multiply(BigInteger.valueOf(i));
		
			
		}
		System.out.println(bi);
	}
	
	
	public static void main(String[] args) {
		int[] arr= {2,6,20,6,8,5};
		int n=Integer.MIN_VALUE;
		for(int i:arr) {
			n=Math.max(i, n);
		}
		
		factorial(n);
	}
	
	
}
