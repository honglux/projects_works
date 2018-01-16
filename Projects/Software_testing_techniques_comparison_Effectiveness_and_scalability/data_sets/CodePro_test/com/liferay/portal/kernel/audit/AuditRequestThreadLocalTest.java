package com.liferay.portal.kernel.audit;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AuditRequestThreadLocalTest</code> contains tests for the class <code>{@link AuditRequestThreadLocal}</code>.
 *
 * @generatedBy CodePro at 12/5/17 12:59 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class AuditRequestThreadLocalTest {
	/**
	 * Run the AuditRequestThreadLocal() constructor test.
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testAuditRequestThreadLocal_1()
		throws Exception {
		AuditRequestThreadLocal result = new AuditRequestThreadLocal();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the AuditRequestThreadLocal getAuditThreadLocal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testGetAuditThreadLocal_1()
		throws Exception {

		AuditRequestThreadLocal result = AuditRequestThreadLocal.getAuditThreadLocal();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getQueryString());
		assertEquals(null, result.getServerName());
		assertEquals(0L, result.getRealUserId());
		assertEquals(null, result.getSessionID());
		assertEquals(null, result.getClientHost());
		assertEquals(null, result.getRequestURL());
		assertEquals(null, result.getClientIP());
		assertEquals(0, result.getServerPort());
	}

	/**
	 * Run the AuditRequestThreadLocal getAuditThreadLocal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testGetAuditThreadLocal_2()
		throws Exception {

		AuditRequestThreadLocal result = AuditRequestThreadLocal.getAuditThreadLocal();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getQueryString());
		assertEquals(null, result.getServerName());
		assertEquals(0L, result.getRealUserId());
		assertEquals(null, result.getSessionID());
		assertEquals(null, result.getClientHost());
		assertEquals(null, result.getRequestURL());
		assertEquals(null, result.getClientIP());
		assertEquals(0, result.getServerPort());
	}

	/**
	 * Run the String getClientHost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testGetClientHost_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");

		String result = fixture.getClientHost();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getClientIP() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testGetClientIP_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");

		String result = fixture.getClientIP();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getQueryString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testGetQueryString_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");

		String result = fixture.getQueryString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the long getRealUserId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testGetRealUserId_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");

		long result = fixture.getRealUserId();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the String getRequestURL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testGetRequestURL_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");

		String result = fixture.getRequestURL();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getServerName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testGetServerName_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");

		String result = fixture.getServerName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getServerPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testGetServerPort_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");

		int result = fixture.getServerPort();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getSessionID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testGetSessionID_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");

		String result = fixture.getSessionID();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void removeAuditThreadLocal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testRemoveAuditThreadLocal_1()
		throws Exception {

		AuditRequestThreadLocal.removeAuditThreadLocal();

		// add additional test code here
	}

	/**
	 * Run the void setClientHost(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testSetClientHost_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");
		String clientHost = "";

		fixture.setClientHost(clientHost);

		// add additional test code here
	}

	/**
	 * Run the void setClientIP(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testSetClientIP_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");
		String clientIP = "";

		fixture.setClientIP(clientIP);

		// add additional test code here
	}

	/**
	 * Run the void setQueryString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testSetQueryString_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");
		String queryString = "";

		fixture.setQueryString(queryString);

		// add additional test code here
	}

	/**
	 * Run the void setRealUserId(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testSetRealUserId_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");
		long realUserId = 1L;

		fixture.setRealUserId(realUserId);

		// add additional test code here
	}

	/**
	 * Run the void setRequestURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testSetRequestURL_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");
		String requestURL = "";

		fixture.setRequestURL(requestURL);

		// add additional test code here
	}

	/**
	 * Run the void setServerName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testSetServerName_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");
		String serverName = "";

		fixture.setServerName(serverName);

		// add additional test code here
	}

	/**
	 * Run the void setServerPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testSetServerPort_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");
		int serverPort = 1;

		fixture.setServerPort(serverPort);

		// add additional test code here
	}

	/**
	 * Run the void setSessionID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	@Test
	public void testSetSessionID_1()
		throws Exception {
		AuditRequestThreadLocal fixture = new AuditRequestThreadLocal();
		fixture.setServerPort(1);
		fixture.setSessionID("");
		fixture.setRequestURL("");
		fixture.setRealUserId(1L);
		fixture.setClientIP("");
		fixture.setServerName("");
		fixture.setClientHost("");
		fixture.setQueryString("");
		String sessionID = "";

		fixture.setSessionID(sessionID);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/5/17 12:59 PM
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
	 * @generatedBy CodePro at 12/5/17 12:59 PM
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
	 * @generatedBy CodePro at 12/5/17 12:59 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AuditRequestThreadLocalTest.class);
	}
}