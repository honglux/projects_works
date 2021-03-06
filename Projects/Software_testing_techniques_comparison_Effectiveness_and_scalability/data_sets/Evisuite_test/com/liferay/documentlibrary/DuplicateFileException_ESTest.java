/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:33:52 GMT 2017
 */

package com.liferay.documentlibrary;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.documentlibrary.DuplicateFileException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DuplicateFileException_ESTest extends DuplicateFileException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DuplicateFileException duplicateFileException0 = new DuplicateFileException("#7VH");
      DuplicateFileException duplicateFileException1 = new DuplicateFileException(duplicateFileException0);
      assertFalse(duplicateFileException1.equals((Object)duplicateFileException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DuplicateFileException duplicateFileException0 = new DuplicateFileException("#7VH");
      DuplicateFileException duplicateFileException1 = new DuplicateFileException("l^uaFRN:`8]`i;'fQD", duplicateFileException0);
      assertFalse(duplicateFileException1.equals((Object)duplicateFileException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DuplicateFileException duplicateFileException0 = new DuplicateFileException();
  }
}
