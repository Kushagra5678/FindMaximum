package com.practice.FindMaximum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaxTest {

	@Test
	public void test_integer_input1() {
		Integer[] array = { 1, 2, 6, 3 };
		FindMaxMain mf = new FindMaxMain(array);
		Assert.assertEquals((Integer) 6, (Integer) FindMaxMain.find_maximum(mf));
	}

	@Test
	public void test_integer_input2() {
		Integer[] array = { 1, 5, 2, 7, 5, 0 };
		FindMaxMain mf = new FindMaxMain(array);
		Assert.assertEquals((Integer) 7, (Integer) FindMaxMain.find_maximum(mf));
	}

	@Test
	public void test_integer_input3() {
		Integer[] array = { 1, 2, 6, 3, 6, 5, 3 };
		FindMaxMain mf = new FindMaxMain(array);
		Assert.assertEquals((Integer) 6, (Integer) FindMaxMain.find_maximum(mf));
	}

	@Test
	public void test_float_input() {
		Float[] array = { 1.0f, 4.0f, 6.0f, 5.0f, 3.0f };
		FindMaxMain mf = new FindMaxMain(array);
		Assert.assertEquals((Float) 6.0F, (Float) FindMaxMain.find_maximum(mf));
	}

	@Test
	public void test_string_input() {
		String[] array = { "Peach", "Apple", "Orange", "Raspberry" };
		FindMaxMain mf = new FindMaxMain(array);
		Assert.assertEquals("Raspberry", FindMaxMain.find_maximum(mf));
	}

}
