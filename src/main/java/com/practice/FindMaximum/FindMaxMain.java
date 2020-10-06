package com.practice.FindMaximum;

public class FindMaxMain {
	public String findMaxNumber(String a, String b, String c) {
		String max=a;
		if(b.compareTo(max)>0) 
			max=b;
		if(c.compareTo(max)>0) 
			max=c;
		return max;
	}
	
	public Float findMaxNumber(Float a, Float b, Float c) {
		Float max=a;
		if(b.compareTo(max)>0)
			max=b;
		if(c.compareTo(max)>0) 
			max=c;
		return max;
	}
	
	public Integer findMaxNumber(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

}
