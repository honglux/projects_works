/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:57:31 GMT 2017
 */

package com.liferay.portal.kernel.bean;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.bean.BeanLocator;
import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PortletBeanLocatorUtil_ESTest extends PortletBeanLocatorUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PortletBeanLocatorUtil.setBeanLocator("com.lifera_.portalkernel.log.LogFactoryUti", (BeanLocator) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BeanLocator beanLocator0 = PortletBeanLocatorUtil.getBeanLocator("com.lifera_.portalkernel.log.LogFactoryUti");
      assertNull(beanLocator0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PortletBeanLocatorUtil portletBeanLocatorUtil0 = new PortletBeanLocatorUtil();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      try { 
        PortletBeanLocatorUtil.locate("'W6eLz(@6<,xO*wq", "BeanLocator has not been set");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortletBeanLocatorUtil", e);
      }
  }
}
