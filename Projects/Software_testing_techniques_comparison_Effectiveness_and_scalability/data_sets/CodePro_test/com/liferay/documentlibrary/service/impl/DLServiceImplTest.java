package com.liferay.documentlibrary.service.impl;

import java.io.File;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.documentlibrary.service.DLLocalService;
import com.liferay.documentlibrary.util.CMISHook;
import com.liferay.documentlibrary.util.Hook;
import com.liferay.portal.service.ServiceContext;

/**
 * The class <code>DLServiceImplTest</code> contains tests for the class <code>{@link DLServiceImpl}</code>.
 *
 * @generatedBy CodePro at 11/27/17 12:59 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class DLServiceImplTest {
	/**
	 * Run the DLServiceImpl() constructor test.
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testDLServiceImpl_1()
		throws Exception {
		DLServiceImpl result = new DLServiceImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_1()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_2()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_3()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_4()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_5()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_6()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_7()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_8()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_9()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_10()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_11()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_12()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_13()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_14()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_15()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddDirectory_16()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddFile_1()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		File file = new File("");

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddFile_2()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		File file = new File("");

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddFile_3()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		File file = new File("");

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddFile_4()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		File file = new File("");

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddFile_5()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		File file = new File("");

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddFile_6()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		byte[] bytes = new byte[] {};

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddFile_7()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		byte[] bytes = new byte[] {};

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddFile_8()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		byte[] bytes = new byte[] {};

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddFile_9()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		byte[] bytes = new byte[] {};

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testAddFile_10()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		byte[] bytes = new byte[] {};

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void deleteDirectory(long,String,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testDeleteDirectory_1()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void deleteDirectory(long,String,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testDeleteDirectory_2()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void deleteDirectory(long,String,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testDeleteDirectory_3()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void deleteFile(long,String,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testDeleteFile_1()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void deleteFile(long,String,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testDeleteFile_2()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void deleteFile(long,String,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testDeleteFile_3()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void deleteFile(long,String,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testDeleteFile_4()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void deleteFile(long,String,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testDeleteFile_5()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void deleteFile(long,String,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testDeleteFile_6()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the byte[] getFile(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testGetFile_1()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the byte[] getFile(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testGetFile_2()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the byte[] getFile(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testGetFile_3()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the byte[] getFile(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testGetFile_4()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the byte[] getFile(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testGetFile_5()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the byte[] getFile(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testGetFile_6()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the String[] getFileNames(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testGetFileNames_1()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the String[] getFileNames(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testGetFileNames_2()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the String[] getFileNames(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testGetFileNames_3()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the long getFileSize(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testGetFileSize_1()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the long getFileSize(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testGetFileSize_2()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the long getFileSize(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testGetFileSize_3()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,long,String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_1()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		long newRepositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;

		fixture.updateFile(companyId, portletId, groupId, repositoryId, newRepositoryId, fileName, fileEntryId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,long,String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_2()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		long newRepositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;

		fixture.updateFile(companyId, portletId, groupId, repositoryId, newRepositoryId, fileName, fileEntryId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,long,String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_3()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		long newRepositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;

		fixture.updateFile(companyId, portletId, groupId, repositoryId, newRepositoryId, fileName, fileEntryId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_4()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String newFileName = "";
		boolean reindex = true;

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, newFileName, reindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_5()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String newFileName = "";
		boolean reindex = true;

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, newFileName, reindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_6()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String newFileName = "";
		boolean reindex = true;

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, newFileName, reindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_7()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		File file = new File("");

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_8()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		File file = new File("");

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_9()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		File file = new File("");

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_10()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		File file = new File("");

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_11()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		File file = new File("");

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_12()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		byte[] bytes = new byte[] {};

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_13()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		byte[] bytes = new byte[] {};

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_14()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		byte[] bytes = new byte[] {};

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_15()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		byte[] bytes = new byte[] {};

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	@Test
	public void testUpdateFile_16()
		throws Exception {
		DLServiceImpl fixture = new DLServiceImpl();
		fixture.hook = new CMISHook();
		fixture.dlLocalService = new DLLocalServiceImpl();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		byte[] bytes = new byte[] {};

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLServiceImpl
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
	 * @generatedBy CodePro at 11/27/17 12:59 PM
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
	 * @generatedBy CodePro at 11/27/17 12:59 PM
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
	 * @generatedBy CodePro at 11/27/17 12:59 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DLServiceImplTest.class);
	}
}