package com.L1;
//find sub array of given sum
public class FindSubArray {

	public static void main(String[] args) {
		
  int arr[]= { 15, 2, 4, 8, 9, 5, 10 };
  int n =arr.length;
  int sum=17;
  
  
  for(int i=0; i<n; i++) {
	  int currentSum = arr[i];
	  if(currentSum==sum) {
		  System.out.println("sum found at index" + i);
	  }else {
		  for(int j=i+1; j<n; j++) {
			  currentSum += arr[j];
			  if(currentSum==sum) {
				  System.out.println("Sum found at index " +i +"and" +j );
			  }
		  }
	  }
  }

	}

}
