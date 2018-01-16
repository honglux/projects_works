/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:28:02 GMT 2017
 */

package com.liferay.counter;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.counter.NoSuchCounterException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NoSuchCounterException_ESTest extends NoSuchCounterException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NoSuchCounterException noSuchCounterException0 = new NoSuchCounterException();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NoSuchCounterException noSuchCounterException0 = new NoSuchCounterException("I>/R");
      NoSuchCounterException noSuchCounterException1 = new NoSuchCounterException(noSuchCounterException0);
      assertFalse(noSuchCounterException1.equals((Object)noSuchCounterException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NoSuchCounterException noSuchCounterException0 = new NoSuchCounterException("I>/R");
      NoSuchCounterException noSuchCounterException1 = new NoSuchCounterException("';Y)Syzmb2", noSuchCounterException0);
      assertFalse(noSuchCounterException1.equals((Object)noSuchCounterException0));
  }
}