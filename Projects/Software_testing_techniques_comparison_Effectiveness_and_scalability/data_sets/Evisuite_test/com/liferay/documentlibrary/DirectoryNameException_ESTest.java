/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:33:36 GMT 2017
 */

package com.liferay.documentlibrary;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.documentlibrary.DirectoryNameException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DirectoryNameException_ESTest extends DirectoryNameException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "+r<|YB<O(;T1\\u=rI[";
      DirectoryNameException directoryNameException0 = new DirectoryNameException(string0);
      DirectoryNameException directoryNameException1 = new DirectoryNameException("}", directoryNameException0);
      assertFalse(directoryNameException1.equals((Object)directoryNameException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DirectoryNameException directoryNameException0 = new DirectoryNameException();
      DirectoryNameException directoryNameException1 = new DirectoryNameException(directoryNameException0);
      assertFalse(directoryNameException1.equals((Object)directoryNameException0));
  }
}
