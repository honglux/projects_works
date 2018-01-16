package com.liferay.portal.kernel.audit;

import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.portal.audit.AuditRouterProxyBean;

/**
 * The class <code>AuditRouterUtilTest</code> contains tests for the class <code>{@link AuditRouterUtil}</code>.
 *
 * @generatedBy CodePro at 12/5/17 1:01 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class AuditRouterUtilTest {
	/**
	 * Run the AuditRouter getAuditRouter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:01 PM
	 */
	@Test
	public void testGetAuditRouter_1()
		throws Exception {

		AuditRouter result = AuditRouterUtil.getAuditRouter();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void route(AuditMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:01 PM
	 */
	@Test
	public void testRoute_1()
		throws Exception {
		AuditMessage auditMessage = new AuditMessage("");

		AuditRouterUtil.route(auditMessage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.portal.kernel.json.JSONFactoryUtil.createJSONObject(JSONFactoryUtil.java:37)
		//       at com.liferay.portal.kernel.audit.AuditMessage.<init>(AuditMessage.java:37)
	}

	/**
	 * Run the void route(AuditMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:01 PM
	 */
	@Test
	public void testRoute_2()
		throws Exception {
		AuditMessage auditMessage = new AuditMessage("");

		AuditRouterUtil.route(auditMessage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.portal.kernel.json.JSONFactoryUtil.createJSONObject(JSONFactoryUtil.java:37)
		//       at com.liferay.portal.kernel.audit.AuditMessage.<init>(AuditMessage.java:37)
	}

	/**
	 * Run the void setAuditRouter(AuditRouter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 1:01 PM
	 */
	@Test
	public void testSetAuditRouter_1()
		throws Exception {
		AuditRouterUtil fixture = new AuditRouterUtil();
		AuditRouter auditRouter = new AuditRouterProxyBean();

		fixture.setAuditRouter(auditRouter);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/5/17 1:01 PM
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
	 * @generatedBy CodePro at 12/5/17 1:01 PM
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
	 * @generatedBy CodePro at 12/5/17 1:01 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AuditRouterUtilTest.class);
	}
}