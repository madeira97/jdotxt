package com.todotxt.todotxttouch.util.category_partition;

import static com.todotxt.todotxttouch.util.Path.fileName;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

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

}
