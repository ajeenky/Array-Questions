package com.velocity;

import java.util.Arrays;

public class PowerKth {
	
	int temp;
	public void getkthsmallest(int arr[],int k) {
		// Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		System.out.println("smallest kth element::"+arr[k-1]);
		
	}
	 public void getkthlargest(int arr[],int k) {
		
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]<arr[j]) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 System.out.println("Largest Kth element::"+arr[k-1]);
	 }
	
	
	public static void main(String[] args) {
		int arr[]={7,10,4,3,20,15};//3,4,7,10,15,20 // 20,15,10,7,4,3
		PowerKth powerkth=new PowerKth();
		powerkth.getkthsmallest(arr, 2);
		powerkth.getkthlargest(arr, 4);

	}

}
