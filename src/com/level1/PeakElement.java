package com.level1;

public class PeakElement {
	

	public static void main(String[] args) {
		int[] arr= {10, 20, 15, 2, 23, 90, 67};
		if(arr[0]>=arr[1]){
			System.out.println("Peak element is:: "+arr[0]);
		}
		if(arr[arr.length-1]>=arr[arr.length-2]) {
			System.out.println("Peak element is:: "+arr[arr.length-1]);
		}
		
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				System.out.println("Peak element is:: "+arr[i]);
			}
		}

	}

}
