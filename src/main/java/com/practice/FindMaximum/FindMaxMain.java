package com.practice.FindMaximum;

public class FindMaxMain {
	public <E extends Comparable<E>>  E findMaxNumber(E a,E b,E c) {
		E max=a;
		if(b.compareTo(max)>0)
			max=b;
		if(c.compareTo(max)>0)
			max=c;
		return max;
	}

}
