package com.array.practice;

public class MissingInteger {

	//Find the Missing Number
	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 6, 3, 7, 8};
		int temp=0;
		//sort the array
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
			
		}
		//logic for missing int
		int min=arr[0];
		for(int k=0;k<arr.length;k++) {
			if(arr[k]==min) {
				min++;
			}
			else {
				System.out.println("missing interger::"+min);
			break;
			}
		}

	}

}
