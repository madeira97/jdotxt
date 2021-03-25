package com.todotxt.todotxttouch.util.boundary_value_analysis;
import static com.todotxt.todotxttouch.util.Strings.insertPaddedIfNeeded;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStrings {
	
	/*
	 * Partition 1A
	 * String s = ""
	 * Integer insertAt between(0,1)
	 */
	
	private static final String stringToInsert="xdfcgc";
	
	
	@Test
	public void P1AT1() {
		assertEquals("xdfcgc ",insertPaddedIfNeeded("",0,stringToInsert));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void P1AT2() {
		assertEquals("",insertPaddedIfNeeded("",1,stringToInsert));
	}
	
	/*
	 * Partition 2A
	 * String s = "a"
	 * Integer insertAt between(0,1,2)
	 */
	
	@Test
	public void P2AT3() {
		assertEquals(stringToInsert+" a",insertPaddedIfNeeded("a",0,stringToInsert));
	}
	
	@Test
	public void P2AT4() {
		assertEquals("a "+stringToInsert+" ",insertPaddedIfNeeded("a",1,stringToInsert));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void P2AT5() {
		assertEquals("a",insertPaddedIfNeeded("a",2,stringToInsert));
	}
//	
//	/*
//	 * Partition 3A
//	 * String s = "aaa"
//	 * Integer insertAt between(0,3,4)
//	*/
//
//	
	@Test
	public void P3AT6() {
		assertEquals(stringToInsert+ " aaa",insertPaddedIfNeeded("aaa",0,stringToInsert));
	}
	
	@Test
	public void P3AT7() {
		assertEquals("aaa " + stringToInsert +" ",insertPaddedIfNeeded("aaa",3,stringToInsert));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void P3AT8() {
		assertEquals("aaa ",insertPaddedIfNeeded("aaa",4,stringToInsert));
	}
	
//	
//	/*
//	 * Partition 4A
//	 * String s = null
//	 * Integer insertAt between(0,1)
//	*/
//
//
	//@Test
	@Test(expected=NullPointerException.class)
	public void P4AT9() { // nao se sabe o que devolver nesta situacao, a partir da documentacao
		assertEquals("aaa ",insertPaddedIfNeeded(null,0,stringToInsert));
	}
	
	@Test(expected = NullPointerException.class)
	public void P4AT10() {// nao se sabe o que devolver nesta situacao, a partir da documentacao
		assertEquals("bbb aaa",insertPaddedIfNeeded(null,1,stringToInsert));
	}
//	
//	/*
//	 * Partition 1B
//	 * String s = ""
//	 * Integer insertAt=-1
//	*/
//	
	@Test(expected = IndexOutOfBoundsException.class)
	public void P1BT11() {
		assertEquals("aaa ",insertPaddedIfNeeded("",-1,stringToInsert));
	}
//	
//	/*
//	 * Partition 2B
//	 * String s = "a"
//	 * Integer insertAt=-1
//	*/
//	
	@Test(expected = IndexOutOfBoundsException.class)
	public void P2BT12() {
		assertEquals("",insertPaddedIfNeeded("a",-1,stringToInsert));
	}
//	
//	/*
//	 * Partition 3B
//	 * String s = "aaa"
//	 * Integer insertAt=-1
//	*/
//	
	@Test(expected = IndexOutOfBoundsException.class)
	public void P3BT13() {
		assertEquals("aaa ",insertPaddedIfNeeded("aaa",-1,stringToInsert));
	}
//	
//	/*
//	 * Partition 4B
//	 * String s = null
//	 * Integer insertAt=-1
//	*/
//	
//	@Test(expected = IndexOutOfBoundsException.class)
	@Test(expected = NullPointerException.class)
	public void P4BT14() {
		assertEquals("aaa ",insertPaddedIfNeeded(null,-1,stringToInsert));
	}
	
}
