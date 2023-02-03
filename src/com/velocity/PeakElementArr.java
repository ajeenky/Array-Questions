package com.velocity;

import java.util.Scanner;

//find the peak element which is not smaller than its neighbor.

public class PeakElementArr {
	

	
		public static void main(String[] args) {
			int n=5;
			int a;
			Scanner scanner = new Scanner(System.in);
			System.out.print("How many element in array :: ");
			n=scanner.nextInt();
			int arr[]=new int[n];
			int length=arr.length;
			for(int i=0;i<n;i++) {
				System.out.print("Enter your"+i+"-index array element :: ");
				a= scanner.nextInt();
				arr[i]=a;
			}
			System.out.println("My Array is:");
			for(int i=0;i<n;i++) {
				System.out.print(" "+arr[i]);
			}
			
			System.out.println("\nPeak elemet :: "+arr[length-1]);
			
			if(arr[length-1]>arr[length-2]){
				System.out.println("Peak elemet which is gretter than its neghbor :: "+arr[length-1]);
			}
			else if(arr[length-1] < arr[length-2]) {
				System.out.println("Peak elemet which is gretter than its neghbor :: "+arr[length-2]);
			}
			else {
				System.out.println("Peak elemet which is gretter than its neghbor :: "+arr[length-1]);
			}
				
			scanner.close();
		}

	}

