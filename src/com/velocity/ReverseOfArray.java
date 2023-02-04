package com.velocity;

public class ReverseOfArray {
		// Method Having return type Array 
		// which give array in reverse manner
		public int [] getReverseArray(int[]arr) {
			int l = arr.length;
			int j =0;
			int [] result=new int [l];
			for(int i=l-1;i>=0;i--)//8-->
			{
					result[j]=arr[i];
					j++;
			}
			
			return result;
		}
		
		public static void main(String[] args) {
			 ReverseOfArray reArray = new ReverseOfArray();
			 int [] array = {1,2,3,4,5,6,9,8,7};
			 int[] array2 = reArray.getReverseArray(array);
			  
			 System.out.print("[ "); 
			 for(Integer x:array2) {
				  System.out.print(x+" ");
			  }
			 System.out.print("]");
		}

	}

