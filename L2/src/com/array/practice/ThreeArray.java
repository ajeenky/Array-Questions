package com.array.practice;

public class ThreeArray {
	//WAP to find common numbers from 3 arrays
	
	public void commonNumber(int arr1[],int arr2[],int arr3[]) {
		
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length && k<arr3.length) {
			
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
				
			System.out.println(arr1[i]+" ");
			i++;
			j++;
			k++;
		}
		else if(arr1[i]<arr2[j]){
			i++;
		}
		else if(arr2[j]<arr3[k]) {
			j++;
		}
		else
			k++;
	}
	}

	public static void main(String[] args) {
		 ThreeArray th=new ThreeArray();
			int ar1[] = { 1, 5, 10, 20, 40, 80 };
	        int ar2[] = { 6, 7, 20, 80, 100 };
	        int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
	     
	        th.commonNumber(ar1, ar2, ar3);
	        

}
}