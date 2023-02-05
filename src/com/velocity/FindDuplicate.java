package com.velocity;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 6, 7, 6, 1};
		
		Set<Integer> set = new HashSet<>();
		
		for(int i : array) {
			if(!set.add(i)) {
				System.out.println(i+" ");
			}
		}
	}

}
