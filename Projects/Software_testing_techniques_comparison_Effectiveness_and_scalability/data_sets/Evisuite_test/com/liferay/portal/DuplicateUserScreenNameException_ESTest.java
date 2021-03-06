/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:44:10 GMT 2017
 */

package com.liferay.portal;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.DuplicateUserScreenNameException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DuplicateUserScreenNameException_ESTest extends DuplicateUserScreenNameException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DuplicateUserScreenNameException duplicateUserScreenNameException0 = new DuplicateUserScreenNameException();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DuplicateUserScreenNameException duplicateUserScreenNameException0 = new DuplicateUserScreenNameException("HE>Iv&~AX?8+/++v");
      DuplicateUserScreenNameException duplicateUserScreenNameException1 = new DuplicateUserScreenNameException(duplicateUserScreenNameException0);
      assertFalse(duplicateUserScreenNameException1.equals((Object)duplicateUserScreenNameException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DuplicateUserScreenNameException duplicateUserScreenNameException0 = new DuplicateUserScreenNameException("HE>Iv&~AX?8+/++v");
      DuplicateUserScreenNameException duplicateUserScreenNameException1 = new DuplicateUserScreenNameException(",*O]{gyqjc'", duplicateUserScreenNameException0);
      assertFalse(duplicateUserScreenNameException1.equals((Object)duplicateUserScreenNameException0));
  }
}
