package aevar.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest
{
	@Test
	public void testEmptyString()
	{
		assertEquals(0,Calculator.add(""));
	}

	@Test
	public void testOneNumber()
	{
		assertEquals(1,Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers()
	{
		assertEquals(3,Calculator.add("1,2"));
	}

	@Test
	public void testManyNumbers()
	{
		assertEquals(6,Calculator.add("1,2,3"));
	}

	@Test
	public void testNewlineNumbers()
	{
		assertEquals(6,Calculator.add("1\n2,3"));
	}

	@Test
	public void testNegativeNumbers()
	{
		try {
			Calculator.add("1,-2,3,-5");

		} catch (IllegalArgumentException e) {
			assertEquals("Negatives not allowed: -2, -5", e.getMessage());
		}
	}

	@Test
	public void testBigNumbers()
	{
		assertEquals(5,Calculator.add("1333,2,3,1001"));
	}

	@Test
	public void testOtherDelimeters()
	{
		assertEquals(5,Calculator.add("//L\n2L3L1001"));
	}
}
