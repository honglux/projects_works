/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:38:19 GMT 2017
 */

package com.liferay.portal.kernel.deploy.auto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.deploy.auto.AutoDeployDir;
import com.liferay.portal.kernel.deploy.auto.AutoDeployListener;
import com.liferay.portal.kernel.deploy.auto.AutoDeployScanner;
import java.io.File;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AutoDeployScanner_ESTest extends AutoDeployScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThreadGroup threadGroup0 = new ThreadGroup("");
      MockFile mockFile0 = new MockFile("");
      LinkedList<AutoDeployListener> linkedList0 = new LinkedList<AutoDeployListener>();
      AutoDeployDir autoDeployDir0 = new AutoDeployDir("", mockFile0, mockFile0, 0L, 0, linkedList0);
      AutoDeployScanner autoDeployScanner0 = new AutoDeployScanner(threadGroup0, "", autoDeployDir0);
      // Undeclared exception!
      autoDeployScanner0.run();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThreadGroup threadGroup0 = new ThreadGroup("xjE$_l");
      MockFile mockFile0 = new MockFile("");
      LinkedList<AutoDeployListener> linkedList0 = new LinkedList<AutoDeployListener>();
      AutoDeployDir autoDeployDir0 = new AutoDeployDir("", mockFile0, mockFile0, (-4113L), 0, linkedList0);
      AutoDeployScanner autoDeployScanner0 = new AutoDeployScanner(threadGroup0, "", autoDeployDir0);
      // Undeclared exception!
      try { 
        autoDeployScanner0.run();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ThreadGroup threadGroup0 = new ThreadGroup(",|ZXLaz>2AK1T");
      LinkedList<AutoDeployListener> linkedList0 = new LinkedList<AutoDeployListener>();
      AutoDeployDir autoDeployDir0 = new AutoDeployDir("0 g7~", (File) null, (File) null, 0L, (-307), linkedList0);
      AutoDeployScanner autoDeployScanner0 = null;
      try {
        autoDeployScanner0 = new AutoDeployScanner(threadGroup0, (String) null, autoDeployDir0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name cannot be null
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ThreadGroup threadGroup0 = new ThreadGroup(".zip");
      MockFile mockFile0 = new MockFile("n0+,");
      threadGroup0.destroy();
      LinkedList<AutoDeployListener> linkedList0 = new LinkedList<AutoDeployListener>();
      AutoDeployDir autoDeployDir0 = new AutoDeployDir(".zip", mockFile0, mockFile0, 0L, 1, linkedList0);
      AutoDeployScanner autoDeployScanner0 = null;
      try {
        autoDeployScanner0 = new AutoDeployScanner(threadGroup0, ".zip", autoDeployDir0);
        fail("Expecting exception: IllegalThreadStateException");
      
      } catch(IllegalThreadStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.ThreadGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ThreadGroup threadGroup0 = new ThreadGroup("com.liferay.portal.kernel.deploy.auto.AutoDeployDir");
      AutoDeployScanner autoDeployScanner0 = new AutoDeployScanner(threadGroup0, "com.liferay.portal.kernel.deploy.auto.AutoDeployDir", (AutoDeployDir) null);
      // Undeclared exception!
      try { 
        autoDeployScanner0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ThreadGroup threadGroup0 = new ThreadGroup("");
      AutoDeployScanner autoDeployScanner0 = new AutoDeployScanner(threadGroup0, "", (AutoDeployDir) null);
      autoDeployScanner0.pause();
      autoDeployScanner0.run();
      assertTrue(autoDeployScanner0.isDaemon());
  }
}
