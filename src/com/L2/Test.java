package com.L2;

public class Test {

	public static void main(String[] args) {
	      int[] string1 = {2,3,4,2,3,2};
	      
	     System.err.println("Duplicates values");
	     for(int i=0; i< string1.length; i++) {
	    	  for(int j=i+1; j<string1.length; j++ ) {
	    		  if(string1[i]==string1[j]) {
	    			  System.out.println(string1[j]);
	    		  }
	    	  }
	    	 
	     }

	}

}
