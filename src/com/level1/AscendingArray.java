package com.level1;

public class AscendingArray {

	public static void main(String[] args) {
		int a[] = {2,5,7,3,8,1};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
		}
			System.out.print(a[i]+",");
	}
		}
	}