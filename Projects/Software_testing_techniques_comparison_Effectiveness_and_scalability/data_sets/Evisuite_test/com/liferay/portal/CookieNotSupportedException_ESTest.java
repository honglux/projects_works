/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:42:01 GMT 2017
 */

package com.liferay.portal;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.CookieNotSupportedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CookieNotSupportedException_ESTest extends CookieNotSupportedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CookieNotSupportedException cookieNotSupportedException0 = new CookieNotSupportedException();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CookieNotSupportedException cookieNotSupportedException0 = new CookieNotSupportedException("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("com.liferay.portal.kernel.exception.PortalException");
      CookieNotSupportedException cookieNotSupportedException0 = new CookieNotSupportedException(mockThrowable0);
      CookieNotSupportedException cookieNotSupportedException1 = new CookieNotSupportedException("com.liferay.portal.kernel.exception.PortalException", cookieNotSupportedException0);
      assertFalse(cookieNotSupportedException1.equals((Object)cookieNotSupportedException0));
  }
}
