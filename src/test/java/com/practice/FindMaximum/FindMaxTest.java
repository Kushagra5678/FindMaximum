package com.practice.FindMaximum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaxTest {

	@Test
	public void Max_number_at_first_position() {
		FindMaxMain fm = new FindMaxMain(10, 2, 5);
		Assert.assertEquals((Integer) 10, (Integer) fm.findMaxNumber(fm));
	}

	@Test
	public void Max_number_at_second_position() {
		FindMaxMain fm = new FindMaxMain(10, 20, 5);
		Assert.assertEquals((Integer) 20, (Integer) fm.findMaxNumber(fm));
	}

	@Test
	public void Max_number_at_third_position() {
		FindMaxMain fm = new FindMaxMain(10, 2, 50);
		Assert.assertEquals((Integer) 50, (Integer) fm.findMaxNumber(fm));
	}

	@Test
	public void Max_float_at_first_position() {
		FindMaxMain fm = new FindMaxMain(10.0f, 2.0f, 5.0f);
		Assert.assertEquals((Float) 10.0f, (Float) fm.findMaxNumber(fm));
	}

	@Test
	public void Max_float_at_second_position() {
		FindMaxMain fm = new FindMaxMain(10.0f, 20.0f, 5.0f);
		Assert.assertEquals((Float) 20.0f, (Float) fm.findMaxNumber(fm));
	}

	@Test
	public void Max_float_at_third_position() {
		FindMaxMain fm = new FindMaxMain(10.0f, 2.0f, 50.0f);
		Assert.assertEquals((Float) 50.0f, (Float) fm.findMaxNumber(fm));
	}

	@Test
	public void Max_String_at_first_position() {
		FindMaxMain fm = new FindMaxMain("Peach", "Apple", "Banana");
		Assert.assertEquals("Peach", fm.findMaxNumber(fm));
	}

	@Test
	public void Max_String_at_second_position() {
		FindMaxMain fm = new FindMaxMain("Apple", "Peach", "Banana");
		Assert.assertEquals("Peach", fm.findMaxNumber(fm));
	}

	@Test
	public void Max_String_at_third_position() {
		FindMaxMain fm = new FindMaxMain("Banana", "Apple", "Peach");
		Assert.assertEquals("Peach", fm.findMaxNumber(fm));
	}

}
