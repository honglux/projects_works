/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:38:49 GMT 2017
 */

package com.liferay.documentlibrary.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.documentlibrary.util.Hook;
import com.liferay.documentlibrary.util.HookWrapper;
import com.liferay.portal.service.ServiceContext;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HookWrapper_ESTest extends HookWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      ServiceContext serviceContext0 = new ServiceContext();
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      hookWrapper0.updateFile(0L, "com.liferay.portal.kernel.exception.PortalException", 0L, 0L, "", "com.liferay.portal.kernel.exception.PortalException", "com.liferay.portal.kernel.exception.PortalException", (-1L), "", (Date) null, serviceContext0, (InputStream) byteArrayInputStream0);
      assertNull(serviceContext0.getUserDisplayURL());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      ServiceContext serviceContext0 = new ServiceContext();
      MockFile mockFile0 = new MockFile("^cDR#1;<#n", "^cDR#1;<#n");
      hookWrapper0.updateFile((-1L), "Ym%5k\"Hd\"", 0L, 0L, "Ym%5k\"Hd\"", "Ym%5k\"Hd\"", "Ym%5k\"Hd\"", 0L, "^cDR#1;<#n", (Date) null, serviceContext0, (File) mockFile0);
      assertFalse(serviceContext0.getAddCommunityPermissions());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      ServiceContext serviceContext0 = new ServiceContext();
      Date date0 = serviceContext0.getModifiedDate((Date) null);
      hookWrapper0.addFile(209L, "rjygc_s1|?|XE", 0L, 209L, "rjygc_s1|?|XE", (-1L), "", date0, serviceContext0, (InputStream) null);
      assertEquals(0L, serviceContext0.getPlid());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      ServiceContext serviceContext0 = new ServiceContext();
      MockDate mockDate0 = new MockDate((-3660L));
      hookWrapper0.addFile(0L, "FW7JnmDS)F0pS*HKp$t", (-3660L), 65L, "*Hk>ZbB'W", 65L, "*Hk>ZbB'W", (Date) mockDate0, serviceContext0, (File) null);
      assertEquals(0L, serviceContext0.getScopeGroupId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      hookWrapper0.addDirectory(0L, (-1L), "");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      hookWrapper0.updateFile((-3318L), "", 0L, 421L, (-434L), "com.liferay.portal.model.PortletPreferencesIds", (-3318L));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      ServiceContext serviceContext0 = new ServiceContext();
      byte[] byteArray0 = new byte[7];
      hookWrapper0.addFile((-143L), "S1KM-f%Z", 1L, 0L, "S1KM-f%Z", 0L, "com.liferay.portal.model.PortletPreferencesIds", (Date) null, serviceContext0, byteArray0);
      assertFalse(serviceContext0.getAddGuestPermissions());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(hook0).hasFile(anyLong() , anyLong() , anyString() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      boolean boolean0 = hookWrapper0.hasFile(0L, 0L, "com.liferay.portal.kernel.exception.NestableException", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(hook0).getFileSize(anyLong() , anyLong() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      long long0 = hookWrapper0.getFileSize(0L, 859L, (String) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn((-1294L)).when(hook0).getFileSize(anyLong() , anyLong() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      long long0 = hookWrapper0.getFileSize(3591L, 3591L, "");
      assertEquals((-1294L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn((String[]) null).when(hook0).getFileNames(anyLong() , anyLong() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      String[] stringArray0 = hookWrapper0.getFileNames(0L, 404L, ":/E (>Sd+1c)0J");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(hook0).getFileNames(anyLong() , anyLong() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      String[] stringArray1 = hookWrapper0.getFileNames(0L, 0L, "*<");
      assertSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn((InputStream) null).when(hook0).getFileAsStream(anyLong() , anyLong() , anyString() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      InputStream inputStream0 = hookWrapper0.getFileAsStream(0L, 0L, "", "MA@%T*--%.lQ[X'yOV-");
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn((InputStream) null).when(hook0).getFileAsStream(anyLong() , anyLong() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      InputStream inputStream0 = hookWrapper0.getFileAsStream((-309L), (-309L), "\"");
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)57, 0);
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(byteArrayInputStream0).when(hook0).getFileAsStream(anyLong() , anyLong() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      InputStream inputStream0 = hookWrapper0.getFileAsStream(0L, (-1L), "QU");
      assertSame(inputStream0, byteArrayInputStream0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(hook0).getFile(anyLong() , anyLong() , anyString() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      byte[] byteArray1 = hookWrapper0.getFile((-1076L), 0L, (String) null, "");
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(hook0).getFile(anyLong() , anyLong() , anyString() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      byte[] byteArray1 = hookWrapper0.getFile((-3650L), (-3650L), "", "");
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn((byte[]) null).when(hook0).getFile(anyLong() , anyLong() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      byte[] byteArray0 = hookWrapper0.getFile(0L, 886L, "");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(hook0).getFile(anyLong() , anyLong() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      byte[] byteArray1 = hookWrapper0.getFile((-2484L), (-1722L), "");
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.updateFile(8L, "IGW8_\"", 1L, 3599L, "", "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      MockDate mockDate0 = new MockDate();
      ServiceContext serviceContext0 = new ServiceContext();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        hookWrapper0.updateFile((-1L), "", 0L, (-1L), "", "", "", 0L, "", (Date) mockDate0, serviceContext0, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      MockDate mockDate0 = new MockDate(1691L);
      ServiceContext serviceContext0 = new ServiceContext();
      MockFile mockFile0 = new MockFile("");
      // Undeclared exception!
      try { 
        hookWrapper0.updateFile(0L, "->.NH<Y/Zy;)", 0L, 0L, "N?oW25SQ5 2T6Jn:f", (String) null, "update", (-2130L), "", (Date) mockDate0, serviceContext0, (File) mockFile0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.reindex((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.move("u:d_Bf(dC[Te", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.hasFile((-211L), 2691L, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.getFileSize(1L, 0L, "VyZ&>Q@^`/-@~orC");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.getFileAsStream((-2764L), 0L, "", "PwMp7Kbter7N~0nr");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.getFile((-1L), (-1L), "?/B]2P`q<0~ol9");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.deleteFile(598L, "x", 0L, "x", "L=<a^7");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.deleteFile(0L, "W.sR.x{3i`inUcO", 0L, "W.sR.x{3i`inUcO");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.deleteDirectory(0L, "", (-86L), "com.liferay.portal.kernel.exception.SystemException");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      MockDate mockDate0 = new MockDate(0L);
      ServiceContext serviceContext0 = new ServiceContext();
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)95);
      // Undeclared exception!
      try { 
        hookWrapper0.addFile(0L, "", 0L, 0L, (String) null, 0L, "", (Date) mockDate0, serviceContext0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      MockDate mockDate0 = new MockDate((-2161), 0, 1750, 1, (-210), 1236);
      ServiceContext serviceContext0 = new ServiceContext();
      MockFile mockFile0 = new MockFile("", "~ #");
      // Undeclared exception!
      try { 
        hookWrapper0.addFile((-2423L), "\"u%I\"4vQ=", 1361L, (-2423L), "_", (-2423L), "~ #", (Date) mockDate0, serviceContext0, (File) mockFile0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.addDirectory(884L, 884L, "com.liferay.documentlibrary.util.BaseHook");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.updateFile(0L, "%dxZ?QlGM%;", 0L, 0L, 0L, "%dxZ?QlGM%;", (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      MockDate mockDate0 = new MockDate(8192, 8192, 0);
      ServiceContext serviceContext0 = new ServiceContext();
      MockFile mockFile0 = new MockFile("", "`s1^_W=y");
      hookWrapper0.updateFile(0L, "", (-43L), 0L, "", "", "", 0L, "", (Date) mockDate0, serviceContext0, (File) mockFile0);
      assertNull(serviceContext0.getUserDisplayURL());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(hook0).getFileNames(anyLong() , anyLong() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      String[] stringArray1 = hookWrapper0.getFileNames((-1722L), (-1722L), "");
      assertSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      ServiceContext serviceContext0 = new ServiceContext();
      hookWrapper0.updateFile(230L, "", (-47L), 0L, "mb;P1I,'$1(;hFR_+", "", "mb;P1I,'$1(;hFR_+", 3581L, "", (Date) null, serviceContext0, (InputStream) null);
      assertFalse(serviceContext0.getAddGuestPermissions());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(hook0).getFile(anyLong() , anyLong() , anyString() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      byte[] byteArray1 = hookWrapper0.getFile(432L, (-1722L), "P/I4$s<1`{J>O~j3PT", "");
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(668L).when(hook0).getFileSize(anyLong() , anyLong() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      long long0 = hookWrapper0.getFileSize(0L, (-427L), "<w");
      assertEquals(668L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      hookWrapper0.deleteDirectory((-927L), "1.0", (-490L), "Resetting to invalid mark");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(hook0).getFile(anyLong() , anyLong() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      byte[] byteArray1 = hookWrapper0.getFile(1L, 1L, "^98+SG");
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      hookWrapper0.deleteFile((-750L), "1`e61Ho", 1L, "");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(byteArrayInputStream0).when(hook0).getFileAsStream(anyLong() , anyLong() , anyString() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      InputStream inputStream0 = hookWrapper0.getFileAsStream(0L, 0L, "", "");
      assertSame(inputStream0, byteArrayInputStream0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      String[] stringArray0 = new String[0];
      hookWrapper0.reindex(stringArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      ServiceContext serviceContext0 = new ServiceContext();
      hookWrapper0.updateFile(0L, "", 6354L, 1900L, (String) null, "", "", 542L, "j<.oZ+ wDw~!c8`<", (Date) null, serviceContext0, byteArray0);
      assertNull(serviceContext0.getLayoutFullURL());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      ServiceContext serviceContext0 = new ServiceContext();
      hookWrapper0.addFile(0L, (String) null, 0L, (-1L), "", 0L, "}", (Date) null, serviceContext0, (File) null);
      assertFalse(serviceContext0.getAddGuestPermissions());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(hook0).hasFile(anyLong() , anyLong() , anyString() , anyString());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      boolean boolean0 = hookWrapper0.hasFile((-927L), 0L, "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      // Undeclared exception!
      try { 
        hookWrapper0.getFileAsStream((-633L), (-355L), "O#>\"[[&4|\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      hookWrapper0.deleteFile(780L, "", 780L, "G1@#9c8x!{J*1k1:", "1`e61Ho");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      hookWrapper0.updateFile(0L, "5[)vyH6jfpjX;wS'$", 0L, (-1L), "DwQ\"I.K %+T-rabSJ", "tO", true);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HookWrapper hookWrapper0 = new HookWrapper((Hook) null);
      MockDate mockDate0 = new MockDate(4096, 3304, 3304);
      ServiceContext serviceContext0 = new ServiceContext();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        hookWrapper0.addFile(822L, (String) null, 822L, 645L, "h4:/_na?aKEt4", 1197L, "EBe%mlZ4iPIhwl ,", (Date) mockDate0, serviceContext0, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.documentlibrary.util.HookWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      hookWrapper0.move("y", (String) null);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      hookWrapper0.checkRoot((-287L));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Hook hook0 = mock(Hook.class, new ViolatedAssumptionAnswer());
      HookWrapper hookWrapper0 = new HookWrapper(hook0);
      MockDate mockDate0 = new MockDate(0, 0, 4096, 0, 0, 1009);
      ServiceContext serviceContext0 = new ServiceContext();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      hookWrapper0.addFile((-43L), "", (-43L), 73L, (String) null, 0L, "", (Date) mockDate0, serviceContext0, (InputStream) sequenceInputStream0);
      assertFalse(serviceContext0.getAddGuestPermissions());
  }
}
