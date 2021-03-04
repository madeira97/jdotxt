package com.todotxt.todotxttouch.util;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TreeTest {
	
	private Tree<Integer> tree;
	
	@Before
	public void setUp() {
		tree = new Tree<>(5);
	}
	
	@Test
	public void testNewData() {
		assertEquals(Integer.valueOf(5),tree.getData());
	}
	
	@Test
	public void testGetChildren() {
		tree.addChild(10);
		Tree<Integer> t = new Tree<>(10);
		assertEquals(t.getData(),tree.getChildren().get(0).getData());
	}
	
	@Test
	public void testLoad() {
		tree.setLoaded();
		assertEquals(true,tree.isLoaded());
	}
	
	@Test
	public void testGetChildrenBeforeLoading() {
		assertEquals(null,tree.getChildren());
	}
	
	@Test
	public void testGetChildrenAfterLoading() {
		tree.setLoaded();
		assertEquals(new ArrayList<Tree<Integer>>(),tree.getChildren());
	}
	
	@Test  //BUG. Data not searched for in Root.
	public void testContainsDataInRoot() {
		assertEquals(true,tree.contains(5));
	}
	
	
	@Test
	public void testDepth1Contains() {
		tree.addChild(10);
		assertEquals(true,tree.contains(10));
	}
	
	@Test
	public void testLargerDepthsContains() {
		tree.addChild(10).addChild(9).addChild(8);
		assertEquals(true,tree.contains(8));
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void getChildOutOfBounds() {
		tree.setLoaded();
		tree.getChild(10000000);
	}
	
	
	
	
	
}
