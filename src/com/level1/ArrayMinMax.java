package com.level1;

public class ArrayMinMax {

	public static void main(String[] args) {
		int x[]= {4,2,8,6,5,3,7,9};
		    int max =x[0];
			int min =x[0];
			for (int i = 1;i<x.length;i++) {
				if(x[i]>max) {
					max=x[i];

				}
				if (x[i]<min) {
					min=x[i];
				}
			}
	         System.out.println("max="+max+" "+"\nmin="+min+" ");
		}

	}

