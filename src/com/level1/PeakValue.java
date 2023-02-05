package com.level1;
//Find a peak element which is not smaller than its neighbours 
public class PeakValue {

	public static void main(String[] args) {
	
		int [] a = {5,7,9,4,8,1};
		for(int i=1; i<a.length-1;i++) {
				if(a[i]>a[i+1]&& a[i]>a[i-1]) {
					System.out.println(a[i]);
					
				}
			
		}

	}

}
