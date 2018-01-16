/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:02:23 GMT 2017
 */

package com.liferay.portal.kernel.bi.reporting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.bi.reporting.MemoryReportDesignRetriever;
import java.io.InputStream;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MemoryReportDesignRetriever_ESTest extends MemoryReportDesignRetriever_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2719), 255, 0, 255, 0);
      byte[] byteArray0 = new byte[0];
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever("NJxJeV61mIQy", mockDate0, byteArray0);
      String string0 = memoryReportDesignRetriever0.getReportName();
      assertEquals("NJxJeV61mIQy", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2897, 2897, (-464));
      byte[] byteArray0 = new byte[1];
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever("", mockDate0, byteArray0);
      String string0 = memoryReportDesignRetriever0.getReportName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 1, 1);
      byte[] byteArray0 = new byte[0];
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever(",iN", mockDate0, byteArray0);
      Date date0 = memoryReportDesignRetriever0.getModifiedDate();
      assertSame(mockDate0, date0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      byte[] byteArray0 = new byte[0];
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever("", mockDate0, byteArray0);
      InputStream inputStream0 = memoryReportDesignRetriever0.getInputStream();
      assertEquals(0, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever("", (Date) null, byteArray0);
      Date date0 = memoryReportDesignRetriever0.getModifiedDate();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2277L);
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever("w$Pg:gcAXE", mockDate0, (byte[]) null);
      // Undeclared exception!
      try { 
        memoryReportDesignRetriever0.getInputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      byte[] byteArray0 = new byte[6];
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever((String) null, mockDate0, byteArray0);
      String string0 = memoryReportDesignRetriever0.getReportName();
      assertNull(string0);
  }
}