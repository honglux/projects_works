/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:34:00 GMT 2017
 */

package com.liferay.documentlibrary;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.documentlibrary.FileNameException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileNameException_ESTest extends FileNameException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileNameException fileNameException0 = new FileNameException("");
      FileNameException fileNameException1 = new FileNameException(fileNameException0);
      assertFalse(fileNameException1.equals((Object)fileNameException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileNameException fileNameException0 = new FileNameException();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileNameException fileNameException0 = new FileNameException("");
      FileNameException fileNameException1 = new FileNameException("", fileNameException0);
      assertFalse(fileNameException1.equals((Object)fileNameException0));
  }
}
