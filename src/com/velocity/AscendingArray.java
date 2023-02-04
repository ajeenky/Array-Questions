package com.velocity;

/*sort array in ascending order 
 * Input: {2,5,3,1,6,4}
 * Output: 1,2,3,4,5,6 
 */

public class AscendingArray 
{

	public static void main(String[] args) 
	{
		int arr[] = {2,5,3,1,6,4};
		for(int i=0; i<arr.length; i++)
		{
            for(int j=i+1; j<arr.length; j++)
            {
            	//swaping numbers to get ascending order 
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                 }
            }
            System.out.println(arr[i]);
		}
	}
}
		
