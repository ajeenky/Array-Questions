package com.velocity;
// Find Peak Element
public class Demo {
     
	public int findPeakElement(int arr[],int arrleng) {
		if (arrleng ==1)
			return arr[0];
		if(arr[0]>= arr[1])
			return arr[0];
		if(arr[arrleng-1]>= arr[arrleng-2])
			return arr[arrleng-1];
	
		
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>=arr[i+1] && arr[i]>= arr[i+1]) 
				return i;
		}
		return arr[0];
		
	}
	
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		int arr[] = { 23, 3, 20, 4, 1, 0, 22};
        int arrleng= arr.length;
      System.out.println("Peak element is " + demo.findPeakElement(arr, arrleng));
	}

}
