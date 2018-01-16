package com.liferay.documentlibrary.util;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.io.Base64InputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.service.ServiceContext;

/**
 * The class <code>SafeFileNameHookWrapperTest</code> contains tests for the class <code>{@link SafeFileNameHookWrapper}</code>.
 *
 * @generatedBy CodePro at 11/27/17 1:04 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class SafeFileNameHookWrapperTest {
	/**
	 * Run the SafeFileNameHookWrapper(Hook) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testSafeFileNameHookWrapper_1()
		throws Exception {
		Hook hook = new CMISHook();

		SafeFileNameHookWrapper result = new SafeFileNameHookWrapper(hook);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void addDirectory(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddDirectory_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddDirectory_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddDirectory_3()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddDirectory_4()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddDirectory_5()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_3()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_4()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_5()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_6()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_7()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_8()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_9()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void addFile(long,String,long,long,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_10()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_11()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_12()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_13()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_14()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testAddFile_15()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void checkRoot(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testCheckRoot_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void checkRoot(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testCheckRoot_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_3()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_4()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_5()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_6()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_3()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_4()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_5()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_6()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_7()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_8()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_9()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_10()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_11()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_12()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_13()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_14()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_15()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_16()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_17()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteFile_18()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_3()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_4()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_5()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_6()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_7()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_8()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_9()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_10()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_11()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_12()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_13()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_14()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_15()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFile_16()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		byte[] result = fixture.getFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_3()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_4()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_5()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_6()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_7()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_8()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_9()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_10()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_11()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_12()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_13()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_14()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_15()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the InputStream getFileAsStream(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_16()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileNames_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileNames_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileNames_3()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileNames_4()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileSize_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileSize_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileSize_3()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileSize_4()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileSize_5()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileSize_6()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileSize_7()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileSize_8()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the boolean hasFile(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testHasFile_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the boolean hasFile(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testHasFile_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the boolean hasFile(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testHasFile_3()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the boolean hasFile(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testHasFile_4()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the boolean hasFile(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testHasFile_5()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the boolean hasFile(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testHasFile_6()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the boolean hasFile(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testHasFile_7()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void move(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testMove_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void move(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testMove_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void reindex(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testReindex_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		String[] ids = new String[] {};

		fixture.reindex(ids);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void reindex(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testReindex_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		String[] ids = new String[] {};

		fixture.reindex(ids);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void renameUnsafeFile(long,String,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testRenameUnsafeFile_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String safeFileName = "";

		fixture.renameUnsafeFile(companyId, portletId, groupId, repositoryId, fileName, safeFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void renameUnsafeFile(long,String,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testRenameUnsafeFile_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String safeFileName = "";

		fixture.renameUnsafeFile(companyId, portletId, groupId, repositoryId, fileName, safeFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void renameUnsafeFile(long,String,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testRenameUnsafeFile_3()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String safeFileName = "";

		fixture.renameUnsafeFile(companyId, portletId, groupId, repositoryId, fileName, safeFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void renameUnsafeFile(long,String,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testRenameUnsafeFile_4()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String safeFileName = "";

		fixture.renameUnsafeFile(companyId, portletId, groupId, repositoryId, fileName, safeFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void renameUnsafeFile(long,String,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testRenameUnsafeFile_5()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String safeFileName = "";

		fixture.renameUnsafeFile(companyId, portletId, groupId, repositoryId, fileName, safeFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void renameUnsafeFile(long,String,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testRenameUnsafeFile_6()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String safeFileName = "";

		fixture.renameUnsafeFile(companyId, portletId, groupId, repositoryId, fileName, safeFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void renameUnsafeFile(long,String,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testRenameUnsafeFile_7()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String safeFileName = "";

		fixture.renameUnsafeFile(companyId, portletId, groupId, repositoryId, fileName, safeFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_1()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_2()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_3()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_4()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_5()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_6()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_7()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_8()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_9()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_10()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_11()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_12()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_13()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_14()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_15()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_16()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_17()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_18()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_19()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_20()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_21()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_22()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_23()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_24()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_25()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * Run the void updateFile(long,String,long,long,String,String,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_26()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_27()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_28()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_29()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_30()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_31()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_32()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testUpdateFile_33()
		throws Exception {
		SafeFileNameHookWrapper fixture = new SafeFileNameHookWrapper(new CMISHook());
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.SafeFileNameHookWrapper
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SafeFileNameHookWrapperTest.class);
	}
}