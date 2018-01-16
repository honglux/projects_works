/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:53:56 GMT 2017
 */

package com.liferay.portal.kernel.googleapps;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.googleapps.GGroup;
import com.liferay.portal.kernel.googleapps.GGroupOwner;
import com.liferay.portal.kernel.googleapps.GUser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GGroupOwner_ESTest extends GGroupOwner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      gGroupOwner0.setType("<2I rD||bN.");
      String string0 = gGroupOwner0.getType();
      assertEquals("<2I rD||bN.", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      gGroupOwner0.setType("");
      String string0 = gGroupOwner0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      GUser gUser0 = new GUser();
      gUser0.setAgreedToTermsOfUse(true);
      gGroupOwner0.setGUser(gUser0);
      GUser gUser1 = gGroupOwner0.getGUser();
      assertNull(gUser1.getLastName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      GUser gUser0 = new GUser();
      gUser0.setAdministrator(true);
      gGroupOwner0.setGUser(gUser0);
      GUser gUser1 = gGroupOwner0.getGUser();
      assertFalse(gUser1.isActive());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      GUser gUser0 = new GUser();
      gUser0.setActive(true);
      gGroupOwner0.setGUser(gUser0);
      GUser gUser1 = gGroupOwner0.getGUser();
      assertTrue(gUser1.isActive());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      GUser gUser0 = new GUser();
      gUser0.setUserId((-1L));
      gGroupOwner0.setGUser(gUser0);
      GUser gUser1 = gGroupOwner0.getGUser();
      assertFalse(gUser1.isActive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      GGroup gGroup0 = new GGroup();
      gGroupOwner0.setGGroup(gGroup0);
      GGroup gGroup1 = gGroupOwner0.getGGroup();
      assertNull(gGroup1.getPermissionPreset());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      gGroupOwner0.setEmailAddress((String) null);
      String string0 = gGroupOwner0.getEmailAddress();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      gGroupOwner0.setEmailAddress("^wF(n/ Z5=>Ov9");
      String string0 = gGroupOwner0.getEmailAddress();
      assertEquals("^wF(n/ Z5=>Ov9", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      gGroupOwner0.setEmailAddress((String) null);
      // Undeclared exception!
      try { 
        gGroupOwner0.isEveryone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      assertFalse(gGroupOwner0.isEveryone());
      
      gGroupOwner0.setEmailAddress("*");
      boolean boolean0 = gGroupOwner0.isEveryone();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      boolean boolean0 = gGroupOwner0.isEveryone();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      String string0 = gGroupOwner0.getEmailAddress();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      GUser gUser0 = new GUser();
      gGroupOwner0.setGUser(gUser0);
      gUser0.setUserId(1622L);
      GUser gUser1 = gGroupOwner0.getGUser();
      assertSame(gUser1, gUser0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      GGroup gGroup0 = gGroupOwner0.getGGroup();
      assertNull(gGroup0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      String string0 = gGroupOwner0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GGroupOwner gGroupOwner0 = new GGroupOwner();
      GUser gUser0 = gGroupOwner0.getGUser();
      assertNull(gUser0);
  }
}
