package com.liferay.documentlibrary.util;

import java.io.DataInput;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;
import javax.jcr.NamespaceRegistry;
import javax.jcr.Node;
import javax.jcr.Session;
import javax.jcr.nodetype.NodeDefinition;
import javax.xml.transform.ErrorListener;
import org.apache.jackrabbit.core.AbstractNodeData;
import org.apache.jackrabbit.core.CachingHierarchyManager;
import org.apache.jackrabbit.core.HierarchyManager;
import org.apache.jackrabbit.core.ItemManager;
import org.apache.jackrabbit.core.NodeId;
import org.apache.jackrabbit.core.SessionImpl;
import org.apache.jackrabbit.core.fs.BasedFileSystem;
import org.apache.jackrabbit.core.fs.FileSystem;
import org.apache.jackrabbit.core.nodetype.NodeTypeRegistry;
import org.apache.jackrabbit.core.observation.DelegatingObservationDispatcher;
import org.apache.jackrabbit.core.observation.EventStateCollectionFactory;
import org.apache.jackrabbit.core.persistence.PersistenceManager;
import org.apache.jackrabbit.core.persistence.bundle.BundleDbPersistenceManager;
import org.apache.jackrabbit.core.state.CacheManager;
import org.apache.jackrabbit.core.state.DefaultISMLocking;
import org.apache.jackrabbit.core.state.ISMLocking;
import org.apache.jackrabbit.core.state.ItemStateCacheFactory;
import org.apache.jackrabbit.core.state.ItemStateManager;
import org.apache.jackrabbit.core.state.LocalItemStateManager;
import org.apache.jackrabbit.core.state.ManagedMLRUItemStateCacheFactory;
import org.apache.jackrabbit.core.state.SessionItemStateManager;
import org.apache.jackrabbit.core.state.SharedItemStateManager;
import org.apache.jackrabbit.core.version.VersionImpl;
import org.apache.jackrabbit.core.version.VersionManagerImpl;
import org.apache.jackrabbit.core.version.XAVersionManager;
import org.apache.jackrabbit.uuid.UUID;
import org.apache.xalan.templates.StylesheetRoot;
import org.apache.xml.utils.DefaultErrorHandler;
import org.evosuite.shaded.org.dom4j.dom.DOMElement;
import org.junit.*;
import static org.junit.Assert.*;
import org.python.apache.xerces.dom.CoreDocumentImpl;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import com.gargoylesoftware.htmlunit.DialogWindow;
import com.gargoylesoftware.htmlunit.SgmlPage;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebWindow;
import com.gargoylesoftware.htmlunit.html.DomDocumentType;
import com.gargoylesoftware.htmlunit.xml.XmlPage;
import com.liferay.portal.kernel.io.Base64InputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.service.ServiceContext;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.ConverterRegistry;
import com.thoughtworks.xstream.converters.DataHolder;
import com.thoughtworks.xstream.converters.reflection.FieldDictionary;
import com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.core.DefaultConverterLookup;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.ReferenceByIdMarshaller;
import com.thoughtworks.xstream.core.util.CustomObjectInputStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.DomWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import com.thoughtworks.xstream.mapper.AnnotationMapper;
import com.thoughtworks.xstream.mapper.Mapper;

/**
 * The class <code>JCRHookTest</code> contains tests for the class <code>{@link JCRHook}</code>.
 *
 * @generatedBy CodePro at 11/27/17 1:04 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class JCRHookTest {
	/**
	 * Run the JCRHook() constructor test.
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testJCRHook_1()
		throws Exception {
		JCRHook result = new JCRHook();
		assertNotNull(result);
		// add additional test code here
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddDirectory_6()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddDirectory_7()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddDirectory_8()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddDirectory_9()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddDirectory_10()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddDirectory_11()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddDirectory_12()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddDirectory_13()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddDirectory_14()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddDirectory_15()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddDirectory_16()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		fixture.addDirectory(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddFile_1()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddFile_2()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddFile_3()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddFile_4()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddFile_5()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddFile_11()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddFile_12()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddFile_13()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddFile_14()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testAddFile_15()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setAssetCategoryIds(new long[] {});
		serviceContext.setAssetTagNames(new String[] {});
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:544)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:311)
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
	public void testAddFile_16()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		long fileEntryId = 1L;
		String properties = "";
		Date modifiedDate = new Date();
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setAssetCategoryIds(new long[] {});
		serviceContext.setAssetTagNames(new String[] {});
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.addFile(companyId, portletId, groupId, repositoryId, fileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:544)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:311)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testCheckRoot_3()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testCheckRoot_4()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testCheckRoot_5()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testCheckRoot_6()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testCheckRoot_7()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testCheckRoot_8()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testCheckRoot_9()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testCheckRoot_10()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testCheckRoot_11()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testCheckRoot_12()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;

		fixture.checkRoot(companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteDirectory_7()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteDirectory_8()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteDirectory_9()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteDirectory_10()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteDirectory_11()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteDirectory_12()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteDirectory_13()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteDirectory_14()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteDirectory_15()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteDirectory_16()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String dirName = "";

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:544)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_17()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream3);
		NodeId nodeId3 = new NodeId(uUID6);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream7);
		NodeId nodeId6 = new NodeId(uUID3);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream5);
		NodeId nodeId4 = new NodeId(uUID8);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId6, nodeId4, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId3, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream6);
		NodeId nodeId5 = new NodeId(uUID7);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream8);
		NodeId nodeId8 = new NodeId(uUID5);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream2);
		NodeId nodeId2 = new NodeId(uUID2);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream4);
		NodeId nodeId = new NodeId(uUID4);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId2, nodeId, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId8, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId5, sessionItemStateManager2);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream);
		NodeId nodeId7 = new NodeId(uUID);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId7);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_18()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream4);
		NodeId nodeId = new NodeId(uUID7);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream6);
		NodeId nodeId4 = new NodeId(uUID);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream7);
		NodeId nodeId6 = new NodeId(uUID3);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId4, nodeId6, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream);
		NodeId nodeId8 = new NodeId(uUID2);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream5);
		NodeId nodeId3 = new NodeId(uUID4);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream8);
		NodeId nodeId5 = new NodeId(uUID8);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream3);
		NodeId nodeId7 = new NodeId(uUID5);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId5, nodeId7, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId3, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId8, sessionItemStateManager);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream2);
		NodeId nodeId2 = new NodeId(uUID6);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager2, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId2);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_19()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream);
		NodeId nodeId8 = new NodeId(uUID8);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream6);
		NodeId nodeId6 = new NodeId(uUID6);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream5);
		NodeId nodeId2 = new NodeId(uUID);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId6, nodeId2, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId8, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream4);
		NodeId nodeId7 = new NodeId(uUID5);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream7);
		NodeId nodeId5 = new NodeId(uUID2);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream2);
		NodeId nodeId4 = new NodeId(uUID7);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream8);
		NodeId nodeId = new NodeId(uUID3);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId4, nodeId, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId5, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId7, sessionItemStateManager);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream3);
		NodeId nodeId3 = new NodeId(uUID4);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager2, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId3);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_20()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream7);
		NodeId nodeId2 = new NodeId(uUID7);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream8);
		NodeId nodeId3 = new NodeId(uUID8);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream6);
		NodeId nodeId5 = new NodeId(uUID4);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId3, nodeId5, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId2, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream2);
		NodeId nodeId7 = new NodeId(uUID6);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream5);
		NodeId nodeId4 = new NodeId(uUID5);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream);
		NodeId nodeId = new NodeId(uUID3);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream4);
		NodeId nodeId6 = new NodeId(uUID);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId, nodeId6, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId4, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId7, sessionItemStateManager2);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream3);
		NodeId nodeId8 = new NodeId(uUID2);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId8);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_21()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream8);
		NodeId nodeId2 = new NodeId(uUID3);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream);
		NodeId nodeId4 = new NodeId(uUID5);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream5);
		NodeId nodeId7 = new NodeId(uUID8);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId4, nodeId7, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId2, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream4);
		NodeId nodeId6 = new NodeId(uUID);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream7);
		NodeId nodeId8 = new NodeId(uUID7);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream3);
		NodeId nodeId5 = new NodeId(uUID2);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream6);
		NodeId nodeId3 = new NodeId(uUID6);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId5, nodeId3, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId8, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId6, sessionItemStateManager);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream2);
		NodeId nodeId = new NodeId(uUID4);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager2, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_22()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream5);
		NodeId nodeId5 = new NodeId(uUID6);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream);
		NodeId nodeId8 = new NodeId(uUID7);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream4);
		NodeId nodeId3 = new NodeId(uUID5);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId8, nodeId3, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId5, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream2);
		NodeId nodeId7 = new NodeId(uUID);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream3);
		NodeId nodeId2 = new NodeId(uUID8);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream7);
		NodeId nodeId4 = new NodeId(uUID4);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream6);
		NodeId nodeId6 = new NodeId(uUID3);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId4, nodeId6, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId2, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId7, sessionItemStateManager);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream8);
		NodeId nodeId = new NodeId(uUID2);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager2, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_23()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream6);
		NodeId nodeId = new NodeId(uUID);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream3);
		NodeId nodeId3 = new NodeId(uUID4);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream2);
		NodeId nodeId6 = new NodeId(uUID5);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId3, nodeId6, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream5);
		NodeId nodeId2 = new NodeId(uUID7);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream8);
		NodeId nodeId4 = new NodeId(uUID8);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream4);
		NodeId nodeId7 = new NodeId(uUID2);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream);
		NodeId nodeId8 = new NodeId(uUID3);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId7, nodeId8, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId4, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId2, sessionItemStateManager2);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream7);
		NodeId nodeId5 = new NodeId(uUID6);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId5);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_24()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream7);
		NodeId nodeId6 = new NodeId(uUID4);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream5);
		NodeId nodeId7 = new NodeId(uUID2);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream3);
		NodeId nodeId8 = new NodeId(uUID8);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId7, nodeId8, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId6, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream2);
		NodeId nodeId = new NodeId(uUID3);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream4);
		NodeId nodeId2 = new NodeId(uUID);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream8);
		NodeId nodeId4 = new NodeId(uUID5);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream);
		NodeId nodeId5 = new NodeId(uUID7);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId4, nodeId5, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId2, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId, sessionItemStateManager2);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream6);
		NodeId nodeId3 = new NodeId(uUID6);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId3);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_25()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream7);
		NodeId nodeId2 = new NodeId(uUID7);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream4);
		NodeId nodeId6 = new NodeId(uUID5);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream5);
		NodeId nodeId4 = new NodeId(uUID3);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId6, nodeId4, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId2, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream6);
		NodeId nodeId3 = new NodeId(uUID8);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream8);
		NodeId nodeId7 = new NodeId(uUID);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream3);
		NodeId nodeId = new NodeId(uUID2);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream);
		NodeId nodeId5 = new NodeId(uUID6);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId, nodeId5, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId7, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId3, sessionItemStateManager2);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream2);
		NodeId nodeId8 = new NodeId(uUID4);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId8);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_26()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream7);
		NodeId nodeId7 = new NodeId(uUID5);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream);
		NodeId nodeId4 = new NodeId(uUID6);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream6);
		NodeId nodeId2 = new NodeId(uUID3);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId4, nodeId2, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId7, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream4);
		NodeId nodeId6 = new NodeId(uUID);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream3);
		NodeId nodeId3 = new NodeId(uUID7);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream5);
		NodeId nodeId8 = new NodeId(uUID2);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream8);
		NodeId nodeId5 = new NodeId(uUID4);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId8, nodeId5, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId3, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId6, sessionItemStateManager2);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream2);
		NodeId nodeId = new NodeId(uUID8);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_27()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream7);
		NodeId nodeId4 = new NodeId(uUID8);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream3);
		NodeId nodeId6 = new NodeId(uUID3);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream2);
		NodeId nodeId2 = new NodeId(uUID7);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId6, nodeId2, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId4, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream4);
		NodeId nodeId7 = new NodeId(uUID2);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream);
		NodeId nodeId = new NodeId(uUID4);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream6);
		NodeId nodeId8 = new NodeId(uUID5);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream8);
		NodeId nodeId5 = new NodeId(uUID6);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId8, nodeId5, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId7, sessionItemStateManager2);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream5);
		NodeId nodeId3 = new NodeId(uUID);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId3);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_28()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream7);
		NodeId nodeId7 = new NodeId(uUID8);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream4);
		NodeId nodeId2 = new NodeId(uUID);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream3);
		NodeId nodeId = new NodeId(uUID7);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId2, nodeId, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId7, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream6);
		NodeId nodeId8 = new NodeId(uUID5);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream5);
		NodeId nodeId6 = new NodeId(uUID6);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream2);
		NodeId nodeId4 = new NodeId(uUID3);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream);
		NodeId nodeId5 = new NodeId(uUID4);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId4, nodeId5, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId6, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId8, sessionItemStateManager2);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream8);
		NodeId nodeId3 = new NodeId(uUID2);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId3);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_29()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream8);
		NodeId nodeId = new NodeId(uUID);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream7);
		NodeId nodeId2 = new NodeId(uUID7);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream6);
		NodeId nodeId7 = new NodeId(uUID6);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId2, nodeId7, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream4);
		NodeId nodeId4 = new NodeId(uUID3);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream);
		NodeId nodeId6 = new NodeId(uUID5);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream5);
		NodeId nodeId5 = new NodeId(uUID4);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream2);
		NodeId nodeId8 = new NodeId(uUID8);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId5, nodeId8, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId6, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId4, sessionItemStateManager2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream3);
		NodeId nodeId3 = new NodeId(uUID2);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId3);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
	}

	/**
	 * Run the void deleteDirectory(long,String,long,Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testDeleteDirectory_30()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream6);
		NodeId nodeId4 = new NodeId(uUID5);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream8);
		NodeId nodeId2 = new NodeId(uUID4);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream2);
		NodeId nodeId8 = new NodeId(uUID3);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId2, nodeId8, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId4, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream5);
		NodeId nodeId5 = new NodeId(uUID7);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream3);
		NodeId nodeId3 = new NodeId(uUID8);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream4);
		NodeId nodeId7 = new NodeId(uUID2);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream7);
		NodeId nodeId6 = new NodeId(uUID);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId7, nodeId6, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId3, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId5, sessionItemStateManager);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream);
		NodeId nodeId = new NodeId(uUID6);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager2, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId);
		Node dirNode = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);

		fixture.deleteDirectory(companyId, portletId, repositoryId, dirNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_10()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_11()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_12()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_13()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_14()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_15()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_16()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_19()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_20()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_21()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_22()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_23()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_24()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_25()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_26()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_27()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_28()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_29()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_30()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_31()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testDeleteFile_32()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		fixture.deleteFile(companyId, portletId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:544)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}

	/**
	 * Run the InputStream getFileAsStream(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileAsStream_1()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileAsStream_2()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileAsStream_3()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileAsStream_4()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileAsStream_5()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileAsStream_6()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileAsStream_7()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileAsStream_8()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		InputStream result = fixture.getFileAsStream(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_1()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_2()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_3()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_4()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_5()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(Session,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_6()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(session, companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(Session,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_7()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(session, companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(Session,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_8()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(session, companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(Session,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_9()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(session, companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(Session,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_10()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(session, companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(Session,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_11()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(session, companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(Session,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_12()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(session, companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(Session,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_13()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(session, companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(Session,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_14()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(session, companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(Session,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_15()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(session, companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(Session,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_16()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(session, companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFileContentNode(Session,long,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFileContentNode_17()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		Node result = fixture.getFileContentNode(session, companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileNames_5()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileNames_6()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileNames_7()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileNames_8()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileNames_9()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileNames_10()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileNames_11()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileNames_12()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String dirName = "";

		String[] result = fixture.getFileNames(companyId, repositoryId, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	public void testGetFileSize_9()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";

		long result = fixture.getFileSize(companyId, repositoryId, fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getFolderNode(Node,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_1()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream3);
		NodeId nodeId6 = new NodeId(uUID4);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream4);
		NodeId nodeId3 = new NodeId(uUID7);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream2);
		NodeId nodeId8 = new NodeId(uUID5);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId3, nodeId8, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId6, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream5);
		NodeId nodeId4 = new NodeId(uUID6);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream8);
		NodeId nodeId2 = new NodeId(uUID2);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream6);
		NodeId nodeId = new NodeId(uUID8);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream);
		NodeId nodeId5 = new NodeId(uUID);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId, nodeId5, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId2, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId4, sessionItemStateManager2);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream7);
		NodeId nodeId7 = new NodeId(uUID3);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId7);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		long name = 1L;

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getFolderNode(Node,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_2()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream3);
		NodeId nodeId = new NodeId(uUID);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream7);
		NodeId nodeId8 = new NodeId(uUID6);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream6);
		NodeId nodeId5 = new NodeId(uUID7);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId8, nodeId5, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream5);
		NodeId nodeId2 = new NodeId(uUID3);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream);
		NodeId nodeId7 = new NodeId(uUID8);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream4);
		NodeId nodeId3 = new NodeId(uUID4);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream2);
		NodeId nodeId6 = new NodeId(uUID5);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId3, nodeId6, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId7, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId2, sessionItemStateManager2);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream8);
		NodeId nodeId4 = new NodeId(uUID2);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId4);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		long name = 1L;

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getFolderNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_3()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream3);
		NodeId nodeId2 = new NodeId(uUID6);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream);
		NodeId nodeId7 = new NodeId(uUID5);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream8);
		NodeId nodeId3 = new NodeId(uUID8);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId7, nodeId3, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId2, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream6);
		NodeId nodeId4 = new NodeId(uUID4);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream2);
		NodeId nodeId = new NodeId(uUID);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream4);
		NodeId nodeId6 = new NodeId(uUID7);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream5);
		NodeId nodeId5 = new NodeId(uUID2);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId6, nodeId5, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId4, sessionItemStateManager);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream7);
		NodeId nodeId8 = new NodeId(uUID3);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager2, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId8);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		String name = "";

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getFolderNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_4()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream6);
		NodeId nodeId8 = new NodeId(uUID3);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream);
		NodeId nodeId2 = new NodeId(uUID4);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream2);
		NodeId nodeId3 = new NodeId(uUID5);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId2, nodeId3, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId8, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream4);
		NodeId nodeId6 = new NodeId(uUID6);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream7);
		NodeId nodeId = new NodeId(uUID);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream5);
		NodeId nodeId7 = new NodeId(uUID8);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream3);
		NodeId nodeId5 = new NodeId(uUID7);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId7, nodeId5, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId6, sessionItemStateManager2);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream8);
		NodeId nodeId4 = new NodeId(uUID2);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId4);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		String name = "";

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getFolderNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_5()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream6);
		NodeId nodeId2 = new NodeId(uUID4);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream4);
		NodeId nodeId5 = new NodeId(uUID8);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream8);
		NodeId nodeId6 = new NodeId(uUID6);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId5, nodeId6, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId2, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream3);
		NodeId nodeId3 = new NodeId(uUID5);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream2);
		NodeId nodeId4 = new NodeId(uUID7);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream5);
		NodeId nodeId7 = new NodeId(uUID);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream);
		NodeId nodeId8 = new NodeId(uUID3);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId7, nodeId8, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId4, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId3, sessionItemStateManager2);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream7);
		NodeId nodeId = new NodeId(uUID2);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		String name = "";

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getFolderNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_6()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream4);
		NodeId nodeId3 = new NodeId(uUID3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream);
		NodeId nodeId4 = new NodeId(uUID6);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream3);
		NodeId nodeId6 = new NodeId(uUID);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId4, nodeId6, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId3, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream5);
		NodeId nodeId8 = new NodeId(uUID5);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream8);
		NodeId nodeId = new NodeId(uUID8);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream6);
		NodeId nodeId2 = new NodeId(uUID4);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream2);
		NodeId nodeId5 = new NodeId(uUID2);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId2, nodeId5, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId8, sessionItemStateManager);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream7);
		NodeId nodeId7 = new NodeId(uUID7);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager2, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId7);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		String name = "";

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getFolderNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_7()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream3);
		NodeId nodeId5 = new NodeId(uUID);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream4);
		NodeId nodeId4 = new NodeId(uUID2);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream);
		NodeId nodeId = new NodeId(uUID5);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId4, nodeId, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId5, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream7);
		NodeId nodeId6 = new NodeId(uUID8);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream2);
		NodeId nodeId8 = new NodeId(uUID7);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream6);
		NodeId nodeId3 = new NodeId(uUID6);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream5);
		NodeId nodeId7 = new NodeId(uUID3);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId3, nodeId7, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId8, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId6, sessionItemStateManager);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream8);
		NodeId nodeId2 = new NodeId(uUID4);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager2, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId2);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		String name = "";

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getFolderNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_8()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream6);
		NodeId nodeId5 = new NodeId(uUID3);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream8);
		NodeId nodeId8 = new NodeId(uUID8);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream2);
		NodeId nodeId7 = new NodeId(uUID);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId8, nodeId7, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId5, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream7);
		NodeId nodeId4 = new NodeId(uUID7);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream3);
		NodeId nodeId3 = new NodeId(uUID6);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream);
		NodeId nodeId = new NodeId(uUID5);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream5);
		NodeId nodeId6 = new NodeId(uUID2);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId, nodeId6, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId3, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId4, sessionItemStateManager2);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream4);
		NodeId nodeId2 = new NodeId(uUID4);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId2);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		String name = "";

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getFolderNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_9()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream4);
		NodeId nodeId7 = new NodeId(uUID5);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream8);
		NodeId nodeId2 = new NodeId(uUID7);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream3);
		NodeId nodeId = new NodeId(uUID8);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId2, nodeId, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId7, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream);
		NodeId nodeId3 = new NodeId(uUID3);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream5);
		NodeId nodeId4 = new NodeId(uUID);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream7);
		NodeId nodeId5 = new NodeId(uUID4);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream2);
		NodeId nodeId6 = new NodeId(uUID2);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId5, nodeId6, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId4, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId3, sessionItemStateManager2);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream6);
		NodeId nodeId8 = new NodeId(uUID6);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId8);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		String name = "";

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getFolderNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_10()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream);
		NodeId nodeId7 = new NodeId(uUID2);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream7);
		NodeId nodeId2 = new NodeId(uUID7);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream2);
		NodeId nodeId8 = new NodeId(uUID);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId2, nodeId8, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId7, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream6);
		NodeId nodeId3 = new NodeId(uUID6);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream4);
		NodeId nodeId6 = new NodeId(uUID4);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream3);
		NodeId nodeId4 = new NodeId(uUID5);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream8);
		NodeId nodeId = new NodeId(uUID8);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId4, nodeId, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId6, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId3, sessionItemStateManager2);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream5);
		NodeId nodeId5 = new NodeId(uUID3);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId5);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		String name = "";

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getFolderNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_11()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream);
		NodeId nodeId6 = new NodeId(uUID8);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream2);
		NodeId nodeId = new NodeId(uUID);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream6);
		NodeId nodeId7 = new NodeId(uUID4);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId, nodeId7, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId6, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream7);
		NodeId nodeId5 = new NodeId(uUID2);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream5);
		NodeId nodeId4 = new NodeId(uUID6);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream8);
		NodeId nodeId3 = new NodeId(uUID5);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream4);
		NodeId nodeId2 = new NodeId(uUID3);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId3, nodeId2, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId4, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId5, sessionItemStateManager);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream3);
		NodeId nodeId8 = new NodeId(uUID7);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager2, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId8);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		String name = "";

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getFolderNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_12()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream6);
		NodeId nodeId2 = new NodeId(uUID2);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream2);
		NodeId nodeId = new NodeId(uUID6);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream);
		NodeId nodeId4 = new NodeId(uUID);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId, nodeId4, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId2, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream8);
		NodeId nodeId8 = new NodeId(uUID5);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream3);
		NodeId nodeId3 = new NodeId(uUID3);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream5);
		NodeId nodeId5 = new NodeId(uUID8);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream7);
		NodeId nodeId7 = new NodeId(uUID7);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId5, nodeId7, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId3, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId8, sessionItemStateManager2);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream4);
		NodeId nodeId6 = new NodeId(uUID4);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId6);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		String name = "";

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getFolderNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetFolderNode_13()
		throws Exception {
		JCRHook fixture = new JCRHook();
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter6 = new PrintWriter(stringWriter4);
		DefaultErrorHandler defaultErrorHandler8 = new DefaultErrorHandler(printWriter6);
		StylesheetRoot stylesheetRoot5 = new StylesheetRoot(defaultErrorHandler8);
		XmlPage xmlPage4 = new XmlPage(stylesheetRoot5, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType5 = new DomDocumentType(xmlPage4, "", "", "");
		CoreDocumentImpl coreDocumentImpl = new CoreDocumentImpl(domDocumentType5);
		DomWriter domWriter4 = new DomWriter(new DOMElement(""), coreDocumentImpl, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller6 = new ReferenceByIdMarshaller(domWriter4, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream7 = CustomObjectInputStream.getInstance(referenceByIdMarshaller6, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID4 = new UUID(customObjectInputStream7);
		NodeId nodeId = new NodeId(uUID4);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		DefaultErrorHandler defaultErrorHandler7 = new DefaultErrorHandler(printWriter4);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler7);
		XmlPage xmlPage5 = new XmlPage(stylesheetRoot2, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType2 = new DomDocumentType(xmlPage5, "", "", "");
		CoreDocumentImpl coreDocumentImpl8 = new CoreDocumentImpl(domDocumentType2);
		DomWriter domWriter6 = new DomWriter(new DOMElement(""), coreDocumentImpl8, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller = new ReferenceByIdMarshaller(domWriter6, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream6 = CustomObjectInputStream.getInstance(referenceByIdMarshaller, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID7 = new UUID(customObjectInputStream6);
		NodeId nodeId2 = new NodeId(uUID7);
		StringWriter stringWriter8 = new StringWriter();
		PrintWriter printWriter7 = new PrintWriter(stringWriter8);
		DefaultErrorHandler defaultErrorHandler4 = new DefaultErrorHandler(printWriter7);
		StylesheetRoot stylesheetRoot3 = new StylesheetRoot(defaultErrorHandler4);
		XmlPage xmlPage7 = new XmlPage(stylesheetRoot3, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType3 = new DomDocumentType(xmlPage7, "", "", "");
		CoreDocumentImpl coreDocumentImpl4 = new CoreDocumentImpl(domDocumentType3);
		DomWriter domWriter = new DomWriter(new DOMElement(""), coreDocumentImpl4, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller4 = new ReferenceByIdMarshaller(domWriter, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream8 = CustomObjectInputStream.getInstance(referenceByIdMarshaller4, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID8 = new UUID(customObjectInputStream8);
		NodeId nodeId3 = new NodeId(uUID8);
		VersionManagerImpl versionManagerImpl2 = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId2, nodeId3, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager2 = new XAVersionManager(versionManagerImpl2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager2, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager2 = SessionItemStateManager.createInstance(nodeId, localItemStateManager, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler3 = new DefaultErrorHandler(printWriter5);
		StylesheetRoot stylesheetRoot7 = new StylesheetRoot(defaultErrorHandler3);
		XmlPage xmlPage3 = new XmlPage(stylesheetRoot7, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType4 = new DomDocumentType(xmlPage3, "", "", "");
		CoreDocumentImpl coreDocumentImpl3 = new CoreDocumentImpl(domDocumentType4);
		DomWriter domWriter8 = new DomWriter(new DOMElement(""), coreDocumentImpl3, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller3 = new ReferenceByIdMarshaller(domWriter8, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream2 = CustomObjectInputStream.getInstance(referenceByIdMarshaller3, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID = new UUID(customObjectInputStream2);
		NodeId nodeId8 = new NodeId(uUID);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler6 = new DefaultErrorHandler(printWriter);
		StylesheetRoot stylesheetRoot8 = new StylesheetRoot(defaultErrorHandler6);
		XmlPage xmlPage2 = new XmlPage(stylesheetRoot8, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType7 = new DomDocumentType(xmlPage2, "", "", "");
		CoreDocumentImpl coreDocumentImpl2 = new CoreDocumentImpl(domDocumentType7);
		DomWriter domWriter3 = new DomWriter(new DOMElement(""), coreDocumentImpl2, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller7 = new ReferenceByIdMarshaller(domWriter3, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream3 = CustomObjectInputStream.getInstance(referenceByIdMarshaller7, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID3 = new UUID(customObjectInputStream3);
		NodeId nodeId4 = new NodeId(uUID3);
		StringWriter stringWriter6 = new StringWriter();
		PrintWriter printWriter8 = new PrintWriter(stringWriter6);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(printWriter8);
		StylesheetRoot stylesheetRoot4 = new StylesheetRoot(defaultErrorHandler);
		XmlPage xmlPage6 = new XmlPage(stylesheetRoot4, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType = new DomDocumentType(xmlPage6, "", "", "");
		CoreDocumentImpl coreDocumentImpl6 = new CoreDocumentImpl(domDocumentType);
		DomWriter domWriter5 = new DomWriter(new DOMElement(""), coreDocumentImpl6, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller8 = new ReferenceByIdMarshaller(domWriter5, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(referenceByIdMarshaller8, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID2 = new UUID(customObjectInputStream);
		NodeId nodeId5 = new NodeId(uUID2);
		StringWriter stringWriter7 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter7);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(printWriter3);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler2);
		XmlPage xmlPage = new XmlPage(stylesheetRoot, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType6 = new DomDocumentType(xmlPage, "", "", "");
		CoreDocumentImpl coreDocumentImpl5 = new CoreDocumentImpl(domDocumentType6);
		DomWriter domWriter2 = new DomWriter(new DOMElement(""), coreDocumentImpl5, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller2 = new ReferenceByIdMarshaller(domWriter2, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream4 = CustomObjectInputStream.getInstance(referenceByIdMarshaller2, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID5 = new UUID(customObjectInputStream4);
		NodeId nodeId7 = new NodeId(uUID5);
		VersionManagerImpl versionManagerImpl = new VersionManagerImpl(new BundleDbPersistenceManager(), new BasedFileSystem((FileSystem) null, ""), NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), new DelegatingObservationDispatcher(), nodeId5, nodeId7, new ManagedMLRUItemStateCacheFactory(new CacheManager()), new DefaultISMLocking());
		XAVersionManager xAVersionManager = new XAVersionManager(versionManagerImpl, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")), (SessionImpl) null, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		LocalItemStateManager localItemStateManager2 = LocalItemStateManager.createInstance((SharedItemStateManager) null, xAVersionManager, new ManagedMLRUItemStateCacheFactory(new CacheManager()));
		SessionItemStateManager sessionItemStateManager = SessionItemStateManager.createInstance(nodeId4, localItemStateManager2, NodeTypeRegistry.create((NamespaceRegistry) null, new BasedFileSystem((FileSystem) null, "")));
		CachingHierarchyManager cachingHierarchyManager = new CachingHierarchyManager(nodeId8, sessionItemStateManager);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter5);
		DefaultErrorHandler defaultErrorHandler5 = new DefaultErrorHandler(printWriter2);
		StylesheetRoot stylesheetRoot6 = new StylesheetRoot(defaultErrorHandler5);
		XmlPage xmlPage8 = new XmlPage(stylesheetRoot6, new DialogWindow(new WebClient(), new Object()));
		DomDocumentType domDocumentType8 = new DomDocumentType(xmlPage8, "", "", "");
		CoreDocumentImpl coreDocumentImpl7 = new CoreDocumentImpl(domDocumentType8);
		DomWriter domWriter7 = new DomWriter(new DOMElement(""), coreDocumentImpl7, new XmlFriendlyReplacer());
		ReferenceByIdMarshaller referenceByIdMarshaller5 = new ReferenceByIdMarshaller(domWriter7, new DefaultConverterLookup(), new AnnotationMapper((Mapper) null, (ConverterRegistry) null, (ClassLoader) null, new PureJavaReflectionProvider(new FieldDictionary()), (JVM) null));
		CustomObjectInputStream customObjectInputStream5 = CustomObjectInputStream.getInstance(referenceByIdMarshaller5, (com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback) null);
		UUID uUID6 = new UUID(customObjectInputStream5);
		NodeId nodeId6 = new NodeId(uUID6);
		ItemManager itemManager = ItemManager.createInstance(sessionItemStateManager2, cachingHierarchyManager, (SessionImpl) null, (NodeDefinition) null, nodeId6);
		Node node = new VersionImpl(itemManager, (SessionImpl) null, (AbstractNodeData) null);
		String name = "";

		Node result = fixture.getFolderNode(node, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: ElemTemplateElement error: Function not supported!
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:223)
		//       at org.apache.xalan.templates.ElemTemplateElement.error(ElemTemplateElement.java:236)
		//       at org.apache.xml.utils.UnImplNode.getDoctype(UnImplNode.java:777)
		//       at com.gargoylesoftware.htmlunit.xml.XmlUtil.appendChild(XmlUtil.java:132)
		//       at com.gargoylesoftware.htmlunit.xml.XmlPage.<init>(XmlPage.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the Node getRootNode(Session,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetRootNode_1()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;

		Node result = fixture.getRootNode(session, companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getRootNode(Session,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetRootNode_2()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;

		Node result = fixture.getRootNode(session, companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getRootNode(Session,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetRootNode_3()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;

		Node result = fixture.getRootNode(session, companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Node getRootNode(Session,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testGetRootNode_4()
		throws Exception {
		JCRHook fixture = new JCRHook();
		Session session = null;
		long companyId = 1L;

		Node result = fixture.getRootNode(session, companyId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	@Test
	public void testHasFile_1()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String versionNumber = "";

		boolean result = fixture.hasFile(companyId, repositoryId, fileName, versionNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_3()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_4()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_5()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_6()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_7()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_8()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_9()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_10()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_11()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_12()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_13()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_14()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_15()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testMove_16()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String srcDir = "";
		String destDir = "";

		fixture.move(srcDir, destDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		String[] ids = new String[] {null, "", "", ""};

		fixture.reindex(ids);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
		String[] ids = new String[] {null, "", "", ""};

		fixture.reindex(ids);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testReindex_3()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String[] ids = new String[] {null, "", "", ""};

		fixture.reindex(ids);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testReindex_4()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String[] ids = new String[] {null, "", "", ""};

		fixture.reindex(ids);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testReindex_5()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String[] ids = new String[] {null, "", "", ""};

		fixture.reindex(ids);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testReindex_6()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String[] ids = new String[] {null, "", "", ""};

		fixture.reindex(ids);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testReindex_7()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String[] ids = new String[] {null, "", "", ""};

		fixture.reindex(ids);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testReindex_8()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String[] ids = new String[] {null, "", "", ""};

		fixture.reindex(ids);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testReindex_9()
		throws Exception {
		JCRHook fixture = new JCRHook();
		String[] ids = new String[] {null, "", "", ""};

		fixture.reindex(ids);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_6()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_7()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_8()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_9()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_10()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_11()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_12()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_13()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_14()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_15()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_16()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_17()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_18()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_19()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_20()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_21()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_22()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_23()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_24()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String newFileName = "";
		boolean reindex = false;

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, newFileName, reindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_25()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String newFileName = "";
		boolean reindex = false;

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, newFileName, reindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_26()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String newFileName = "";
		boolean reindex = false;

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, newFileName, reindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_27()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_28()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_29()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_30()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String newFileName = "";
		boolean reindex = false;

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, newFileName, reindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_31()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String newFileName = "";
		boolean reindex = false;

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, newFileName, reindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_32()
		throws Exception {
		JCRHook fixture = new JCRHook();
		long companyId = 1L;
		String portletId = "";
		long groupId = 1L;
		long repositoryId = 1L;
		String fileName = "";
		String newFileName = "";
		boolean reindex = false;

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, newFileName, reindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_33()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_34()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_35()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_36()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_37()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_38()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_39()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_40()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_41()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_42()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_43()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_44()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_45()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_46()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	public void testUpdateFile_47()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		serviceContext.setAssetCategoryIds(new long[] {});
		serviceContext.setAssetTagNames(new String[] {});
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:544)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:311)
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
	public void testUpdateFile_48()
		throws Exception {
		JCRHook fixture = new JCRHook();
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
		serviceContext.setAssetCategoryIds(new long[] {});
		serviceContext.setAssetTagNames(new String[] {});
		InputStream is = new Base64InputStream(new UnsyncByteArrayInputStream(new byte[] {}));

		fixture.updateFile(companyId, portletId, groupId, repositoryId, fileName, versionNumber, sourceFileName, fileEntryId, properties, modifiedDate, serviceContext, is);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.JCRHook
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:544)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:311)
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
		new org.junit.runner.JUnitCore().run(JCRHookTest.class);
	}
}