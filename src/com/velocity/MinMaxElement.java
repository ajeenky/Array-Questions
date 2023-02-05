package com.velocity;

public class MinMaxElement {

	/*Find the minimum and maximum element in an array
	 * min array=2
	 * max array=12
	 */
	public static void main(String[] args) {
		
	
		int a[] = {5,8,12,7,6,2,10,4};
		int min=a[0];
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
			min=a[i];
			if(a[i]>max)
			max=a[i];
			
		}
		System.out.println("Minimum element in array:"+min);
		System.out.println("Maximum element in array:"+max);
		}
}