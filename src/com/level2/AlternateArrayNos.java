package com.level2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlternateArrayNos {
	
	//Input:  arr[] = {1, 2, 3, -4, -1, 4}
	//Output: arr[] = {-4, 1, -1, 2, 3, 4}
	   

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, -4, -1, 4,-1};
		List<Integer> negative = Arrays.stream(arr).boxed().filter(s->s<0).collect(Collectors.toList());
		List<Integer> positive = Arrays.stream(arr).boxed().filter(s->s>=0).collect(Collectors.toList());
		
		int i=0;
		int j=0;
		int k=0;
		while(i<negative.size() && j<positive.size()) {
			arr[k++]=positive.get(j++);
			arr[k++]=negative.get(i++);
			
		}
		
		
		while(i<negative.size()) {
			arr[k++]=negative.get(i++);
		}
		
		while(j<positive.size()) {
			arr[k++]=positive.get(j++);
		}
		

		
		
		for(int z:arr) {
			System.out.print(z+" ");
		}
		
	}

}
