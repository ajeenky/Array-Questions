package com.level1;

public class PeakAmoungNeighbors {
	
	public void getPeak(int arr[]) {
		int l=arr.length-1;
		System.out.print("Element Which IS Greater Amoung Neighbors--->  ");
		for(int i=1;i<l;i++) {
			if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]) {
				System.out.print(arr[i]+" ");
			}
		}
	}
		
	public static void main(String[] args) {
		int [] array = {1,0,5,6,4,9,5,6};	
		PeakAmoungNeighbors peak = new PeakAmoungNeighbors();
		peak.getPeak(array);
	}
}
