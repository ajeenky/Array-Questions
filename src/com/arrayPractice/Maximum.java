package com.arrayPractice;

public class Maximum {

	
		public static void main(String[] args) {
			int a[]= {50,30,40,60,70};
			int max=a[0];//60
			for(int i=4; i<a.length; i++) {//70
				if(a[i]>max) {//70>60
					max=a[i];//70
				}
			}
			System.out.println("maximum number is  "+max);

			}
	}


