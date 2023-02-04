package com.velocity;
//Java program to replace lower case with upper case & vice versa
public class CapitalSmall {

	public static void main(String[] args) {
		String str = "JaVa Is CodInG LAnguaGe";
		StringBuffer buffer = new StringBuffer(str);
		for (int i =0; i<str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				buffer.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			if(Character.isUpperCase(str.charAt(i))) {
				buffer.setCharAt(i, Character.toLowerCase(str.charAt(i)));
		}

	}
         System.out.println(buffer);
}
}