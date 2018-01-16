/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:55:40 GMT 2017
 */

package com.liferay.portal.kernel.cluster.messaging;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.cluster.Address;
import com.liferay.portal.kernel.cluster.ClusterLinkUtil;
import com.liferay.portal.kernel.cluster.Priority;
import com.liferay.portal.kernel.cluster.messaging.ClusterBridgeMessageListener;
import com.liferay.portal.kernel.messaging.Message;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClusterBridgeMessageListener_ESTest extends ClusterBridgeMessageListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Message message0 = new Message();
      message0.put("CLUSTER_FORWARD_MESSAGE", message0);
      ClusterBridgeMessageListener clusterBridgeMessageListener0 = new ClusterBridgeMessageListener();
      // Undeclared exception!
      try { 
        clusterBridgeMessageListener0.receive(message0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.liferay.portal.kernel.messaging.Message cannot be cast to java.lang.String
         //
         verifyException("com.liferay.portal.kernel.messaging.Message", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClusterBridgeMessageListener clusterBridgeMessageListener0 = new ClusterBridgeMessageListener();
      Message message0 = new Message();
      clusterBridgeMessageListener0.receive(message0);
      assertNull(message0.getDestinationName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Address address0 = mock(Address.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(address0).toString();
      ClusterBridgeMessageListener clusterBridgeMessageListener0 = new ClusterBridgeMessageListener();
      Message message0 = new Message();
      Message message1 = ClusterLinkUtil.setAddress(message0, address0);
      clusterBridgeMessageListener0.receive(message1);
      assertNull(message1.getResponseId());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Message message0 = new Message();
      ClusterLinkUtil.setForwardMessage(message0);
      ClusterBridgeMessageListener clusterBridgeMessageListener0 = new ClusterBridgeMessageListener();
      clusterBridgeMessageListener0.receive(message0);
      assertNull(message0.getResponseDestinationName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClusterBridgeMessageListener clusterBridgeMessageListener0 = new ClusterBridgeMessageListener();
      Priority priority0 = Priority.LEVEL4;
      clusterBridgeMessageListener0.setPriority(priority0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClusterBridgeMessageListener clusterBridgeMessageListener0 = new ClusterBridgeMessageListener();
      clusterBridgeMessageListener0.setActive(false);
      Message message0 = new Message();
      clusterBridgeMessageListener0.receive(message0);
      assertNull(message0.getResponseDestinationName());
  }
}
