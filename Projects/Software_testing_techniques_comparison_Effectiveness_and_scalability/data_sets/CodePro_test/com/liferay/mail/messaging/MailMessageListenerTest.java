package com.liferay.mail.messaging;

import java.lang.reflect.Method;
import javax.mail.internet.InternetAddress;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.util.MethodHandler;

/**
 * The class <code>MailMessageListenerTest</code> contains tests for the class <code>{@link MailMessageListener}</code>.
 *
 * @generatedBy CodePro at 11/27/17 1:05 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class MailMessageListenerTest {
	/**
	 * Run the MailMessageListener() constructor test.
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test
	public void testMailMessageListener_1()
		throws Exception {
		MailMessageListener result = new MailMessageListener();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void doMailMessage(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMailMessage_1()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MailMessage mailMessage = new MailMessage(new InternetAddress(), new InternetAddress(), "", "", true);

		fixture.doMailMessage(mailMessage);

		// add additional test code here
	}

	/**
	 * Run the void doMailMessage(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMailMessage_2()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MailMessage mailMessage = new MailMessage(new InternetAddress(), new InternetAddress(), "", "", true);
		mailMessage.setTo(new InternetAddress[] {});
		mailMessage.setBCC(new InternetAddress[] {});
		mailMessage.setCC(new InternetAddress[] {});
		mailMessage.setBulkAddresses(new InternetAddress[] {});

		fixture.doMailMessage(mailMessage);

		// add additional test code here
	}

	/**
	 * Run the void doMailMessage(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMailMessage_3()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MailMessage mailMessage = new MailMessage(new InternetAddress(), new InternetAddress(), "", "", true);
		mailMessage.setTo(new InternetAddress[] {});
		mailMessage.setBCC(new InternetAddress[] {});
		mailMessage.setCC(new InternetAddress[] {});
		mailMessage.setBulkAddresses(new InternetAddress[] {});

		fixture.doMailMessage(mailMessage);

		// add additional test code here
	}

	/**
	 * Run the void doMailMessage(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMailMessage_4()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MailMessage mailMessage = new MailMessage(new InternetAddress(), new InternetAddress(), "", "", true);
		mailMessage.setTo(new InternetAddress[] {});
		mailMessage.setBCC(new InternetAddress[] {});
		mailMessage.setCC(new InternetAddress[] {});
		mailMessage.setBulkAddresses(new InternetAddress[] {});

		fixture.doMailMessage(mailMessage);

		// add additional test code here
	}

	/**
	 * Run the void doMailMessage(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMailMessage_5()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MailMessage mailMessage = new MailMessage(new InternetAddress(), new InternetAddress(), "", "", true);
		mailMessage.setTo(new InternetAddress[] {});
		mailMessage.setBCC(new InternetAddress[] {});
		mailMessage.setCC(new InternetAddress[] {});
		mailMessage.setBulkAddresses(new InternetAddress[] {});

		fixture.doMailMessage(mailMessage);

		// add additional test code here
	}

	/**
	 * Run the void doMailMessage(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMailMessage_6()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MailMessage mailMessage = new MailMessage(new InternetAddress(), new InternetAddress(), "", "", true);
		mailMessage.setTo(new InternetAddress[] {});
		mailMessage.setBCC(new InternetAddress[] {});
		mailMessage.setCC(new InternetAddress[] {});
		mailMessage.setBulkAddresses(new InternetAddress[] {});

		fixture.doMailMessage(mailMessage);

		// add additional test code here
	}

	/**
	 * Run the void doMailMessage(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMailMessage_7()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MailMessage mailMessage = new MailMessage(new InternetAddress(), new InternetAddress(), "", "", true);
		mailMessage.setTo(new InternetAddress[] {});
		mailMessage.setBCC(new InternetAddress[] {});
		mailMessage.setCC(new InternetAddress[] {});
		mailMessage.setBulkAddresses(new InternetAddress[] {});

		fixture.doMailMessage(mailMessage);

		// add additional test code here
	}

	/**
	 * Run the void doMailMessage(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMailMessage_8()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MailMessage mailMessage = new MailMessage(new InternetAddress(), new InternetAddress(), "", "", true);
		mailMessage.setTo(new InternetAddress[] {});
		mailMessage.setBCC(new InternetAddress[] {});
		mailMessage.setCC(new InternetAddress[] {});
		mailMessage.setBulkAddresses(new InternetAddress[] {});

		fixture.doMailMessage(mailMessage);

		// add additional test code here
	}

	/**
	 * Run the void doMailMessage(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMailMessage_9()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MailMessage mailMessage = new MailMessage(new InternetAddress(), new InternetAddress(), "", "", true);
		mailMessage.setTo(new InternetAddress[] {});
		mailMessage.setBCC(new InternetAddress[] {});
		mailMessage.setCC(new InternetAddress[] {});
		mailMessage.setBulkAddresses(new InternetAddress[] {});

		fixture.doMailMessage(mailMessage);

		// add additional test code here
	}

	/**
	 * Run the void doMailMessage(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMailMessage_10()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MailMessage mailMessage = new MailMessage(new InternetAddress(), new InternetAddress(), "", "", true);
		mailMessage.setTo(new InternetAddress[] {});
		mailMessage.setBCC(new InternetAddress[] {});
		mailMessage.setCC(new InternetAddress[] {});
		mailMessage.setBulkAddresses(new InternetAddress[] {});

		fixture.doMailMessage(mailMessage);

		// add additional test code here
	}

	/**
	 * Run the void doMailMessage(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMailMessage_11()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MailMessage mailMessage = new MailMessage(new InternetAddress(), new InternetAddress(), "", "", true);
		mailMessage.setTo(new InternetAddress[] {});
		mailMessage.setBCC(new InternetAddress[] {});
		mailMessage.setCC(new InternetAddress[] {});
		mailMessage.setBulkAddresses(new InternetAddress[] {});

		fixture.doMailMessage(mailMessage);

		// add additional test code here
	}

	/**
	 * Run the void doMailMessage(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMailMessage_12()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MailMessage mailMessage = new MailMessage(new InternetAddress(), new InternetAddress(), "", "", true);
		mailMessage.setTo(new InternetAddress[] {});
		mailMessage.setBCC(new InternetAddress[] {});
		mailMessage.setCC(new InternetAddress[] {});
		mailMessage.setBulkAddresses(new InternetAddress[] {});

		fixture.doMailMessage(mailMessage);

		// add additional test code here
	}

	/**
	 * Run the void doMethodHandler(MethodHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMethodHandler_1()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MethodHandler methodHandler = new MethodHandler(Object.class.getMethods()[0], new Object[] {});

		fixture.doMethodHandler(methodHandler);

		// add additional test code here
	}

	/**
	 * Run the void doMethodHandler(MethodHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoMethodHandler_2()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		MethodHandler methodHandler = new MethodHandler(Object.class.getMethods()[0], new Object[] {});

		fixture.doMethodHandler(methodHandler);

		// add additional test code here
	}

	/**
	 * Run the void doReceive(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoReceive_1()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		Message message = new Message();
		message.setPayload(new MailMessage());

		fixture.doReceive(message);

		// add additional test code here
	}

	/**
	 * Run the void doReceive(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoReceive_2()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		Message message = new Message();
		message.setPayload(new MethodHandler(Object.class.getMethods()[0], new Object[] {}));

		fixture.doReceive(message);

		// add additional test code here
	}

	/**
	 * Run the void doReceive(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoReceive_3()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		Message message = new Message();
		message.setPayload(new MethodHandler(Object.class.getMethods()[0], new Object[] {}));

		fixture.doReceive(message);

		// add additional test code here
	}

	/**
	 * Run the void doReceive(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoReceive_4()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		Message message = new Message();
		message.setPayload(new Object());

		fixture.doReceive(message);

		// add additional test code here
	}

	/**
	 * Run the void doReceive(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testDoReceive_5()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		Message message = new Message();
		message.setPayload(new MailMessage());

		fixture.doReceive(message);

		// add additional test code here
	}

	/**
	 * Run the InternetAddress filterInternetAddress(InternetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test
	public void testFilterInternetAddress_1()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		InternetAddress internetAddress = new InternetAddress();

		InternetAddress result = fixture.filterInternetAddress(internetAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.messaging.MailMessageListener
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the InternetAddress filterInternetAddress(InternetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test
	public void testFilterInternetAddress_2()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		InternetAddress internetAddress = new InternetAddress();

		InternetAddress result = fixture.filterInternetAddress(internetAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.messaging.MailMessageListener
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the InternetAddress[] filterInternetAddresses(InternetAddress[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test
	public void testFilterInternetAddresses_1()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		InternetAddress[] internetAddresses = new InternetAddress[] {};

		InternetAddress[] result = fixture.filterInternetAddresses(internetAddresses);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.messaging.MailMessageListener
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the InternetAddress[] filterInternetAddresses(InternetAddress[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test
	public void testFilterInternetAddresses_2()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		InternetAddress[] internetAddresses = new InternetAddress[] {};

		InternetAddress[] result = fixture.filterInternetAddresses(internetAddresses);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.messaging.MailMessageListener
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the InternetAddress[] filterInternetAddresses(InternetAddress[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test
	public void testFilterInternetAddresses_3()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		InternetAddress[] internetAddresses = new InternetAddress[] {};

		InternetAddress[] result = fixture.filterInternetAddresses(internetAddresses);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.messaging.MailMessageListener
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the InternetAddress[] filterInternetAddresses(InternetAddress[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test
	public void testFilterInternetAddresses_4()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		InternetAddress[] internetAddresses = new InternetAddress[] {};

		InternetAddress[] result = fixture.filterInternetAddresses(internetAddresses);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.messaging.MailMessageListener
		//       at java.net.URLClassLoader.findClass(Unknown Source)
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
	 * Run the void receive(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test
	public void testReceive_1()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		Message message = new Message();

		fixture.receive(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.messaging.MailMessageListener
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:544)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}

	/**
	 * Run the void receive(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	@Test
	public void testReceive_2()
		throws Exception {
		MailMessageListener fixture = new MailMessageListener();
		Message message = new Message();

		fixture.receive(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.mail.messaging.MailMessageListener
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
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
	 * @generatedBy CodePro at 11/27/17 1:05 PM
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
	 * @generatedBy CodePro at 11/27/17 1:05 PM
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
	 * @generatedBy CodePro at 11/27/17 1:05 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MailMessageListenerTest.class);
	}
}