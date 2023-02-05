package com.velocity;

public class MissingNumber {

	// Given an array arr[] of size N-1 with integers in the range of [1, N],
	// the task is to find the missing number from the first N integers.
	public static void missingNumber(int[] arr) {
		int temp=0;
		for(int i=1;i<=arr.length+1;i++) {
			boolean ans=false;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					ans=true;
					break;
				}
			}
			if(!ans) {
				temp=i;
				break;
			}
		}
		System.out.println(temp);
	}
	
//	public static void findMissing(int arr[], int N)
//    {
//        int i;
//        int temp[] = new int[N + 1];
//        for (i = 0; i <= N; i++) {
//            temp[i] = 0;
//        }
// 
//        for (i = 0; i < N; i++) {
//            temp[arr[i] - 1] = 1;
//        }
// 
//        int ans = 0;
//        for (i = 0; i <= N; i++) {
//            if (temp[i] == 0)
//                ans = i + 1;
//        }
//        System.out.println(ans);
//    }

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 3, 7, 6 };
		missingNumber(arr);
	}

}
