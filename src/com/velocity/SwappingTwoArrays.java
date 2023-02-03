package com.velocity;
//Swapping Two Strings without using third variable
public class SwappingTwoArrays {

	public static void main(String[] args) {
		
		String a = "Priya";
		String b = "Jyoti" ;
        a=a+b;
        b=a.substring(0, a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("a"+"="+a);
        System.out.println("b"+"="+b);
	}

}
