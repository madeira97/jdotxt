package com.todotxt.todotxttouch.util.mutation_testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.prefs.Preferences;

import org.junit.Test;

import com.chschmid.jdotxt.Jdotxt;
import com.chschmid.jdotxt.gui.JdotxtGUI;
import com.todotxt.todotxttouch.util.RelativeDate;

public class TestRelativeDate {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private static final long SECOND = 1000; //milliseconds
	private static final long HOUR = 3600 * SECOND;
	private static final long DAY = 24 * HOUR;
	private static final long YEAR = 365 * DAY;
	
	@Test
	public void test1() {
		Calendar today = new GregorianCalendar();
		Calendar tomorrow = new GregorianCalendar();
		tomorrow.add(Calendar.YEAR, 1);
		JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(sdf.format(today.getTime()),RelativeDate.getRelativeDate(tomorrow,today));
	}
	
	@Test
	public void test2() {
		Calendar today = new GregorianCalendar();
		Calendar tomorrow = new GregorianCalendar();
		tomorrow.add(Calendar.YEAR, 2);
		JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(sdf.format(today.getTime()),RelativeDate.getRelativeDate(tomorrow,today));
	}
	
	@Test
	public void test3() {
		Calendar today = new GregorianCalendar();
		Calendar tomorrow = new GregorianCalendar();
		tomorrow.add(Calendar.YEAR, 1);
		JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(sdf.format(tomorrow.getTime()),RelativeDate.getRelativeDate(today,tomorrow));
	}
	
	@Test
	public void test4() {
		Calendar today = new GregorianCalendar();
		Calendar tomorrow = new GregorianCalendar();
		JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(JdotxtGUI.lang.getWord("dates_today"),RelativeDate.getRelativeDate(today,tomorrow));
	}
	
	@Test
	public void test5() {
		Calendar today = new GregorianCalendar();
		Calendar tomorrow = new GregorianCalendar();
		tomorrow.add(Calendar.DAY_OF_MONTH, 60);
		long diff = tomorrow.getTimeInMillis() - today.getTimeInMillis();
		long months = diff / (30 * DAY);
		JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(String.format(JdotxtGUI.lang.getWord("dates_months_ago"), months),RelativeDate.getRelativeDate(tomorrow,today));
	}
	
	@Test
	public void test6() {
		Calendar today = new GregorianCalendar();
		Calendar tomorrow = new GregorianCalendar();
		tomorrow.add(Calendar.DAY_OF_MONTH, 61);
		long diff = tomorrow.getTimeInMillis() - today.getTimeInMillis();
		long months = diff / (30 * DAY);
		JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(String.format(JdotxtGUI.lang.getWord("dates_months_ago"), months),RelativeDate.getRelativeDate(tomorrow,today));
	}
	
	@Test
	public void test7() {
		Calendar today = new GregorianCalendar();
		Calendar tomorrow = new GregorianCalendar();
		tomorrow.add(Calendar.DAY_OF_MONTH, 30);
		JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(JdotxtGUI.lang.getWord("dates_one_month_ago"),RelativeDate.getRelativeDate(tomorrow,today));
	}
	
	@Test
	public void test8() {
		Calendar today = new GregorianCalendar();
		Calendar tomorrow = new GregorianCalendar();
		tomorrow.add(Calendar.DAY_OF_MONTH, 31);
		JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(JdotxtGUI.lang.getWord("dates_one_month_ago"),RelativeDate.getRelativeDate(tomorrow,today));
	}
	
	@Test
	public void test9() {
		Calendar today = new GregorianCalendar();
		Calendar tomorrow = new GregorianCalendar();
		tomorrow.add(Calendar.DAY_OF_MONTH, 2);
		long diff = tomorrow.getTimeInMillis() - today.getTimeInMillis();
		long days = diff / DAY;
		JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(String.format(JdotxtGUI.lang.getWord("dates_days_ago"), days),RelativeDate.getRelativeDate(tomorrow,today));
	}
	
	@Test
	public void test10() {
		Calendar today = new GregorianCalendar();
		Calendar tomorrow = new GregorianCalendar();
		tomorrow.add(Calendar.DAY_OF_MONTH, 3);
		long diff = tomorrow.getTimeInMillis() - today.getTimeInMillis();
		long days = diff / DAY;
		JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(String.format(JdotxtGUI.lang.getWord("dates_days_ago"), days),RelativeDate.getRelativeDate(tomorrow,today));
	}
	


}
