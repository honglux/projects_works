/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:44:50 GMT 2017
 */

package com.liferay.portal;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liferay.portal.ImageTypeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ImageTypeException_ESTest extends ImageTypeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImageTypeException imageTypeException0 = new ImageTypeException((String) null);
      ImageTypeException imageTypeException1 = new ImageTypeException(imageTypeException0);
      assertFalse(imageTypeException1.equals((Object)imageTypeException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ImageTypeException imageTypeException0 = new ImageTypeException();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ImageTypeException imageTypeException0 = new ImageTypeException((String) null);
      ImageTypeException imageTypeException1 = new ImageTypeException("", imageTypeException0);
      assertFalse(imageTypeException1.equals((Object)imageTypeException0));
  }
}
