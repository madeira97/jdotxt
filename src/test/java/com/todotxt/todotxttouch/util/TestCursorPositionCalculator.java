package com.todotxt.todotxttouch.util;

import static org.junit.Assert.assertEquals;
import static com.todotxt.todotxttouch.util.CursorPositionCalculator.calculate;

import org.junit.Test;

public class TestCursorPositionCalculator {
	
	
	@Test
	public void testNegativePriorPositionBothNull() {
		assert(calculate(-1, null,null) == 0);
	}
	
	@Test
	public void testNegativePositionNoneNull() {
		assertEquals(0,calculate(-10, "Joaquim", "Manel"));
	}
	
	@Test
	public void testEmptyStrings() {
		assertEquals("macaco".length(),calculate(100, "","macaco"));
	}
	
	@Test
	public void testEmptyStrings2() {
		assertEquals("".length(),calculate(5,"asjbasjbhasçdba",""));
	}
	
	@Test
	public void testLargerCursorPosition() {
		assert(calculate(10, "frango", "maca") == 4);
	}
	
	@Test
	public void testPriorValueNull() {
		assertEquals("joao".length(),calculate(100,null,"Joao"));
	}
	
	
	@Test
	public void testNewValueNull() {
		assertEquals(0,calculate(100,"joao",null));
	}
	
	@Test
	public void testLargerPositionThanWord() {
		assertEquals("macaco".length(),CursorPositionCalculator.calculate(100,"algo", "macaco"));
	}
	
}
