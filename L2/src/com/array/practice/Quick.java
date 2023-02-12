package com.array.practice;

public class Quick {
	
	// WAP QuickSort
	
		int partition(int arr[],int low,int high) {
				
				low=arr[0];
				high=arr.length-1;
				int pivot=((low+high)/2);
				while(low<=high) {
					while(arr[low]<pivot) {
						low++;
					}
					while(arr[high]>pivot) {
						high--;
					}
					if(low<=high) {
					int temp=arr[low];
					arr[low]=arr[high];
					arr[high]=temp;
					low++;
					high--;
					}
				
				}
				return low;
			}
			
			public void recursion(int arr[],int low,int high) {
				
				int pi=partition(arr,low,high);
				if(low<pi-1) {
					recursion(arr,low,pi-1);
				}
				if(high>pi-1) {
					recursion(arr,pi,high);
				}
			}
				public void printArray(int arr[]){
					for(int i:arr) {
						System.out.println(i);
					}
				}
				
			
			public static void main(String[] args) {
				int[] arr = { 10, 7, 8, 9, 1, 5 };
				Quick quickSortArray=new Quick();
					quickSortArray.recursion(arr,0,arr.length-1);
					quickSortArray.printArray(arr);
				
				
			}

		


	}

