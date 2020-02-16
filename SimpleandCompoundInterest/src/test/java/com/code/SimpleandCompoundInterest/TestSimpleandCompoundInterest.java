package com.code.SimpleandCompoundInterest;
import org.junit.*;
import static org.junit.Assert.*;
public class TestSimpleandCompoundInterest {
	@Test

	public void test() {

		SimpleandCompoundInterest sc = new SimpleandCompoundInterest();

		

		// Calculate Simple Interest

		double answer = sc.simpleInterest(500, 20, 5);

		assertEquals(500, answer,0.1);

		

		

		// Calculate Compound Interest

		answer = sc.compoundInterest(500, 10, 2);

		assertEquals(105,answer,0.1);

	}
}
