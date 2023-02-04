 package com.velocity;

public class MiniMaxElement {

	public void getMaxElement(int arr[]) {
			int l = arr.length;
			int max = arr[0];
			int min = arr[0];
			for(int i=0;i<l;i++) {
				if(max < arr[i]) // 
				{
					 max = arr[i];
					  
				}
				if(min > arr[i])//1<2
				{
					min = arr[i];
					 
				}
			}
			System.out.print("Max And Mnimum Respectivly:: "+ max+"  "+min);
			 
		}
	
	public static void main(String[] args) {
		 int [] array = {1,3,5,4,2,6,4,2,5,6,7};
		 MiniMaxElement minimax = new MiniMaxElement();
		 minimax.getMaxElement(array);
		  
	}

}
