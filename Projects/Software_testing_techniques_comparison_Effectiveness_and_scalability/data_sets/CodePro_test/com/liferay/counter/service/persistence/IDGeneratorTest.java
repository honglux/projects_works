package com.liferay.counter.service.persistence;

import java.io.Serializable;
import org.hibernate.engine.SessionImplementor;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IDGeneratorTest</code> contains tests for the class <code>{@link IDGenerator}</code>.
 *
 * @generatedBy CodePro at 11/27/17 12:58 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class IDGeneratorTest {
	/**
	 * Run the Serializable generate(SessionImplementor,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testGenerate_1()
		throws Exception {
		IDGenerator fixture = new IDGenerator();
		SessionImplementor session = null;
		Object object = new Object();

		Serializable result = fixture.generate(session, object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.IDGenerator
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
	 * Run the Serializable generate(SessionImplementor,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testGenerate_2()
		throws Exception {
		IDGenerator fixture = new IDGenerator();
		SessionImplementor session = null;
		Object object = new Object();

		Serializable result = fixture.generate(session, object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.IDGenerator
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(IDGeneratorTest.class);
	}
}