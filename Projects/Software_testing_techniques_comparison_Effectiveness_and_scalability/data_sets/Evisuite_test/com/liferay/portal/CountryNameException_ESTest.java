/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:42:33 GMT 2017
 */

package com.liferay.portal;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.CountryNameException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CountryNameException_ESTest extends CountryNameException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CountryNameException countryNameException0 = new CountryNameException("f5hO7;M}vfc=/wb0^");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CountryNameException countryNameException0 = new CountryNameException();
      CountryNameException countryNameException1 = new CountryNameException(countryNameException0);
      assertFalse(countryNameException1.equals((Object)countryNameException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CountryNameException countryNameException0 = new CountryNameException();
      CountryNameException countryNameException1 = new CountryNameException("f5hO7;M}vfc=/wb0^", countryNameException0);
      assertFalse(countryNameException1.equals((Object)countryNameException0));
  }
}
