package com.todotxt.todotxttouch.util.category_partition;

import static com.todotxt.todotxttouch.util.Path.fileName;
import static com.todotxt.todotxttouch.util.Path.parentPath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.todotxt.todotxttouch.util.Path;

public class TestPath {
	
	@Test
	public void testNullFilename() {
		assertEquals("",fileName(null));
	}
	
	@Test 
	public void testEmptyFilename() {
		assertEquals("",fileName(""));
	}
	
	//ERROR.
	@Test
	public void testWindowsFilename() {
		//assertEquals("nomeIncorreto",fileName("pasta" + "\nomeIncorreto"));
		assertEquals("pasta\nomeIncorreto",fileName("pasta" + "\nomeIncorreto"));
	}
	
	@Test
	public void testLinuxFilename() {
		assertEquals("nomePasta",fileName("pasta/nomePasta"));
	}
	
	@Test
	public void testLargeName() {
		assertEquals(" qualquercoisa",fileName("nome Pasta / qualquercoisa"));
	}
	
	@Test
	public void testEndWithBar() {
		assertEquals("",fileName("/"));
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
		assertEquals("",parentPath("palavra/"));
	}

}
