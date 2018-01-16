package com.liferay.counter.service;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.counter.model.Counter;
import com.liferay.counter.model.CounterWrapper;
import com.liferay.counter.model.impl.CounterImpl;
import com.liferay.counter.service.impl.CounterLocalServiceImpl;
import com.liferay.portal.dao.orm.hibernate.DynamicQueryImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portlet.journal.util.comparator.ArticleCreateDateComparator;

/**
 * The class <code>CounterLocalServiceWrapperTest</code> contains tests for the class <code>{@link CounterLocalServiceWrapper}</code>.
 *
 * @generatedBy CodePro at 11/26/17 5:14 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class CounterLocalServiceWrapperTest {
	/**
	 * Run the CounterLocalServiceWrapper(CounterLocalService) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testCounterLocalServiceWrapper_1()
		throws Exception {
		CounterLocalService counterLocalService = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());

		CounterLocalServiceWrapper result = new CounterLocalServiceWrapper(counterLocalService);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Counter addCounter(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testAddCounter_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		Counter counter = new CounterWrapper(new CounterImpl());

		Counter result = fixture.addCounter(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.addCounter(CounterLocalServiceBaseImpl.java:69)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.addCounter(CounterLocalServiceWrapper.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the Counter addCounter(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testAddCounter_2()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		Counter counter = new CounterWrapper(new CounterImpl());

		Counter result = fixture.addCounter(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.addCounter(CounterLocalServiceBaseImpl.java:69)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.addCounter(CounterLocalServiceWrapper.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the Counter createCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testCreateCounter_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";

		Counter result = fixture.createCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.createCounter(CounterLocalServiceBaseImpl.java:79)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.createCounter(CounterLocalServiceWrapper.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the void deleteCounter(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDeleteCounter_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		Counter counter = new CounterWrapper(new CounterImpl());

		fixture.deleteCounter(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.deleteCounter(CounterLocalServiceBaseImpl.java:101)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.deleteCounter(CounterLocalServiceWrapper.java:76)
	}

	/**
	 * Run the void deleteCounter(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDeleteCounter_2()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		Counter counter = new CounterWrapper(new CounterImpl());

		fixture.deleteCounter(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.deleteCounter(CounterLocalServiceBaseImpl.java:101)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.deleteCounter(CounterLocalServiceWrapper.java:76)
	}

	/**
	 * Run the void deleteCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDeleteCounter_3()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";

		fixture.deleteCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.deleteCounter(CounterLocalServiceBaseImpl.java:91)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.deleteCounter(CounterLocalServiceWrapper.java:65)
	}

	/**
	 * Run the void deleteCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDeleteCounter_4()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";

		fixture.deleteCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.deleteCounter(CounterLocalServiceBaseImpl.java:91)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.deleteCounter(CounterLocalServiceWrapper.java:65)
	}

	/**
	 * Run the void deleteCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDeleteCounter_5()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";

		fixture.deleteCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.deleteCounter(CounterLocalServiceBaseImpl.java:91)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.deleteCounter(CounterLocalServiceWrapper.java:65)
	}

	/**
	 * Run the List dynamicQuery(DynamicQuery) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDynamicQuery_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));

		List result = fixture.dynamicQuery(dynamicQuery);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.dynamicQuery(CounterLocalServiceBaseImpl.java:114)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.dynamicQuery(CounterLocalServiceWrapper.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the List dynamicQuery(DynamicQuery) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDynamicQuery_2()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));

		List result = fixture.dynamicQuery(dynamicQuery);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.dynamicQuery(CounterLocalServiceBaseImpl.java:114)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.dynamicQuery(CounterLocalServiceWrapper.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the List dynamicQuery(DynamicQuery,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDynamicQuery_3()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));
		int start = 1;
		int end = 1;

		List result = fixture.dynamicQuery(dynamicQuery, start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.dynamicQuery(CounterLocalServiceBaseImpl.java:133)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.dynamicQuery(CounterLocalServiceWrapper.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the List dynamicQuery(DynamicQuery,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDynamicQuery_4()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));
		int start = 1;
		int end = 1;

		List result = fixture.dynamicQuery(dynamicQuery, start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.dynamicQuery(CounterLocalServiceBaseImpl.java:133)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.dynamicQuery(CounterLocalServiceWrapper.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the List dynamicQuery(DynamicQuery,int,int,OrderByComparator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDynamicQuery_5()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));
		int start = 1;
		int end = 1;
		OrderByComparator orderByComparator = new ArticleCreateDateComparator();

		List result = fixture.dynamicQuery(dynamicQuery, start, end, orderByComparator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.dynamicQuery(CounterLocalServiceBaseImpl.java:153)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.dynamicQuery(CounterLocalServiceWrapper.java:133)
		assertNotNull(result);
	}

	/**
	 * Run the List dynamicQuery(DynamicQuery,int,int,OrderByComparator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDynamicQuery_6()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));
		int start = 1;
		int end = 1;
		OrderByComparator orderByComparator = new ArticleCreateDateComparator();

		List result = fixture.dynamicQuery(dynamicQuery, start, end, orderByComparator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.dynamicQuery(CounterLocalServiceBaseImpl.java:153)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.dynamicQuery(CounterLocalServiceWrapper.java:133)
		assertNotNull(result);
	}

	/**
	 * Run the long dynamicQueryCount(DynamicQuery) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDynamicQueryCount_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));

		long result = fixture.dynamicQueryCount(dynamicQuery);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.dynamicQueryCount(CounterLocalServiceBaseImpl.java:166)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.dynamicQueryCount(CounterLocalServiceWrapper.java:147)
		assertEquals(0L, result);
	}

	/**
	 * Run the long dynamicQueryCount(DynamicQuery) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testDynamicQueryCount_2()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));

		long result = fixture.dynamicQueryCount(dynamicQuery);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.dynamicQueryCount(CounterLocalServiceBaseImpl.java:166)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.dynamicQueryCount(CounterLocalServiceWrapper.java:147)
		assertEquals(0L, result);
	}

	/**
	 * Run the Counter getCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testGetCounter_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";

		Counter result = fixture.getCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.getCounter(CounterLocalServiceBaseImpl.java:179)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.getCounter(CounterLocalServiceWrapper.java:161)
		assertNotNull(result);
	}

	/**
	 * Run the Counter getCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testGetCounter_2()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";

		Counter result = fixture.getCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.getCounter(CounterLocalServiceBaseImpl.java:179)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.getCounter(CounterLocalServiceWrapper.java:161)
		assertNotNull(result);
	}

	/**
	 * Run the Counter getCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testGetCounter_3()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";

		Counter result = fixture.getCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.getCounter(CounterLocalServiceBaseImpl.java:179)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.getCounter(CounterLocalServiceWrapper.java:161)
		assertNotNull(result);
	}

	/**
	 * Run the List<Counter> getCounters(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testGetCounters_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		int start = 1;
		int end = 1;

		List<Counter> result = fixture.getCounters(start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.getCounters(CounterLocalServiceBaseImpl.java:196)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.getCounters(CounterLocalServiceWrapper.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the List<Counter> getCounters(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testGetCounters_2()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		int start = 1;
		int end = 1;

		List<Counter> result = fixture.getCounters(start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.getCounters(CounterLocalServiceBaseImpl.java:196)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.getCounters(CounterLocalServiceWrapper.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the int getCountersCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testGetCountersCount_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());

		int result = fixture.getCountersCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.getCountersCount(CounterLocalServiceBaseImpl.java:206)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.getCountersCount(CounterLocalServiceWrapper.java:190)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCountersCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testGetCountersCount_2()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());

		int result = fixture.getCountersCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.getCountersCount(CounterLocalServiceBaseImpl.java:206)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.getCountersCount(CounterLocalServiceWrapper.java:190)
		assertEquals(0, result);
	}

	/**
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testGetNames_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());

		List<String> result = fixture.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.getNames(CounterLocalServiceImpl.java:34)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.getNames(CounterLocalServiceWrapper.java:222)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testGetNames_2()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());

		List<String> result = fixture.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.getNames(CounterLocalServiceImpl.java:34)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.getNames(CounterLocalServiceWrapper.java:222)
		assertNotNull(result);
	}

	/**
	 * Run the CounterLocalService getWrappedCounterLocalService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testGetWrappedCounterLocalService_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());

		CounterLocalService result = fixture.getWrappedCounterLocalService();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long increment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testIncrement_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());

		long result = fixture.increment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.increment(CounterLocalServiceImpl.java:41)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.increment(CounterLocalServiceWrapper.java:227)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testIncrement_2()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());

		long result = fixture.increment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.increment(CounterLocalServiceImpl.java:41)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.increment(CounterLocalServiceWrapper.java:227)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testIncrement_3()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";

		long result = fixture.increment(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.increment(CounterLocalServiceImpl.java:48)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.increment(CounterLocalServiceWrapper.java:232)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testIncrement_4()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";

		long result = fixture.increment(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.increment(CounterLocalServiceImpl.java:48)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.increment(CounterLocalServiceWrapper.java:232)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testIncrement_5()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";
		int size = 1;

		long result = fixture.increment(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.increment(CounterLocalServiceImpl.java:55)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.increment(CounterLocalServiceWrapper.java:237)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testIncrement_6()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";
		int size = 1;

		long result = fixture.increment(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.increment(CounterLocalServiceImpl.java:55)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.increment(CounterLocalServiceWrapper.java:237)
		assertEquals(0L, result);
	}

	/**
	 * Run the void rename(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testRename_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String oldName = "";
		String newName = "";

		fixture.rename(oldName, newName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.rename(CounterLocalServiceImpl.java:62)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.rename(CounterLocalServiceWrapper.java:242)
	}

	/**
	 * Run the void rename(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testRename_2()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String oldName = "";
		String newName = "";

		fixture.rename(oldName, newName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.rename(CounterLocalServiceImpl.java:62)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.rename(CounterLocalServiceWrapper.java:242)
	}

	/**
	 * Run the void reset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testReset_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";

		fixture.reset(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.reset(CounterLocalServiceImpl.java:69)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.reset(CounterLocalServiceWrapper.java:247)
	}

	/**
	 * Run the void reset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testReset_2()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";

		fixture.reset(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.reset(CounterLocalServiceImpl.java:69)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.reset(CounterLocalServiceWrapper.java:247)
	}

	/**
	 * Run the void reset(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testReset_3()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";
		long size = 1L;

		fixture.reset(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.reset(CounterLocalServiceImpl.java:76)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.reset(CounterLocalServiceWrapper.java:252)
	}

	/**
	 * Run the void reset(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testReset_4()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		String name = "";
		long size = 1L;

		fixture.reset(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.impl.CounterLocalServiceImpl.reset(CounterLocalServiceImpl.java:76)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.reset(CounterLocalServiceWrapper.java:252)
	}

	/**
	 * Run the Counter updateCounter(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testUpdateCounter_1()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		Counter counter = new CounterWrapper(new CounterImpl());

		Counter result = fixture.updateCounter(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.updateCounter(CounterLocalServiceBaseImpl.java:219)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.updateCounter(CounterLocalServiceWrapper.java:203)
		assertNotNull(result);
	}

	/**
	 * Run the Counter updateCounter(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testUpdateCounter_2()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		Counter counter = new CounterWrapper(new CounterImpl());

		Counter result = fixture.updateCounter(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.updateCounter(CounterLocalServiceBaseImpl.java:219)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.updateCounter(CounterLocalServiceWrapper.java:203)
		assertNotNull(result);
	}

	/**
	 * Run the Counter updateCounter(Counter,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testUpdateCounter_3()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		Counter counter = new CounterWrapper(new CounterImpl());
		boolean merge = true;

		Counter result = fixture.updateCounter(counter, merge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.updateCounter(CounterLocalServiceBaseImpl.java:234)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.updateCounter(CounterLocalServiceWrapper.java:217)
		assertNotNull(result);
	}

	/**
	 * Run the Counter updateCounter(Counter,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Test
	public void testUpdateCounter_4()
		throws Exception {
		CounterLocalServiceWrapper fixture = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());
		Counter counter = new CounterWrapper(new CounterImpl());
		boolean merge = true;

		Counter result = fixture.updateCounter(counter, merge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.service.base.CounterLocalServiceBaseImpl.updateCounter(CounterLocalServiceBaseImpl.java:234)
		//       at com.liferay.counter.service.CounterLocalServiceWrapper.updateCounter(CounterLocalServiceWrapper.java:217)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/26/17 5:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CounterLocalServiceWrapperTest.class);
	}
}