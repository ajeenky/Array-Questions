package com.velocity;

public class SortArray {public static void main(String[] args) {
	int a[]= {77, 33, 44, 22, 99};
	int temp=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;

			}
		}


	}
	for(int x:a) {
	System.out.println(x);
	}
	

}
}