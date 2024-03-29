/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:05:17 GMT 2017
 */

package com.liferay.portal.kernel.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.concurrent.LockRegistry;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LockRegistry_ESTest extends LockRegistry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        LockRegistry.freeLock((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        LockRegistry.freeLock((String) null, "9w`rm,|8U*$9J", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        LockRegistry.freeLock((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        LockRegistry.freeLock((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        LockRegistry.allocateLock("com.liferay.portal.kernel.concurrent.CompeteLatch$Sync", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Lock lock0 = LockRegistry.freeLock("com.liferay.portal.kernel.concurrent.CompeteLatch$Sync", "com.liferay.portal.kernel.concurrent.CompeteLatch$Sync", false);
      assertNull(lock0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Map<String, Lock> map0 = LockRegistry.freeLock("com.liferay.portal.kernel.concurrent.CompeteLatch$Sync", false);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Map<String, Lock> map0 = LockRegistry.freeLock("M2m~RP?<Z:C;g-Sd", false);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = true;
      LockRegistry.freeLock("", "", true);
      // Undeclared exception!
      try { 
        LockRegistry.freeAllLock(true);
       //  fail("Expecting exception: IllegalMonitorStateException");
       // Unstable assertion
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.locks.ReentrantLock$Sync", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Map<String, Lock> map0 = LockRegistry.freeLock("nDP", true);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        LockRegistry.freeAllLock(true);
       //  fail("Expecting exception: IllegalMonitorStateException");
       // Unstable assertion
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.locks.ReentrantLock$Sync", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LockRegistry.allocateLock("", "");
      LockRegistry lockRegistry0 = new LockRegistry();
      LockRegistry.freeLock("", "", false);
      LockRegistry.freeLock("", "XwFhZ)h*h", true);
      LockRegistry.freeLock("", "XwFhZ)h*h", true);
      LockRegistry.freeLock("pkvvVQiYk8o*p$n", "");
      LockRegistry.freeLock("", true);
      // Undeclared exception!
      try { 
        LockRegistry.freeAllLock(true);
       //  fail("Expecting exception: IllegalMonitorStateException");
       // Unstable assertion
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.locks.ReentrantLock$Sync", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Map<String, Lock> map0 = LockRegistry.freeLock("com.liferay.portal.kernel.concurrent.CompeteLatch$Sync");
      assertNull(map0);
  }
}
