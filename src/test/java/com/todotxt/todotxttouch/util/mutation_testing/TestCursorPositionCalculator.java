package com.todotxt.todotxttouch.util.mutation_testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.todotxt.todotxttouch.util.CursorPositionCalculator;

public class TestCursorPositionCalculator {
	
	
	@Test
	public void kill_mutant1() {
		assertEquals(CursorPositionCalculator.calculate(0, "bolach","ola"), 0);
	}
	
	@Test
	public void kill_mutant2() {
		assertEquals(CursorPositionCalculator.calculate(0, "ola","bolach"), 3);
	}
	
	@Test
	public void kill_mutant3() {
		assertEquals(CursorPositionCalculator.calculate(0, "ola","tio"), 0);
	}
	
	@Test
	public void kill_mutant4() {
		assertEquals(CursorPositionCalculator.calculate(0, "ola","bolach"), 3);
	}
	
	@Test
	public void kill_mutant5() {
		assertEquals(CursorPositionCalculator.calculate(-10,"1","bolacha"),0);
	}
	
}
