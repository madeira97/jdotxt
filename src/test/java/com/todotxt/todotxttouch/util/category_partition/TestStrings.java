//package com.todotxt.todotxttouch.util.category_partition;
//
//import static com.todotxt.todotxttouch.util.Strings.insertPaddedIfNeeded;
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Test;
//
//public class TestStrings {
//
//	@Test
//	public void testNullStrings() {
//		assertEquals(null,insertPaddedIfNeeded(null, 0, null));
//	}
//	
//	@Test
//	public void testNullPriorString() {
//		assertEquals("string2 ",insertPaddedIfNeeded(null, 0, "string2"));
//	}
//	
//	@Test
//	public void testEmptyStrings() {
//		assertEquals("",insertPaddedIfNeeded("", 0, ""));
//	}
//	
//	@Test
//	public void testEmptyPriorString() {
//		assertEquals("string2 ",insertPaddedIfNeeded("", 0, "string2"));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void testNegativeIndex() {
//		assertEquals("string2 string1",insertPaddedIfNeeded("string1", -4, "string2"));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void testLargerIndex() {
//		assertEquals("string2 string1",insertPaddedIfNeeded("string1", 100, "string2"));
//	}
//	
//	@Test
//	public void testIndex0() {
//		assertEquals("string2 string1",insertPaddedIfNeeded("string1", 0, "string2"));
//	}
//	
//	@Test
//	public void testStringsEqual() {
//		assertEquals("string2 ",insertPaddedIfNeeded("string2", 0, "string2"));
//	}
//	
//}
