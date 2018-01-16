/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:41:41 GMT 2017
 */

package com.liferay.portal.kernel.cal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.cal.DayAndPosition;
import com.liferay.portal.kernel.cal.Duration;
import com.liferay.portal.kernel.cal.TZSRecurrence;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TZSRecurrence_ESTest extends TZSRecurrence_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Duration duration0 = new Duration(1217);
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(calendar0, duration0, 0);
      DayAndPosition dayAndPosition0 = new DayAndPosition(6, 0);
      boolean boolean0 = tZSRecurrence0.matchesIndividualByDay(calendar0, dayAndPosition0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1172), 2993, (-1172), (-1172), 2, 2);
      Duration duration0 = new Duration();
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, duration0);
      int[] intArray0 = new int[8];
      tZSRecurrence0.byYearDay = intArray0;
      boolean boolean0 = tZSRecurrence0.matchesByYearDay(mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-91387511878000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=927,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=26,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=2,SECOND=2,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Duration duration0 = new Duration();
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(calendar0, duration0);
      int[] intArray0 = new int[2];
      tZSRecurrence0.byWeekNo = intArray0;
      boolean boolean0 = tZSRecurrence0.matchesByWeekNo(calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      Duration duration0 = new Duration(0);
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(gregorianCalendar0, duration0, 1755);
      int[] intArray0 = new int[7];
      tZSRecurrence0.byMonthDay = intArray0;
      boolean boolean0 = tZSRecurrence0.matchesByMonthDay(gregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Duration duration0 = new Duration((-960));
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, duration0, (-960));
      int[] intArray0 = new int[1];
      tZSRecurrence0.setByMonth(intArray0);
      boolean boolean0 = tZSRecurrence0.matchesByMonth(mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Duration duration0 = new Duration(0, 0, 0);
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, duration0);
      int[] intArray0 = new int[0];
      boolean boolean0 = tZSRecurrence0.matchesByField(intArray0, 0, mockGregorianCalendar0, true, (TimeZone) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Duration duration0 = new Duration(0, 0, (-1455), (-1455));
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, duration0, 0);
      int[] intArray0 = new int[1];
      boolean boolean0 = tZSRecurrence0.matchesByField(intArray0, 0, mockGregorianCalendar0, false, (TimeZone) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Duration duration0 = new Duration((-80));
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, duration0, (-80));
      DayAndPosition dayAndPosition0 = new DayAndPosition();
      mockGregorianCalendar0.set(0, 5);
      // Undeclared exception!
      try { 
        tZSRecurrence0.matchesIndividualByDay(mockGregorianCalendar0, dayAndPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      Duration duration0 = new Duration(0, (-468), 0, 5);
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(calendar0, duration0, (-468));
      tZSRecurrence0.setTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        tZSRecurrence0.matchesByYearDay(calendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.util.CalendarFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("|_c=%J?$");
      Locale locale0 = Locale.CANADA;
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      Duration duration0 = new Duration(2497, 2497, 2497, 2497);
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(calendar0, duration0);
      tZSRecurrence0.setTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        tZSRecurrence0.matchesByWeekNo(calendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.util.CalendarFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(284, "K");
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) simpleTimeZone0);
      Duration duration0 = new Duration(0);
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(calendar0, duration0, (-2703));
      tZSRecurrence0.setTimeZone(simpleTimeZone0);
      // Undeclared exception!
      try { 
        tZSRecurrence0.matchesByMonth(calendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.util.CalendarFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Duration duration0 = new Duration();
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(calendar0, duration0);
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        tZSRecurrence0.matchesByField(tZSRecurrence0.byWeekNo, 4, calendar0, true, timeZone0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.util.CalendarFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 814, 184, 1, 814, 3231);
      Duration duration0 = new Duration();
      mockGregorianCalendar0.setLenient(false);
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, duration0);
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        tZSRecurrence0.matchesByField(intArray0, 3, mockGregorianCalendar0, false, (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(624, 624, 24, 0, 0, 0);
      Duration duration0 = new Duration(0);
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, duration0);
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        tZSRecurrence0.matchesByField(intArray0, 801, mockGregorianCalendar0, true, (TimeZone) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 801
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = new Duration(3, 3, 3);
      TZSRecurrence tZSRecurrence0 = null;
      try {
        tZSRecurrence0 = new TZSRecurrence((Calendar) null, duration0, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.util.CalendarFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, 8);
      Duration duration0 = new Duration((-642));
      TZSRecurrence tZSRecurrence0 = null;
      try {
        tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, duration0, (-642));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      TZSRecurrence tZSRecurrence0 = null;
      try {
        tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, (Duration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cal.Recurrence", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Duration duration0 = new Duration((-643));
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, duration0, (-643));
      DayAndPosition dayAndPosition0 = new DayAndPosition();
      tZSRecurrence0.setTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        tZSRecurrence0.matchesIndividualByDay(mockGregorianCalendar0, dayAndPosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.util.CalendarFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      Duration duration0 = new Duration(0, 0, 0);
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(calendar0, duration0, 0);
      DayAndPosition dayAndPosition0 = new DayAndPosition();
      boolean boolean0 = tZSRecurrence0.matchesIndividualByDay(calendar0, dayAndPosition0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 814, 184, 1, 814, 3231);
      Duration duration0 = new Duration();
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, duration0);
      TimeZone timeZone0 = tZSRecurrence0.getTimeZone();
      assertNull(timeZone0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1172), 2993, (-1172), (-1172), 2, 2);
      Duration duration0 = new Duration();
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, duration0);
      boolean boolean0 = tZSRecurrence0.matchesByMonth(mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1172), 2993, (-1172), (-1172), 2, 2);
      Duration duration0 = new Duration();
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(mockGregorianCalendar0, duration0);
      boolean boolean0 = tZSRecurrence0.matchesByYearDay(mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      Duration duration0 = new Duration(0, 0, 0);
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(calendar0, duration0, 0);
      boolean boolean0 = tZSRecurrence0.matchesByMonthDay(calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TZSRecurrence tZSRecurrence0 = null;
      try {
        tZSRecurrence0 = new TZSRecurrence();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.util.CalendarFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      Duration duration0 = new Duration(0, 0, 0);
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(calendar0, duration0, 0);
      tZSRecurrence0.setTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        tZSRecurrence0.matchesByMonthDay(calendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.util.CalendarFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Duration duration0 = new Duration();
      TZSRecurrence tZSRecurrence0 = new TZSRecurrence(calendar0, duration0);
      boolean boolean0 = tZSRecurrence0.matchesByWeekNo(calendar0);
      assertTrue(boolean0);
  }
}