package com.liferay.mail.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CyrusUserTest</code> contains tests for the class <code>{@link CyrusUser}</code>.
 *
 * @generatedBy CodePro at 11/27/17 1:06 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class CyrusUserTest {
	/**
	 * Run the CyrusUser() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:06 PM
	 */
	@Test
	public void testCyrusUser_1()
		throws Exception {

		CyrusUser result = new CyrusUser();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.model.CyrusUser
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the CyrusUser(long,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:06 PM
	 */
	@Test
	public void testCyrusUser_2()
		throws Exception {
		long userId = 1L;
		String password = "";

		CyrusUser result = new CyrusUser(userId, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.model.CyrusUser
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the CyrusUser(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:06 PM
	 */
	@Test
	public void testCyrusUser_3()
		throws Exception {
		String userId = "";
		String password = "";

		CyrusUser result = new CyrusUser(userId, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.model.CyrusUser
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the String getPassword() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:06 PM
	 */
	@Test
	public void testGetPassword_1()
		throws Exception {
		CyrusUser fixture = new CyrusUser("", "");

		String result = fixture.getPassword();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.model.CyrusUser
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
	 * Run the String getUserId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:06 PM
	 */
	@Test
	public void testGetUserId_1()
		throws Exception {
		CyrusUser fixture = new CyrusUser("", "");

		String result = fixture.getUserId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.model.CyrusUser
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
	 * Run the void setPassword(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:06 PM
	 */
	@Test
	public void testSetPassword_1()
		throws Exception {
		CyrusUser fixture = new CyrusUser("", "");
		String password = "";

		fixture.setPassword(password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.model.CyrusUser
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
	 * Run the void setUserId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:06 PM
	 */
	@Test
	public void testSetUserId_1()
		throws Exception {
		CyrusUser fixture = new CyrusUser("", "");
		String userId = "";

		fixture.setUserId(userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.model.CyrusUser
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
	 * @generatedBy CodePro at 11/27/17 1:06 PM
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
	 * @generatedBy CodePro at 11/27/17 1:06 PM
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
	 * @generatedBy CodePro at 11/27/17 1:06 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CyrusUserTest.class);
	}
}