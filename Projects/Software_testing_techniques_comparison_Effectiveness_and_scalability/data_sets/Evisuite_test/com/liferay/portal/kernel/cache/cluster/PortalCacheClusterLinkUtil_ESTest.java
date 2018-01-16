/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 23:25:24 GMT 2017
 */

package com.liferay.portal.kernel.cache.cluster;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.cache.cluster.PortalCacheClusterEvent;
import com.liferay.portal.kernel.cache.cluster.PortalCacheClusterEventType;
import com.liferay.portal.kernel.cache.cluster.PortalCacheClusterLink;
import com.liferay.portal.kernel.cache.cluster.PortalCacheClusterLinkUtil;
import com.liferay.portal.kernel.cache.cluster.UniformPortalCacheClusterChannelSelector;
import java.io.Serializable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PortalCacheClusterLinkUtil_ESTest extends PortalCacheClusterLinkUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PortalCacheClusterLinkUtil portalCacheClusterLinkUtil0 = new PortalCacheClusterLinkUtil();
      PortalCacheClusterLink portalCacheClusterLink0 = new PortalCacheClusterLink();
      UniformPortalCacheClusterChannelSelector uniformPortalCacheClusterChannelSelector0 = new UniformPortalCacheClusterChannelSelector();
      portalCacheClusterLink0.setPortalCacheClusterChannelSelector(uniformPortalCacheClusterChannelSelector0);
      portalCacheClusterLinkUtil0.setPortalCacheClusterLink(portalCacheClusterLink0);
      long long0 = PortalCacheClusterLinkUtil.getSubmittedEventNumber();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PortalCacheClusterLinkUtil portalCacheClusterLinkUtil0 = new PortalCacheClusterLinkUtil();
      PortalCacheClusterLink portalCacheClusterLink0 = new PortalCacheClusterLink();
      portalCacheClusterLinkUtil0.setPortalCacheClusterLink(portalCacheClusterLink0);
      // Undeclared exception!
      try { 
        PortalCacheClusterLinkUtil.sendEvent((PortalCacheClusterEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.cache.cluster.PortalCacheClusterLink", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PortalCacheClusterEventType portalCacheClusterEventType0 = PortalCacheClusterEventType.EXPIRED;
      PortalCacheClusterEvent portalCacheClusterEvent0 = new PortalCacheClusterEvent((String) null, (Serializable) null, portalCacheClusterEventType0);
      PortalCacheClusterLinkUtil.sendEvent(portalCacheClusterEvent0);
      assertEquals(PortalCacheClusterEventType.EXPIRED, portalCacheClusterEvent0.getEventType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      long long0 = PortalCacheClusterLinkUtil.getSubmittedEventNumber();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PortalCacheClusterLink portalCacheClusterLink0 = PortalCacheClusterLinkUtil.getPortalCacheClusterLink();
      assertNull(portalCacheClusterLink0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PortalCacheClusterLinkUtil portalCacheClusterLinkUtil0 = new PortalCacheClusterLinkUtil();
      PortalCacheClusterLink portalCacheClusterLink0 = new PortalCacheClusterLink();
      portalCacheClusterLinkUtil0.setPortalCacheClusterLink(portalCacheClusterLink0);
      PortalCacheClusterLink portalCacheClusterLink1 = PortalCacheClusterLinkUtil.getPortalCacheClusterLink();
      assertSame(portalCacheClusterLink1, portalCacheClusterLink0);
  }
}