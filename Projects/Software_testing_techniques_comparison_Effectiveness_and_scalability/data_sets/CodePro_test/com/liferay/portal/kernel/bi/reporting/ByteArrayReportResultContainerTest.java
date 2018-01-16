package com.liferay.portal.kernel.bi.reporting;

import java.io.OutputStream;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ByteArrayReportResultContainerTest</code> contains tests for the class <code>{@link ByteArrayReportResultContainer}</code>.
 *
 * @generatedBy CodePro at 12/5/17 1:15 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class ByteArrayReportResultContainerTest {
	/**
	 * Run the ByteArrayReportResultContainer() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	@Test
	public void testByteArrayReportResultContainer_1()
		throws Exception {

		ByteArrayReportResultContainer result = new ByteArrayReportResultContainer();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasError());
		assertEquals(null, result.getReportName());
		assertEquals(null, result.getReportGenerationException());
	}

	/**
	 * Run the ByteArrayReportResultContainer(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	@Test
	public void testByteArrayReportResultContainer_2()
		throws Exception {
		String reportName = "";

		ByteArrayReportResultContainer result = new ByteArrayReportResultContainer(reportName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasError());
		assertEquals("", result.getReportName());
		assertEquals(null, result.getReportGenerationException());
	}

	/**
	 * Run the ByteArrayReportResultContainer(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	@Test
	public void testByteArrayReportResultContainer_3()
		throws Exception {
		String reportName = "";
		int initialCapacity = 1;

		ByteArrayReportResultContainer result = new ByteArrayReportResultContainer(reportName, initialCapacity);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasError());
		assertEquals("", result.getReportName());
		assertEquals(null, result.getReportGenerationException());
	}

	/**
	 * Run the ReportResultContainer clone(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		ByteArrayReportResultContainer fixture = new ByteArrayReportResultContainer("", 1);
		fixture.setReportGenerationException(new ReportGenerationException());
		String reportName = "";

		ReportResultContainer result = fixture.clone(reportName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasError());
		assertEquals("", result.getReportName());
		assertEquals(null, result.getReportGenerationException());
	}

	/**
	 * Run the OutputStream getOutputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	@Test
	public void testGetOutputStream_1()
		throws Exception {
		ByteArrayReportResultContainer fixture = new ByteArrayReportResultContainer("", 1);
		fixture.setReportGenerationException(new ReportGenerationException());

		OutputStream result = fixture.getOutputStream();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream getOutputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	@Test
	public void testGetOutputStream_2()
		throws Exception {
		ByteArrayReportResultContainer fixture = new ByteArrayReportResultContainer("", 1);
		fixture.setReportGenerationException(new ReportGenerationException());

		OutputStream result = fixture.getOutputStream();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ReportGenerationException getReportGenerationException() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	@Test
	public void testGetReportGenerationException_1()
		throws Exception {
		ByteArrayReportResultContainer fixture = new ByteArrayReportResultContainer("", 1);
		fixture.setReportGenerationException(new ReportGenerationException());

		ReportGenerationException result = fixture.getReportGenerationException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("com.liferay.portal.kernel.bi.reporting.ReportGenerationException", result.toString());
		assertEquals(null, result.getLocalizedMessage());
		assertEquals(null, result.getMessage());
	}

	/**
	 * Run the String getReportName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	@Test
	public void testGetReportName_1()
		throws Exception {
		ByteArrayReportResultContainer fixture = new ByteArrayReportResultContainer("", 1);
		fixture.setReportGenerationException(new ReportGenerationException());

		String result = fixture.getReportName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the byte[] getResults() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	@Test
	public void testGetResults_1()
		throws Exception {
		ByteArrayReportResultContainer fixture = new ByteArrayReportResultContainer("", 1);
		fixture.setReportGenerationException(new ReportGenerationException());

		byte[] result = fixture.getResults();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.portal.kernel.bi.reporting.ByteArrayReportResultContainer.getResults(ByteArrayReportResultContainer.java:67)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasError() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	@Test
	public void testHasError_1()
		throws Exception {
		ByteArrayReportResultContainer fixture = new ByteArrayReportResultContainer("", 1);
		fixture.setReportGenerationException(new ReportGenerationException());

		boolean result = fixture.hasError();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasError() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	@Test
	public void testHasError_2()
		throws Exception {
		ByteArrayReportResultContainer fixture = new ByteArrayReportResultContainer("", 1);
		fixture.setReportGenerationException((ReportGenerationException) null);

		boolean result = fixture.hasError();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setReportGenerationException(ReportGenerationException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	@Test
	public void testSetReportGenerationException_1()
		throws Exception {
		ByteArrayReportResultContainer fixture = new ByteArrayReportResultContainer("", 1);
		fixture.setReportGenerationException(new ReportGenerationException());
		ReportGenerationException reportGenerationException = new ReportGenerationException();

		fixture.setReportGenerationException(reportGenerationException);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/5/17 1:15 PM
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
	 * @generatedBy CodePro at 12/5/17 1:15 PM
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
	 * @generatedBy CodePro at 12/5/17 1:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ByteArrayReportResultContainerTest.class);
	}
}