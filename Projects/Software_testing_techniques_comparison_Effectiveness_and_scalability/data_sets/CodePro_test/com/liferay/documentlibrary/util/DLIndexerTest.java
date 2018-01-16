package com.liferay.documentlibrary.util;

import javax.portlet.PortletURL;
import javax.servlet.http.HttpServletRequest;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.documentlibrary.model.FileModel;
import com.liferay.portal.kernel.portlet.PortletURLWrapper;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.DocumentImpl;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portlet.PortletURLImpl;
import com.liferay.support.tomcat.connector.PortalRequest;

/**
 * The class <code>DLIndexerTest</code> contains tests for the class <code>{@link DLIndexer}</code>.
 *
 * @generatedBy CodePro at 11/27/17 1:00 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class DLIndexerTest {
	/**
	 * Run the DLIndexer() constructor test.
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test
	public void testDLIndexer_1()
		throws Exception {
		DLIndexer result = new DLIndexer();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void doDelete(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoDelete_1()
		throws Exception {
		DLIndexer fixture = new DLIndexer();
		FileModel obj = new FileModel();
		obj.setFileName("");
		obj.setPortletId("");
		obj.setRepositoryId(1L);
		obj.setCompanyId(1L);

		fixture.doDelete(obj);

		// add additional test code here
	}

	/**
	 * Run the void doDelete(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoDelete_2()
		throws Exception {
		DLIndexer fixture = new DLIndexer();
		FileModel obj = new FileModel();
		obj.setFileName("");
		obj.setPortletId("");
		obj.setRepositoryId(1L);
		obj.setCompanyId(1L);

		fixture.doDelete(obj);

		// add additional test code here
	}

	/**
	 * Run the void doReindex(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoReindex_1()
		throws Exception {
		DLIndexer fixture = new DLIndexer();
		Object obj = new FileModel();

		fixture.doReindex(obj);

		// add additional test code here
	}

	/**
	 * Run the void doReindex(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoReindex_2()
		throws Exception {
		DLIndexer fixture = new DLIndexer();
		FileModel obj = new FileModel();
		obj.setCompanyId(1L);

		fixture.doReindex(obj);

		// add additional test code here
	}

	/**
	 * Run the void doReindex(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoReindex_3()
		throws Exception {
		DLIndexer fixture = new DLIndexer();
		FileModel obj = new FileModel();
		obj.setCompanyId(1L);

		fixture.doReindex(obj);

		// add additional test code here
	}

	/**
	 * Run the void doReindex(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoReindex_4()
		throws Exception {
		DLIndexer fixture = new DLIndexer();
		Object obj = new FileModel();

		fixture.doReindex(obj);

		// add additional test code here
	}

	/**
	 * Run the void doReindex(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoReindex_5()
		throws Exception {
		DLIndexer fixture = new DLIndexer();
		String[] ids = new String[] {};

		fixture.doReindex(ids);

		// add additional test code here
	}

	/**
	 * Run the void doReindex(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoReindex_6()
		throws Exception {
		DLIndexer fixture = new DLIndexer();
		String[] ids = new String[] {};

		fixture.doReindex(ids);

		// add additional test code here
	}

	/**
	 * Run the void doReindex(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoReindex_7()
		throws Exception {
		DLIndexer fixture = new DLIndexer();
		String className = "";
		long classPK = 1L;

		fixture.doReindex(className, classPK);

		// add additional test code here
	}

	/**
	 * Run the String[] getClassNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test
	public void testGetClassNames_1()
		throws Exception {
		DLIndexer fixture = new DLIndexer();

		String[] result = fixture.getClassNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.DLIndexer
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the String getPortletId(SearchContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test
	public void testGetPortletId_1()
		throws Exception {
		DLIndexer fixture = new DLIndexer();
		SearchContext searchContext = new SearchContext();

		String result = fixture.getPortletId(searchContext);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.DLIndexer
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the Summary getSummary(Document,String,PortletURL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	@Test
	public void testGetSummary_1()
		throws Exception {
		DLIndexer fixture = new DLIndexer();
		Document document = new DocumentImpl();
		String snippet = "";
		PortletURL portletURL = new PortletURLWrapper(new PortletURLImpl(new PortalRequest(), "", 1L, ""));

		Summary result = fixture.getSummary(document, snippet, portletURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.documentlibrary.util.DLIndexer
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * @generatedBy CodePro at 11/27/17 1:00 PM
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
	 * @generatedBy CodePro at 11/27/17 1:00 PM
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
	 * @generatedBy CodePro at 11/27/17 1:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DLIndexerTest.class);
	}
}