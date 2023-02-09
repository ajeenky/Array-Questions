package com.velocity;
//Find the common element in given arrays
public class FindCommon {
	
	
	static void commonElement(int a[],int b[], int c[]) {
		
		int  i=0,j=0,k=0;
		
		while(i<a.length && j<b.length && k<c.length) {
			
			if(a[i]==b[j] && b[j]==c[k]) {
				System.out.println(a[i]+ " ");
				i++;
				j++;
				k++;
			}
			else if(a[i]<b[j]) {
					i++;
				}
			else if(b[j]<c[k]) {
				j++;
				
			}
			else
				k++;
		}
		
	}
	
	public static void main(String[] args) {
		
		 int a[] = { 1, 5, 10, 50, 40, 80};
	     int b[] = { 1, 6, 7, 50, 80, 100};
	     int c[] = { 1, 3, 4, 15, 50, 30, 70, 80, 120};

	     System.out.println("Common Elements in given Arrays are ::");
	     commonElement(a, b, c);
	}

}
