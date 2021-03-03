package com.todotxt.todotxttouch.util;

import static com.todotxt.todotxttouch.util.RelativeDate.getRelativeDate;
import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import com.chschmid.jdotxt.gui.JdotxtGUI;

public class TestRelativeDate {
	private static final long SECOND = 1000; //milliseconds
	private static final long HOUR = 3600 * SECOND;
	private static final long DAY = 24 * HOUR;
	private static final long YEAR = 365 * DAY;

	@Test
	public void testDateNull() {
		Calendar today = new GregorianCalendar();
		assertEquals("",getRelativeDate(today,null));
	}
	
	@Test
	public void testDateBeforeToday() {
		final Calendar today = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -1);
	    long diff = today.getTimeInMillis() - cal.getTimeInMillis();
	    long days = diff / DAY;
		assertEquals(String.format(JdotxtGUI.lang.getWord("dates_days_ago"), days),getRelativeDate(today,cal));
	}
	
}
