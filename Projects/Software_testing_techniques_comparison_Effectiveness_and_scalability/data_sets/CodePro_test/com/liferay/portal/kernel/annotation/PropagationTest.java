package com.liferay.portal.kernel.annotation;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PropagationTest</code> contains tests for the class <code>{@link Propagation}</code>.
 *
 * @generatedBy CodePro at 12/5/17 12:55 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class PropagationTest {
	/**
	 * Run the Propagation(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:55 PM
	 */
	@Test
	public void testPropagation_1()
		throws Exception {
		int value = 1;

		Propagation result = new Propagation(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: com.liferay.portal.kernel.annotation.Propagation.<init>(int)
		//       at java.lang.Class.getConstructor0(Unknown Source)
		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the int value() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:55 PM
	 */
	@Test
	public void testValue_1()
		throws Exception {
		Propagation fixture = Propagation.MANDATORY;

		int result = fixture.value();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/5/17 12:55 PM
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
	 * @generatedBy CodePro at 12/5/17 12:55 PM
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
	 * @generatedBy CodePro at 12/5/17 12:55 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PropagationTest.class);
	}
}