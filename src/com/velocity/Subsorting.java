package com.velocity;

//sort(sub sorting) the array of index 0,1,2,3 element.

public class Subsorting {
	public static void main(String[] args) {
      int arr[]= {5,3,22,45,21,8,11};
	  int temp;
	  int arrlength = arr.length;
	  for(int i=0;i<arrlength;i++) {
		 for(int j=i+1 ;j<arrlength;j++) {
			 
			if(j<=2) {
		    	if(arr[i]>=arr[j]) {
		           temp=arr[j];
				   arr[j]=arr[i];
				   arr[i]=temp;
		    	}
			}
		 }
	   }
	   System.out.println("Sub Shorted array");
	                                           // only index 0 to 3 index is sorted.
       for(int i=0;i<arrlength;i++) {
	      System.out.print(arr[i]+" ");
	   }
   }
}
