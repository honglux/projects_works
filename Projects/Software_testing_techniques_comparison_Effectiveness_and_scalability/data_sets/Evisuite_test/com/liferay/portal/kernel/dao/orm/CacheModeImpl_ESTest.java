/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:17:06 GMT 2017
 */

package com.liferay.portal.kernel.dao.orm;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.dao.orm.CacheMode;
import com.liferay.portal.kernel.dao.orm.CacheModeImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheModeImpl_ESTest extends CacheModeImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CacheModeImpl cacheModeImpl0 = new CacheModeImpl((String) null);
      String string0 = cacheModeImpl0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CacheModeImpl cacheModeImpl0 = (CacheModeImpl)CacheMode.REFRESH;
      String string0 = cacheModeImpl0.getName();
      assertEquals("REFRESH", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CacheModeImpl cacheModeImpl0 = new CacheModeImpl("");
      String string0 = cacheModeImpl0.getName();
      assertEquals("", string0);
  }
}
