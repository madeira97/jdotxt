package com.todotxt.todotxttouch.util.category_partition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.todotxt.todotxttouch.util.Path;
import com.todotxt.todotxttouch.util.Strings;

public class TestStrings {

	@Test
	public void testNullStrings() {
		assertEquals(null,Strings.insertPaddedIfNeeded(null, 0, null));
	}
	
	@Test
	public void test_insert_padded() {
		assertEquals(null,Strings.insertPadded(null, 0, null));
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullPriorString() {
		assertEquals("string2 ",Strings.insertPaddedIfNeeded(null, 0, "string2"));
	}
	
	@Test
	public void testEmptyStrings() {
		assertEquals("",Strings.insertPaddedIfNeeded("", 0, ""));
	}
	
	@Test
	public void testEmptyPriorString() {
		assertEquals("string2 ",Strings.insertPaddedIfNeeded("", 0, "string2"));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testNegativeIndex() {
		assertEquals("string2 string1",Strings.insertPaddedIfNeeded("string1", -4, "string2"));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testLargerIndex() {
		assertEquals("string2 string1",Strings.insertPaddedIfNeeded("string1", 100, "string2"));
	}
	
	@Test
	public void testIndex0() {
		assertEquals("string2 string1",Strings.insertPaddedIfNeeded("string1", 0, "string2"));
	}
	
	@Test
	public void testStringsEqual() {
		assertEquals("string2 ",Strings.insertPaddedIfNeeded("string2", 0, "string2"));
	}
	
	@Test
	public void createString() {
		Strings s = new Strings();
		assertTrue(true);
	}
	
}
