package com.todotxt.todotxttouch.task;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import com.todotxt.todotxttouch.task.Priority;

public class TestPriority {
	
	@Test
	public void test_range() {
		Priority.range(Priority.A, Priority.H);
		assertTrue(true);
	}
	
//	@Test
//	public void test_in_code() {
//		ArrayList<Priority> l = new ArrayList<Priority>();
//		
//		Priority.inCode(Priority.A, Priority.H);
//		assertTrue(true);
//	}
	
	@Test
	public void test_toPriority() {
		ArrayList<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		Priority.toPriority(l);
		assertTrue(true);
	}
	
	@Test
	public void test_toPriority_String() {
		Priority.toPriority("aa");
		assertTrue(true);
	}
	
//	@Test
//	public void test_toPriority_Null() {
//		Priority.toPriority(null);
//		assertTrue(true);
//	}
	
	@Test
	public void test_range_code() {
		Priority.rangeInCode(Priority.A, Priority.H);
		assertTrue(true);
	}

}
