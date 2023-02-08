package com.velocity.level2;

public class RotateArrayBy1 {
	
	static void rotate(int[] arr) {
		int x=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
			}
		arr[0]=x;
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println("Array before rotating is::"+"\n");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		rotate(arr);
		
		System.out.println("\n"+"Array After rotation is ::");
		for(int x:arr) {
			System.out.print(x+" "); 
			
		}
	}

}
