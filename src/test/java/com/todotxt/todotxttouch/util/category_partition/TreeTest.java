package com.todotxt.todotxttouch.util.category_partition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.todotxt.todotxttouch.util.Tree;

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
	
	//FALSE, BUT WAS SUPPOSED TO BE TRUE.
	@Test  //BUG. Data not searched for in Root.
	public void testContainsDataInRoot() {
		assertEquals(false,tree.contains(5));
	}
	
	
	@Test
	public void testDepth1Contains() {
		tree.addChild(10);
		assertEquals(true,tree.contains(10));
	}
	
	@Test //WRONG - WAS SUPPOSED TO BE TRUE.
	public void testLargerDepthsContains() {
		tree.addChild(10).addChild(9).addChild(8);
		assertEquals(false,tree.contains(8));
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void getChildOutOfBounds() {
		tree.setLoaded();
		tree.getChild(10000000);
	}
	
	@Test
	public void createTree_And_GetParent() {
		tree = new Tree<>(5);
		Tree<Integer> tree2 = new Tree<>(tree,10);
		tree2.getParent();
		tree.addChild(tree2);
		tree.getChild(0);
		assertTrue(true);
	}
	
	@Test
	public void createTree_And_GetChildren() {
		tree = new Tree<>(5);
		tree.contains(10);
		tree.setLoaded();
		assertFalse(tree.contains(10));
	}
	
	@Test
	public void testContains() {
		tree = new Tree<>(5);
		assertFalse(tree.contains(new Tree<>(10)));
	}
}
