/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:36:54 GMT 2017
 */

package com.liferay.portal.kernel.deploy.auto;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.deploy.auto.AutoDeployException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AutoDeployException_ESTest extends AutoDeployException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AutoDeployException autoDeployException0 = new AutoDeployException();
      AutoDeployException autoDeployException1 = new AutoDeployException(autoDeployException0);
      assertFalse(autoDeployException1.equals((Object)autoDeployException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AutoDeployException autoDeployException0 = new AutoDeployException("7)p16[;G-s&3 eC");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AutoDeployException autoDeployException0 = new AutoDeployException();
      AutoDeployException autoDeployException1 = new AutoDeployException("7)p16[;G-s&3 eC", autoDeployException0);
      assertFalse(autoDeployException1.equals((Object)autoDeployException0));
  }
}
