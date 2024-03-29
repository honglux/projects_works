/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:05:29 GMT 2017
 */

package com.liferay.portal.kernel.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.concurrent.ReadWriteLockKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReadWriteLockKey_ESTest extends ReadWriteLockKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReadWriteLockKey<String> readWriteLockKey0 = new ReadWriteLockKey<String>("?yk5`Y", false);
      boolean boolean0 = readWriteLockKey0.isWriteLock();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-2267));
      ReadWriteLockKey<Integer> readWriteLockKey0 = new ReadWriteLockKey<Integer>(integer0, true);
      readWriteLockKey0.getKey();
      assertTrue(readWriteLockKey0.isWriteLock());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReadWriteLockKey<Object> readWriteLockKey0 = new ReadWriteLockKey<Object>("", false);
      ReadWriteLockKey<String> readWriteLockKey1 = new ReadWriteLockKey<String>("", false);
      boolean boolean0 = readWriteLockKey0.equals(readWriteLockKey1);
      assertTrue(boolean0);
      assertFalse(readWriteLockKey1.isWriteLock());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReadWriteLockKey<String> readWriteLockKey0 = new ReadWriteLockKey<String>("?yk5`Y", false);
      ReadWriteLockKey<Object> readWriteLockKey1 = new ReadWriteLockKey<Object>((Object) null, true);
      boolean boolean0 = readWriteLockKey0.equals(readWriteLockKey1);
      assertTrue(readWriteLockKey1.isWriteLock());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ReadWriteLockKey<Integer> readWriteLockKey0 = new ReadWriteLockKey<Integer>((Integer) null, false);
      boolean boolean0 = readWriteLockKey0.equals((Object) null);
      assertFalse(boolean0);
      assertFalse(readWriteLockKey0.isWriteLock());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ReadWriteLockKey<String> readWriteLockKey0 = new ReadWriteLockKey<String>("?yk5`Y", false);
      boolean boolean0 = readWriteLockKey0.equals("?yk5`Y");
      assertFalse(boolean0);
      assertFalse(readWriteLockKey0.isWriteLock());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ReadWriteLockKey<Object> readWriteLockKey0 = new ReadWriteLockKey<Object>((Object) null, true);
      readWriteLockKey0.getKey();
      assertTrue(readWriteLockKey0.isWriteLock());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ReadWriteLockKey<Object> readWriteLockKey0 = new ReadWriteLockKey<Object>((Object) null, true);
      boolean boolean0 = readWriteLockKey0.isWriteLock();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ReadWriteLockKey<String> readWriteLockKey0 = new ReadWriteLockKey<String>("7rfrkv%bcINGdL%PP", true);
      readWriteLockKey0.hashCode();
      assertTrue(readWriteLockKey0.isWriteLock());
  }
}
