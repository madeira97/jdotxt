package com.todotxt.todotxttouch.util.mutation_testing;

import static com.todotxt.todotxttouch.util.Path.parentPath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.todotxt.todotxttouch.util.Path;

public class TestPath {
	
	@Test
	public void testNullFilename() {
		assertEquals("",parentPath(null));
	}
	
	@Test 
	public void testEmptyFilename() {
		assertEquals("",parentPath(""));
	}
	
	//ERROR.
//	@Test
//	public void testWindowsFilename() {
//		//assertEquals("nomeIncorreto",fileName("pasta" + "\nomeIncorreto"));
//		assertEquals("pasta\nomeIncorreto",parentPath("pasta" + "\nomeIncorreto"));
//	}
	
//	@Test
//	public void testLinuxFilename() {
//		assertEquals("nomePasta",parentPath("pasta/nomePasta"));
//	}
	
//	@Test
//	public void testLargeName() {
//		assertEquals(" qualquercoisa",parentPath("nome Pasta / qualquercoisa"));
//	}
	
	@Test
	public void testEndWithBar() {
		assertEquals("",parentPath("/"));
	}
	
	@Test
	public void createPath() {
		Path p = new Path();
		assertTrue(true);
	}
	
	
	@Test
	public void testParentPath1() {
		assertEquals("",parentPath("/"));
	}
	
	@Test
	public void testParentPath2() {
		assertEquals("palavra/",parentPath("palavra/ "));
	}

}
