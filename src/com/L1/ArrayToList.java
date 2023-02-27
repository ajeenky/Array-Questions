package com.L1;
//program for converting array to list 
import java.util.ArrayList;

public class ArrayToList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
	      list.add("Apple");
	      list.add("Orange");
	      list.add("Banana");
 
	      System.out.println("Items of ArrayList");
	      System.out.println(list);
	      String[] item = new String[list.size()];
	      list.toArray(item);
	      System.out.println();
           System.out.println("converting arraylist to array");
	      for(String s:item){
	        System.out.println(s);
	      }
	   }
	}


