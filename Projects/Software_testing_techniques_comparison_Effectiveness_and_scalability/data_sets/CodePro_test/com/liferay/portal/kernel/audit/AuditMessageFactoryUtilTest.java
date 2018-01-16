package com.liferay.portal.kernel.audit;

import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.portal.audit.AuditMessageFactoryImpl;
import com.liferay.portal.json.JSONObjectImpl;
import com.liferay.portal.kernel.json.JSONObject;

/**
 * The class <code>AuditMessageFactoryUtilTest</code> contains tests for the class <code>{@link AuditMessageFactoryUtil}</code>.
 *
 * @generatedBy CodePro at 12/5/17 12:58 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class AuditMessageFactoryUtilTest {
	/**
	 * Run the AuditMessage getAuditMessage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:58 PM
	 */
	@Test
	public void testGetAuditMessage_1()
		throws Exception {
		AuditMessageFactoryUtil fixture = new AuditMessageFactoryUtil();
		String message = "";

		AuditMessage result = fixture.getAuditMessage(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.portal.kernel.audit.AuditMessageFactoryUtil.getAuditMessage(AuditMessageFactoryUtil.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the AuditMessage getAuditMessage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:58 PM
	 */
	@Test
	public void testGetAuditMessage_2()
		throws Exception {
		AuditMessageFactoryUtil fixture = new AuditMessageFactoryUtil();
		String message = "";

		AuditMessage result = fixture.getAuditMessage(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.portal.kernel.audit.AuditMessageFactoryUtil.getAuditMessage(AuditMessageFactoryUtil.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the AuditMessage getAuditMessage(String,long,long,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:58 PM
	 */
	@Test
	public void testGetAuditMessage_3()
		throws Exception {
		AuditMessageFactoryUtil fixture = new AuditMessageFactoryUtil();
		String eventType = "";
		long companyId = 1L;
		long userId = 1L;
		String userName = "";

		AuditMessage result = fixture.getAuditMessage(eventType, companyId, userId, userName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.portal.kernel.audit.AuditMessageFactoryUtil.getAuditMessage(AuditMessageFactoryUtil.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the AuditMessage getAuditMessage(String,long,long,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:58 PM
	 */
	@Test
	public void testGetAuditMessage_4()
		throws Exception {
		AuditMessageFactoryUtil fixture = new AuditMessageFactoryUtil();
		String eventType = "";
		long companyId = 1L;
		long userId = 1L;
		String userName = "";
		String className = "";
		String classPK = "";

		AuditMessage result = fixture.getAuditMessage(eventType, companyId, userId, userName, className, classPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.portal.kernel.audit.AuditMessageFactoryUtil.getAuditMessage(AuditMessageFactoryUtil.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the AuditMessage getAuditMessage(String,long,long,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:58 PM
	 */
	@Test
	public void testGetAuditMessage_5()
		throws Exception {
		AuditMessageFactoryUtil fixture = new AuditMessageFactoryUtil();
		String eventType = "";
		long companyId = 1L;
		long userId = 1L;
		String userName = "";
		String className = "";
		String classPK = "";
		String message = "";

		AuditMessage result = fixture.getAuditMessage(eventType, companyId, userId, userName, className, classPK, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.portal.kernel.audit.AuditMessageFactoryUtil.getAuditMessage(AuditMessageFactoryUtil.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the AuditMessage getAuditMessage(String,long,long,String,String,String,String,JSONObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:58 PM
	 */
	@Test
	public void testGetAuditMessage_6()
		throws Exception {
		AuditMessageFactoryUtil fixture = new AuditMessageFactoryUtil();
		String eventType = "";
		long companyId = 1L;
		long userId = 1L;
		String userName = "";
		String className = "";
		String classPK = "";
		String message = "";
		JSONObject additionalInfo = new JSONObjectImpl();

		AuditMessage result = fixture.getAuditMessage(eventType, companyId, userId, userName, className, classPK, message, additionalInfo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.portal.kernel.audit.AuditMessageFactoryUtil.getAuditMessage(AuditMessageFactoryUtil.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the AuditMessage getAuditMessage(String,long,long,String,String,String,String,Date,JSONObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:58 PM
	 */
	@Test
	public void testGetAuditMessage_7()
		throws Exception {
		AuditMessageFactoryUtil fixture = new AuditMessageFactoryUtil();
		String eventType = "";
		long companyId = 1L;
		long userId = 1L;
		String userName = "";
		String className = "";
		String classPK = "";
		String message = "";
		Date timestamp = new Date();
		JSONObject additionalInfo = new JSONObjectImpl();

		AuditMessage result = fixture.getAuditMessage(eventType, companyId, userId, userName, className, classPK, message, timestamp, additionalInfo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.portal.kernel.audit.AuditMessageFactoryUtil.getAuditMessage(AuditMessageFactoryUtil.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the AuditMessageFactory getAuditMessageFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:58 PM
	 */
	@Test
	public void testGetAuditMessageFactory_1()
		throws Exception {

		AuditMessageFactory result = AuditMessageFactoryUtil.getAuditMessageFactory();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setAuditMessageFactory(AuditMessageFactory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:58 PM
	 */
	@Test
	public void testSetAuditMessageFactory_1()
		throws Exception {
		AuditMessageFactoryUtil fixture = new AuditMessageFactoryUtil();
		AuditMessageFactory auditMessageFactory = new AuditMessageFactoryImpl();

		fixture.setAuditMessageFactory(auditMessageFactory);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/5/17 12:58 PM
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
	 * @generatedBy CodePro at 12/5/17 12:58 PM
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
	 * @generatedBy CodePro at 12/5/17 12:58 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AuditMessageFactoryUtilTest.class);
	}
}