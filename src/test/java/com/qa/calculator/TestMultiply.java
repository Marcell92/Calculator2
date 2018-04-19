package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiply {

	private Multiplier multiplier;

	@Test
	public void test() {

		multiplier = new Multiplier();
		int expectedValue = 4;
		int actualValue = multiplier.multiply(2, 2);
		assertEquals(expectedValue, actualValue);

	}

}
