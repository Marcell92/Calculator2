package com.qa.calculator;

public class Divider {

	public double divide(double num1, double num2) {

		if (num2 == 0) {

			throw new IllegalArgumentException("Argument 'divisor' is 0");
		}
		return num1 / num2;
	}

}
