/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:27:03 GMT 2017
 */

package com.liferay.portal.kernel.dao.orm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.dao.orm.PropertyFactory;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyFactoryUtil_ESTest extends PropertyFactoryUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PropertyFactory propertyFactory0 = PropertyFactoryUtil.getPropertyFactory();
      assertNull(propertyFactory0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PropertyFactoryUtil propertyFactoryUtil0 = new PropertyFactoryUtil();
      propertyFactoryUtil0.setPropertyFactory((PropertyFactory) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        PropertyFactoryUtil.forName("LF)ksL=t9QK");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil", e);
      }
  }
}
