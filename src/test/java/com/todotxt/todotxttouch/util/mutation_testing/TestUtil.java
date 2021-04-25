package com.todotxt.todotxttouch.util.mutation_testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.todotxt.todotxttouch.util.Util;

public class TestUtil {
	
	@Test
	public void kill_mutant1() {
		Util.closeStream(null);
		assertTrue(true);
	}
	
	@Test
	public void kill_mutant2() {
		assertEquals(null,Util.readStream(null));
	}
	
//	@Test
//	public void kill_mutant3() {
//		assertEquals(null,Util.readStream(new InputStream() {
//			
//			@Override
//			public int read() throws IOException {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		}));
//	}

}
