/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:49:36 GMT 2017
 */

package com.liferay.portal.kernel.googleapps.comparator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.googleapps.GGroup;
import com.liferay.portal.kernel.googleapps.comparator.GGroupNameComparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GGroupNameComparator_ESTest extends GGroupNameComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GGroupNameComparator gGroupNameComparator0 = new GGroupNameComparator();
      GGroup gGroup0 = new GGroup();
      gGroup0.setName("");
      GGroup gGroup1 = new GGroup();
      gGroup1.setName("/{gygx");
      int int0 = gGroupNameComparator0.compare(gGroup1, gGroup0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GGroupNameComparator gGroupNameComparator0 = new GGroupNameComparator();
      GGroup gGroup0 = new GGroup();
      gGroup0.setName("");
      GGroup gGroup1 = new GGroup();
      gGroup1.setName("/{gygx");
      int int0 = gGroupNameComparator0.compare(gGroup0, gGroup1);
      assertEquals((-7), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GGroupNameComparator gGroupNameComparator0 = new GGroupNameComparator();
      GGroup gGroup0 = new GGroup();
      // Undeclared exception!
      try { 
        gGroupNameComparator0.compare(gGroup0, gGroup0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.googleapps.comparator.GGroupNameComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GGroupNameComparator gGroupNameComparator0 = new GGroupNameComparator(false);
      GGroup gGroup0 = new GGroup();
      gGroup0.setName("+LSG{");
      int int0 = gGroupNameComparator0.compare(gGroup0, gGroup0);
      assertEquals(0, int0);
  }
}