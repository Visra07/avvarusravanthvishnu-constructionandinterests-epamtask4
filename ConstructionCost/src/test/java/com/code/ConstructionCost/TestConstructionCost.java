package com.code.ConstructionCost;
import org.junit.*;
import static org.junit.Assert.*;
public class TestConstructionCost {
	@Test

	public void test() {

		ConstructionCost cc = new ConstructionCost();

		double answer = cc.costForConstructionMaterial("Standard", 500, false);

		assertEquals(600000,answer,0.001);

	}
}
