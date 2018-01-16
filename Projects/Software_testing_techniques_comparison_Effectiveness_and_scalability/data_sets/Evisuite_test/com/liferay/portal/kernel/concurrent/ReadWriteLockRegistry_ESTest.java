/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:06:39 GMT 2017
 */

package com.liferay.portal.kernel.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.concurrent.ReadWriteLockKey;
import com.liferay.portal.kernel.concurrent.ReadWriteLockRegistry;
import java.util.concurrent.locks.Lock;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReadWriteLockRegistry_ESTest extends ReadWriteLockRegistry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReadWriteLockRegistry readWriteLockRegistry0 = new ReadWriteLockRegistry();
      // Undeclared exception!
      try { 
        readWriteLockRegistry0.releaseLock((ReadWriteLockKey<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.concurrent.ReadWriteLockRegistry", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReadWriteLockRegistry readWriteLockRegistry0 = new ReadWriteLockRegistry();
      // Undeclared exception!
      try { 
        readWriteLockRegistry0.acquireLock((ReadWriteLockKey<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReadWriteLockRegistry readWriteLockRegistry0 = new ReadWriteLockRegistry();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      ReadWriteLockKey<MockThaiBuddhistDate> readWriteLockKey0 = new ReadWriteLockKey<MockThaiBuddhistDate>(mockThaiBuddhistDate0, true);
      readWriteLockRegistry0.releaseLock(readWriteLockKey0);
      assertTrue(readWriteLockKey0.isWriteLock());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReadWriteLockRegistry readWriteLockRegistry0 = new ReadWriteLockRegistry();
      ReadWriteLockKey<Object> readWriteLockKey0 = new ReadWriteLockKey<Object>(readWriteLockRegistry0, false);
      readWriteLockRegistry0.releaseLock(readWriteLockKey0);
      assertFalse(readWriteLockKey0.isWriteLock());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ReadWriteLockRegistry readWriteLockRegistry0 = new ReadWriteLockRegistry();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      ReadWriteLockKey<MockThaiBuddhistDate> readWriteLockKey0 = new ReadWriteLockKey<MockThaiBuddhistDate>(mockThaiBuddhistDate0, true);
      Lock lock0 = readWriteLockRegistry0.acquireLock(readWriteLockKey0);
      assertNotNull(lock0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ReadWriteLockRegistry readWriteLockRegistry0 = new ReadWriteLockRegistry();
      ReadWriteLockKey<Object> readWriteLockKey0 = new ReadWriteLockKey<Object>(readWriteLockRegistry0, false);
      Lock lock0 = readWriteLockRegistry0.acquireLock(readWriteLockKey0);
      Lock lock1 = readWriteLockRegistry0.acquireLock(readWriteLockKey0);
      assertSame(lock1, lock0);
  }
}
