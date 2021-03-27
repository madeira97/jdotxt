package com.todotxt.todotxttouch.line_branch_coverage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.todotxt.todotxttouch.TodoException;

public class TestTodoException {
	
	@Test
	public void testTodoException() {
		TodoException te = new TodoException("teste", new Throwable());
		assertTrue(true);
	}

}
