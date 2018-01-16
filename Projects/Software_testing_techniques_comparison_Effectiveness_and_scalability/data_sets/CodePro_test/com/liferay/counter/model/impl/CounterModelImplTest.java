package com.liferay.counter.model.impl;

import java.io.Serializable;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.counter.model.Counter;
import com.liferay.counter.model.CounterWrapper;

/**
 * The class <code>CounterModelImplTest</code> contains tests for the class <code>{@link CounterModelImpl}</code>.
 *
 * @generatedBy CodePro at 11/27/17 12:56 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class CounterModelImplTest {
	/**
	 * Run the CounterModelImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testCounterModelImpl_1()
		throws Exception {

		CounterModelImpl result = new CounterModelImpl();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the Object clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");

		Object result = fixture.clone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the int compareTo(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");
		Counter counter = new CounterWrapper(new CounterImpl());

		int result = fixture.compareTo(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");
		Object obj = new CounterWrapper(new CounterImpl());

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");
		Object obj = new CounterWrapper(new CounterImpl());

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
		assertTrue(result);
	}

	/**
	 * Run the long getCurrentId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetCurrentId_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");

		long result = fixture.getCurrentId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName((String) null);

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetName_2()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the String getPrimaryKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetPrimaryKey_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");

		String result = fixture.getPrimaryKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the Serializable getPrimaryKeyObj() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testGetPrimaryKeyObj_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");

		Serializable result = fixture.getPrimaryKeyObj();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the void setCurrentId(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testSetCurrentId_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");
		long currentId = 1L;

		fixture.setCurrentId(currentId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the void setPrimaryKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testSetPrimaryKey_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");
		String pk = "";

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the Counter toEscapedModel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testToEscapedModel_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");

		Counter result = fixture.toEscapedModel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the Counter toEscapedModel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testToEscapedModel_2()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");

		Counter result = fixture.toEscapedModel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the Counter toEscapedModel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testToEscapedModel_3()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");

		Counter result = fixture.toEscapedModel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
	 * Run the String toXmlString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:56 PM
	 */
	@Test
	public void testToXmlString_1()
		throws Exception {
		CounterModelImpl fixture = new CounterModelImpl();
		fixture.setCurrentId(1L);
		fixture.setName("");

		String result = fixture.toXmlString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.model.impl.CounterModelImpl
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
		new org.junit.runner.JUnitCore().run(CounterModelImplTest.class);
	}
}