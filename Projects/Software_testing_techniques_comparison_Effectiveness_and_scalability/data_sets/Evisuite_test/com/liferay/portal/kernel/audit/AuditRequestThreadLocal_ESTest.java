/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:51:22 GMT 2017
 */

package com.liferay.portal.kernel.audit;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.audit.AuditRequestThreadLocal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AuditRequestThreadLocal_ESTest extends AuditRequestThreadLocal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      String string0 = auditRequestThreadLocal0.getSessionID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = new AuditRequestThreadLocal();
      auditRequestThreadLocal0.setSessionID("");
      String string0 = auditRequestThreadLocal0.getSessionID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      auditRequestThreadLocal0.setRealUserId(0L);
      int int0 = auditRequestThreadLocal0.getServerPort();
      assertEquals(0, int0);
      
      auditRequestThreadLocal0.setClientHost("K,TC)#%Hm/]F\",,");
      auditRequestThreadLocal0.getClientHost();
      assertEquals(0, auditRequestThreadLocal0.getServerPort());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      long long0 = auditRequestThreadLocal0.getRealUserId();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      String string0 = auditRequestThreadLocal0.getQueryString();
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals((-1203), auditRequestThreadLocal0.getServerPort());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = new AuditRequestThreadLocal();
      String string0 = auditRequestThreadLocal0.getClientIP();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = new AuditRequestThreadLocal();
      auditRequestThreadLocal0.setClientHost("");
      String string0 = auditRequestThreadLocal0.getClientHost();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      auditRequestThreadLocal0.setServerPort((-1203));
      auditRequestThreadLocal0.setServerName((String) null);
      auditRequestThreadLocal0.setClientIP((String) null);
      auditRequestThreadLocal0.setRealUserId(0L);
      auditRequestThreadLocal0.getServerPort();
      auditRequestThreadLocal0.setClientIP((String) null);
      AuditRequestThreadLocal.getAuditThreadLocal();
      auditRequestThreadLocal0.setQueryString("U!\f0`^/E4!gs");
      assertEquals((-1203), auditRequestThreadLocal0.getServerPort());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      auditRequestThreadLocal0.setRequestURL("");
      auditRequestThreadLocal0.setQueryString("");
      auditRequestThreadLocal0.setClientIP("");
      assertEquals(0, auditRequestThreadLocal0.getServerPort());
      
      auditRequestThreadLocal0.setServerPort((-49));
      auditRequestThreadLocal0.getClientHost();
      auditRequestThreadLocal0.getRealUserId();
      auditRequestThreadLocal0.getQueryString();
      assertEquals((-49), auditRequestThreadLocal0.getServerPort());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = new AuditRequestThreadLocal();
      auditRequestThreadLocal0.setQueryString("com.liferay.portal.kernel.audit.AuditRequestThreadLocal");
      String string0 = auditRequestThreadLocal0.getQueryString();
      assertEquals("com.liferay.portal.kernel.audit.AuditRequestThreadLocal", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      String string0 = auditRequestThreadLocal0.getServerName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = new AuditRequestThreadLocal();
      String string0 = auditRequestThreadLocal0.getSessionID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      String string0 = auditRequestThreadLocal0.getRequestURL();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = AuditRequestThreadLocal.getAuditThreadLocal();
      String string0 = auditRequestThreadLocal0.getClientIP();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AuditRequestThreadLocal.removeAuditThreadLocal();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AuditRequestThreadLocal auditRequestThreadLocal0 = new AuditRequestThreadLocal();
      String string0 = auditRequestThreadLocal0.getQueryString();
      assertNull(string0);
  }
}
