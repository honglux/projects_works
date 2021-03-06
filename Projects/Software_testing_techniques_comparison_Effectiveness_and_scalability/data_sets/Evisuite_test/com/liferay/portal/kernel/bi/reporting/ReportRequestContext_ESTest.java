/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:09:49 GMT 2017
 */

package com.liferay.portal.kernel.bi.reporting;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.bi.reporting.ReportDataSourceType;
import com.liferay.portal.kernel.bi.reporting.ReportRequestContext;
import java.io.Serializable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReportRequestContext_ESTest extends ReportRequestContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReportDataSourceType reportDataSourceType0 = ReportDataSourceType.CSV;
      ReportRequestContext reportRequestContext0 = new ReportRequestContext(reportDataSourceType0);
      ReportDataSourceType reportDataSourceType1 = reportRequestContext0.getReportDataSourceType();
      assertSame(reportDataSourceType0, reportDataSourceType1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReportRequestContext reportRequestContext0 = new ReportRequestContext((ReportDataSourceType) null);
      ReportDataSourceType reportDataSourceType0 = ReportDataSourceType.XML;
      reportRequestContext0.setAttribute("~5cM%<qq_M'o?%l[F%", reportDataSourceType0);
      Serializable serializable0 = reportRequestContext0.getAttribute("~5cM%<qq_M'o?%l[F%");
      assertSame(serializable0, reportDataSourceType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReportRequestContext reportRequestContext0 = new ReportRequestContext((ReportDataSourceType) null);
      reportRequestContext0.getAttribute("~5cM%<qq_M'o?%l[F%");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReportRequestContext reportRequestContext0 = new ReportRequestContext((ReportDataSourceType) null);
      reportRequestContext0.getReportDataSourceType();
  }
}
