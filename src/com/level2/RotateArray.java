package com.level2;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int cycles =2;
		
		//(1 2 3 4 5)
		//(5 2 3 4 1)
		//(5  
		for(int j=0;j<cycles;j++) {
			int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		}
		
		for (int s : arr){
			System.out.print(s+" ");
		}
		
	}

}
