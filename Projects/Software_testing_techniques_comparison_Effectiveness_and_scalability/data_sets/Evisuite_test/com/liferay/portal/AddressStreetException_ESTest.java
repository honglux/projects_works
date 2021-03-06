/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:40:35 GMT 2017
 */

package com.liferay.portal;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.AddressStreetException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AddressStreetException_ESTest extends AddressStreetException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AddressStreetException addressStreetException0 = new AddressStreetException();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AddressStreetException addressStreetException0 = new AddressStreetException("");
      AddressStreetException addressStreetException1 = new AddressStreetException(addressStreetException0);
      assertFalse(addressStreetException1.equals((Object)addressStreetException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AddressStreetException addressStreetException0 = new AddressStreetException("");
      AddressStreetException addressStreetException1 = new AddressStreetException("", addressStreetException0);
      assertFalse(addressStreetException1.equals((Object)addressStreetException0));
  }
}
