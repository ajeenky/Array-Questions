package com.velocity;

public class ReverseWord {
	
	public static String reverseWord(String str)
    {
        int i=0;
        int length=str.length();
        String s="";
        while(i<length){
            s=str.charAt(i)+s;
           i++;
        }
        return s;
    }

	public static void main(String[] args) {
		
		String str=reverseWord("Hello");
		System.out.println(str);
	}

}
