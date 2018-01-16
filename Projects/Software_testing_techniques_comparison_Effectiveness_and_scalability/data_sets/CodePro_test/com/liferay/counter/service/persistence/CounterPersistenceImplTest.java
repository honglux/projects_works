package com.liferay.counter.service.persistence;

import java.io.Serializable;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.liferay.counter.model.Counter;
import com.liferay.counter.model.CounterWrapper;
import com.liferay.counter.model.impl.CounterImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.ResourcePersistenceImpl;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.UserPersistenceImpl;
import com.liferay.portlet.journal.util.comparator.ArticleCreateDateComparator;
import com.liferay.util.UniqueList;

/**
 * The class <code>CounterPersistenceImplTest</code> contains tests for the class <code>{@link CounterPersistenceImpl}</code>.
 *
 * @generatedBy CodePro at 11/27/17 12:58 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
public class CounterPersistenceImplTest {
	/**
	 * Run the CounterPersistenceImpl() constructor test.
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testCounterPersistenceImpl_1()
		throws Exception {
		CounterPersistenceImpl result = new CounterPersistenceImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testAfterPropertiesSet_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		fixture.afterPropertiesSet();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testAfterPropertiesSet_2()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		fixture.afterPropertiesSet();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testAfterPropertiesSet_3()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		fixture.afterPropertiesSet();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testAfterPropertiesSet_4()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		fixture.afterPropertiesSet();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void cacheResult(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testCacheResult_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Counter counter = new CounterWrapper(new CounterImpl());

		fixture.cacheResult(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void cacheResult(List<Counter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testCacheResult_2()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		List<Counter> counters = new UniqueList();

		fixture.cacheResult(counters);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void cacheResult(List<Counter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testCacheResult_3()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		List<Counter> counters = new UniqueList();

		fixture.cacheResult(counters);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void cacheResult(List<Counter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testCacheResult_4()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		List<Counter> counters = new UniqueList();

		fixture.cacheResult(counters);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void clearCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testClearCache_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		fixture.clearCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void clearCache(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testClearCache_2()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Counter counter = new CounterWrapper(new CounterImpl());

		fixture.clearCache(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the int countAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testCountAll_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		int result = fixture.countAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
		assertEquals(0, result);
	}

	/**
	 * Run the int countAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testCountAll_2()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		int result = fixture.countAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
		assertEquals(0, result);
	}

	/**
	 * Run the int countAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testCountAll_3()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		int result = fixture.countAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
		assertEquals(0, result);
	}

	/**
	 * Run the Counter create(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testCreate_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		String name = "";

		Counter result = fixture.create(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		fixture.destroy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter fetchByPrimaryKey(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFetchByPrimaryKey_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Serializable primaryKey = "";

		Counter result = fixture.fetchByPrimaryKey(primaryKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter fetchByPrimaryKey(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFetchByPrimaryKey_2()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Serializable primaryKey = "";

		Counter result = fixture.fetchByPrimaryKey(primaryKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter fetchByPrimaryKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFetchByPrimaryKey_3()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		String name = "";

		Counter result = fixture.fetchByPrimaryKey(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter fetchByPrimaryKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFetchByPrimaryKey_4()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		String name = "";

		Counter result = fixture.fetchByPrimaryKey(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter fetchByPrimaryKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFetchByPrimaryKey_5()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		String name = "";

		Counter result = fixture.fetchByPrimaryKey(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the List<Counter> findAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindAll_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		List<Counter> result = fixture.findAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the List<Counter> findAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindAll_2()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		List<Counter> result = fixture.findAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the List<Counter> findAll(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindAll_3()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		int start = 1;
		int end = 1;

		List<Counter> result = fixture.findAll(start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the List<Counter> findAll(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindAll_4()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		int start = 1;
		int end = 1;

		List<Counter> result = fixture.findAll(start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the List<Counter> findAll(int,int,OrderByComparator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindAll_5()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		int start = 1;
		int end = 1;
		OrderByComparator orderByComparator = new ArticleCreateDateComparator();

		List<Counter> result = fixture.findAll(start, end, orderByComparator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the List<Counter> findAll(int,int,OrderByComparator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindAll_6()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		int start = 1;
		int end = 1;
		OrderByComparator orderByComparator = null;

		List<Counter> result = fixture.findAll(start, end, orderByComparator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the List<Counter> findAll(int,int,OrderByComparator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindAll_7()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		int start = 1;
		int end = 1;
		OrderByComparator orderByComparator = new ArticleCreateDateComparator();

		List<Counter> result = fixture.findAll(start, end, orderByComparator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter findByPrimaryKey(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindByPrimaryKey_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Serializable primaryKey = "";

		Counter result = fixture.findByPrimaryKey(primaryKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter findByPrimaryKey(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindByPrimaryKey_2()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Serializable primaryKey = "";

		Counter result = fixture.findByPrimaryKey(primaryKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter findByPrimaryKey(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindByPrimaryKey_3()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Serializable primaryKey = "";

		Counter result = fixture.findByPrimaryKey(primaryKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter findByPrimaryKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindByPrimaryKey_4()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		String name = "";

		Counter result = fixture.findByPrimaryKey(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter findByPrimaryKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindByPrimaryKey_5()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		String name = "";

		Counter result = fixture.findByPrimaryKey(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter findByPrimaryKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindByPrimaryKey_6()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		String name = "";

		Counter result = fixture.findByPrimaryKey(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter findByPrimaryKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testFindByPrimaryKey_7()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		String name = "";

		Counter result = fixture.findByPrimaryKey(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter remove(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Serializable primaryKey = "";

		Counter result = fixture.remove(primaryKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter remove(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Serializable primaryKey = "";

		Counter result = fixture.remove(primaryKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter remove(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Serializable primaryKey = "";

		Counter result = fixture.remove(primaryKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter remove(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		String name = "";

		Counter result = fixture.remove(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void removeAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testRemoveAll_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		fixture.removeAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void removeAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testRemoveAll_2()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		fixture.removeAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void removeAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testRemoveAll_3()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		fixture.removeAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void removeAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testRemoveAll_4()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		fixture.removeAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the void removeAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testRemoveAll_5()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();

		fixture.removeAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter removeImpl(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testRemoveImpl_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Counter counter = new CounterWrapper(new CounterImpl());

		Counter result = fixture.removeImpl(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter toUnwrappedModel(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testToUnwrappedModel_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Counter counter = new CounterWrapper(new CounterImpl());

		Counter result = fixture.toUnwrappedModel(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter toUnwrappedModel(Counter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testToUnwrappedModel_2()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Counter counter = new CounterWrapper(new CounterImpl());

		Counter result = fixture.toUnwrappedModel(counter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * Run the Counter updateImpl(Counter,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	@Test
	public void testUpdateImpl_1()
		throws Exception {
		CounterPersistenceImpl fixture = new CounterPersistenceImpl();
		fixture.userPersistence = new UserPersistenceImpl();
		fixture.counterPersistence = new CounterPersistenceImpl();
		fixture.resourcePersistence = new ResourcePersistenceImpl();
		Counter counter = new CounterWrapper(new CounterImpl());
		boolean merge = true;

		Counter result = fixture.updateImpl(counter, merge);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: com.liferay.counter.service.persistence.CounterPersistenceImpl
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
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
	 * @generatedBy CodePro at 11/27/17 12:58 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CounterPersistenceImplTest.class);
	}
}