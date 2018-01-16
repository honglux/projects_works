package com.liferay.documentlibrary.util;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 11/27/17 1:04 PM
 * @author miyu3
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	HookFactoryTest.class,
	HookProxyImplTest.class,
	CMISHookTest.class,
	AdvancedFileSystemHookTest.class,
	SafeFileNameHookWrapperTest.class,
	FileSystemHookTest.class,
	DLIndexerTest.class,
	HookProxyBeanTest.class,
	JCRHookTest.class,
	S3HookTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/27/17 1:04 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
