/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:42:50 GMT 2017
 */

package com.liferay.portal;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.DuplicateGroupException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DuplicateGroupException_ESTest extends DuplicateGroupException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DuplicateGroupException duplicateGroupException0 = new DuplicateGroupException();
      DuplicateGroupException duplicateGroupException1 = new DuplicateGroupException("zHb?r", duplicateGroupException0);
      assertFalse(duplicateGroupException1.equals((Object)duplicateGroupException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DuplicateGroupException duplicateGroupException0 = new DuplicateGroupException();
      DuplicateGroupException duplicateGroupException1 = new DuplicateGroupException(duplicateGroupException0);
      assertFalse(duplicateGroupException1.equals((Object)duplicateGroupException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DuplicateGroupException duplicateGroupException0 = new DuplicateGroupException("");
  }
}
