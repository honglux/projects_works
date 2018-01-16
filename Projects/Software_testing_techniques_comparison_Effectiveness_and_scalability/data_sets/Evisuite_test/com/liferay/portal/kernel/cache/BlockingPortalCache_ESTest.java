/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:16:36 GMT 2017
 */

package com.liferay.portal.kernel.cache;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.cache.BlockingPortalCache;
import com.liferay.portal.kernel.cache.PortalCache;
import com.liferay.portal.kernel.concurrent.CompeteLatch;
import java.io.ObjectStreamConstants;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BlockingPortalCache_ESTest extends BlockingPortalCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      blockingPortalCache0.removeAll();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(portalCache0).get(any(java.util.Collection.class));
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      Locale locale0 = Locale.JAPAN;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Collection<Object> collection0 = blockingPortalCache0.get((Collection<String>) set0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache((PortalCache) null);
      // Undeclared exception!
      try { 
        blockingPortalCache0.setDebug(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache((PortalCache) null);
      // Undeclared exception!
      try { 
        blockingPortalCache0.remove("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache((PortalCache) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        blockingPortalCache0.put("com.liferay.portal.kernel.cache.BlockingPortalCache", object0, 582);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache((PortalCache) null);
      CompeteLatch competeLatch0 = new CompeteLatch();
      // Undeclared exception!
      try { 
        blockingPortalCache0.put("", (Object) competeLatch0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache((PortalCache) null);
      // Undeclared exception!
      try { 
        blockingPortalCache0.put("com.liferay.portal.kernel.cache.BlockingPortalCache", (Serializable) "Key is null", 1273);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache((PortalCache) null);
      // Undeclared exception!
      try { 
        blockingPortalCache0.put("Key is null", (Serializable) "Key is null");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache((PortalCache) null);
      Locale locale0 = Locale.KOREA;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      // Undeclared exception!
      try { 
        blockingPortalCache0.get((Collection<String>) set0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache((PortalCache) null);
      // Undeclared exception!
      try { 
        blockingPortalCache0.get((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      byte byte0 = ObjectStreamConstants.TC_CLASS;
      blockingPortalCache0.put("dQ1{_7{Z<D6rD X{o.", (Serializable) (byte)118);
      blockingPortalCache0.remove("dQ1{_7{Z<D6rD X{o.");
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale.lookup(linkedList0, linkedList1);
      // Undeclared exception!
      try { 
        blockingPortalCache0.put("dQ1{_7{Z<D6rD X{o.", (Serializable) null, (int) (byte)118);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object is null
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      String string0 = "5E";
      EvoSuiteFile evoSuiteFile0 = null;
      blockingPortalCache0.put("5E", (Object) "5E");
      // Undeclared exception!
      try { 
        blockingPortalCache0.put("eHx-V<h59!h", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object is null
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(portalCache0).get(anyString());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      blockingPortalCache0.get("Key is null");
      blockingPortalCache0.remove("Key is null");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      blockingPortalCache0.put("N&hT${,wCy[rlnv.b}", (Serializable) "com.liferay.portal.kernel.concurrent.CompeteLatch$Sync", 0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      // Undeclared exception!
      try { 
        blockingPortalCache0.put((String) null, (Serializable) "com.liferay.portal.kernel.concurrent.CompetLatch$Sync", 1192);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key is null
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      blockingPortalCache0.put("!&@jZ%V!_@fM(Pe", (Serializable) "!&@jZ%V!_@fM(Pe");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      // Undeclared exception!
      try { 
        blockingPortalCache0.put("", (Serializable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object is null
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      // Undeclared exception!
      try { 
        blockingPortalCache0.put((String) null, (Serializable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key is null
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(portalCache0).get(any(java.util.Collection.class));
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      Locale locale0 = Locale.GERMANY;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      blockingPortalCache0.get((Collection<String>) set0);
      Object object0 = new Object();
      PortalCache portalCache1 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      blockingPortalCache0.put("(E92", (Object) "(E92", (-1346));
      blockingPortalCache0.put("fbV&T'E?-", (Serializable) "fbV&T'E?-", 1);
      blockingPortalCache0.put("(E92", (Serializable) "(E92", (-1));
      blockingPortalCache0.put("C6hU!tZ", (Serializable) "(E92");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("C6hU!tZ");
      blockingPortalCache0.setDebug(true);
      linkedList0.add("fbV&T'E?-");
      linkedList0.add("");
      linkedList0.pollFirst();
      linkedList0.add(1, "6|9");
      blockingPortalCache0.put("", (Serializable) "C6hU!tZ", 5970);
      linkedList0.add("");
      blockingPortalCache0.get((Collection<String>) linkedList0);
      blockingPortalCache0.put("", (Object) "(E92", 0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      // Undeclared exception!
      try { 
        blockingPortalCache0.put((String) null, (Object) ".i@lrP7:`z}1Al", (-3543));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key is null
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      Locale locale0 = Locale.JAPAN;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      // Undeclared exception!
      try { 
        blockingPortalCache0.put((String) null, (Object) set0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key is null
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(portalCache0).get(anyString());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      blockingPortalCache0.get("yIp)*y");
      Object object0 = blockingPortalCache0.get("yIp)*y");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      doReturn(locale0).when(portalCache0).get(anyString());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      Object object0 = blockingPortalCache0.get("XynNz");
      assertSame(object0, locale0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PortalCache portalCache0 = mock(PortalCache.class, new ViolatedAssumptionAnswer());
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache(portalCache0);
      blockingPortalCache0.destroy();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BlockingPortalCache blockingPortalCache0 = new BlockingPortalCache((PortalCache) null);
      // Undeclared exception!
      try { 
        blockingPortalCache0.removeAll();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cache.BlockingPortalCache", e);
      }
  }
}
