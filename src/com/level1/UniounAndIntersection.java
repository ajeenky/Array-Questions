package com.level1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class UniounAndIntersection {

	public int[] getUnion(int[] arr1, int[] arr2) {

		List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());

		list1.addAll(list2);
		int[] uniArray = list1.stream().distinct().mapToInt(s -> s).toArray();

		return uniArray;

	}

	public int[] getIntersection(int[] arr1, int[] arr2) {
		Set<Integer> set = new TreeSet<Integer>();
		Set<Integer> intersectionSet = new TreeSet<Integer>();

		for (int s : arr1) {
			set.add(s);
		}

		for (int s : arr2) {
			if (!set.add(s)) {
				intersectionSet.add(s);
			}

		}

		int[] intersectionArray = intersectionSet.stream().mapToInt(s -> s).toArray();
		return intersectionArray;

	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 2, 2, 3 };
		int arr2[] = { 2, 3, 3, 4, 5, 5 };

		UniounAndIntersection ui = new UniounAndIntersection();
		int[] union = ui.getUnion(arr1, arr2);
		int[] intersection = ui.getIntersection(arr1, arr2);
		System.out.println("Union elemets are:: ");

		for (int s : union) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Intersection elemets are:: ");

		for (int s : intersection) {
			System.out.print(s + " ");
		}

	}

}
