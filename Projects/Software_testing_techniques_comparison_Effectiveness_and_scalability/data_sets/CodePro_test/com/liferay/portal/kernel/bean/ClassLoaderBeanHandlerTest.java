package com.liferay.portal.kernel.bean;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ClassLoaderBeanHandlerTest</code> contains tests for the class <code>{@link ClassLoaderBeanHandler}</code>.
 *
 * @generatedBy CodePro at 12/5/17 1:02 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class ClassLoaderBeanHandlerTest {
	/**
	 * Run the ClassLoaderBeanHandler(Object,ClassLoader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:02 PM
	 */
	@Test
	public void testClassLoaderBeanHandler_1()
		throws Exception {
		Object bean = new Object();
		ClassLoader classLoader = new URLClassLoader(new URL[] {});

		ClassLoaderBeanHandler result = new ClassLoaderBeanHandler(bean, classLoader);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Object(), result.getBean());
	}

	/**
	 * Run the Object getBean() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:02 PM
	 */
	@Test
	public void testGetBean_1()
		throws Exception {
		ClassLoaderBeanHandler fixture = new ClassLoaderBeanHandler(new Object(), new URLClassLoader(new URL[] {}));

		Object result = fixture.getBean();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ClassLoader getClassLoader() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:02 PM
	 */
	@Test
	public void testGetClassLoader_1()
		throws Exception {
		ClassLoaderBeanHandler fixture = new ClassLoaderBeanHandler(new Object(), new URLClassLoader(new URL[] {}));

		ClassLoader result = fixture.getClassLoader();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invoke(Object,Method,Object[]) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 12/5/17 1:02 PM
	 */
	@Test(expected = java.lang.IllegalMonitorStateException.class)
	public void testInvoke_1()
		throws Throwable {
		ClassLoaderBeanHandler fixture = new ClassLoaderBeanHandler(new Object(), new URLClassLoader(new URL[] {}));
		Object proxy = new Object();
		Method method = Object.class.getMethods()[0];
		Object[] args = new Object[] {};

		Object result = fixture.invoke(proxy, method, args);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invoke(Object,Method,Object[]) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 12/5/17 1:02 PM
	 */
	@Test(expected = java.lang.IllegalMonitorStateException.class)
	public void testInvoke_2()
		throws Throwable {
		ClassLoaderBeanHandler fixture = new ClassLoaderBeanHandler(new Object(), (ClassLoader) null);
		Object proxy = new Object();
		Method method = Object.class.getMethods()[0];
		Object[] args = new Object[] {};

		Object result = fixture.invoke(proxy, method, args);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invoke(Object,Method,Object[]) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 12/5/17 1:02 PM
	 */
	@Test(expected = java.lang.IllegalMonitorStateException.class)
	public void testInvoke_3()
		throws Throwable {
		ClassLoaderBeanHandler fixture = new ClassLoaderBeanHandler(new Object(), new URLClassLoader(new URL[] {}));
		Object proxy = new Object();
		Method method = Object.class.getMethods()[0];
		Object[] args = new Object[] {};

		Object result = fixture.invoke(proxy, method, args);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/5/17 1:02 PM
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
	 * @generatedBy CodePro at 12/5/17 1:02 PM
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
	 * @generatedBy CodePro at 12/5/17 1:02 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ClassLoaderBeanHandlerTest.class);
	}
}