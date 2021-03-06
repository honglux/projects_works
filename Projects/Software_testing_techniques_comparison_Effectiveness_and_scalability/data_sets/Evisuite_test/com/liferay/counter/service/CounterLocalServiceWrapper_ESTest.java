/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 08 22:31:04 GMT 2017
 */

package com.liferay.counter.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.counter.model.Counter;
import com.liferay.counter.model.CounterWrapper;
import com.liferay.counter.service.CounterLocalService;
import com.liferay.counter.service.CounterLocalServiceWrapper;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CounterLocalServiceWrapper_ESTest extends CounterLocalServiceWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Counter counter0 = mock(Counter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(counter0).toString();
      Counter counter1 = mock(Counter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(counter1).toString();
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(counter1).when(counterLocalService0).createCounter(anyString());
      doReturn(counter0).when(counterLocalService0).updateCounter(any(com.liferay.counter.model.Counter.class) , anyBoolean());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      Counter counter2 = counterLocalServiceWrapper0.createCounter("5?%g|-1b@)");
      Counter counter3 = counterLocalServiceWrapper0.updateCounter(counter2, false);
      assertSame(counter3, counter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((Counter) null, (Counter) null, counterWrapper0).when(counterLocalService0).updateCounter(any(com.liferay.counter.model.Counter.class));
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      counterLocalServiceWrapper0.updateCounter((Counter) null);
      counterLocalServiceWrapper0.updateCounter((Counter) null);
      Counter counter0 = counterLocalServiceWrapper0.updateCounter((Counter) counterWrapper0);
      assertSame(counterWrapper0, counter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(1490L).when(counterLocalService0).increment(anyString() , anyInt());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      long long0 = counterLocalServiceWrapper0.increment("REQUIRES_NEW", (-1133));
      assertEquals(1490L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-483)).when(counterLocalService0).increment(anyString() , anyInt());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      long long0 = counterLocalServiceWrapper0.increment("", 0);
      assertEquals((-483L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(1344L).when(counterLocalService0).increment(anyString());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      long long0 = counterLocalServiceWrapper0.increment("com.liferay.portal.kernel.exception.NestableException");
      assertEquals(1344L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-483)).when(counterLocalService0).increment(anyString());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      long long0 = counterLocalServiceWrapper0.increment("dueDate ASC, workflowTaskId ASC");
      assertEquals((-483L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((-2709L), 1L).when(counterLocalService0).increment();
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      counterLocalServiceWrapper0.increment();
      long long0 = counterLocalServiceWrapper0.increment();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      CounterLocalService counterLocalService0 = counterLocalServiceWrapper0.getWrappedCounterLocalService();
      assertNull(counterLocalService0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(counterLocalService0).increment();
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      CounterLocalServiceWrapper counterLocalServiceWrapper1 = new CounterLocalServiceWrapper(counterLocalServiceWrapper0);
      counterLocalServiceWrapper1.increment();
      CounterLocalService counterLocalService1 = counterLocalServiceWrapper1.getWrappedCounterLocalService();
      //  // Unstable assertion: assertEquals(4113L, counterLocalService1.increment());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      CounterLocalServiceWrapper counterLocalServiceWrapper1 = new CounterLocalServiceWrapper(counterLocalServiceWrapper0);
      CounterLocalService counterLocalService1 = counterLocalServiceWrapper1.getWrappedCounterLocalService();
      assertSame(counterLocalServiceWrapper0, counterLocalService1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(counterLocalService0).getNames();
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      linkedList0.add("v3vyO");
      List<String> list0 = counterLocalServiceWrapper0.getNames();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(counterLocalService0).getNames();
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      List<String> list0 = counterLocalServiceWrapper0.getNames();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list1 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) list0, locale_FilteringMode0);
      CounterLocalService counterLocalService1 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(list1).when(counterLocalService1).getNames();
      CounterLocalServiceWrapper counterLocalServiceWrapper1 = new CounterLocalServiceWrapper(counterLocalService1);
      List<String> list2 = counterLocalServiceWrapper1.getNames();
      assertEquals(0, list2.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(1439).when(counterLocalService0).getCountersCount();
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      int int0 = counterLocalServiceWrapper0.getCountersCount();
      assertEquals(1439, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((-1898)).when(counterLocalService0).getCountersCount();
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      int int0 = counterLocalServiceWrapper0.getCountersCount();
      assertEquals((-1898), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Counter counter0 = mock(Counter.class, new ViolatedAssumptionAnswer());
      doReturn((Counter) null).when(counter0).toEscapedModel();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(counter0).toString();
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(counter0, counter0, (Counter) null).when(counterLocalService0).addCounter(any(com.liferay.counter.model.Counter.class));
      doReturn(counter0).when(counterLocalService0).createCounter(anyString());
      doReturn((List) null).when(counterLocalService0).dynamicQuery(any(com.liferay.portal.kernel.dao.orm.DynamicQuery.class) , anyInt() , anyInt() , any(com.liferay.portal.kernel.util.OrderByComparator.class));
      doReturn(counter0, counter0).when(counterLocalService0).getCounter(anyString());
      doReturn((List) null).when(counterLocalService0).getCounters(anyInt() , anyInt());
      doReturn((Counter) null).when(counterLocalService0).updateCounter(any(com.liferay.counter.model.Counter.class) , anyBoolean());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      Counter counter1 = counterLocalServiceWrapper0.getCounter("qs:z]Ym}P`Qoc%\"n<U");
      Counter counter2 = counterLocalServiceWrapper0.addCounter(counter1);
      Counter counter3 = counterLocalServiceWrapper0.addCounter(counter2);
      counterLocalServiceWrapper0.createCounter("com.liferay.portal.kernel.workflow.comparator.BaseWorkflowInstanceEndDateComparator");
      Counter counter4 = counterLocalServiceWrapper0.getCounter("YbA]\"R{eU`7");
      CounterWrapper counterWrapper0 = new CounterWrapper(counter4);
      counterWrapper0.setName("qs:z]Ym}P`Qoc%\"n<U");
      counterWrapper0.setCachedModel(true);
      counterWrapper0.toEscapedModel();
      counterLocalServiceWrapper0.addCounter(counterWrapper0);
      counterLocalServiceWrapper0.getCounters(0, 0);
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      counterLocalServiceWrapper0.dynamicQuery(dynamicQuery0, 0, 1496, (OrderByComparator) baseWorkflowTaskNameComparator0);
      Counter counter5 = counterLocalServiceWrapper0.updateCounter(counter3, true);
      assertNull(counter5);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Counter> linkedList0 = new LinkedList<Counter>();
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(counterLocalService0).getCounters(anyInt() , anyInt());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      linkedList0.add((Counter) counterWrapper0);
      List<Counter> list0 = counterLocalServiceWrapper0.getCounters((-2484), (-2484));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(475L).when(counterLocalService0).dynamicQueryCount(any(com.liferay.portal.kernel.dao.orm.DynamicQuery.class));
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      long long0 = counterLocalServiceWrapper0.dynamicQueryCount(dynamicQuery0);
      assertEquals(475L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((long)(-1)).when(counterLocalService0).dynamicQueryCount(any(com.liferay.portal.kernel.dao.orm.DynamicQuery.class));
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      long long0 = counterLocalServiceWrapper0.dynamicQueryCount(dynamicQuery0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<MockJapaneseDate> linkedList0 = new LinkedList<MockJapaneseDate>();
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(counterLocalService0).dynamicQuery(any(com.liferay.portal.kernel.dao.orm.DynamicQuery.class) , anyInt() , anyInt() , any(com.liferay.portal.kernel.util.OrderByComparator.class));
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      linkedList0.add(mockJapaneseDate0);
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      List list0 = counterLocalServiceWrapper0.dynamicQuery(dynamicQuery0, 46, 46, (OrderByComparator) baseWorkflowTaskNameComparator0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = new Locale("dueDate", "");
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(list0).when(counterLocalService0).dynamicQuery(any(com.liferay.portal.kernel.dao.orm.DynamicQuery.class) , anyInt() , anyInt() , any(com.liferay.portal.kernel.util.OrderByComparator.class));
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      List list1 = counterLocalServiceWrapper0.dynamicQuery(dynamicQuery0, 0, 0, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
      assertEquals(0, list1.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(counterLocalService0).dynamicQuery(any(com.liferay.portal.kernel.dao.orm.DynamicQuery.class) , anyInt() , anyInt());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      List list0 = counterLocalServiceWrapper0.dynamicQuery(dynamicQuery0, (-764), 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<CounterWrapper> linkedList0 = new LinkedList<CounterWrapper>();
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(counterLocalService0).dynamicQuery(any(com.liferay.portal.kernel.dao.orm.DynamicQuery.class) , anyInt() , anyInt());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      linkedList0.add(counterWrapper0);
      List list0 = counterLocalServiceWrapper0.dynamicQuery((DynamicQuery) null, 885, 4);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(counterLocalService0).getNames();
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      List<String> list0 = counterLocalServiceWrapper0.getNames();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list1 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) list0, locale_FilteringMode0);
      CounterLocalService counterLocalService1 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(list1).when(counterLocalService1).dynamicQuery(any(com.liferay.portal.kernel.dao.orm.DynamicQuery.class) , anyInt() , anyInt());
      CounterLocalServiceWrapper counterLocalServiceWrapper1 = new CounterLocalServiceWrapper(counterLocalService1);
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      List list2 = counterLocalServiceWrapper1.dynamicQuery(dynamicQuery0, (-781), 5);
      assertTrue(list2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(counterLocalService0).dynamicQuery(any(com.liferay.portal.kernel.dao.orm.DynamicQuery.class));
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      List list0 = counterLocalServiceWrapper0.dynamicQuery(dynamicQuery0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<CounterWrapper> linkedList0 = new LinkedList<CounterWrapper>();
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(counterLocalService0).dynamicQuery(any(com.liferay.portal.kernel.dao.orm.DynamicQuery.class));
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      CounterWrapper counterWrapper0 = new CounterWrapper((Counter) null);
      linkedList0.add(counterWrapper0);
      List list0 = counterLocalServiceWrapper0.dynamicQuery((DynamicQuery) null);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(counterLocalService0).getNames();
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      List<String> list0 = counterLocalServiceWrapper0.getNames();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list1 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) list0, locale_FilteringMode0);
      CounterLocalService counterLocalService1 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(list1).when(counterLocalService1).dynamicQuery(any(com.liferay.portal.kernel.dao.orm.DynamicQuery.class));
      CounterLocalServiceWrapper counterLocalServiceWrapper1 = new CounterLocalServiceWrapper(counterLocalService1);
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      List list2 = counterLocalServiceWrapper1.dynamicQuery(dynamicQuery0);
      assertEquals(0, list2.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.updateCounter((Counter) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.updateCounter((Counter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.reset(" |XZ6J", 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.reset("/'(5=k");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.rename("|~YaS[=G8M", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.increment("dueDate ASC, workflowTaskId ASC", 359);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.increment("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.increment();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.getNames();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.getCountersCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.getCounters(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.getCounter("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator(false);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.dynamicQuery(dynamicQuery0, 0, (-1454), (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.dynamicQuery((DynamicQuery) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.dynamicQuery((DynamicQuery) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.deleteCounter("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.createCounter("\"gAg|\"tigpWH ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper((CounterLocalService) null);
      // Undeclared exception!
      try { 
        counterLocalServiceWrapper0.addCounter((Counter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.counter.service.CounterLocalServiceWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(counterLocalService0).increment(anyString() , anyInt());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      long long0 = counterLocalServiceWrapper0.increment("dueDate ASC, workflowTaskId ASC", 16);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(counterLocalService0).getCounters(anyInt() , anyInt());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      List<Counter> list0 = counterLocalServiceWrapper0.getCounters((-781), 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      counterLocalServiceWrapper0.deleteCounter("NESTED");
      assertEquals(0L, counterLocalServiceWrapper0.increment());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((Counter) null).when(counterLocalService0).createCounter(anyString());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      Counter counter0 = counterLocalServiceWrapper0.createCounter("GoXqRV6jP");
      assertNull(counter0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(counterLocalService0).getCountersCount();
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      int int0 = counterLocalServiceWrapper0.getCountersCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn((Counter) null).when(counterLocalService0).getCounter(anyString());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      Counter counter0 = counterLocalServiceWrapper0.getCounter("");
      assertNull(counter0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      counterLocalServiceWrapper0.deleteCounter((Counter) null);
      assertEquals(0, counterLocalServiceWrapper0.getCountersCount());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(counterLocalService0).increment(anyString());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      long long0 = counterLocalServiceWrapper0.increment("");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(counterLocalService0).dynamicQueryCount(any(com.liferay.portal.kernel.dao.orm.DynamicQuery.class));
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      DynamicQuery dynamicQuery0 = mock(DynamicQuery.class, new ViolatedAssumptionAnswer());
      long long0 = counterLocalServiceWrapper0.dynamicQueryCount(dynamicQuery0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      counterLocalServiceWrapper0.reset("t^eMwp4", 0L);
      assertEquals(0L, counterLocalServiceWrapper0.increment());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      counterLocalServiceWrapper0.reset("NESTED");
      assertEquals(0, counterLocalServiceWrapper0.getCountersCount());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CounterLocalService counterLocalService0 = mock(CounterLocalService.class, new ViolatedAssumptionAnswer());
      CounterLocalServiceWrapper counterLocalServiceWrapper0 = new CounterLocalServiceWrapper(counterLocalService0);
      counterLocalServiceWrapper0.rename("", "");
      assertEquals(0, counterLocalServiceWrapper0.getCountersCount());
  }
}
