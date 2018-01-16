/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:46:09 GMT 2017
 */

package com.liferay.portal.kernel.cluster;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.cluster.Address;
import com.liferay.portal.kernel.cluster.ClusterLink;
import com.liferay.portal.kernel.cluster.ClusterLinkUtil;
import com.liferay.portal.kernel.cluster.Priority;
import com.liferay.portal.kernel.messaging.Message;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClusterLinkUtil_ESTest extends ClusterLinkUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Message message0 = new Message();
      Address address0 = mock(Address.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(address0).toString();
      Message message1 = ClusterLinkUtil.setAddress(message0, address0);
      Address address1 = ClusterLinkUtil.getAddress(message1);
      assertSame(address1, address0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClusterLinkUtil.setForwardMessage((Message) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cluster.ClusterLinkUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClusterLinkUtil.setAddress((Message) null, (Address) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cluster.ClusterLinkUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClusterLinkUtil.isForwardMessage((Message) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cluster.ClusterLinkUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Message message0 = new Message();
      Object object0 = new Object();
      message0.put("CLUSTER_FORWARD_MESSAGE", object0);
      // Undeclared exception!
      try { 
        ClusterLinkUtil.isForwardMessage(message0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("com.liferay.portal.kernel.messaging.Message", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClusterLinkUtil.getAddress((Message) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cluster.ClusterLinkUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Message message0 = new Message();
      Priority priority0 = Priority.LEVEL10;
      ClusterLinkUtil.sendMulticastMessage(message0, priority0);
      assertNull(message0.getResponseId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Message message0 = new Message();
      Priority priority0 = Priority.LEVEL9;
      ClusterLinkUtil.sendUnicastMessage((Address) null, message0, priority0);
      assertNull(message0.getDestinationName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Priority priority0 = Priority.LEVEL10;
      ClusterLinkUtil.sendMulticastMessage((Object) null, priority0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Priority priority0 = Priority.LEVEL9;
      List<Address> list0 = ClusterLinkUtil.getTransportAddresses(priority0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Priority priority0 = Priority.LEVEL3;
      List<Address> list0 = ClusterLinkUtil.getTransportAddresses(priority0);
      Message message0 = new Message();
      message0.put("CLUSTER_ADDRESS", list0);
      // Undeclared exception!
      try { 
        ClusterLinkUtil.getAddress(message0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Collections$EmptyList cannot be cast to com.liferay.portal.kernel.cluster.Address
         //
         verifyException("com.liferay.portal.kernel.cluster.ClusterLinkUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      List<Address> list0 = ClusterLinkUtil.getLocalTransportAddresses();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClusterLink clusterLink0 = ClusterLinkUtil.getClusterLink();
      assertNull(clusterLink0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Message message0 = new Message();
      ClusterLinkUtil.setForwardMessage(message0);
      boolean boolean0 = ClusterLinkUtil.isForwardMessage(message0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Message message0 = new Message();
      Address address0 = ClusterLinkUtil.getAddress(message0);
      Priority priority0 = Priority.LEVEL3;
      ClusterLinkUtil.sendUnicastMessage(address0, message0, priority0);
      assertNull(message0.getDestinationName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClusterLinkUtil clusterLinkUtil0 = new ClusterLinkUtil();
      clusterLinkUtil0.setClusterLink((ClusterLink) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Message message0 = new Message();
      boolean boolean0 = ClusterLinkUtil.isForwardMessage(message0);
      assertFalse(boolean0);
  }
}