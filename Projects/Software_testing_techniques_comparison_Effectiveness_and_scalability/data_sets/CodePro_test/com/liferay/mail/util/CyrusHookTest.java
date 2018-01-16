package com.liferay.mail.util;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.mail.model.Filter;
import com.liferay.util.UniqueList;

/**
 * The class <code>CyrusHookTest</code> contains tests for the class <code>{@link CyrusHook}</code>.
 *
 * @generatedBy CodePro at 11/27/17 1:10 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class CyrusHookTest {
	/**
	 * Run the CyrusHook() constructor test.
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testCyrusHook_1()
		throws Exception {
		CyrusHook result = new CyrusHook();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_1()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = new UniqueList();
		boolean leaveCopy = false;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_2()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = null;
		boolean leaveCopy = true;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_3()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = new UniqueList();
		boolean leaveCopy = true;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_4()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = new UniqueList();
		boolean leaveCopy = false;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_5()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = new UniqueList();
		boolean leaveCopy = true;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_6()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = new UniqueList();
		boolean leaveCopy = true;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_7()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = new UniqueList();
		boolean leaveCopy = true;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_8()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = new UniqueList();
		boolean leaveCopy = true;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_9()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = new UniqueList();
		boolean leaveCopy = true;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_10()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = new UniqueList();
		boolean leaveCopy = false;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_11()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = new UniqueList();
		boolean leaveCopy = false;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_12()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = new UniqueList();
		boolean leaveCopy = false;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addForward(long,long,List<Filter>,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddForward_13()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<Filter> filters = new UniqueList();
		List<String> emailAddresses = new UniqueList();
		boolean leaveCopy = false;

		fixture.addForward(companyId, userId, filters, emailAddresses, leaveCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addUser(long,long,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddUser_1()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		String password = "";
		String firstName = "";
		String middleName = "";
		String lastName = "";
		String emailAddress = "";

		fixture.addUser(companyId, userId, password, firstName, middleName, lastName, emailAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addUser(long,long,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddUser_2()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		String password = "";
		String firstName = "";
		String middleName = "";
		String lastName = "";
		String emailAddress = "";

		fixture.addUser(companyId, userId, password, firstName, middleName, lastName, emailAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addUser(long,long,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddUser_3()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		String password = "";
		String firstName = "";
		String middleName = "";
		String lastName = "";
		String emailAddress = "";

		fixture.addUser(companyId, userId, password, firstName, middleName, lastName, emailAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addVacationMessage(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddVacationMessage_1()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		String emailAddress = "";
		String vacationMessage = "";

		fixture.addVacationMessage(companyId, userId, emailAddress, vacationMessage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addVacationMessage(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddVacationMessage_2()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		String emailAddress = "";
		String vacationMessage = "";

		fixture.addVacationMessage(companyId, userId, emailAddress, vacationMessage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void addVacationMessage(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testAddVacationMessage_3()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		String emailAddress = "";
		String vacationMessage = "";

		fixture.addVacationMessage(companyId, userId, emailAddress, vacationMessage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteEmailAddress(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteEmailAddress_1()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteEmailAddress(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteEmailAddress(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteEmailAddress_2()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteEmailAddress(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_1()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_2()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_3()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_4()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_5()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_6()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_7()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_8()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_9()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_10()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_11()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_12()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_13()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_14()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_15()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void deleteUser(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testDeleteUser_16()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;

		fixture.deleteUser(companyId, userId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void updateBlocked(long,long,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testUpdateBlocked_1()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<String> blocked = null;

		fixture.updateBlocked(companyId, userId, blocked);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void updateBlocked(long,long,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testUpdateBlocked_2()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<String> blocked = new UniqueList();

		fixture.updateBlocked(companyId, userId, blocked);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void updateBlocked(long,long,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testUpdateBlocked_3()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<String> blocked = new UniqueList();

		fixture.updateBlocked(companyId, userId, blocked);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void updateBlocked(long,long,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testUpdateBlocked_4()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<String> blocked = new UniqueList();

		fixture.updateBlocked(companyId, userId, blocked);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void updateBlocked(long,long,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testUpdateBlocked_5()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<String> blocked = new UniqueList();

		fixture.updateBlocked(companyId, userId, blocked);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void updateBlocked(long,long,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testUpdateBlocked_6()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		List<String> blocked = new UniqueList();

		fixture.updateBlocked(companyId, userId, blocked);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void updateEmailAddress(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testUpdateEmailAddress_1()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		String emailAddress = "";

		fixture.updateEmailAddress(companyId, userId, emailAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void updateEmailAddress(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testUpdateEmailAddress_2()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		String emailAddress = "";

		fixture.updateEmailAddress(companyId, userId, emailAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void updatePassword(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testUpdatePassword_1()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		String password = "";

		fixture.updatePassword(companyId, userId, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
	 * Run the void updatePassword(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:10 PM
	 */
	@Test
	public void testUpdatePassword_2()
		throws Exception {
		CyrusHook fixture = new CyrusHook();
		long companyId = 1L;
		long userId = 1L;
		String password = "";

		fixture.updatePassword(companyId, userId, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.util.CyrusHook
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
		new org.junit.runner.JUnitCore().run(CyrusHookTest.class);
	}
}