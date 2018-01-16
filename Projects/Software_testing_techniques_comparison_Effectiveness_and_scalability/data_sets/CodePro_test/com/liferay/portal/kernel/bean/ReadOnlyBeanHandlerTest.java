package com.liferay.portal.kernel.bean;

import java.lang.reflect.Method;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ReadOnlyBeanHandlerTest</code> contains tests for the class <code>{@link ReadOnlyBeanHandler}</code>.
 *
 * @generatedBy CodePro at 12/5/17 1:14 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class ReadOnlyBeanHandlerTest {
	/**
	 * Run the ReadOnlyBeanHandler(Object) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:14 PM
	 */
	@Test
	public void testReadOnlyBeanHandler_1()
		throws Exception {
		Object bean = new Object();

		ReadOnlyBeanHandler result = new ReadOnlyBeanHandler(bean);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Object(), result.getBean());
	}

	/**
	 * Run the Object getBean() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:14 PM
	 */
	@Test
	public void testGetBean_1()
		throws Exception {
		ReadOnlyBeanHandler fixture = new ReadOnlyBeanHandler(new Object());

		Object result = fixture.getBean();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invoke(Object,Method,Object[]) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 12/5/17 1:14 PM
	 */
	@Test(expected = java.lang.IllegalMonitorStateException.class)
	public void testInvoke_1()
		throws Throwable {
		ReadOnlyBeanHandler fixture = new ReadOnlyBeanHandler(new Object());
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
	 * @generatedBy CodePro at 12/5/17 1:14 PM
	 */
	@Test(expected = java.lang.IllegalMonitorStateException.class)
	public void testInvoke_2()
		throws Throwable {
		ReadOnlyBeanHandler fixture = new ReadOnlyBeanHandler(new Object());
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
	 * @generatedBy CodePro at 12/5/17 1:14 PM
	 */
	@Test(expected = java.lang.IllegalMonitorStateException.class)
	public void testInvoke_3()
		throws Throwable {
		ReadOnlyBeanHandler fixture = new ReadOnlyBeanHandler(new Object());
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
	 * @generatedBy CodePro at 12/5/17 1:14 PM
	 */
	@Test(expected = java.lang.IllegalMonitorStateException.class)
	public void testInvoke_4()
		throws Throwable {
		ReadOnlyBeanHandler fixture = new ReadOnlyBeanHandler(new Object());
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
	 * @generatedBy CodePro at 12/5/17 1:14 PM
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
	 * @generatedBy CodePro at 12/5/17 1:14 PM
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
	 * @generatedBy CodePro at 12/5/17 1:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ReadOnlyBeanHandlerTest.class);
	}
}