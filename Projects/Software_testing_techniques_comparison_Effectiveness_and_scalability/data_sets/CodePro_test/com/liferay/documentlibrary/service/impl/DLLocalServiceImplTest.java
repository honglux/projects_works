package com.liferay.documentlibrary.service.impl;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.documentlibrary.util.CMISHook;
import com.liferay.documentlibrary.util.Hook;
import com.liferay.portal.kernel.io.Base64InputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.service.GroupLocalService;
import com.liferay.portal.service.GroupLocalServiceWrapper;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.impl.GroupLocalServiceImpl;
import com.liferay.portlet.documentlibrary.service.DLFolderService;
import com.liferay.portlet.documentlibrary.service.DLFolderServiceWrapper;
import com.liferay.portlet.documentlibrary.service.impl.DLFolderServiceImpl;

/**
 * The class <code>DLLocalServiceImplTest</code> contains tests for the class <code>{@link DLLocalServiceImpl}</code>.
 *
 * @generatedBy CodePro at 11/27/17 12:58 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class DLLocalServiceImplTest {
	/**
	 * Run the DLLocalServiceImpl() constructor test.
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testDLLocalServiceImpl_1()
		throws Exception {
		DLLocalServiceImpl result = new DLLocalServiceImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addFile(long,String,long,long,String,boolean,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testAddFile_1()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		boolean validateFileExtension = true;
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, validateFileExtension, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void addFile(long,String,long,long,String,boolean,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testAddFile_2()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		boolean validateFileExtension = true;
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, validateFileExtension, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void addFile(long,String,long,long,String,boolean,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testAddFile_3()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		boolean validateFileExtension = true;
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, validateFileExtension, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void addFile(long,String,long,long,String,boolean,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testAddFile_4()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		boolean validateFileExtension = true;
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, validateFileExtension, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void addFile(long,String,long,long,String,boolean,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testAddFile_5()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		boolean validateFileExtension = true;
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, validateFileExtension, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testCheckRoot_1()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testCheckRoot_2()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the InputStream getFileAsStream(long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testGetFileAsStream_1()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testGetFileAsStream_2()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testGetFileAsStream_3()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testGetFileAsStream_4()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testGetFileAsStream_5()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testGetFileAsStream_6()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the boolean hasFile(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testHasFile_1()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testHasFile_2()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testHasFile_3()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testHasFile_4()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testMove_1()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testMove_2()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Hits search(long,String,long,long,long[],String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testSearch_1()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long userId = 1L;
		long[] repositoryIds = new long[] {0L};
		String keywords = "";
		int start = 1;
		int end = 1;

		Hits result = fixture.search(companyId, portletId, groupId, userId, repositoryIds, keywords, start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Hits search(long,String,long,long,long[],String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testSearch_2()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 0L;
		long userId = 1L;
		long[] repositoryIds = new long[] {0L};
		String keywords = "";
		int start = 1;
		int end = 1;

		Hits result = fixture.search(companyId, portletId, groupId, userId, repositoryIds, keywords, start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Hits search(long,String,long,long,long[],String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testSearch_3()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 0L;
		long userId = 1L;
		long[] repositoryIds = new long[] {0L};
		String keywords = "";
		int start = 1;
		int end = 1;

		Hits result = fixture.search(companyId, portletId, groupId, userId, repositoryIds, keywords, start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Hits search(long,String,long,long,long[],String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testSearch_4()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 0L;
		long userId = 1L;
		long[] repositoryIds = new long[] {0L};
		String keywords = "";
		int start = 1;
		int end = 1;

		Hits result = fixture.search(companyId, portletId, groupId, userId, repositoryIds, keywords, start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Hits search(long,String,long,long,long[],String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testSearch_5()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 0L;
		long userId = 1L;
		long[] repositoryIds = new long[] {0L};
		String keywords = "";
		int start = 1;
		int end = 1;

		Hits result = fixture.search(companyId, portletId, groupId, userId, repositoryIds, keywords, start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Hits search(long,String,long,long,long[],String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testSearch_6()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 0L;
		long userId = 1L;
		long[] repositoryIds = new long[] {};
		String keywords = "";
		int start = 1;
		int end = 1;

		Hits result = fixture.search(companyId, portletId, groupId, userId, repositoryIds, keywords, start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Hits search(long,String,long,long,long[],String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testSearch_7()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long userId = 1L;
		long[] repositoryIds = new long[] {};
		String keywords = "";
		int start = 1;
		int end = 1;

		Hits result = fixture.search(companyId, portletId, groupId, userId, repositoryIds, keywords, start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void updateFile(long,String,long,long,String,String,boolean,String,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testUpdateFile_1()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String fileExtension = "";
		boolean validateFileExtension = true;
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, fileExtension, validateFileExtension, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void updateFile(long,String,long,long,String,String,boolean,String,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testUpdateFile_2()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String fileExtension = "";
		boolean validateFileExtension = true;
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, fileExtension, validateFileExtension, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void updateFile(long,String,long,long,String,String,boolean,String,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testUpdateFile_3()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String fileExtension = "";
		boolean validateFileExtension = true;
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, fileExtension, validateFileExtension, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void updateFile(long,String,long,long,String,String,boolean,String,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testUpdateFile_4()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String fileExtension = "";
		boolean validateFileExtension = true;
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, fileExtension, validateFileExtension, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void updateFile(long,String,long,long,String,String,boolean,String,String,long,String,Date,ServiceContext,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testUpdateFile_5()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String fileExtension = "";
		boolean validateFileExtension = true;
		String versionNumber = "";
		String sourceFileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, fileExtension, validateFileExtension, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_1()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_2()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_3()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_4()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_5()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_6()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_7()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_8()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_9()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_10()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_11()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_12()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_13()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_14()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_15()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_16()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = false;

		fixture.validate(fileName, validateFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_17()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		File file = new File("");

		fixture.validate(fileName, validateFileExtension, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_18()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		File file = new File("");

		fixture.validate(fileName, validateFileExtension, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_19()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		File file = new File("");

		fixture.validate(fileName, validateFileExtension, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_20()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		File file = new File("");

		fixture.validate(fileName, validateFileExtension, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_21()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		File file = null;

		fixture.validate(fileName, validateFileExtension, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_22()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		File file = new File("");

		fixture.validate(fileName, validateFileExtension, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_23()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		File file = new File("");

		fixture.validate(fileName, validateFileExtension, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_24()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		File file = new File("");

		fixture.validate(fileName, validateFileExtension, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_25()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_26()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_27()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_28()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_29()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		InputStream is = null;

		fixture.validate(fileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_30()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_31()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_32()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_33()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_34()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		byte[] bytes = new byte[] {};

		fixture.validate(fileName, validateFileExtension, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_35()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		byte[] bytes = new byte[] {};

		fixture.validate(fileName, validateFileExtension, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_36()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		byte[] bytes = new byte[] {};

		fixture.validate(fileName, validateFileExtension, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_37()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		byte[] bytes = new byte[] {};

		fixture.validate(fileName, validateFileExtension, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_38()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		byte[] bytes = new byte[] {};

		fixture.validate(fileName, validateFileExtension, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_39()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		byte[] bytes = new byte[] {};

		fixture.validate(fileName, validateFileExtension, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_40()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		byte[] bytes = new byte[] {};

		fixture.validate(fileName, validateFileExtension, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,boolean,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_41()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		boolean validateFileExtension = true;
		byte[] bytes = new byte[] {};

		fixture.validate(fileName, validateFileExtension, bytes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_42()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_43()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_44()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_45()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_46()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_47()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_48()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_49()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = null;

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_50()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = null;

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_51()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = null;

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_52()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_53()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_54()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_55()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_56()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void validate(String,String,String,boolean,InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testValidate_57()
		throws Exception {
		DLLocalServiceImpl fixture = new DLLocalServiceImpl();
		fixture.groupLocalService = new GroupLocalServiceWrapper(new GroupLocalServiceImpl());
		fixture.hook = new CMISHook();
		fixture.dlFolderService = new DLFolderServiceWrapper(new DLFolderServiceImpl());
		String fileName = "";
		String fileExtension = "";
		String sourceFileName = "";
		boolean validateFileExtension = true;
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.validate(fileName, fileExtension, sourceFileName, validateFileExtension, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.service.impl.DLLocalServiceImpl
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		new org.junit.runner.JUnitCore().run(DLLocalServiceImplTest.class);
	}
}