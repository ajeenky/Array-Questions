package com.velocity;

public class MaxAndMinNumInArray {

	public static void main(String[] args) 
	{
		int array[] = {2,1,4,3,5,6};
		int max = array[0];
		int min = array[0];
		for(int i=1;i<array.length;i++) 
		{
			if(array[i]>max) 
			{
			max = array[i];
		    }
			if(array[i]<min)
			{
				min = array[i];
			}
			System.out.println("max number is::"+max);
			System.out.println("min number is::"+min);
		}
	
	}		
}
