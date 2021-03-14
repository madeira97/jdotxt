package com.todotxt.todotxttouch.util.boundary_value_analysis;

import static com.todotxt.todotxttouch.util.Util.prependString;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
public class PrependStringTest {
	
	private ArrayList<String> test;
	
	@Before
	public void setup() {
		test = new ArrayList<>();
	}

	 @Test(expected=NullPointerException.class)
	public void P1T1() {
		prependString(null,null);
	}
	 
	 @Test
	 public void P2T1() {
		prependString(test,null);
		assertEquals(new ArrayList<String>(),test);
	 }
	 
	 @Test
	 public void P3T1() {
		 test.add("a");
		 prependString(test,null);
		 ArrayList<String> r = new ArrayList<>();
		 r.add(null + "a");
		 assertEquals(r,test);
	 }
	 
	 @Test(expected=NullPointerException.class)
	 public void P4T1() {
		prependString(null,"");
	 }
	 
	 @Test(expected=NullPointerException.class)
	 public void P5T1() {
		 prependString(null,"a");
	 }
	 
	 @Test
	 public void P6T1() {
		prependString(test,"");
		assertEquals(test,new ArrayList<>());
	 }
	 
	 @Test
	 public void P7T1() {
		 prependString(test,"a");
		 assertEquals(test,new ArrayList<>());
	 }
	 
	 @Test
	 public void P8T1() {
		 test.add("a");
		 prependString(test,"a");
		 ArrayList<String> r = new ArrayList<>();
		 r.add("aa");
		 assertEquals(r,test);
	 }
}
