/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:23:07 GMT 2017
 */

package com.liferay.portal.kernel.dao.orm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FinderPath_ESTest extends FinderPath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[2];
      FinderPath finderPath0 = new FinderPath(true, true, "nz`", "nz`", stringArray0);
      boolean boolean0 = finderPath0.isFinderCacheEnabled();
      assertTrue(boolean0);
      assertTrue(finderPath0.isEntityCacheEnabled());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[7];
      FinderPath finderPath0 = new FinderPath(false, false, "", "", stringArray0);
      boolean boolean0 = finderPath0.isEntityCacheEnabled();
      assertFalse(boolean0);
      assertFalse(finderPath0.isFinderCacheEnabled());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[2];
      FinderPath finderPath0 = new FinderPath(true, true, "nz`", "nz`", stringArray0);
      finderPath0.getParams();
      assertTrue(finderPath0.isEntityCacheEnabled());
      assertTrue(finderPath0.isFinderCacheEnabled());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[2];
      FinderPath finderPath0 = new FinderPath(true, true, "nz`", "nz`", stringArray0);
      finderPath0.getMethodName();
      assertTrue(finderPath0.isFinderCacheEnabled());
      assertTrue(finderPath0.isEntityCacheEnabled());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[3];
      FinderPath finderPath0 = new FinderPath(false, false, "", "", stringArray0);
      finderPath0.getMethodName();
      assertFalse(finderPath0.isFinderCacheEnabled());
      assertFalse(finderPath0.isEntityCacheEnabled());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      FinderPath finderPath0 = new FinderPath(true, true, "nz`", "nz`", stringArray0);
      finderPath0.getClassName();
      assertTrue(finderPath0.isEntityCacheEnabled());
      assertTrue(finderPath0.isFinderCacheEnabled());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FinderPath finderPath0 = null;
      try {
        finderPath0 = new FinderPath(false, false, "zmQfstuSR", "h8^~oqBOa$;.", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.dao.orm.FinderPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[3];
      FinderPath finderPath0 = new FinderPath(false, false, "fQ\"r", "fQ\"r", stringArray0);
      // Undeclared exception!
      try { 
        finderPath0.encodeLocalCacheKey(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cache.key.CacheKeyGeneratorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[3];
      FinderPath finderPath0 = new FinderPath(true, true, "\"C04H$n9i8)cPFuh", "\"C04H$n9i8)cPFuh", stringArray0);
      // Undeclared exception!
      try { 
        finderPath0.encodeCacheKey(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cache.key.CacheKeyGeneratorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FinderPath finderPath0 = new FinderPath(true, false, "}", (String) null, stringArray0);
      String string0 = finderPath0.getMethodName();
      assertFalse(finderPath0.isFinderCacheEnabled());
      assertNull(string0);
      assertTrue(finderPath0.isEntityCacheEnabled());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FinderPath finderPath0 = new FinderPath(true, false, "}", (String) null, stringArray0);
      boolean boolean0 = finderPath0.isEntityCacheEnabled();
      assertFalse(finderPath0.isFinderCacheEnabled());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FinderPath finderPath0 = new FinderPath(true, true, "", "[yNa", stringArray0);
      finderPath0.getParams();
      assertTrue(finderPath0.isEntityCacheEnabled());
      assertEquals("", finderPath0.getClassName());
      assertEquals("[yNa", finderPath0.getMethodName());
      assertTrue(finderPath0.isFinderCacheEnabled());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[3];
      FinderPath finderPath0 = new FinderPath(false, false, "", "", stringArray0);
      finderPath0.getClassName();
      assertFalse(finderPath0.isFinderCacheEnabled());
      assertFalse(finderPath0.isEntityCacheEnabled());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FinderPath finderPath0 = new FinderPath(true, false, ":>8H", "_+]WO nFi", stringArray0);
      boolean boolean0 = finderPath0.isFinderCacheEnabled();
      assertEquals(":>8H", finderPath0.getClassName());
      assertEquals("_+]WO nFi", finderPath0.getMethodName());
      assertTrue(finderPath0.isEntityCacheEnabled());
      assertFalse(boolean0);
  }
}
