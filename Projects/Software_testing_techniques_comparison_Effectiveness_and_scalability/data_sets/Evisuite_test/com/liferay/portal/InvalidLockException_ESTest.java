/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:44:58 GMT 2017
 */

package com.liferay.portal;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.InvalidLockException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InvalidLockException_ESTest extends InvalidLockException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InvalidLockException invalidLockException0 = new InvalidLockException();
      InvalidLockException invalidLockException1 = new InvalidLockException("M/P`7_h", invalidLockException0);
      assertFalse(invalidLockException1.equals((Object)invalidLockException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InvalidLockException invalidLockException0 = new InvalidLockException("]bVzkIhJ}$P:cK");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InvalidLockException invalidLockException0 = new InvalidLockException();
      InvalidLockException invalidLockException1 = new InvalidLockException(invalidLockException0);
      assertFalse(invalidLockException1.equals((Object)invalidLockException0));
  }
}
