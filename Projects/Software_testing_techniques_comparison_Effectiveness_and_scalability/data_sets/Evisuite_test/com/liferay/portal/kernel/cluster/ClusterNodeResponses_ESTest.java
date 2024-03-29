/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:49:54 GMT 2017
 */

package com.liferay.portal.kernel.cluster;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.cluster.ClusterNode;
import com.liferay.portal.kernel.cluster.ClusterNodeResponse;
import com.liferay.portal.kernel.cluster.ClusterNodeResponses;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClusterNodeResponses_ESTest extends ClusterNodeResponses_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClusterNodeResponses clusterNodeResponses0 = ClusterNodeResponses.EMPTY_CLUSTER_NODE_RESPONSES;
      int int0 = clusterNodeResponses0.size();
      //  // Unstable assertion: assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClusterNodeResponses clusterNodeResponses0 = ClusterNodeResponses.EMPTY_CLUSTER_NODE_RESPONSES;
      ClusterNodeResponse clusterNodeResponse0 = new ClusterNodeResponse();
      clusterNodeResponses0.EMPTY_CLUSTER_NODE_RESPONSES.addClusterResponse(clusterNodeResponse0);
      clusterNodeResponse0.setMulticast(true);
      ClusterNodeResponse clusterNodeResponse1 = clusterNodeResponses0.getClusterResponse((ClusterNode) null);
      assertSame(clusterNodeResponse1, clusterNodeResponse0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClusterNodeResponses clusterNodeResponses0 = ClusterNodeResponses.EMPTY_CLUSTER_NODE_RESPONSES;
      ClusterNodeResponse clusterNodeResponse0 = clusterNodeResponses0.getClusterResponse((ClusterNode) null);
      assertNull(clusterNodeResponse0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClusterNodeResponses clusterNodeResponses0 = ClusterNodeResponses.EMPTY_CLUSTER_NODE_RESPONSES;
      ClusterNode clusterNode0 = new ClusterNode((String) null);
      // Undeclared exception!
      try { 
        clusterNodeResponses0.getClusterResponse(clusterNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cluster.ClusterNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClusterNodeResponses clusterNodeResponses0 = ClusterNodeResponses.EMPTY_CLUSTER_NODE_RESPONSES;
      // Undeclared exception!
      try { 
        clusterNodeResponses0.addClusterResponse((ClusterNodeResponse) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cluster.ClusterNodeResponses", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClusterNodeResponses clusterNodeResponses0 = new ClusterNodeResponses();
      ClusterNodeResponse clusterNodeResponse0 = clusterNodeResponses0.getClusterResponse((ClusterNode) null);
      assertNull(clusterNodeResponse0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClusterNodeResponses clusterNodeResponses0 = new ClusterNodeResponses();
      Map<ClusterNode, ClusterNodeResponse> map0 = clusterNodeResponses0.getClusterResponses();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClusterNodeResponses clusterNodeResponses0 = new ClusterNodeResponses();
      int int0 = clusterNodeResponses0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClusterNodeResponses clusterNodeResponses0 = new ClusterNodeResponses();
      ClusterNodeResponse clusterNodeResponse0 = new ClusterNodeResponse();
      clusterNodeResponses0.addClusterResponse(clusterNodeResponse0);
      MockThrowable mockThrowable0 = new MockThrowable();
      MockException mockException0 = new MockException(mockThrowable0);
      clusterNodeResponse0.setException(mockException0);
      ClusterNodeResponse clusterNodeResponse1 = clusterNodeResponses0.getClusterResponse((ClusterNode) null);
      assertTrue(clusterNodeResponse1.hasException());
  }
}
