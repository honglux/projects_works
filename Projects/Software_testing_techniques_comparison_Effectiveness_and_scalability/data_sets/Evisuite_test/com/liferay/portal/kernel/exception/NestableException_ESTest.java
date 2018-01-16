/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:47:48 GMT 2017
 */

package com.liferay.portal.kernel.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.exception.NestableException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NestableException_ESTest extends NestableException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NestableException nestableException0 = new NestableException((String) null);
      NestableException nestableException1 = new NestableException("\"IHE", nestableException0);
      assertFalse(nestableException1.equals((Object)nestableException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NestableException nestableException0 = new NestableException();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NestableException nestableException0 = new NestableException((String) null);
      NestableException nestableException1 = new NestableException(nestableException0);
      assertFalse(nestableException1.equals((Object)nestableException0));
  }
}
