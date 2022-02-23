package calc.tester;

import static org.junit.Assert.*;

import org.junit.Test;

import calc.logic.*;

public class CalculatorTest {
	
	@Test
	public void testAdder() {
		assertEquals(6,SmallCalculator.adder(3, 3));
	}
	
	@Test
	public void testMultiplier() {
		assertEquals(12, SmallCalculator.multiplier(4, 3));
	}

}
