package com.velocity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UnionAndIntersectionOfArrays {
	
	public static void main(String[] args) {
	
	  int[] a = {2,3,4,5,6,7,8};
	  int[] b = {6,7,8,9,10,11,12,13};
	  int la = a.length;
	  int lb = b.length;
	  
	  HashSet<Integer>hashset = new  HashSet<Integer>();
	  HashSet<Integer>hashset2 = new  HashSet<Integer>();
		 
	  System.out.println("First array :");
	  for(int i=0;i<la;i++){                 // first array
		  System.out.print(" "+a[i]);
		  hashset.add(a[i]);
	  }
	  System.out.println(); 
	  System.out.println("Second array :");
	  for(int i=0;i<lb;i++){                 // second array
		  System.out.print(" "+b[i]);
		  hashset2.add(b[i]);
	  }
	  System.out.println();
	  HashSet<Integer>hashset3 = new  HashSet<Integer>();
	  hashset3.addAll(hashset);
	  hashset3.addAll(hashset2);
	  
	  System.out.println("Union of two arrays :");
	  for( Integer set : hashset3) {
	  System.out.print(" "+set);
	 }
	  
	 
	  //Intersection of two arrays.
	  System.out.println(); 
	  System.out.println("Intersection of two arrays :");
	  hashset.retainAll(hashset2);
	  for( Integer set1 : hashset) {
		  System.out.print(" "+set1);
	  }
   }
 }


