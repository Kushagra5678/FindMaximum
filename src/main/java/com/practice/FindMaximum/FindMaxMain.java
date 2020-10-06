package com.practice.FindMaximum;

public class FindMaxMain<E extends Comparable<E>> {
	E numOne;
	E numTwo;
	E numThree;

	FindMaxMain(E numOne, E numTwo, E numThree) {
		this.numOne = numOne;
		this.numTwo = numTwo;
		this.numThree = numThree;
	}

	public <E extends Comparable<E>> E findMaxNumber(FindMaxMain<E> mf) {
		E max = (E) mf.numOne;
		if (mf.numTwo.compareTo(max) > 0)
			max = (E) mf.numTwo;
		if (mf.numThree.compareTo(max) > 0)
			max = (E) mf.numThree;
		return max;
	}

}
