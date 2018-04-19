package com.qa.calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class AdderTest {
	
	
	private Adder adder;
	
	
	@Test
	public void test() {
		
		adder = new Adder();
		int expectedValue = 4;
		int actualValue = adder.add(2,2);
		assertEquals(expectedValue, actualValue);
		
	}

}
