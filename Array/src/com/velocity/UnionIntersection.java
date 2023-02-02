package com.velocity;

public class UnionIntersection {

	// Union and Intersection of two sorted arrays
	
	public static void main(String[] args) {
		int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6} ;
        int n=arr1.length;
        int m=arr2.length;
       
        int arr3[]= new int[n+m];
        int z=arr3.length;
        int temp=0;
        for(int i=0;i<arr1.length;i++) {
        	arr3[i]=arr1[i];
        	for(int j=0;j<arr2.length;j++) {
        		arr3[n+j]=arr2[j];
        		if(arr1[i]==arr2[j]) {
        			System.out.println("intersection array is::"+arr1[i]);
        		}
        		arr3[i]=arr1[i];
        		
        		}
        	}
        for(int k=0;k<arr3.length;k++) {
        	for(int l=k+1;l<arr3.length;l++) {
        		if(arr3[k]>arr3[l]) {
        			temp=arr3[k];
        			arr3[k]=arr3[l];
        			arr3[l]=temp;
        		}
        	}
        		
        }
        for(int i=0;i<arr3.length;i++) {
        	
        	if(arr3[i]==arr3[i+1]&&i<z) {
        			continue;
        		}
        	
        	 System.out.println(arr3[i]);
        }
       

	}

}
