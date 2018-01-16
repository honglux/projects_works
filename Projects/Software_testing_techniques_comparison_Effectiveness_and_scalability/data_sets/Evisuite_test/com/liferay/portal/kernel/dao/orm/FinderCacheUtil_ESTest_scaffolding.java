/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Dec 09 00:21:55 GMT 2017
 */

package com.liferay.portal.kernel.dao.orm;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class FinderCacheUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.liferay.portal.kernel.dao.orm.FinderCacheUtil"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FinderCacheUtil_ESTest_scaffolding.class.getClassLoader() ,
      "com.liferay.portal.model.UserModel",
      "com.liferay.portal.model.ClusterGroupModel",
      "com.liferay.portal.model.ResourceAction",
      "com.liferay.portal.model.EmailAddress",
      "com.liferay.portal.kernel.util.StringBundler",
      "com.liferay.portal.model.PortletPreferencesWrapper",
      "com.liferay.portal.model.OrgGroupRole",
      "com.liferay.portal.model.ColorScheme",
      "com.liferay.portal.model.ClusterGroup",
      "com.liferay.portal.kernel.cache.key.CacheKeyGeneratorUtil",
      "com.liferay.portal.model.MembershipRequestWrapper",
      "com.liferay.portal.kernel.log.LogFactory",
      "com.liferay.portal.model.UserGroupRoleModel",
      "com.liferay.portal.model.ShardWrapper",
      "com.liferay.portal.model.PasswordPolicyModel",
      "com.liferay.portal.model.LayoutModel",
      "com.liferay.portal.model.PortletPreferences",
      "com.liferay.portal.model.ResourceCodeWrapper",
      "com.liferay.portal.model.PermissionModel",
      "com.liferay.portal.model.User",
      "com.liferay.portal.model.ImageModel",
      "com.liferay.portal.model.Ticket",
      "com.liferay.portal.model.LayoutSetPrototypeModel",
      "com.liferay.portal.model.Release",
      "com.liferay.portal.kernel.dao.orm.FinderCacheUtil",
      "com.liferay.portal.model.WorkflowDefinitionLinkModel",
      "com.liferay.portal.kernel.util.GetterUtil",
      "com.liferay.portal.model.PasswordTracker",
      "com.liferay.portal.kernel.util.OrderByComparator",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "com.liferay.portal.model.GroupModel",
      "com.liferay.portal.model.AccountWrapper",
      "com.liferay.portal.model.CompanyModel",
      "com.liferay.portal.model.PasswordPolicyRelWrapper",
      "com.liferay.portal.model.UserTrackerPath",
      "com.liferay.portal.model.BrowserTrackerModel",
      "com.liferay.portal.kernel.dao.orm.SessionFactory",
      "com.liferay.portal.model.UserIdMapperWrapper",
      "com.liferay.portal.model.Subscription",
      "com.liferay.portal.kernel.cache.ThreadLocalCacheManager",
      "com.liferay.portal.model.ResourcePermissionModel",
      "com.liferay.portal.model.PortletItemModel",
      "com.liferay.portal.model.CompanyWrapper",
      "com.liferay.portal.model.ListType",
      "com.liferay.portal.kernel.dao.shard.ShardUtil",
      "com.liferay.portal.model.BaseModel",
      "com.liferay.portal.model.ClassName",
      "com.liferay.portal.model.WorkflowInstanceLink",
      "com.liferay.portal.model.Permission",
      "com.liferay.portal.model.UserGroupModel",
      "com.liferay.portal.model.Group",
      "com.liferay.portal.model.WebsiteWrapper",
      "com.liferay.portal.model.PasswordPolicyRelModel",
      "com.liferay.portal.model.PasswordTrackerModel",
      "com.liferay.portal.model.RoleWrapper",
      "com.liferay.portal.model.ResourceModel",
      "com.liferay.portal.model.LayoutPrototypeWrapper",
      "com.liferay.portal.model.ClassNameWrapper",
      "com.liferay.portal.model.EmailAddressWrapper",
      "com.liferay.portal.kernel.exception.PortalException",
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "com.liferay.portal.kernel.cache.ThreadLocalCache",
      "com.liferay.portal.model.MembershipRequest",
      "com.liferay.portal.model.ContactWrapper",
      "com.liferay.portal.model.TicketModel",
      "com.liferay.portal.model.Account",
      "com.liferay.portal.model.PasswordTrackerWrapper",
      "com.liferay.portal.model.OrgGroupRoleModel",
      "com.liferay.portal.model.TeamModel",
      "com.liferay.portal.model.ResourceCodeModel",
      "com.liferay.portal.model.LayoutSetModel",
      "com.liferay.portal.model.UserIdMapper",
      "com.liferay.portal.service.persistence.OrgGroupRolePK",
      "com.liferay.portal.model.UserTrackerModel",
      "com.liferay.portal.kernel.dao.orm.ORMException",
      "com.liferay.portal.model.RoleModel",
      "com.liferay.portal.model.UserGroup",
      "com.liferay.portal.model.Role",
      "com.liferay.portal.model.Layout",
      "com.liferay.portal.model.WorkflowInstanceLinkModel",
      "com.liferay.portal.model.ShardModel",
      "com.liferay.portal.kernel.log.Jdk14LogImpl",
      "com.liferay.portlet.expando.model.ExpandoBridge",
      "com.liferay.portal.model.UserGroupWrapper",
      "com.liferay.portal.model.MembershipRequestModel",
      "com.liferay.portal.model.UserIdMapperModel",
      "com.liferay.portal.model.UserTrackerWrapper",
      "com.liferay.portal.model.Theme",
      "com.liferay.portal.model.WebDAVPropsModel",
      "com.liferay.portal.model.UserGroupGroupRole",
      "com.liferay.portal.model.WebDAVProps",
      "com.liferay.portal.model.BrowserTracker",
      "com.liferay.portal.model.EmailAddressModel",
      "com.liferay.portal.model.Company",
      "com.liferay.portal.model.LockModel",
      "com.liferay.portal.model.Image",
      "com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator",
      "com.liferay.portal.model.ServiceComponentWrapper",
      "com.liferay.portal.model.PortletItem",
      "com.liferay.portal.model.PortletPreferencesIds",
      "com.liferay.portal.model.Shard",
      "com.liferay.portal.model.ResourceActionModel",
      "com.liferay.portal.model.Team",
      "com.liferay.portal.model.ResourceCode",
      "com.liferay.portal.model.PhoneModel",
      "com.liferay.portal.kernel.cache.key.CacheKeyGenerator",
      "com.liferay.portal.model.OrgGroupRoleWrapper",
      "com.liferay.portal.model.OrgLaborWrapper",
      "com.liferay.portal.kernel.dao.orm.Session",
      "com.liferay.portal.model.SubscriptionModel",
      "com.liferay.portal.model.WebDAVPropsWrapper",
      "com.liferay.portal.model.Region",
      "com.liferay.portal.model.WorkflowInstanceLinkWrapper",
      "com.liferay.portal.model.WorkflowDefinitionLink",
      "com.liferay.portal.model.PortletItemWrapper",
      "com.liferay.portal.service.persistence.UserGroupRolePK",
      "com.liferay.portal.model.LayoutPrototypeModel",
      "com.liferay.portal.model.ListTypeWrapper",
      "com.liferay.portal.model.ResourceActionWrapper",
      "com.liferay.portal.model.ImageWrapper",
      "com.liferay.portal.model.LayoutPrototype",
      "com.liferay.portal.model.RegionModel",
      "com.liferay.portal.model.LayoutSetWrapper",
      "com.liferay.portal.model.LayoutSetPrototypeWrapper",
      "com.liferay.portal.model.LockWrapper",
      "com.liferay.portal.model.Contact",
      "com.liferay.portal.model.WorkflowDefinitionLinkWrapper",
      "com.liferay.portal.model.AccountModel",
      "com.liferay.portal.kernel.util.UnicodeProperties",
      "com.liferay.portal.model.ServiceComponent",
      "com.liferay.portal.theme.ThemeDisplay",
      "com.liferay.portal.model.UserGroupGroupRoleModel",
      "com.liferay.portal.kernel.io.unsync.UnsyncStringReader",
      "com.liferay.portal.model.AddressWrapper",
      "com.liferay.portal.model.CountryModel",
      "com.liferay.portal.model.Resource",
      "com.liferay.portal.kernel.dao.orm.FinderPath",
      "com.liferay.portal.model.CountryWrapper",
      "com.liferay.portal.model.WebsiteModel",
      "com.liferay.portal.model.TeamWrapper",
      "com.liferay.portal.model.ResourceWrapper",
      "com.liferay.portal.model.UserTrackerPathModel",
      "com.liferay.portal.model.Lock",
      "com.liferay.portal.model.RegionWrapper",
      "com.liferay.portal.model.PluginSettingWrapper",
      "com.liferay.portal.model.UserGroupRole",
      "com.liferay.portal.model.UserTrackerPathWrapper",
      "com.liferay.portal.model.ClusterGroupWrapper",
      "com.liferay.portal.model.PluginSetting",
      "com.liferay.portal.kernel.cache.Lifecycle",
      "com.liferay.portal.model.ReleaseWrapper",
      "com.liferay.portal.service.ServiceContext",
      "com.liferay.portal.kernel.dao.orm.Dialect",
      "com.liferay.portal.model.PortletPreferencesModel",
      "com.liferay.portal.kernel.log.Log",
      "com.liferay.portal.model.PermissionWrapper",
      "com.liferay.portal.kernel.exception.SystemException",
      "com.liferay.portal.kernel.dao.orm.FinderCache",
      "com.liferay.portal.model.ServiceComponentModel",
      "com.liferay.portal.model.PasswordPolicy",
      "com.liferay.portal.model.Address",
      "com.liferay.portal.model.Plugin",
      "com.liferay.portal.kernel.dao.shard.Shard",
      "com.liferay.portal.model.ContactModel",
      "com.liferay.portal.kernel.log.LogWrapper",
      "com.liferay.portal.model.ResourcePermission",
      "com.liferay.portal.model.GroupWrapper",
      "com.liferay.portal.model.UserTracker",
      "com.liferay.portal.model.SubscriptionWrapper",
      "com.liferay.portal.model.UserGroupGroupRoleWrapper",
      "com.liferay.portal.service.persistence.UserGroupGroupRolePK",
      "com.liferay.portal.model.AddressModel",
      "com.liferay.portal.model.BrowserTrackerWrapper",
      "com.liferay.portal.model.ListTypeModel",
      "com.liferay.portal.model.LayoutSet",
      "com.liferay.portal.model.LayoutSetPrototype",
      "com.liferay.portal.model.UserWrapper",
      "com.liferay.portal.model.PhoneWrapper",
      "com.liferay.portal.kernel.exception.NestableException",
      "com.liferay.portal.model.PasswordPolicyRel",
      "com.liferay.portal.model.ResourcePermissionWrapper",
      "com.liferay.portal.model.Website",
      "com.liferay.portal.model.Country",
      "com.liferay.portal.kernel.util.InitialThreadLocal",
      "com.liferay.portal.model.OrgLaborModel",
      "com.liferay.portal.model.TicketWrapper",
      "com.liferay.portal.model.UserGroupRoleWrapper",
      "com.liferay.portal.model.ReleaseModel",
      "com.liferay.portal.model.Phone",
      "com.liferay.portal.model.ClassNameModel",
      "com.liferay.portal.model.PluginSettingModel",
      "com.liferay.portal.model.OrgLabor"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.liferay.portal.kernel.dao.orm.SessionFactory", false, FinderCacheUtil_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FinderCacheUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "com.liferay.portal.kernel.dao.orm.FinderCacheUtil",
      "com.liferay.portal.kernel.dao.orm.FinderPath",
      "com.liferay.portal.kernel.util.GetterUtil",
      "com.liferay.portal.kernel.util.StringBundler",
      "com.liferay.portal.kernel.dao.shard.ShardUtil",
      "com.liferay.portal.kernel.cache.key.CacheKeyGeneratorUtil",
      "com.liferay.portal.kernel.cache.Lifecycle",
      "com.liferay.portal.kernel.util.InitialThreadLocal",
      "com.liferay.portal.kernel.cache.ThreadLocalCacheManager",
      "com.liferay.portal.model.UserGroupRoleWrapper",
      "com.liferay.portal.model.EmailAddressWrapper",
      "com.liferay.portal.model.PasswordPolicyRelWrapper",
      "com.liferay.portal.model.AddressWrapper",
      "com.liferay.portal.model.CountryWrapper",
      "com.liferay.portal.model.UserIdMapperWrapper",
      "com.liferay.portal.model.LayoutSetPrototypeWrapper",
      "com.liferay.portal.model.LayoutSetWrapper",
      "com.liferay.portal.model.CompanyWrapper",
      "com.liferay.portal.model.AccountWrapper",
      "com.liferay.portal.model.PasswordTrackerWrapper",
      "com.liferay.portal.model.TeamWrapper",
      "com.liferay.portal.model.ResourceActionWrapper",
      "com.liferay.portal.model.PluginSettingWrapper",
      "com.liferay.portal.model.UserWrapper",
      "com.liferay.portal.model.UserTrackerWrapper",
      "com.liferay.portal.model.MembershipRequestWrapper",
      "com.liferay.portal.service.ServiceContext",
      "com.liferay.portal.model.LayoutPrototypeWrapper",
      "com.liferay.portal.model.LockWrapper",
      "com.liferay.portal.model.RegionWrapper",
      "com.liferay.portal.model.SubscriptionWrapper",
      "com.liferay.portal.kernel.util.OrderByComparator",
      "com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator",
      "com.liferay.portal.model.BrowserTrackerWrapper",
      "com.liferay.portal.model.OrgGroupRoleWrapper",
      "com.liferay.portal.model.ClassNameWrapper",
      "com.liferay.portal.model.PortletPreferencesWrapper",
      "com.liferay.portal.model.ContactWrapper",
      "com.liferay.portal.model.ResourcePermissionWrapper",
      "com.liferay.portal.model.ResourceCodeWrapper",
      "com.liferay.portal.model.UserGroupWrapper",
      "com.liferay.portal.model.ImageWrapper",
      "com.liferay.portal.model.OrgLaborWrapper",
      "com.liferay.portal.model.ServiceComponentWrapper",
      "com.liferay.portal.model.WebsiteWrapper",
      "com.liferay.portal.model.ReleaseWrapper",
      "com.liferay.portal.model.PermissionWrapper",
      "com.liferay.portal.model.GroupWrapper",
      "com.liferay.portal.model.WorkflowDefinitionLinkWrapper",
      "com.liferay.portal.model.TicketWrapper",
      "com.liferay.portal.model.WorkflowInstanceLinkWrapper",
      "com.liferay.portal.model.ListTypeWrapper",
      "com.liferay.portal.model.ShardWrapper",
      "com.liferay.portal.model.PortletItemWrapper",
      "com.liferay.portal.model.RoleWrapper",
      "com.liferay.portal.model.UserTrackerPathWrapper",
      "com.liferay.portal.model.ResourceWrapper",
      "com.liferay.portal.model.WebDAVPropsWrapper",
      "com.liferay.portal.model.PhoneWrapper",
      "com.liferay.portal.model.UserGroupGroupRoleWrapper",
      "com.liferay.portal.model.ClusterGroupWrapper"
    );
  }
}