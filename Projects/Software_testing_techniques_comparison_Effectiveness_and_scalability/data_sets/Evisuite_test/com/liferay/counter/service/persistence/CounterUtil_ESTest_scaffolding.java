/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Dec 08 22:33:28 GMT 2017
 */

package com.liferay.counter.service.persistence;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class CounterUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.liferay.counter.service.persistence.CounterUtil"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CounterUtil_ESTest_scaffolding.class.getClassLoader() ,
      "com.liferay.portal.kernel.dao.orm.Criterion",
      "com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator",
      "com.liferay.counter.service.persistence.CounterUtil",
      "com.liferay.counter.service.persistence.CounterPersistence",
      "com.liferay.counter.model.CounterModel",
      "com.liferay.portal.service.ServiceContext",
      "com.liferay.portal.model.PortletPreferencesIds",
      "com.liferay.counter.NoSuchCounterException",
      "com.liferay.portal.kernel.bean.BeanLocator",
      "com.liferay.portal.kernel.log.Log",
      "com.liferay.portal.kernel.exception.PortalException",
      "com.liferay.portal.kernel.exception.SystemException",
      "com.liferay.portal.kernel.dao.orm.Session",
      "com.liferay.portal.kernel.dao.orm.Projection",
      "com.liferay.portal.kernel.log.LogFactory",
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "com.liferay.portal.kernel.dao.orm.Order",
      "com.liferay.portal.kernel.log.LogWrapper",
      "com.liferay.portal.kernel.bean.BeanLocatorException",
      "com.liferay.portal.kernel.util.OrderByComparator",
      "com.liferay.counter.model.CounterWrapper",
      "com.liferay.portal.kernel.bean.BeanPropertiesUtil",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "com.liferay.portal.kernel.dao.orm.DynamicQuery",
      "com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator",
      "com.liferay.portal.NoSuchModelException",
      "com.liferay.portal.kernel.util.Validator",
      "com.liferay.portal.kernel.exception.NestableException",
      "com.liferay.portal.service.persistence.BasePersistence",
      "com.liferay.portal.kernel.log.Jdk14LogImpl",
      "com.liferay.portlet.expando.model.ExpandoBridge",
      "com.liferay.portal.kernel.util.MethodKey",
      "com.liferay.portal.kernel.bean.PortalBeanLocatorUtil",
      "com.liferay.portal.model.BaseModel",
      "com.liferay.counter.model.Counter",
      "com.liferay.portal.model.ModelListener"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.liferay.portal.kernel.dao.orm.DynamicQuery", false, CounterUtil_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CounterUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.liferay.counter.service.persistence.CounterUtil",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "com.liferay.portal.kernel.bean.PortalBeanLocatorUtil",
      "com.liferay.portal.kernel.bean.BeanLocatorException",
      "com.liferay.portal.service.ServiceContext",
      "com.liferay.portal.kernel.util.OrderByComparator",
      "com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator",
      "com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator",
      "com.liferay.counter.model.CounterWrapper",
      "com.liferay.portal.kernel.bean.BeanPropertiesUtil",
      "com.liferay.portal.kernel.util.MethodKey",
      "com.liferay.portal.kernel.util.Validator",
      "com.liferay.portal.model.PortletPreferencesIds"
    );
  }
}
