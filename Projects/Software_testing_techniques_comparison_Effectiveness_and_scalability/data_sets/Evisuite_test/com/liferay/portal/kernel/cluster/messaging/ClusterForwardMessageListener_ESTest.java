/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:56:48 GMT 2017
 */

package com.liferay.portal.kernel.cluster.messaging;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.cluster.messaging.ClusterForwardMessageListener;
import com.liferay.portal.kernel.messaging.Message;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClusterForwardMessageListener_ESTest extends ClusterForwardMessageListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClusterForwardMessageListener clusterForwardMessageListener0 = new ClusterForwardMessageListener();
      Message message0 = new Message();
      message0.setDestinationName("FErw>rded clster Btnk xessegehas no etinatio");
      // Undeclared exception!
      try { 
        clusterForwardMessageListener0.receive(message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.messaging.MessageBusUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClusterForwardMessageListener clusterForwardMessageListener0 = new ClusterForwardMessageListener();
      Message message0 = new Message();
      clusterForwardMessageListener0.receive(message0);
      assertNull(message0.getResponseDestinationName());
  }
}