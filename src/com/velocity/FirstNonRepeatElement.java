package com.velocity;

public class FirstNonRepeatElement {
	 
	public static void main(String[] args) {
		
		int []a = {9, 4, 9, 6, 7, 4};
		int n = a.length;
		for (int i = 0; i < n; i++) {
			boolean isRepeated = false;
		    for (int j = 0; j < n; j++) {
		        if (i != j && a[i] == a[j]){
		        	isRepeated = true;
		            break;
		            }
		        }
		        if (!isRepeated) {
		            System.out.println(a[i]);
		            break;
		        }
		}
	}
}
