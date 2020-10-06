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
	
	@Test
	public void Max_float_at_first_position() {
		float x = fm.findMaxNumber(10.0f, 2.0f, 5.0f);
		Assert.assertEquals(10.0f, x, 0.0f);
		}
	@Test
	public void Max_float_at_second_position() {
		float x = fm.findMaxNumber(10.0f, 20.0f, 5.0f);
		Assert.assertEquals(20.0f, x, 0.0f);
		}
	@Test
	public void Max_float_at_third_position() {
		float x = fm.findMaxNumber(10.0f, 2.0f, 50.0f);
		Assert.assertEquals(50.0f, x, 0.0f);
		}
	
	@Test
	public void Max_String_at_first_position() {
		String x = fm.findMaxNumber("Peach", "Apple", "Banana");
		Assert.assertEquals("Peach", x);
		}
	@Test
	public void Max_String_at_second_position() {
		String x = fm.findMaxNumber("Banana", "Peach", "Apple");
		Assert.assertEquals("Peach", x);
		}
	@Test
	public void Max_String_at_third_position() {
		String x = fm.findMaxNumber("Banana", "Apple", "Peach");
		Assert.assertEquals("Peach", x);
		}

}
