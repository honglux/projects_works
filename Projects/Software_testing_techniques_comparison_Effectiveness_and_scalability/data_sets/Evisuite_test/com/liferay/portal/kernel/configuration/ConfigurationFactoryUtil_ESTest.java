/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:07:47 GMT 2017
 */

package com.liferay.portal.kernel.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.configuration.ConfigurationFactory;
import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConfigurationFactoryUtil_ESTest extends ConfigurationFactoryUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConfigurationFactory configurationFactory0 = ConfigurationFactoryUtil.getConfigurationFactory();
      assertNull(configurationFactory0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConfigurationFactoryUtil configurationFactoryUtil0 = new ConfigurationFactoryUtil();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        ConfigurationFactoryUtil.getConfiguration(classLoader0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConfigurationFactoryUtil.setConfigurationFactory((ConfigurationFactory) null);
  }
}