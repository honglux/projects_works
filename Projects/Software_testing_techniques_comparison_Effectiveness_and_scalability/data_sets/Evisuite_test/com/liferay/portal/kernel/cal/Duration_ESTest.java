/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:35:21 GMT 2017
 */

package com.liferay.portal.kernel.cal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.cal.Duration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Duration_ESTest extends Duration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Duration duration0 = new Duration();
      duration0.setSeconds(60);
      // Undeclared exception!
      try { 
        duration0.checkWeeksOkay(60);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weeks and non-weeks are incompatible
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Duration duration0 = new Duration();
      duration0.setMinutes(1299);
      // Undeclared exception!
      try { 
        duration0.setWeeks(1299);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weeks and non-weeks are incompatible
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = new Duration((-195), (-195), 1006);
      duration0.normalize();
      // Undeclared exception!
      try { 
        duration0.checkWeeksOkay(1006);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weeks and non-weeks are incompatible
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Duration duration0 = new Duration(2991, 2991, 2991);
      duration0.setInterval(2991);
      assertEquals(2, duration0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Duration duration0 = new Duration(1630, 86400000, 1630, (-2352));
      long long0 = duration0.getInterval();
      assertEquals(1956918208L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Duration duration0 = new Duration(5689, (-1), 1000);
      duration0.setDays(0);
      assertEquals(15, duration0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = new Duration(0);
      duration0.setWeeks(0);
      assertEquals(0, duration0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Duration duration0 = new Duration(0, 0, 0);
      duration0.checkNonWeeksOkay(0);
      assertEquals(0, duration0.getDays());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = new Duration(1630, 86400000, 1630, (-2352));
      int int0 = duration0.getWeeks();
      assertEquals(0, int0);
      assertEquals(1956918208L, duration0.getInterval());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = new Duration((-1684));
      int int0 = duration0.getWeeks();
      assertEquals((-1684), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = new Duration(5689, (-1), 1000);
      int int0 = duration0.getSeconds();
      assertEquals((-993496480L), duration0.getInterval());
      assertEquals(1000, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = new Duration(1630, 86400000, 1630, (-2352));
      int int0 = duration0.getSeconds();
      assertEquals(1956918208L, duration0.getInterval());
      assertEquals((-2352), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Duration duration0 = new Duration(0, 2686, (-3593));
      int int0 = duration0.getMinutes();
      assertEquals(2686, int0);
      assertEquals(157567000L, duration0.getInterval());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Duration duration0 = new Duration(2573, (-1), (-4456));
      int int0 = duration0.getMinutes();
      assertEquals(668349408L, duration0.getInterval());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = new Duration();
      int int0 = duration0.getHours();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Duration duration0 = new Duration((-370), 3600000, (-370));
      int int0 = duration0.getHours();
      assertEquals((-80734800L), duration0.getInterval());
      assertEquals((-370), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Duration duration0 = new Duration();
      duration0.setDays(3165);
      int int0 = duration0.getDays();
      assertEquals(3165, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Duration duration0 = new Duration(0, (-2311), 1431);
      duration0.normalize();
      int int0 = duration0.getDays();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = new Duration(24);
      // Undeclared exception!
      try { 
        duration0.setSeconds(3053);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weeks and non-weeks are incompatible
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Duration duration0 = new Duration(672);
      // Undeclared exception!
      try { 
        duration0.setMinutes(1000);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weeks and non-weeks are incompatible
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = new Duration();
      duration0.setWeeks(1);
      // Undeclared exception!
      try { 
        duration0.setDays(1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weeks and non-weeks are incompatible
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Duration duration0 = new Duration((-6));
      // Undeclared exception!
      try { 
        duration0.checkNonWeeksOkay((-6));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weeks and non-weeks are incompatible
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Duration duration0 = new Duration(420);
      // Undeclared exception!
      try { 
        duration0.setHours(420);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weeks and non-weeks are incompatible
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Duration duration0 = new Duration(0, (-1336), 1850);
      // Undeclared exception!
      try { 
        duration0.checkWeeksOkay(1879048192);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weeks and non-weeks are incompatible
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Duration duration0 = new Duration((-352), (-352), (-352));
      // Undeclared exception!
      try { 
        duration0.checkWeeksOkay((-352));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weeks and non-weeks are incompatible
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Duration duration0 = new Duration(0, 0, 0);
      duration0.checkWeeksOkay(0);
      assertEquals(0, duration0.getDays());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Duration duration0 = new Duration(2113);
      // Undeclared exception!
      try { 
        duration0.setInterval((-2722L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative-length interval
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Duration duration0 = new Duration((-1684));
      // Undeclared exception!
      try { 
        duration0.setSeconds((-326));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Second value out of range
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Duration duration0 = new Duration(1630, 86400000, 1630, (-2352));
      duration0.setSeconds(0);
      assertEquals(10, duration0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Duration duration0 = new Duration((-13), (-13), (-13), (-13));
      // Undeclared exception!
      try { 
        duration0.setMinutes((-13));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minute value out of range
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Duration duration0 = new Duration(0);
      duration0.setMinutes(0);
      assertEquals(0L, duration0.getInterval());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Duration duration0 = new Duration(0, 0, 0);
      // Undeclared exception!
      try { 
        duration0.setHours((-1132));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Hour value out of range
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Duration duration0 = new Duration(0, 0, 0);
      duration0.setHours(0);
      assertEquals(0L, duration0.getInterval());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Duration duration0 = new Duration(2573, (-1), (-4456));
      // Undeclared exception!
      try { 
        duration0.setDays((-15));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Day value out of range
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Duration duration0 = new Duration(0);
      duration0.setDays(60000);
      // Undeclared exception!
      try { 
        duration0.setWeeks(7);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weeks and non-weeks are incompatible
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Duration duration0 = new Duration(0, 0, 0);
      duration0.setWeeks(2808);
      long long0 = duration0.getInterval();
      assertEquals(2808, duration0.getWeeks());
      assertEquals(1766318080L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Duration duration0 = new Duration(2482);
      Duration duration1 = (Duration)duration0.clone();
      assertNotSame(duration1, duration0);
      assertEquals((-2124953600L), duration1.getInterval());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Duration duration0 = new Duration(0);
      int int0 = duration0.getSeconds();
      assertEquals(0, duration0.getWeeks());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Duration duration0 = new Duration(2482);
      long long0 = duration0.getInterval();
      assertEquals((-2124953600L), long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Duration duration0 = new Duration(2482);
      int int0 = duration0.getMinutes();
      assertEquals(0, int0);
      assertEquals((-2124953600L), duration0.getInterval());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Duration duration0 = new Duration(2482);
      duration0.setInterval(0);
      assertEquals(0L, duration0.getInterval());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Duration duration0 = new Duration(2573, (-1), (-4456));
      int int0 = duration0.getHours();
      assertEquals(2573, int0);
      assertEquals(668349408L, duration0.getInterval());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Duration duration0 = new Duration(0, 0, (-1170));
      // Undeclared exception!
      try { 
        duration0.checkWeeksOkay((-1170));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weeks and non-weeks are incompatible
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Duration duration0 = new Duration(2482);
      int int0 = duration0.getDays();
      assertEquals(0, int0);
      assertEquals(2482, duration0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Duration duration0 = new Duration(2482);
      duration0.clear();
      long long0 = duration0.getInterval();
      assertEquals(0, duration0.getWeeks());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Duration duration0 = new Duration(2482);
      String string0 = duration0.toString();
      assertEquals("com.liferay.portal.kernel.cal.Duration[weeks=2482,days=0,hours=0,minutes=0,seconds=0]", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Duration duration0 = new Duration(2482);
      int int0 = duration0.getWeeks();
      assertEquals(2482, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Duration duration0 = new Duration();
      // Undeclared exception!
      try { 
        duration0.setWeeks((-1754));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Week value out of range
         //
         verifyException("com.liferay.portal.kernel.cal.Duration", e);
      }
  }
}
