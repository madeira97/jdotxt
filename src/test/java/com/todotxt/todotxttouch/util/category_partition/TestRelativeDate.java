//package com.todotxt.todotxttouch.util.category_partition;
//
//import static com.todotxt.todotxttouch.util.RelativeDate.getRelativeDate;
//import static org.junit.Assert.assertEquals;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//import java.util.prefs.Preferences;
//
//import org.junit.Test;
//
//import com.chschmid.jdotxt.Jdotxt;
//import com.chschmid.jdotxt.gui.JdotxtGUI;
//
//public class TestRelativeDate {
//	private static final long SECOND = 1000; //milliseconds
//	private static final long HOUR = 3600 * SECOND;
//	private static final long DAY = 24 * HOUR;
//	private static final long YEAR = 365 * DAY;
//
//	@Test
//	public void testDateNull() {
//		Calendar today = new GregorianCalendar();
//		assertEquals("",getRelativeDate(today,null));
//	}
//	
//	@Test
//	public void testDateYesterday() {
//		final Calendar today = new GregorianCalendar();
//		Calendar cal = Calendar.getInstance();
//	    cal.add(Calendar.DATE,-1);
//	    JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
//		assertEquals(JdotxtGUI.lang.getWord("dates_one_day_ago"),getRelativeDate(today,cal));
//	}
//	
//	@Test
//	public void test3DaysAgo() {
//		final Calendar today = new GregorianCalendar();
//		Calendar cal = Calendar.getInstance();
//	    cal.add(Calendar.DATE,-3);
//	    long diff = today.getTimeInMillis() - cal.getTimeInMillis();
//	    long days = diff / DAY;
//	    JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
//		assertEquals(String.format(JdotxtGUI.lang.getWord("dates_days_ago"), days),getRelativeDate(today,cal));
//	}
//	
//	@Test
//	public void test1MonthAgo() {
//		final Calendar today = new GregorianCalendar();
//		Calendar cal = Calendar.getInstance();
//	    cal.add(Calendar.DATE,-31);
//	    JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
//		assertEquals(JdotxtGUI.lang.getWord("dates_one_month_ago"),getRelativeDate(today,cal));
//	}
//	
//	@Test
//	public void testMonthsAgo() {
//		final Calendar today = new GregorianCalendar();
//		Calendar cal = Calendar.getInstance();
//	    cal.add(Calendar.DATE,-64);
//	    long diff = today.getTimeInMillis() - cal.getTimeInMillis();
//	    long months = diff / (30 * DAY);
//	    JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
//		assertEquals(String.format(JdotxtGUI.lang.getWord("dates_months_ago"), months),getRelativeDate(today,cal));
//	}
//	
//	@Test
//	public void testFutureDate() {
//		final Calendar today = new GregorianCalendar();
//		Calendar cal = Calendar.getInstance();
//	    cal.add(Calendar.DATE,30);
//	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//	    JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
//		assertEquals(sdf.format(cal.getTime()),getRelativeDate(today,cal));
//	}
//	
//	@Test
//	public void testAYearAgo() {
//		final Calendar today = new GregorianCalendar();
//		Calendar cal = Calendar.getInstance();
//	    cal.add(Calendar.DATE,30);
//	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//	    JdotxtGUI.loadLookAndFeel(Preferences.userNodeForPackage(Jdotxt.class).get("lang", "English"));
//		assertEquals(sdf.format(cal.getTime()),getRelativeDate(today,cal));
//	}
//	
//}
