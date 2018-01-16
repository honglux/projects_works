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
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portlet.journal.util.comparator.ArticleCreateDateComparator;

/**
 * The class <code>CounterLocalServiceUtilTest</code> contains tests for the class <code>{@link CounterLocalServiceUtil}</code>.
 *
 * @generatedBy CodePro at 12/5/17 12:06 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class CounterLocalServiceUtilTest {
	/**
	 * Run the Counter addCounter(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testAddCounter_1()
		throws Exception {
		Counter counter = new CounterWrapper(new CounterImpl());

		Counter result = CounterLocalServiceUtil.addCounter(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.addCounter(CounterLocalServiceUtil.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the Counter addCounter(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testAddCounter_2()
		throws Exception {
		Counter counter = new CounterWrapper(new CounterImpl());

		Counter result = CounterLocalServiceUtil.addCounter(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.addCounter(CounterLocalServiceUtil.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the Counter createCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testCreateCounter_1()
		throws Exception {
		String name = "";

		Counter result = CounterLocalServiceUtil.createCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.createCounter(CounterLocalServiceUtil.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the void deleteCounter(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDeleteCounter_1()
		throws Exception {
		Counter counter = new CounterWrapper(new CounterImpl());

		CounterLocalServiceUtil.deleteCounter(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.deleteCounter(CounterLocalServiceUtil.java:82)
	}

	/**
	 * Run the void deleteCounter(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDeleteCounter_2()
		throws Exception {
		Counter counter = new CounterWrapper(new CounterImpl());

		CounterLocalServiceUtil.deleteCounter(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.deleteCounter(CounterLocalServiceUtil.java:82)
	}

	/**
	 * Run the void deleteCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDeleteCounter_3()
		throws Exception {
		String name = "";

		CounterLocalServiceUtil.deleteCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.deleteCounter(CounterLocalServiceUtil.java:71)
	}

	/**
	 * Run the void deleteCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDeleteCounter_4()
		throws Exception {
		String name = "";

		CounterLocalServiceUtil.deleteCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.deleteCounter(CounterLocalServiceUtil.java:71)
	}

	/**
	 * Run the void deleteCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDeleteCounter_5()
		throws Exception {
		String name = "";

		CounterLocalServiceUtil.deleteCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.deleteCounter(CounterLocalServiceUtil.java:71)
	}

	/**
	 * Run the List dynamicQuery(DynamicQuery) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDynamicQuery_1()
		throws Exception {
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));

		List result = CounterLocalServiceUtil.dynamicQuery(dynamicQuery);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.dynamicQuery(CounterLocalServiceUtil.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the List dynamicQuery(DynamicQuery) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDynamicQuery_2()
		throws Exception {
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));

		List result = CounterLocalServiceUtil.dynamicQuery(dynamicQuery);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.dynamicQuery(CounterLocalServiceUtil.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the List dynamicQuery(DynamicQuery,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDynamicQuery_3()
		throws Exception {
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));
		int start = 1;
		int end = 1;

		List result = CounterLocalServiceUtil.dynamicQuery(dynamicQuery, start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.dynamicQuery(CounterLocalServiceUtil.java:116)
		assertNotNull(result);
	}

	/**
	 * Run the List dynamicQuery(DynamicQuery,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDynamicQuery_4()
		throws Exception {
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));
		int start = 1;
		int end = 1;

		List result = CounterLocalServiceUtil.dynamicQuery(dynamicQuery, start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.dynamicQuery(CounterLocalServiceUtil.java:116)
		assertNotNull(result);
	}

	/**
	 * Run the List dynamicQuery(DynamicQuery,int,int,OrderByComparator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDynamicQuery_5()
		throws Exception {
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));
		int start = 1;
		int end = 1;
		OrderByComparator orderByComparator = new ArticleCreateDateComparator();

		List result = CounterLocalServiceUtil.dynamicQuery(dynamicQuery, start, end, orderByComparator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.dynamicQuery(CounterLocalServiceUtil.java:139)
		assertNotNull(result);
	}

	/**
	 * Run the List dynamicQuery(DynamicQuery,int,int,OrderByComparator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDynamicQuery_6()
		throws Exception {
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));
		int start = 1;
		int end = 1;
		OrderByComparator orderByComparator = new ArticleCreateDateComparator();

		List result = CounterLocalServiceUtil.dynamicQuery(dynamicQuery, start, end, orderByComparator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.dynamicQuery(CounterLocalServiceUtil.java:139)
		assertNotNull(result);
	}

	/**
	 * Run the long dynamicQueryCount(DynamicQuery) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDynamicQueryCount_1()
		throws Exception {
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));

		long result = CounterLocalServiceUtil.dynamicQueryCount(dynamicQuery);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.dynamicQueryCount(CounterLocalServiceUtil.java:153)
		assertEquals(0L, result);
	}

	/**
	 * Run the long dynamicQueryCount(DynamicQuery) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testDynamicQueryCount_2()
		throws Exception {
		DynamicQuery dynamicQuery = new DynamicQueryImpl(DetachedCriteria.forClass(Object.class));

		long result = CounterLocalServiceUtil.dynamicQueryCount(dynamicQuery);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.dynamicQueryCount(CounterLocalServiceUtil.java:153)
		assertEquals(0L, result);
	}

	/**
	 * Run the Counter getCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testGetCounter_1()
		throws Exception {
		String name = "";

		Counter result = CounterLocalServiceUtil.getCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getCounter(CounterLocalServiceUtil.java:168)
		assertNotNull(result);
	}

	/**
	 * Run the Counter getCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testGetCounter_2()
		throws Exception {
		String name = "";

		Counter result = CounterLocalServiceUtil.getCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getCounter(CounterLocalServiceUtil.java:168)
		assertNotNull(result);
	}

	/**
	 * Run the Counter getCounter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testGetCounter_3()
		throws Exception {
		String name = "";

		Counter result = CounterLocalServiceUtil.getCounter(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getCounter(CounterLocalServiceUtil.java:168)
		assertNotNull(result);
	}

	/**
	 * Run the List<Counter> getCounters(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testGetCounters_1()
		throws Exception {
		int start = 1;
		int end = 1;

		List<Counter> result = CounterLocalServiceUtil.getCounters(start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getCounters(CounterLocalServiceUtil.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the List<Counter> getCounters(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testGetCounters_2()
		throws Exception {
		int start = 1;
		int end = 1;

		List<Counter> result = CounterLocalServiceUtil.getCounters(start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getCounters(CounterLocalServiceUtil.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the int getCountersCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testGetCountersCount_1()
		throws Exception {

		int result = CounterLocalServiceUtil.getCountersCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getCountersCount(CounterLocalServiceUtil.java:197)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCountersCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testGetCountersCount_2()
		throws Exception {

		int result = CounterLocalServiceUtil.getCountersCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getCountersCount(CounterLocalServiceUtil.java:197)
		assertEquals(0, result);
	}

	/**
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testGetNames_1()
		throws Exception {

		List<String> result = CounterLocalServiceUtil.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getNames(CounterLocalServiceUtil.java:229)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testGetNames_2()
		throws Exception {

		List<String> result = CounterLocalServiceUtil.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getNames(CounterLocalServiceUtil.java:229)
		assertNotNull(result);
	}

	/**
	 * Run the CounterLocalService getService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testGetService_1()
		throws Exception {

		CounterLocalService result = CounterLocalServiceUtil.getService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		assertNotNull(result);
	}

	/**
	 * Run the CounterLocalService getService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test(expected = com.liferay.portal.kernel.bean.BeanLocatorException.class)
	public void testGetService_2()
		throws Exception {

		CounterLocalService result = CounterLocalServiceUtil.getService();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long increment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testIncrement_1()
		throws Exception {

		long result = CounterLocalServiceUtil.increment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.increment(CounterLocalServiceUtil.java:234)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testIncrement_2()
		throws Exception {

		long result = CounterLocalServiceUtil.increment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.increment(CounterLocalServiceUtil.java:234)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testIncrement_3()
		throws Exception {
		String name = "";

		long result = CounterLocalServiceUtil.increment(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.increment(CounterLocalServiceUtil.java:239)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testIncrement_4()
		throws Exception {
		String name = "";

		long result = CounterLocalServiceUtil.increment(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.increment(CounterLocalServiceUtil.java:239)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testIncrement_5()
		throws Exception {
		String name = "";
		int size = 1;

		long result = CounterLocalServiceUtil.increment(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.increment(CounterLocalServiceUtil.java:244)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testIncrement_6()
		throws Exception {
		String name = "";
		int size = 1;

		long result = CounterLocalServiceUtil.increment(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.increment(CounterLocalServiceUtil.java:244)
		assertEquals(0L, result);
	}

	/**
	 * Run the void rename(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testRename_1()
		throws Exception {
		String oldName = "";
		String newName = "";

		CounterLocalServiceUtil.rename(oldName, newName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.rename(CounterLocalServiceUtil.java:249)
	}

	/**
	 * Run the void rename(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testRename_2()
		throws Exception {
		String oldName = "";
		String newName = "";

		CounterLocalServiceUtil.rename(oldName, newName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.rename(CounterLocalServiceUtil.java:249)
	}

	/**
	 * Run the void reset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testReset_1()
		throws Exception {
		String name = "";

		CounterLocalServiceUtil.reset(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.reset(CounterLocalServiceUtil.java:254)
	}

	/**
	 * Run the void reset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testReset_2()
		throws Exception {
		String name = "";

		CounterLocalServiceUtil.reset(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.reset(CounterLocalServiceUtil.java:254)
	}

	/**
	 * Run the void reset(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testReset_3()
		throws Exception {
		String name = "";
		long size = 1L;

		CounterLocalServiceUtil.reset(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.reset(CounterLocalServiceUtil.java:259)
	}

	/**
	 * Run the void reset(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testReset_4()
		throws Exception {
		String name = "";
		long size = 1L;

		CounterLocalServiceUtil.reset(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.reset(CounterLocalServiceUtil.java:259)
	}

	/**
	 * Run the void setService(CounterLocalService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testSetService_1()
		throws Exception {
		CounterLocalServiceUtil fixture = new CounterLocalServiceUtil();
		CounterLocalService service = new CounterLocalServiceWrapper(new CounterLocalServiceImpl());

		fixture.setService(service);

		// add additional test code here
	}

	/**
	 * Run the Counter updateCounter(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testUpdateCounter_1()
		throws Exception {
		Counter counter = new CounterWrapper(new CounterImpl());

		Counter result = CounterLocalServiceUtil.updateCounter(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.updateCounter(CounterLocalServiceUtil.java:210)
		assertNotNull(result);
	}

	/**
	 * Run the Counter updateCounter(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testUpdateCounter_2()
		throws Exception {
		Counter counter = new CounterWrapper(new CounterImpl());

		Counter result = CounterLocalServiceUtil.updateCounter(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.updateCounter(CounterLocalServiceUtil.java:210)
		assertNotNull(result);
	}

	/**
	 * Run the Counter updateCounter(Counter,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testUpdateCounter_3()
		throws Exception {
		Counter counter = new CounterWrapper(new CounterImpl());
		boolean merge = true;

		Counter result = CounterLocalServiceUtil.updateCounter(counter, merge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.updateCounter(CounterLocalServiceUtil.java:224)
		assertNotNull(result);
	}

	/**
	 * Run the Counter updateCounter(Counter,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	@Test
	public void testUpdateCounter_4()
		throws Exception {
		Counter counter = new CounterWrapper(new CounterImpl());
		boolean merge = true;

		Counter result = CounterLocalServiceUtil.updateCounter(counter, merge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.getService(CounterLocalServiceUtil.java:264)
		//       at com.liferay.counter.service.CounterLocalServiceUtil.updateCounter(CounterLocalServiceUtil.java:224)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/5/17 12:06 PM
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
	 * @generatedBy CodePro at 12/5/17 12:06 PM
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
	 * @generatedBy CodePro at 12/5/17 12:06 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CounterLocalServiceUtilTest.class);
	}
}