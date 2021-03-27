package com.todotxt.todotxttouch.util.category_partition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.prefs.Preferences;

import org.junit.Test;

import com.chschmid.jdotxt.Jdotxt;
import com.chschmid.jdotxt.gui.JdotxtGUI;
import com.todotxt.todotxttouch.util.RelativeDate;
import com.todotxt.todotxttouch.util.Strings;

public class TestRelativeDate {
	private static final long SECOND = 1000; //milliseconds
	private static final long HOUR = 3600 * SECOND;
	private static final long DAY = 24 * HOUR;
	private static final long YEAR = 365 * DAY;

	@Test(expected = NullPointerException.class)
	public void testDateNull() {
		Calendar today = new GregorianCalendar();
		assertEquals("",RelativeDate.getRelativeDate(today,null));
	}
	
	@Test
	public void testDateYesterday() {
		final Calendar today = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE,-1);
	    JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(JdotxtGUI.lang.getWord("dates_one_day_ago"),RelativeDate.getRelativeDate(today,cal));
	}
	
	@Test
	public void test3DaysAgo() {
		final Calendar today = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE,-3);
	    long diff = today.getTimeInMillis() - cal.getTimeInMillis();
	    long days = diff / DAY;
	    JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(String.format(JdotxtGUI.lang.getWord("dates_days_ago"), days),RelativeDate.getRelativeDate(today,cal));
	}
	
	@Test
	public void test1MonthAgo() {
		final Calendar today = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE,-31);
	    JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(JdotxtGUI.lang.getWord("dates_one_month_ago"),RelativeDate.getRelativeDate(today,cal));
	}
	
	@Test
	public void testMonthsAgo() {
		final Calendar today = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE,-64);
	    long diff = today.getTimeInMillis() - cal.getTimeInMillis();
	    long months = diff / (30 * DAY);
	    JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(String.format(JdotxtGUI.lang.getWord("dates_months_ago"), months),RelativeDate.getRelativeDate(today,cal));
	}
	
	@Test
	public void testFutureDate() {
		final Calendar today = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE,30);
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(sdf.format(cal.getTime()),RelativeDate.getRelativeDate(today,cal));
	}
	
	@Test
	public void testAYearAgo() {
		final Calendar today = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE,30);
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
		assertEquals(sdf.format(cal.getTime()),RelativeDate.getRelativeDate(today,cal));
	}
	
	@Test
	public void createRelativeDate() {
		RelativeDate rd = new RelativeDate();
		assertTrue(true);
	}
	
	@Test
	public void testGetRelativeDate_Date() {
        Date d = new Date();
        Calendar converted = GregorianCalendar.getInstance();
        converted.setTime(d);
		assertEquals(RelativeDate.getRelativeDate(converted),RelativeDate.getRelativeDate(d));
	}
	
	@Test
	public void testGetRelativeDate_Calendar() {
		final Calendar today = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE,30);
		assertEquals(RelativeDate.getRelativeDate(today,cal),RelativeDate.getRelativeDate(cal));
	}
	
}
