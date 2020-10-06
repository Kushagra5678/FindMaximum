package com.practice.FindMaximum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaxTest {
	FindMaxMain fm;

	@Before
	public void before() {
		fm = new FindMaxMain();
	}

	@Test
	public void Max_number_at_first_position() {
		int x = fm.findMaxNumber(10, 2, 5);
		Assert.assertEquals((Integer)10, (Integer)x);
	}

	@Test
	public void Max_number_at_second_position() {
		int x = fm.findMaxNumber(10, 20, 5);
		Assert.assertEquals((Integer)20, (Integer)x);
	}

	@Test
	public void Max_number_at_third_position() {
		int x = fm.findMaxNumber(10, 2, 50);
		Assert.assertEquals((Integer)50, (Integer)x);
	}
}
