/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:16:58 GMT 2017
 */

package com.liferay.portal.kernel.dao.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactory;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import javax.sql.DataSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SqlUpdateFactoryUtil_ESTest extends SqlUpdateFactoryUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SqlUpdateFactory sqlUpdateFactory0 = SqlUpdateFactoryUtil.getSqlUpdateFactory();
      assertNull(sqlUpdateFactory0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        SqlUpdateFactoryUtil.getSqlUpdate((DataSource) null, "N", intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SqlUpdateFactoryUtil sqlUpdateFactoryUtil0 = new SqlUpdateFactoryUtil();
      sqlUpdateFactoryUtil0.setSqlUpdateFactory((SqlUpdateFactory) null);
  }
}
