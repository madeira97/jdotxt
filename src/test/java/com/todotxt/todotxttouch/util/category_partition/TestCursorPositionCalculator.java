package com.todotxt.todotxttouch.util.category_partition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.todotxt.todotxttouch.util.CursorPositionCalculator;

public class TestCursorPositionCalculator {
	
	
	@Test
	public void testNegativePriorPositionBothNull() {
		assert(CursorPositionCalculator.calculate(-1, null,null) == 0);
	}
	
	@Test
	public void testNegativePositionNoneNull() {
		assertEquals(0,CursorPositionCalculator.calculate(-10, "Joaquim", "Manel"));
	}
	
	@Test
	public void testEmptyStrings() {
		assertEquals("palavra".length(),CursorPositionCalculator.calculate(100, "","palavra"));
	}
	
	@Test
	public void testEmptyStrings2() {
		assertEquals("".length(),CursorPositionCalculator.calculate(5,"asjbasjbhasçdba",""));
	}
	
	@Test
	public void testLargerCursorPosition() {
		assert(CursorPositionCalculator.calculate(10, "frango", "maca") == 4);
	}
	
	@Test
	public void testPriorValueNull() {
		assertEquals("joao".length(),CursorPositionCalculator.calculate(100,null,"Joao"));
	}
	
	
	@Test
	public void testNewValueNull() {
		assertEquals(0,CursorPositionCalculator.calculate(100,"joao",null));
	}
	
	@Test
	public void testLargerPositionThanWord() {
		assertEquals("macaco".length(),CursorPositionCalculator.calculate(100,"algo", "macaco"));
	}
	
	@Test
	public void createCursorPositionCalculator() {
		CursorPositionCalculator cpc = new CursorPositionCalculator();
		assertTrue(true);
	}
	
}
