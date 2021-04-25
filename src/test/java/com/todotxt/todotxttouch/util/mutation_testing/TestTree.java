package com.todotxt.todotxttouch.util.mutation_testing;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.todotxt.todotxttouch.task.Task;
import com.todotxt.todotxttouch.util.TaskIo;
import com.todotxt.todotxttouch.util.Tree;

public class TestTree {
	
private Tree<Integer> tree;
	
	@Before
	public void setUp() {
		tree = new Tree<>(5);
	}
	
	@Test
	public void kill_mutant1() {
		assertEquals(null,tree.getParent() );
	}
	
	@Test(expected= NullPointerException.class)
	public void kill_mutant2() {
		assertEquals(null,(tree.getChild(5)) );
	}

}
