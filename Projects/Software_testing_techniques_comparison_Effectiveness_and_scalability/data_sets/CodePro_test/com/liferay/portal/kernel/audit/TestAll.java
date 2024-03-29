package com.liferay.portal.kernel.audit;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 12/5/17 1:01 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	AuditRequestThreadLocalTest.class,
	AuditMessageFactoryUtilTest.class,
	AuditRouterUtilTest.class,
	AuditMessageTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 12/5/17 1:01 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
