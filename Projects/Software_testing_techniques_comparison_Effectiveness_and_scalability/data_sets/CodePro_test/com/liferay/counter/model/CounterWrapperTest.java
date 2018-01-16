package com.liferay.counter.model;

import java.io.Serializable;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.counter.model.impl.CounterImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.expando.model.ExpandoBridge;

/**
 * The class <code>CounterWrapperTest</code> contains tests for the class <code>{@link CounterWrapper}</code>.
 *
 * @generatedBy CodePro at 12/5/17 12:09 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class CounterWrapperTest {
	/**
	 * Run the CounterWrapper(Counter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testCounterWrapper_1()
		throws Exception {
		Counter counter = new CounterWrapper(new CounterImpl());

		CounterWrapper result = new CounterWrapper(counter);

		// add additional test code here
		assertNotNull(result);
		assertEquals("{name=, currentId=0}", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isNew());
		assertEquals(null, result.getPrimaryKeyObj());
		assertEquals(0L, result.getCurrentId());
		assertEquals(null, result.getPrimaryKey());
		assertEquals(false, result.isEscapedModel());
		assertEquals("<model><model-name>com.liferay.counter.model.Counter</model-name><column><column-name>name</column-name><column-value><![CDATA[]]></column-value></column><column><column-name>currentId</column-name><column-value><![CDATA[0]]></column-value></column></model>", result.toXmlString());
		assertEquals(false, result.isCachedModel());
	}

	/**
	 * Run the Object clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		Object result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int compareTo(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());
		Counter counter = new CounterWrapper(new CounterImpl());

		int result = fixture.compareTo(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.model.impl.CounterModelImpl.compareTo(CounterModelImpl.java:129)
		//       at com.liferay.counter.model.CounterWrapper.compareTo(CounterWrapper.java:101)
		assertEquals(0, result);
	}

	/**
	 * Run the long getCurrentId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testGetCurrentId_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		long result = fixture.getCurrentId();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the ExpandoBridge getExpandoBridge() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testGetExpandoBridge_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		ExpandoBridge result = fixture.getExpandoBridge();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException
		//       at com.liferay.portal.model.impl.BaseModelImpl.getExpandoBridge(BaseModelImpl.java:57)
		//       at com.liferay.counter.model.CounterWrapper.getExpandoBridge(CounterWrapper.java:88)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getPrimaryKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testGetPrimaryKey_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		String result = fixture.getPrimaryKey();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Serializable getPrimaryKeyObj() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testGetPrimaryKeyObj_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		Serializable result = fixture.getPrimaryKeyObj();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Counter getWrappedCounter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testGetWrappedCounter_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		Counter result = fixture.getWrappedCounter();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{name=, currentId=0}", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isNew());
		assertEquals(null, result.getPrimaryKeyObj());
		assertEquals(0L, result.getCurrentId());
		assertEquals(null, result.getPrimaryKey());
		assertEquals(false, result.isEscapedModel());
		assertEquals("<model><model-name>com.liferay.counter.model.Counter</model-name><column><column-name>name</column-name><column-value><![CDATA[]]></column-value></column><column><column-name>currentId</column-name><column-value><![CDATA[0]]></column-value></column></model>", result.toXmlString());
		assertEquals(false, result.isCachedModel());
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.liferay.counter.model.impl.CounterModelImpl.hashCode(CounterModelImpl.java:157)
		//       at com.liferay.counter.model.CounterWrapper.hashCode(CounterWrapper.java:105)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isCachedModel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testIsCachedModel_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		boolean result = fixture.isCachedModel();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCachedModel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testIsCachedModel_2()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		boolean result = fixture.isCachedModel();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEscapedModel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testIsEscapedModel_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		boolean result = fixture.isEscapedModel();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEscapedModel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testIsEscapedModel_2()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		boolean result = fixture.isEscapedModel();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNew() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testIsNew_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		boolean result = fixture.isNew();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNew() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testIsNew_2()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		boolean result = fixture.isNew();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setCachedModel(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testSetCachedModel_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());
		boolean cachedModel = true;

		fixture.setCachedModel(cachedModel);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentId(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testSetCurrentId_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());
		long currentId = 1L;

		fixture.setCurrentId(currentId);

		// add additional test code here
	}

	/**
	 * Run the void setEscapedModel(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testSetEscapedModel_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());
		boolean escapedModel = true;

		fixture.setEscapedModel(escapedModel);

		// add additional test code here
	}

	/**
	 * Run the void setExpandoBridgeAttributes(ServiceContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testSetExpandoBridgeAttributes_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());
		ServiceContext serviceContext = new ServiceContext();

		fixture.setExpandoBridgeAttributes(serviceContext);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException
		//       at com.liferay.portal.model.impl.BaseModelImpl.setExpandoBridgeAttributes(BaseModelImpl.java:61)
		//       at com.liferay.counter.model.CounterWrapper.setExpandoBridgeAttributes(CounterWrapper.java:93)
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setNew(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testSetNew_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());
		boolean n = true;

		fixture.setNew(n);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testSetPrimaryKey_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());
		String pk = "";

		fixture.setPrimaryKey(pk);

		// add additional test code here
	}

	/**
	 * Run the Counter toEscapedModel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testToEscapedModel_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		Counter result = fixture.toEscapedModel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{name=, currentId=0}", result.toString());
		assertEquals(false, result.isNew());
		assertEquals(null, result.getPrimaryKeyObj());
		assertEquals(0L, result.getCurrentId());
		assertEquals(null, result.getPrimaryKey());
		assertEquals(true, result.isEscapedModel());
		assertEquals("<model><model-name>com.liferay.counter.model.Counter</model-name><column><column-name>name</column-name><column-value><![CDATA[]]></column-value></column><column><column-name>currentId</column-name><column-value><![CDATA[0]]></column-value></column></model>", result.toXmlString());
		assertEquals(false, result.isCachedModel());
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("{name=, currentId=0}", result);
	}

	/**
	 * Run the String toXmlString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	@Test
	public void testToXmlString_1()
		throws Exception {
		CounterWrapper fixture = new CounterWrapper(new CounterImpl());

		String result = fixture.toXmlString();

		// add additional test code here
		assertEquals("<model><model-name>com.liferay.counter.model.Counter</model-name><column><column-name>name</column-name><column-value><![CDATA[]]></column-value></column><column><column-name>currentId</column-name><column-value><![CDATA[0]]></column-value></column></model>", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/5/17 12:09 PM
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
	 * @generatedBy CodePro at 12/5/17 12:09 PM
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
	 * @generatedBy CodePro at 12/5/17 12:09 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CounterWrapperTest.class);
	}
}