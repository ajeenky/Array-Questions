package com.velocity;
import java.util.Scanner;

//To check the occurrence of an element in array.

public class OccuranceArray {
	
	public static void main(String[] args) {
		int count=0;
		int[] arr = {8,33,6,12,9,7,15};
		System.out.println("Array is:");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.print("Enter Your element to serch :: ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        for(int i=0;i<arr.length;i++) {
			
        	if(a==arr[i]) {
        		count++;
        	}
        }
    	if(count>0) {
    		
    		System.out.println("Element is persent in array");
    	}
        else {
        		System.out.println("Element "+a+" is not persent in array");
        }
        sc.close();
	}
 }
