/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:55:14 GMT 2017
 */

package com.liferay.portal.kernel.bean;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.bean.ContextClassLoaderBeanHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContextClassLoaderBeanHandler_ESTest extends ContextClassLoaderBeanHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ContextClassLoaderBeanHandler contextClassLoaderBeanHandler0 = new ContextClassLoaderBeanHandler(object0, classLoader0);
  }
}
