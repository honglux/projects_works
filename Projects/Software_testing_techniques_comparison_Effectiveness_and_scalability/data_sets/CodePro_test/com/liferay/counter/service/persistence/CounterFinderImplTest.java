package com.liferay.counter.service.persistence;

import java.sql.Connection;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.counter.model.CounterRegister;

/**
 * The class <code>CounterFinderImplTest</code> contains tests for the class <code>{@link CounterFinderImpl}</code>.
 *
 * @generatedBy CodePro at 11/27/17 12:56 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class CounterFinderImplTest {
	/**
	 * Run the CounterFinderImpl() constructor test.
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testCounterFinderImpl_1()
		throws Exception {
		CounterFinderImpl result = new CounterFinderImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the CounterRegister createCounterRegister(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testCreateCounterRegister_1()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		CounterRegister result = fixture.createCounterRegister(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the CounterRegister createCounterRegister(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testCreateCounterRegister_2()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		CounterRegister result = fixture.createCounterRegister(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the CounterRegister createCounterRegister(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testCreateCounterRegister_3()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";
		long size = 1L;

		CounterRegister result = fixture.createCounterRegister(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the CounterRegister createCounterRegister(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testCreateCounterRegister_4()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";
		long size = 0L;

		CounterRegister result = fixture.createCounterRegister(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the CounterRegister createCounterRegister(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testCreateCounterRegister_5()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";
		long size = 1L;

		CounterRegister result = fixture.createCounterRegister(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the Connection getConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetConnection_1()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();

		Connection result = fixture.getConnection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the Connection getConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetConnection_2()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();

		Connection result = fixture.getConnection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the CounterRegister getCounterRegister(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetCounterRegister_1()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		CounterRegister result = fixture.getCounterRegister(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the CounterRegister getCounterRegister(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetCounterRegister_2()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		CounterRegister result = fixture.getCounterRegister(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the CounterRegister getCounterRegister(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetCounterRegister_3()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		CounterRegister result = fixture.getCounterRegister(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetNames_1()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();

		List<String> result = fixture.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetNames_2()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();

		List<String> result = fixture.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetNames_3()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();

		List<String> result = fixture.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetNames_4()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();

		List<String> result = fixture.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetNames_5()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();

		List<String> result = fixture.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetNames_6()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();

		List<String> result = fixture.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetNames_7()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();

		List<String> result = fixture.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the List<String> getNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetNames_8()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();

		List<String> result = fixture.getNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the int getRangeSize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetRangeSize_1()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		int result = fixture.getRangeSize(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
		assertEquals(0, result);
	}

	/**
	 * Run the int getRangeSize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetRangeSize_2()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		int result = fixture.getRangeSize(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
		assertEquals(0, result);
	}

	/**
	 * Run the int getRangeSize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetRangeSize_3()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		int result = fixture.getRangeSize(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
		assertEquals(0, result);
	}

	/**
	 * Run the long increment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testIncrement_1()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();

		long result = fixture.increment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testIncrement_2()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();

		long result = fixture.increment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testIncrement_3()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		long result = fixture.increment(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testIncrement_4()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		long result = fixture.increment(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testIncrement_5()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";
		int size = 0;

		long result = fixture.increment(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testIncrement_6()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";
		int size = 1;

		long result = fixture.increment(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
		assertEquals(0L, result);
	}

	/**
	 * Run the long increment(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testIncrement_7()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";
		int size = 0;

		long result = fixture.increment(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
		assertEquals(0L, result);
	}

	/**
	 * Run the void rename(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testRename_1()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String oldName = "";
		String newName = "";

		fixture.rename(oldName, newName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the void rename(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testRename_2()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String oldName = "";
		String newName = "";

		fixture.rename(oldName, newName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the void rename(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testRename_3()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String oldName = "";
		String newName = "";

		fixture.rename(oldName, newName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the void reset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testReset_1()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		fixture.reset(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the void reset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testReset_2()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		fixture.reset(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the void reset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testReset_3()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		fixture.reset(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the void reset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testReset_4()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		fixture.reset(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the void reset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testReset_5()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		fixture.reset(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the void reset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testReset_6()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";

		fixture.reset(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the void reset(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testReset_7()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";
		long size = 1L;

		fixture.reset(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * Run the void reset(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testReset_8()
		throws Exception {
		CounterFinderImpl fixture = new CounterFinderImpl();
		String name = "";
		long size = 1L;

		fixture.reset(name, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterFinderImpl
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
	 * @generatedBy CodePro at 11/27/17 12:56 PM
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
	 * @generatedBy CodePro at 11/27/17 12:56 PM
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
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CounterFinderImplTest.class);
	}
}