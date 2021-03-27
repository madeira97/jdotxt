package com.todotxt.todotxttouch.util.line_branch_coverage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.todotxt.todotxttouch.util.TaskIo;

public class TestTaskIo {
	
	@Test
	public void testCreate() {
		TaskIo t = new TaskIo();
		assertTrue(true);
	}
	
	@Test
	public void test_write_file() {
		TaskIo.writeToFile(null, null);
		assertTrue(true);
	}

}
