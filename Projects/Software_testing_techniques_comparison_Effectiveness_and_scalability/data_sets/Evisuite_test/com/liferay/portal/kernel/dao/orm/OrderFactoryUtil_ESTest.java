/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 09 00:24:34 GMT 2017
 */

package com.liferay.portal.kernel.dao.orm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactory;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OrderFactoryUtil_ESTest extends OrderFactoryUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OrderFactory orderFactory0 = OrderFactoryUtil.getOrderFactory();
      assertNull(orderFactory0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator(true);
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        OrderFactoryUtil.addOrderByComparator(dynamicQuery0, baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.dao.orm.OrderFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      OrderFactoryUtil.addOrderByComparator(dynamicQuery0, (OrderByComparator) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        OrderFactoryUtil.addOrderByComparator(dynamicQuery0, baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.dao.orm.OrderFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        OrderFactoryUtil.asc("SX4+WLXsNN%[p~OE92");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.dao.orm.OrderFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        OrderFactoryUtil.desc("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.dao.orm.OrderFactoryUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OrderFactoryUtil orderFactoryUtil0 = new OrderFactoryUtil();
      orderFactoryUtil0.setOrderFactory((OrderFactory) null);
  }
}