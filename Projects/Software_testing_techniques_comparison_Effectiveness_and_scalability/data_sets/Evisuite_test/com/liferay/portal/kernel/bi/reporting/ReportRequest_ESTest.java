/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:09:40 GMT 2017
 */

package com.liferay.portal.kernel.bi.reporting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.bi.reporting.ContextClassloaderReportDesignRetriever;
import com.liferay.portal.kernel.bi.reporting.MemoryReportDesignRetriever;
import com.liferay.portal.kernel.bi.reporting.ReportDataSourceType;
import com.liferay.portal.kernel.bi.reporting.ReportDesignRetriever;
import com.liferay.portal.kernel.bi.reporting.ReportFormat;
import com.liferay.portal.kernel.bi.reporting.ReportRequest;
import com.liferay.portal.kernel.bi.reporting.ReportRequestContext;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReportRequest_ESTest extends ReportRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate(156, 0, 0, 169, 2);
      byte[] byteArray0 = new byte[7];
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever("`55</XE#96Zw", mockDate0, byteArray0);
      ReportRequest reportRequest0 = new ReportRequest((ReportRequestContext) null, memoryReportDesignRetriever0, (Map<String, String>) null, "EXCEL");
      ReportRequestContext reportRequestContext0 = reportRequest0.getReportRequestContext();
      assertNull(reportRequestContext0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ReportDataSourceType reportDataSourceType0 = ReportDataSourceType.XML;
      ReportRequestContext reportRequestContext0 = new ReportRequestContext(reportDataSourceType0);
      ReportRequest reportRequest0 = new ReportRequest(reportRequestContext0, (ReportDesignRetriever) null, (Map<String, String>) null, "pdf");
      Map<String, String> map0 = reportRequest0.getReportParameters();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever((String) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "T9`.");
      ReportRequest reportRequest0 = new ReportRequest((ReportRequestContext) null, contextClassloaderReportDesignRetriever0, hashMap0, "excel");
      Map<String, String> map0 = reportRequest0.getReportParameters();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      ReportRequest reportRequest0 = new ReportRequest((ReportRequestContext) null, (ReportDesignRetriever) null, map0, "HTML");
      ReportDesignRetriever reportDesignRetriever0 = reportRequest0.getReportDesignRetriever();
      assertNull(reportDesignRetriever0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ReportDataSourceType reportDataSourceType0 = ReportDataSourceType.JDBC;
      ReportRequestContext reportRequestContext0 = new ReportRequestContext(reportDataSourceType0);
      byte[] byteArray0 = new byte[8];
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever("csv", (Date) null, byteArray0);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      ReportRequest reportRequest0 = new ReportRequest(reportRequestContext0, memoryReportDesignRetriever0, map0, "csv");
      // Undeclared exception!
      try { 
        reportRequest0.setReportParameters(map0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ReportDataSourceType reportDataSourceType0 = ReportDataSourceType.XML;
      ReportRequestContext reportRequestContext0 = new ReportRequestContext(reportDataSourceType0);
      ReportRequest reportRequest0 = new ReportRequest(reportRequestContext0, (ReportDesignRetriever) null, (Map<String, String>) null, "pdf");
      // Undeclared exception!
      try { 
        reportRequest0.setReportParameters((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.bi.reporting.ReportRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ReportDataSourceType reportDataSourceType0 = ReportDataSourceType.XML;
      ReportRequestContext reportRequestContext0 = new ReportRequestContext(reportDataSourceType0);
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever("dataSource.columnNames");
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      ReportRequest reportRequest0 = null;
      try {
        reportRequest0 = new ReportRequest(reportRequestContext0, contextClassloaderReportDesignRetriever0, map0, "dataSource.charset");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format dataSource.charset
         //
         verifyException("com.liferay.portal.kernel.bi.reporting.ReportFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever((String) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ReportRequest reportRequest0 = new ReportRequest((ReportRequestContext) null, contextClassloaderReportDesignRetriever0, hashMap0, "excel");
      reportRequest0.setReportRequestContext((ReportRequestContext) null);
      assertEquals(ReportFormat.EXCEL, reportRequest0.getReportFormat());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever((String) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ReportRequest reportRequest0 = new ReportRequest((ReportRequestContext) null, contextClassloaderReportDesignRetriever0, hashMap0, "excel");
      ReportFormat reportFormat0 = reportRequest0.getReportFormat();
      assertEquals("excel", reportFormat0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ReportDataSourceType reportDataSourceType0 = ReportDataSourceType.JDBC;
      ReportRequestContext reportRequestContext0 = new ReportRequestContext(reportDataSourceType0);
      byte[] byteArray0 = new byte[8];
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever("csv", (Date) null, byteArray0);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      ReportRequest reportRequest0 = new ReportRequest(reportRequestContext0, memoryReportDesignRetriever0, map0, "csv");
      ReportDesignRetriever reportDesignRetriever0 = reportRequest0.getReportDesignRetriever();
      assertSame(reportDesignRetriever0, memoryReportDesignRetriever0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever((String) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ReportRequest reportRequest0 = new ReportRequest((ReportRequestContext) null, contextClassloaderReportDesignRetriever0, hashMap0, "excel");
      reportRequest0.setReportParameters(hashMap0);
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContextClassloaderReportDesignRetriever contextClassloaderReportDesignRetriever0 = new ContextClassloaderReportDesignRetriever((String) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ReportRequest reportRequest0 = new ReportRequest((ReportRequestContext) null, contextClassloaderReportDesignRetriever0, hashMap0, "excel");
      Map<String, String> map0 = reportRequest0.getReportParameters();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ReportDataSourceType reportDataSourceType0 = ReportDataSourceType.JDBC;
      ReportRequestContext reportRequestContext0 = new ReportRequestContext(reportDataSourceType0);
      byte[] byteArray0 = new byte[8];
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever("csv", (Date) null, byteArray0);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      ReportRequest reportRequest0 = new ReportRequest(reportRequestContext0, memoryReportDesignRetriever0, map0, "csv");
      reportRequest0.setReportDesignRetriever(memoryReportDesignRetriever0);
      assertEquals("csv", memoryReportDesignRetriever0.getReportName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ReportDataSourceType reportDataSourceType0 = ReportDataSourceType.JDBC;
      ReportRequestContext reportRequestContext0 = new ReportRequestContext(reportDataSourceType0);
      byte[] byteArray0 = new byte[8];
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever("csv", (Date) null, byteArray0);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      ReportRequest reportRequest0 = new ReportRequest(reportRequestContext0, memoryReportDesignRetriever0, map0, "csv");
      ReportFormat reportFormat0 = ReportFormat.RTF;
      reportRequest0.setReportFormat(reportFormat0);
      assertEquals(ReportFormat.RTF, reportRequest0.getReportFormat());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ReportDataSourceType reportDataSourceType0 = ReportDataSourceType.JDBC;
      ReportRequestContext reportRequestContext0 = new ReportRequestContext(reportDataSourceType0);
      byte[] byteArray0 = new byte[8];
      MemoryReportDesignRetriever memoryReportDesignRetriever0 = new MemoryReportDesignRetriever("csv", (Date) null, byteArray0);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      ReportRequest reportRequest0 = new ReportRequest(reportRequestContext0, memoryReportDesignRetriever0, map0, "csv");
      ReportRequestContext reportRequestContext1 = reportRequest0.getReportRequestContext();
      assertSame(reportRequestContext0, reportRequestContext1);
  }
}