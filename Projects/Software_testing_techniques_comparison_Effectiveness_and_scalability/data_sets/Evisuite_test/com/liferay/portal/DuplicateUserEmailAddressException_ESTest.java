/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:43:45 GMT 2017
 */

package com.liferay.portal;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.DuplicateUserEmailAddressException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DuplicateUserEmailAddressException_ESTest extends DuplicateUserEmailAddressException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DuplicateUserEmailAddressException duplicateUserEmailAddressException0 = new DuplicateUserEmailAddressException();
      DuplicateUserEmailAddressException duplicateUserEmailAddressException1 = new DuplicateUserEmailAddressException(duplicateUserEmailAddressException0);
      assertFalse(duplicateUserEmailAddressException1.equals((Object)duplicateUserEmailAddressException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DuplicateUserEmailAddressException duplicateUserEmailAddressException0 = new DuplicateUserEmailAddressException("&::1yy");
      DuplicateUserEmailAddressException duplicateUserEmailAddressException1 = new DuplicateUserEmailAddressException("&::1yy", duplicateUserEmailAddressException0);
      assertFalse(duplicateUserEmailAddressException1.equals((Object)duplicateUserEmailAddressException0));
  }
}