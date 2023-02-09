package com.level2;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {-1,0,9,5,3,55};
		
		quickSort(arr,0,arr.length-1);
		
		//printing
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
	}

	private static void quickSort(int[] arr, int si, int ei) {
		//Pivot Last element
		if(si>=ei) {
			return;
		}

		int pidx=partition(arr,si,ei);
		quickSort(arr, si, pidx-1);
		quickSort(arr, pidx+1, ei);

	}

	private static int partition(int[] arr, int si, int ei) {
		
		int i=si-1;
		
		for(int j=si;j<ei;j++) {
			if(arr[j]<arr[ei]) {
				i++;
				//swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=arr[ei];
		arr[ei]=temp;
		return i;
	}

}
