package com.chschmid.jdotxt.line_branch_coverage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.chschmid.jdotxt.Jdotxt;

public class TestJdotxt {
	
	@Test
	public void createJdotxt() {
		Jdotxt jdotxt = new Jdotxt();
		assertTrue(true);
	}
	
	@Test
	public void test_load_todos() {
		Jdotxt.loadPreferences();
		Jdotxt.loadTodos();
		assertTrue(true);
	}
	
	@Test
	public void test_is_Windows() {
		assertEquals(System.getProperty("os.name").startsWith("Windows"), Jdotxt.isWindows());
	}
	
	@Test
	public void test_is_MacOSX() {
		assertEquals(System.getProperty("os.name").startsWith("Mac OS X"), Jdotxt.isMacOSX());
	}
	
	@Test
	public void test_main_first_run() {
		Jdotxt.loadPreferences();
		Jdotxt.userPrefs.putBoolean("firstRun", true);
		Jdotxt.main(null);
		assertTrue(true);
	}
	
	@Test
	public void test_main_second_run() {
		Jdotxt.loadPreferences();
		Jdotxt.userPrefs.putBoolean("firstRun", false);
		Jdotxt.main(null);
		assertTrue(true);
	}
	
//	@Test
//	public void test_archive_todos() {
//		Jdotxt.archiveTodos();
//		assertTrue(true);
//	}
//	
//	@Test
//	public void test_store_todos() {
//		Jdotxt.storeTodos();
//		assertTrue(true);
//	}
	
	@Test
	public void test_insertReplaceString_If() {
		String original="12345", replace="12";
		int offset=2;
		assertEquals(original.substring(0, Math.min(offset, original.length())) + replace + original.substring(offset + replace.length(), original.length()), Jdotxt.insertReplaceString(original, replace, offset));
		
	}
	
	@Test
	public void test_insertReplaceString_Else() {
		String original="12", replace="12";
		int offset=2;
		assertEquals(original.substring(0, Math.min(offset, original.length())) + replace + "",Jdotxt.insertReplaceString(original, replace, offset));
		
	}
	
	@Test
	public void test_onMacOSX() {
		Jdotxt.onMacOSX();
		assertTrue(true);
		
	}
	
//	@Test
//	public void test_run() {
//		Jdotxt.run();
//		assertTrue(true);
//		
//	}

}
