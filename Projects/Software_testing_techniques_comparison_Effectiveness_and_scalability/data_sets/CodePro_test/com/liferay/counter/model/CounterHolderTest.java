package com.liferay.counter.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CounterHolderTest</code> contains tests for the class <code>{@link CounterHolder}</code>.
 *
 * @generatedBy CodePro at 11/27/17 12:40 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class CounterHolderTest {
	/**
	 * Run the CounterHolder(long,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:40 PM
	 */
	@Test
	public void testCounterHolder_1()
		throws Exception {
		long initValue = 1L;
		long rangeMax = 1L;

		CounterHolder result = new CounterHolder(initValue, rangeMax);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1L, result.getRangeMax());
		assertEquals(1L, result.getCurrentValue());
	}

	/**
	 * Run the long addAndGet(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:40 PM
	 */
	@Test
	public void testAddAndGet_1()
		throws Exception {
		CounterHolder fixture = new CounterHolder(1L, 1L);
		long delta = 1L;

		long result = fixture.addAndGet(delta);

		// add additional test code here
		assertEquals(2L, result);
	}

	/**
	 * Run the long getCurrentValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:40 PM
	 */
	@Test
	public void testGetCurrentValue_1()
		throws Exception {
		CounterHolder fixture = new CounterHolder(1L, 1L);

		long result = fixture.getCurrentValue();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the long getRangeMax() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:40 PM
	 */
	@Test
	public void testGetRangeMax_1()
		throws Exception {
		CounterHolder fixture = new CounterHolder(1L, 1L);

		long result = fixture.getRangeMax();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/27/17 12:40 PM
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
	 * @generatedBy CodePro at 11/27/17 12:40 PM
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
	 * @generatedBy CodePro at 11/27/17 12:40 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CounterHolderTest.class);
	}
}