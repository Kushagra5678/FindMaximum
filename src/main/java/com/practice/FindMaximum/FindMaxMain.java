package com.practice.FindMaximum;

import java.util.*;

public class FindMaxMain<E extends Comparable<E>> {
	E[] array;

	FindMaxMain(E[] array) {
		this.array = array;
	}

	public static <E extends Comparable> E find_maximum(FindMaxMain mf) {

		Optional<E> check = Optional.ofNullable(mf.array[mf.array.length - 1]);
		if (check != null) {
			Arrays.sort(mf.array, Collections.reverseOrder());
			return (E) mf.array[0];
		} 
		else {
			System.out.println("Array is empty!!!!");
			return null;
		}
	}

}
