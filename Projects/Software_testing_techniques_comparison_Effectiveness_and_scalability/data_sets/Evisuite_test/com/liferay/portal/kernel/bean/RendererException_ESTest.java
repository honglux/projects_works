/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:58:48 GMT 2017
 */

package com.liferay.portal.kernel.bean;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.bean.RendererException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RendererException_ESTest extends RendererException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RendererException rendererException0 = new RendererException("8V{!9#");
      RendererException rendererException1 = new RendererException(rendererException0);
      assertFalse(rendererException1.equals((Object)rendererException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RendererException rendererException0 = new RendererException();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RendererException rendererException0 = new RendererException("8V{!9#");
      RendererException rendererException1 = new RendererException("8V{!9#", rendererException0);
      assertFalse(rendererException1.equals((Object)rendererException0));
  }
}
