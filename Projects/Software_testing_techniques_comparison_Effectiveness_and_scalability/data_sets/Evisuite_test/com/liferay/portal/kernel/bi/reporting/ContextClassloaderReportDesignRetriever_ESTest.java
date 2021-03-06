/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:01:14 GMT 2017
 */

package com.liferay.portal.kernel.bi.reporting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.bi.reporting.ContextClassloaderReportDesignRetriever;
import java.io.InputStream;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContextClassloaderReportDesignRetriever_ESTest extends ContextClassloaderReportDesignRetriever_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever("Wt2E*QE:c/eo>");
      String string0 = contextClassloaderReportDesignRetriever0.getReportName();
      assertEquals("Wt2E*QE:c/eo>", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever("");
      String string0 = contextClassloaderReportDesignRetriever0.getReportName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever("B|BU:t>nCT(&f");
      InputStream inputStream0 = contextClassloaderReportDesignRetriever0.getInputStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever((String) null);
      // Undeclared exception!
      try { 
        contextClassloaderReportDesignRetriever0.getInputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever("");
      InputStream inputStream0 = contextClassloaderReportDesignRetriever0.getInputStream();
      assertEquals(85, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever(">TOzK+7Bzwl");
      Date date0 = contextClassloaderReportDesignRetriever0.getModifiedDate();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever((String) null);
      String string0 = contextClassloaderReportDesignRetriever0.getReportName();
      assertNull(string0);
  }
}
