package com.liferay.portal.kernel.bean;

import java.net.URL;
import java.net.URLClassLoader;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import com.liferay.portal.bean.BeanLocatorImpl;
import com.liferay.portal.spring.context.PortalApplicationContext;

/**
 * The class <code>PortletBeanLocatorUtilTest</code> contains tests for the class <code>{@link PortletBeanLocatorUtil}</code>.
 *
 * @generatedBy CodePro at 12/5/17 1:13 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class PortletBeanLocatorUtilTest {
	/**
	 * Run the PortletBeanLocatorUtil() constructor test.
	 *
	 * @generatedBy CodePro at 12/5/17 1:13 PM
	 */
	@Test
	public void testPortletBeanLocatorUtil_1()
		throws Exception {
		PortletBeanLocatorUtil result = new PortletBeanLocatorUtil();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the BeanLocator getBeanLocator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:13 PM
	 */
	@Test
	public void testGetBeanLocator_1()
		throws Exception {
		String servletContextName = "";

		BeanLocator result = PortletBeanLocatorUtil.getBeanLocator(servletContextName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object locate(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:13 PM
	 */
	@Test(expected = com.liferay.portal.kernel.bean.BeanLocatorException.class)
	public void testLocate_1()
		throws Exception {
		String servletContextName = "";
		String name = "";

		Object result = PortletBeanLocatorUtil.locate(servletContextName, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object locate(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:13 PM
	 */
	@Test(expected = com.liferay.portal.kernel.bean.BeanLocatorException.class)
	public void testLocate_2()
		throws Exception {
		String servletContextName = "";
		String name = "";

		Object result = PortletBeanLocatorUtil.locate(servletContextName, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object locate(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:13 PM
	 */
	@Test(expected = com.liferay.portal.kernel.bean.BeanLocatorException.class)
	public void testLocate_3()
		throws Exception {
		String servletContextName = "";
		String name = "";

		Object result = PortletBeanLocatorUtil.locate(servletContextName, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setBeanLocator(String,BeanLocator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:13 PM
	 */
	@Test
	public void testSetBeanLocator_1()
		throws Exception {
		String servletContextName = "";
		BeanLocator beanLocator = null;

		PortletBeanLocatorUtil.setBeanLocator(servletContextName, beanLocator);

		// add additional test code here
	}

	/**
	 * Run the void setBeanLocator(String,BeanLocator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:13 PM
	 */
	@Test
	public void testSetBeanLocator_2()
		throws Exception {
		String servletContextName = "";
		BeanLocator beanLocator = new BeanLocatorImpl(new URLClassLoader(new URL[] {}), new PortalApplicationContext());

		PortletBeanLocatorUtil.setBeanLocator(servletContextName, beanLocator);

		// add additional test code here
	}

	/**
	 * Run the void setBeanLocator(String,BeanLocator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:13 PM
	 */
	@Test
	public void testSetBeanLocator_3()
		throws Exception {
		String servletContextName = "";
		BeanLocator beanLocator = new BeanLocatorImpl(new URLClassLoader(new URL[] {}), new PortalApplicationContext());

		PortletBeanLocatorUtil.setBeanLocator(servletContextName, beanLocator);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/5/17 1:13 PM
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
	 * @generatedBy CodePro at 12/5/17 1:13 PM
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
	 * @generatedBy CodePro at 12/5/17 1:13 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PortletBeanLocatorUtilTest.class);
	}
}