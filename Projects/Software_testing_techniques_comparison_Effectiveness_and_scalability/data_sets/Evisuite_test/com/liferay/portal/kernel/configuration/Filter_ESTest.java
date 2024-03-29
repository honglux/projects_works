/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:08:57 GMT 2017
 */

package com.liferay.portal.kernel.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.configuration.Filter;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filter_ESTest extends Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("'7lXcU}", "");
      Filter filter0 = new Filter("", "'7lXcU}", hashMap0);
      Map<String, String> map0 = filter0.getVariables();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Filter filter0 = new Filter(stringArray0, (Map<String, String>) null);
      String[] stringArray1 = filter0.getSelectors();
      assertSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Filter filter0 = new Filter((String[]) null, (Map<String, String>) null);
      String[] stringArray0 = filter0.getSelectors();
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Filter filter0 = new Filter(">-T`1S?>0");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Filter filter0 = new Filter("OVg", "_l)=T])nrYS", "OVg");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Filter filter0 = new Filter("<}\"'pSu]Sn|Z>,5`Wv", (Map<String, String>) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Filter filter0 = new Filter("<}\"'pSu]Sn|Z>,5`Wv", "<}\"'pSu]Sn|Z>,5`Wv");
      Map<String, String> map0 = filter0.getVariables();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Filter filter0 = new Filter("<}\"'pSu]Sn|Z>,5`Wv", "<}\"'pSu]Sn|Z>,5`Wv");
      String[] stringArray0 = filter0.getSelectors();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Filter filter0 = new Filter("", "", "", hashMap0);
      Map<String, String> map0 = filter0.getVariables();
      assertEquals(0, map0.size());
  }
}
