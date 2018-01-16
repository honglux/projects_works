package com.liferay.counter.service.persistence;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.bean.BeanLocatorException;

/**
 * The class <code>CounterFinderUtilTest</code> contains tests for the class <code>{@link CounterFinderUtil}</code>.
 *
 * @generatedBy CodePro at 12/5/17 12:11 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class CounterFinderUtilTest {
	/**
	 * Run the CounterFinder getFinder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testGetFinder_1()
		throws Exception {

		CounterFinder result = CounterFinderUtil.getFinder();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		assertNotNull(result);
	}

	/**
	 * Run the CounterFinder getFinder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test(expected = com.liferay.portal.kernel.bean.BeanLocatorException.class)
	public void testGetFinder_2()
		throws Exception {

		CounterFinder result = CounterFinderUtil.getFinder();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testGetNames_1()
		throws Exception {

		List<String> result = CounterFinderUtil.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getNames(CounterFinderUtil.java:25)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testGetNames_2()
		throws Exception {

		List<String> result = CounterFinderUtil.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getNames(CounterFinderUtil.java:25)
		assertNotNull(result);
	}

	/**
	 * Run the long increment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testIncrement_1()
		throws Exception {

		long result = CounterFinderUtil.increment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.increment(CounterFinderUtil.java:30)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testIncrement_2()
		throws Exception {

		long result = CounterFinderUtil.increment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.increment(CounterFinderUtil.java:30)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testIncrement_3()
		throws Exception {
		String name = "";

		long result = CounterFinderUtil.increment(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.increment(CounterFinderUtil.java:35)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testIncrement_4()
		throws Exception {
		String name = "";

		long result = CounterFinderUtil.increment(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.increment(CounterFinderUtil.java:35)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testIncrement_5()
		throws Exception {
		String name = "";
		int size = 1;

		long result = CounterFinderUtil.increment(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.increment(CounterFinderUtil.java:40)
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testIncrement_6()
		throws Exception {
		String name = "";
		int size = 1;

		long result = CounterFinderUtil.increment(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.increment(CounterFinderUtil.java:40)
		assertEquals(0L, result);
	}

	/**
	 * Run the void rename(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testRename_1()
		throws Exception {
		String oldName = "";
		String newName = "";

		CounterFinderUtil.rename(oldName, newName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.rename(CounterFinderUtil.java:45)
	}

	/**
	 * Run the void rename(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testRename_2()
		throws Exception {
		String oldName = "";
		String newName = "";

		CounterFinderUtil.rename(oldName, newName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.rename(CounterFinderUtil.java:45)
	}

	/**
	 * Run the void reset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testReset_1()
		throws Exception {
		String name = "";

		CounterFinderUtil.reset(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.reset(CounterFinderUtil.java:50)
	}

	/**
	 * Run the void reset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testReset_2()
		throws Exception {
		String name = "";

		CounterFinderUtil.reset(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.reset(CounterFinderUtil.java:50)
	}

	/**
	 * Run the void reset(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testReset_3()
		throws Exception {
		String name = "";
		long size = 1L;

		CounterFinderUtil.reset(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.reset(CounterFinderUtil.java:55)
	}

	/**
	 * Run the void reset(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testReset_4()
		throws Exception {
		String name = "";
		long size = 1L;

		CounterFinderUtil.reset(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.liferay.portal.kernel.bean.BeanLocatorException: BeanLocator has not been set
		//       at com.liferay.portal.kernel.bean.PortalBeanLocatorUtil.locate(PortalBeanLocatorUtil.java:33)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.getFinder(CounterFinderUtil.java:60)
		//       at com.liferay.counter.service.persistence.CounterFinderUtil.reset(CounterFinderUtil.java:55)
	}

	/**
	 * Run the void setFinder(CounterFinder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	@Test
	public void testSetFinder_1()
		throws Exception {
		CounterFinderUtil fixture = new CounterFinderUtil();
		CounterFinder finder = new CounterFinderImpl();

		fixture.setFinder(finder);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/5/17 12:11 PM
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
	 * @generatedBy CodePro at 12/5/17 12:11 PM
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
	 * @generatedBy CodePro at 12/5/17 12:11 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CounterFinderUtilTest.class);
	}
}