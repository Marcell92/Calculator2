package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDivider {

	private Divider divider;

	@Test
	public void test() {

		divider = new Divider();
		int expectedValue = 2;
		int actualValue = divider.divide(10, 5);
		assertEquals(expectedValue, actualValue);
	}

}
