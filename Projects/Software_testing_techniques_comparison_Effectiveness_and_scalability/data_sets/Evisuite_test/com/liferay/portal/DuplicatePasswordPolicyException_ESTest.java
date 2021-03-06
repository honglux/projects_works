/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:43:17 GMT 2017
 */

package com.liferay.portal;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.DuplicatePasswordPolicyException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DuplicatePasswordPolicyException_ESTest extends DuplicatePasswordPolicyException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DuplicatePasswordPolicyException duplicatePasswordPolicyException0 = new DuplicatePasswordPolicyException("_-%5?zh'JA}1[M1?LO");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DuplicatePasswordPolicyException duplicatePasswordPolicyException0 = new DuplicatePasswordPolicyException();
      DuplicatePasswordPolicyException duplicatePasswordPolicyException1 = new DuplicatePasswordPolicyException(duplicatePasswordPolicyException0);
      assertFalse(duplicatePasswordPolicyException1.equals((Object)duplicatePasswordPolicyException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DuplicatePasswordPolicyException duplicatePasswordPolicyException0 = new DuplicatePasswordPolicyException();
      DuplicatePasswordPolicyException duplicatePasswordPolicyException1 = new DuplicatePasswordPolicyException("_-%5?zh'JA}1[M1?LO", duplicatePasswordPolicyException0);
      assertFalse(duplicatePasswordPolicyException1.equals((Object)duplicatePasswordPolicyException0));
  }
}
