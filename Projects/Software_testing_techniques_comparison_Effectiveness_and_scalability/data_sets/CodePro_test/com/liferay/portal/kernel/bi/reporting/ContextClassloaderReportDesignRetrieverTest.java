package com.liferay.portal.kernel.bi.reporting;

import java.io.InputStream;
import java.text.DateFormat;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ContextClassloaderReportDesignRetrieverTest</code> contains tests for the class <code>{@link ContextClassloaderReportDesignRetriever}</code>.
 *
 * @generatedBy CodePro at 12/5/17 1:16 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class ContextClassloaderReportDesignRetrieverTest {
	/**
	 * Run the ContextClassloaderReportDesignRetriever(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:16 PM
	 */
	@Test
	public void testContextClassloaderReportDesignRetriever_1()
		throws Exception {
		String reportName = "";

		ContextClassloaderReportDesignRetriever result = new ContextClassloaderReportDesignRetriever(reportName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getReportName());
	}

	/**
	 * Run the InputStream getInputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:16 PM
	 */
	@Test
	public void testGetInputStream_1()
		throws Exception {
		ContextClassloaderReportDesignRetriever fixture = new ContextClassloaderReportDesignRetriever("");

		InputStream result = fixture.getInputStream();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.read());
		assertEquals(0, result.available());
		assertEquals(true, result.markSupported());
	}

	/**
	 * Run the Date getModifiedDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:16 PM
	 */
	@Test
	public void testGetModifiedDate_1()
		throws Exception {
		ContextClassloaderReportDesignRetriever fixture = new ContextClassloaderReportDesignRetriever("");

		Date result = fixture.getModifiedDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1512497819411L)), DateFormat.getInstance().format(result));
		assertEquals(1512497819411L, result.getTime());
	}

	/**
	 * Run the String getReportName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:16 PM
	 */
	@Test
	public void testGetReportName_1()
		throws Exception {
		ContextClassloaderReportDesignRetriever fixture = new ContextClassloaderReportDesignRetriever("");

		String result = fixture.getReportName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/5/17 1:16 PM
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
	 * @generatedBy CodePro at 12/5/17 1:16 PM
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
	 * @generatedBy CodePro at 12/5/17 1:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ContextClassloaderReportDesignRetrieverTest.class);
	}
}