package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDivider {

	private Divider divider;
	private static final double DELTA = 1e-15;

	@Test
	public void test() {

		divider = new Divider();
		double expectedValue = 2.5;
		double actualValue = divider.divide(10, 4);
		assertEquals(expectedValue, actualValue, DELTA);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testdividebyzero() {

		divider = new Divider();
		divider.divide(10, 0);

	}

}
