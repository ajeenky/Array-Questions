package com.L1;

public class L2 {
//Find the minimum and maximum element in an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]={5,7,8,1,7};
	       int size=a.length;
	      
	      
	       for (int i = 0; i < size; i++)   {
	           for(int j=i+1;j<size;j++){
	               int temp=0;
	               if(a[i]>a[j]){
	                   temp=a[i];
	                   a[i]=a[j];
	                   a[j]=temp;
	               }
	         }
	      }
	      System.out.println("Smallest number in array:"+a[0]);
	      System.out.println("second smallest elements in array:"+a[1]);

	      System.out.println("Gretest elements in array:"+a[size-1]);
	      System.out.println("Second Gretest elements in array:"+a[size-2]);


	}

}
