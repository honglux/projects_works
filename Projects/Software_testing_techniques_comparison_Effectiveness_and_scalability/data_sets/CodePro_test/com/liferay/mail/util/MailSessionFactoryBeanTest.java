package com.liferay.mail.util;

import javax.mail.Session;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MailSessionFactoryBeanTest</code> contains tests for the class <code>{@link MailSessionFactoryBean}</code>.
 *
 * @generatedBy CodePro at 11/27/17 1:10 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class MailSessionFactoryBeanTest {
	/**
	 * Run the MailSessionFactoryBean() constructor test.
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testMailSessionFactoryBean_1()
		throws Exception {
		MailSessionFactoryBean result = new MailSessionFactoryBean();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Session createInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testCreateInstance_1()
		throws Exception {
		MailSessionFactoryBean fixture = new MailSessionFactoryBean();
		fixture.setPropertyPrefix("");

		Session result = fixture.createInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session createInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testCreateInstance_2()
		throws Exception {
		MailSessionFactoryBean fixture = new MailSessionFactoryBean();
		fixture.setPropertyPrefix("");

		Session result = fixture.createInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session createInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testCreateInstance_3()
		throws Exception {
		MailSessionFactoryBean fixture = new MailSessionFactoryBean();
		fixture.setPropertyPrefix("");

		Session result = fixture.createInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session createInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testCreateInstance_4()
		throws Exception {
		MailSessionFactoryBean fixture = new MailSessionFactoryBean();
		fixture.setPropertyPrefix("");

		Session result = fixture.createInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Class<Session> getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testGetObjectType_1()
		throws Exception {
		MailSessionFactoryBean fixture = new MailSessionFactoryBean();
		fixture.setPropertyPrefix("");

		Class<Session> result = fixture.getObjectType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.MailSessionFactoryBean
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:544)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the void setPropertyPrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testSetPropertyPrefix_1()
		throws Exception {
		MailSessionFactoryBean fixture = new MailSessionFactoryBean();
		fixture.setPropertyPrefix("");
		String propertyPrefix = "";

		fixture.setPropertyPrefix(propertyPrefix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.MailSessionFactoryBean
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:544)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
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
	 * @generatedBy CodePro at 11/27/17 1:10 PM
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
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MailSessionFactoryBeanTest.class);
	}
}