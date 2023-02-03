package com.velocity;

public class MaxMinElement {
	      
		public static void main(String[] args) {
			
			int arr[]= {5,3,22,45,21,8,11};
			int arrlength = arr.length;
			int max=arr[0];
			int min=arr[0];

			for(int i=arrlength-1;i>=0;i--) {
			
				if(arr[0]<arr[i]) {
					max=arr[i];
					
				}			
			  
			}
			System.out.println("Maximum Elemet in array is :: "+max);
			 
			
			 for(int i=arrlength-1;i>=0;i--) {
				
				if(arr[0]>arr[i]) {
					min=arr[i];
					 
				}			
			   
			}
			 System.out.println("minimum Elemet in array is :: "+min);
			 
			 
		// Second way to find max and minimum.
			 System.out.println();
			 
			 System.out.println("Second way to find max and min");
			 
			 int arr2[]= {22,11,44,15,9,6,33};
				int temp;
				int leng = arr2.length;
				for(int i=0;i<leng;i++) {
				    for(int j=i+1 ;j<leng;j++) {
						if(arr2[i]>=arr2[j]) {
							temp=arr2[j];
							arr2[j]=arr2[i];
							arr2[i]=temp;
						}
					 }
				}
				
				System.out.println("Shorted array");
				for(int i=0;i<leng;i++) {
					System.out.print(arr2[i]+" ");
				}
				System.out.println();
			
				System.out.println("Maximum element :: "+arr2[leng-1]);
				System.out.println("Miniimum element :: "+arr2[0]);
			}
	 }
 
