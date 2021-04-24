package com.todotxt.todotxttouch.util.mutation_testing;

import static com.todotxt.todotxttouch.util.Strings.insertPadded;
import static com.todotxt.todotxttouch.util.Strings.insertPaddedIfNeeded;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStrings {
	
	@Test
	public void t1() {
		assertEquals("a ",insertPadded("",0,"a"));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void t2() {
		assertEquals("a ",insertPadded("",1,"a"));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void t4() {
		assertEquals("a ",insertPadded("",3,"abc"));
	}

}
