/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:42:04 GMT 2017
 */

package com.liferay.portal.kernel.deploy.hot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.deploy.hot.HotDeployEvent;
import com.liferay.portal.kernel.deploy.hot.HotDeployListener;
import com.liferay.portal.kernel.deploy.hot.HotDeployUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HotDeployUtil_ESTest extends HotDeployUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        HotDeployUtil.fireUndeployEvent((HotDeployEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.deploy.hot.HotDeployUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HotDeployUtil.unregisterListeners();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HotDeployUtil.setCapturePrematureEvents(true);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HotDeployListener hotDeployListener0 = mock(HotDeployListener.class, new ViolatedAssumptionAnswer());
      HotDeployUtil.registerListener(hotDeployListener0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HotDeployUtil.reset();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HotDeployListener hotDeployListener0 = mock(HotDeployListener.class, new ViolatedAssumptionAnswer());
      HotDeployUtil.unregisterListener(hotDeployListener0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HotDeployUtil.fireDeployEvent((HotDeployEvent) null);
  }
}