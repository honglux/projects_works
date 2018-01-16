/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:37:05 GMT 2017
 */

package com.liferay.documentlibrary.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.documentlibrary.service.DLService;
import com.liferay.documentlibrary.service.DLServiceUtil;
import com.liferay.portal.service.ServiceContext;
import java.io.File;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DLServiceUtil_ESTest extends DLServiceUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        DLServiceUtil.addDirectory((-1085L), (-1085L), "com.lifera.util.mai.IntenetAddresstil");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        DLServiceUtil.getService();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        DLServiceUtil.deleteFile((-5323L), "DEFAULT", (-5323L), "DEFAULT");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        DLServiceUtil.deleteDirectory((-33L), "5", (-33L), "5");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        DLServiceUtil.getFileNames((-33L), (-33L), "Z0T");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DLServiceUtil.deleteFile((-1909L), "", (-1909L), "", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      MockFile mockFile0 = new MockFile("?]IwS4P");
      // Undeclared exception!
      try { 
        DLServiceUtil.addFile(138L, "?]IwS4P", 138L, 138L, "?]IwS4P", 138L, "?]IwS4P", (Date) null, serviceContext0, (File) mockFile0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ServiceContext serviceContext0 = new ServiceContext();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        DLServiceUtil.addFile(1722L, "wlLB9pV'jsM#R[<Ny", 1722L, 1722L, "wlLB9pV'jsM#R[<Ny", 1722L, "wlLB9pV'jsM#R[<Ny", (Date) mockDate0, serviceContext0, byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      MockFile mockFile0 = new MockFile("W]LqWapTl@(({6({e", "W]LqWapTl@(({6({e");
      // Undeclared exception!
      try { 
        DLServiceUtil.updateFile(33L, "W]LqWapTl@(({6({e", 33L, 33L, "W]LqWapTl@(({6({e", "W]LqWapTl@(({6({e", "W]LqWapTl@(({6({e", 33L, "W]LqWapTl@(({6({e", (Date) null, serviceContext0, (File) mockFile0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate(17L);
      ServiceContext serviceContext0 = new ServiceContext();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        DLServiceUtil.updateFile(17L, "L", 17L, 17L, "L", "L", "L", 17L, "L", (Date) mockDate0, serviceContext0, byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DLServiceUtil.getFileSize((-21L), (-21L), "RaQUIRED");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        DLServiceUtil.getFile(41L, 41L, "gO%8wnl7t/fG>ULo", "gO%8wnl7t/fG>ULo");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DLServiceUtil dLServiceUtil0 = new DLServiceUtil();
      dLServiceUtil0.setService((DLService) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        DLServiceUtil.updateFile(1916L, "7=6; i", 1916L, 1916L, "7=6; i", "7=6; i", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        DLServiceUtil.getFile(4L, 4L, "v0_!~qRV+{]b!<Q;");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        DLServiceUtil.updateFile((-1308L), (String) null, (-1308L), (-1308L), (-1308L), (String) null, (-1308L));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }
}