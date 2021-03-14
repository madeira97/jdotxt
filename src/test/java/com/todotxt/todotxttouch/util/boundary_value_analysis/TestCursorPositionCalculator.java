package com.todotxt.todotxttouch.util.boundary_value_analysis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static com.todotxt.todotxttouch.util.CursorPositionCalculator.calculate;
public class TestCursorPositionCalculator {
	
	
	@Test
	public void test1() {
		assertEquals(0,calculate(-1,null,null));
	}
	
	@Test
	public void test2() {
		assertEquals(0,calculate(0,null,null));
	}
	
	@Test
	public void test3() {
		assertEquals(0,calculate(1,null,null));
	}
	
	
	@Test
	public void test4() {
		assertEquals(0,calculate(-1,"",""));
	}
	
	@Test
	public void test5() {
		assertEquals(0,calculate(0,"",""));
	}
	
	@Test
	public void test6() {
		assertEquals(0,calculate(1,"",""));
	}
	
	@Test
	public void test7() {
		assertEquals(0,calculate(-1,"a","b"));
	}
	
	@Test
	public void test8() {
		assertEquals(0,calculate(0,"a","b"));
	}
	
	@Test
	public void test9() {
		assertEquals(1,calculate(1,"a","b"));
	}
	
}

