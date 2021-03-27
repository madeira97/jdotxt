package com.todotxt.todotxttouch.util.category_partition;

import static com.todotxt.todotxttouch.util.Util.createParentDirectory;
import static com.todotxt.todotxttouch.util.Util.isDeviceReadable;
import static com.todotxt.todotxttouch.util.Util.isDeviceWritable;
import static com.todotxt.todotxttouch.util.Util.integerList2IntArray;
import static com.todotxt.todotxttouch.util.Util.createImageIcon;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.todotxt.todotxttouch.TodoException;

public class TestUtil {
	
	
	@Test
	public void testIsDeviceWritable() {
		assertTrue(isDeviceWritable());
	}
	
	@Test
	public void testIsDeviceReadable() {
		assertTrue(isDeviceReadable());
	}
	
	@Test(expected=TodoException.class)
	public void testCreateDirNull() {
		createParentDirectory(null);
	}
	
	@Test
	public void testIntegerList() {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(5);
		integerList2IntArray(l);
		assertTrue(true);
	}
	
	@Test
	public void testcreateImageNullPath() {
		assertEquals(null,createImageIcon("qqcena"));
	}
	

}
