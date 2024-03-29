/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:41:50 GMT 2017
 */

package com.liferay.portal.kernel.captcha;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.captcha.CaptchaException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CaptchaException_ESTest extends CaptchaException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CaptchaException captchaException0 = new CaptchaException();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CaptchaException captchaException0 = new CaptchaException("");
      CaptchaException captchaException1 = new CaptchaException("", captchaException0);
      assertFalse(captchaException1.equals((Object)captchaException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CaptchaException captchaException0 = new CaptchaException("");
      CaptchaException captchaException1 = new CaptchaException(captchaException0);
      assertFalse(captchaException1.equals((Object)captchaException0));
  }
}
