/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 15:44:32 GMT 2018
 */

package uk.ac.sanger.artemis.j2ssh;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SshLogin_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.j2ssh.SshLogin"; 
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
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/London"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SshLogin_ESTest_scaffolding.class.getClassLoader() ,
      "com.sshtools.j2ssh.authentication.SshMsgUserAuthRequest",
      "com.sshtools.j2ssh.connection.SshMsgChannelFailure",
      "com.sshtools.j2ssh.connection.SshMsgChannelSuccess",
      "com.sshtools.j2ssh.connection.SshMsgChannelData",
      "com.sshtools.j2ssh.util.ExtensionClassLoader",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.or.RendererMap",
      "com.sshtools.j2ssh.transport.Service",
      "com.sshtools.j2ssh.connection.SshMsgRequestSuccess",
      "com.sshtools.j2ssh.connection.SshMsgRequestFailure",
      "com.sshtools.j2ssh.sftp.SshFxpStat",
      "com.sshtools.j2ssh.transport.hmac.HmacSha",
      "com.sshtools.j2ssh.configuration.ConfigurationLoader$1",
      "org.apache.log4j.Level",
      "com.sshtools.j2ssh.sftp.SshFxpRmdir",
      "com.sshtools.j2ssh.authentication.PasswordAuthenticationClient",
      "com.sshtools.j2ssh.transport.compression.SshCompressionFactory",
      "com.sshtools.j2ssh.sftp.SshFxpOpenDir",
      "com.sshtools.j2ssh.transport.kex.SshMsgKexDhReply",
      "com.sshtools.j2ssh.authentication.PasswordChangePrompt",
      "com.sshtools.j2ssh.authentication.TerminatedStateException",
      "com.sshtools.j2ssh.SshClient",
      "com.sshtools.j2ssh.transport.AlgorithmNotSupportedException",
      "com.sshtools.j2ssh.connection.ChannelFactory",
      "com.sshtools.j2ssh.sftp.SftpSubsystemClient",
      "com.sshtools.j2ssh.util.InvalidStateException",
      "com.sshtools.j2ssh.transport.cipher.TripleDesCbc",
      "com.sshtools.j2ssh.transport.compression.SshCompression",
      "com.sshtools.j2ssh.connection.ConnectionProtocol",
      "com.sshtools.j2ssh.transport.publickey.dsa.SshDssKeyPair",
      "com.sshtools.j2ssh.connection.SshMsgChannelEOF",
      "com.sshtools.j2ssh.connection.SshMsgChannelOpenConfirmation",
      "com.sshtools.j2ssh.transport.kex.DhGroup1Sha1",
      "com.sshtools.j2ssh.forwarding.ForwardingChannel",
      "org.apache.log4j.CategoryKey",
      "com.sshtools.j2ssh.sftp.SshFxpSetStat",
      "com.sshtools.j2ssh.transport.publickey.rsa.SshRsaPrivateKey",
      "com.sshtools.j2ssh.transport.hmac.HmacMd5",
      "com.sshtools.j2ssh.sftp.SshFxpFSetStat",
      "com.sshtools.j2ssh.sftp.SshFxpRemove",
      "com.sshtools.j2ssh.forwarding.ForwardingConfigurationException",
      "com.sshtools.j2ssh.connection.SshMsgChannelExtendedData",
      "com.sshtools.j2ssh.transport.publickey.InvalidSshKeySignatureException",
      "com.sshtools.j2ssh.sftp.SshFxpReadlink",
      "com.sshtools.j2ssh.transport.AsyncService",
      "com.sshtools.j2ssh.transport.cipher.SshCipherFactory",
      "com.sshtools.j2ssh.transport.publickey.SshKeyPair",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "org.apache.log4j.helpers.Loader",
      "com.sshtools.j2ssh.connection.ChannelEventAdapter",
      "org.apache.log4j.ProvisionNode",
      "com.sshtools.j2ssh.TransferCancelledException",
      "com.sshtools.j2ssh.authentication.SshAuthenticationClient",
      "org.apache.log4j.Hierarchy",
      "com.sshtools.j2ssh.connection.SshMsgChannelOpenFailure",
      "org.apache.log4j.helpers.FileWatchdog",
      "com.sshtools.j2ssh.util.ExtensionClassLoader$ResourceEnumeration",
      "com.sshtools.j2ssh.transport.publickey.InvalidSshKeyException",
      "com.sshtools.j2ssh.transport.MessageStoreEOFException",
      "com.sshtools.j2ssh.SshThread",
      "com.sshtools.j2ssh.net.TransportProvider",
      "com.sshtools.j2ssh.connection.Channel",
      "com.sshtools.j2ssh.sftp.MessageRequestId",
      "com.sshtools.j2ssh.SshClient$ActiveChannelEventListener",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "com.sshtools.j2ssh.transport.kex.KeyExchangeException",
      "com.sshtools.j2ssh.transport.publickey.SshPrivateKey",
      "org.apache.log4j.spi.RootLogger",
      "com.sshtools.j2ssh.connection.ChannelOutputStream",
      "com.sshtools.j2ssh.forwarding.ForwardingClient$ClientForwardingListener",
      "com.sshtools.j2ssh.sftp.SshFxpReadDir",
      "com.sshtools.j2ssh.sftp.SshFxpSymlink",
      "com.sshtools.j2ssh.transport.HostKeyVerification",
      "com.sshtools.j2ssh.transport.IgnoreHostKeyVerification",
      "com.sshtools.j2ssh.transport.kex.SshMsgKexDhInit",
      "org.apache.log4j.spi.RendererSupport",
      "com.sshtools.j2ssh.connection.SshMsgChannelRequest",
      "com.sshtools.j2ssh.connection.ChannelEventListener",
      "com.sshtools.j2ssh.connection.SshMsgChannelClose",
      "com.sshtools.j2ssh.transport.AlgorithmOperationException",
      "org.apache.log4j.helpers.OptionConverter",
      "com.sshtools.j2ssh.ScpClient",
      "com.sshtools.j2ssh.ScpClient$ScpChannel",
      "com.sshtools.j2ssh.transport.kex.SshKeyExchange",
      "org.apache.log4j.or.ObjectRenderer",
      "com.sshtools.j2ssh.forwarding.ForwardingSocketChannel",
      "org.apache.log4j.Logger",
      "com.sshtools.j2ssh.subsystem.SubsystemMessage",
      "com.sshtools.j2ssh.configuration.ConfigurationException",
      "com.sshtools.j2ssh.transport.InvalidMessageException",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolListener",
      "org.apache.log4j.helpers.LogLog",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolClient",
      "com.sshtools.j2ssh.configuration.SshAPIConfiguration",
      "org.apache.log4j.Category",
      "com.sshtools.j2ssh.transport.hmac.HmacMd596",
      "com.sshtools.j2ssh.transport.publickey.SshPublicKey",
      "com.sshtools.j2ssh.util.ExtensionClassLoader$ClassCacheEntry",
      "com.sshtools.j2ssh.connection.InvalidChannelException",
      "com.sshtools.j2ssh.SshEventAdapter",
      "com.sshtools.j2ssh.transport.hmac.SshHmac",
      "com.sshtools.j2ssh.sftp.SftpFileOutputStream",
      "com.sshtools.j2ssh.sftp.SshFxpClose",
      "org.apache.log4j.spi.RepositorySelector",
      "com.sshtools.j2ssh.subsystem.SubsystemChannel",
      "com.sshtools.j2ssh.transport.MessageNotAvailableException",
      "com.sshtools.j2ssh.transport.TransportProtocolEventHandler",
      "com.sshtools.j2ssh.configuration.ConfigurationLoader$DefaultConfigurationContext",
      "com.sshtools.j2ssh.forwarding.ForwardingConfiguration",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "com.sshtools.j2ssh.transport.SshMessage",
      "com.sshtools.j2ssh.transport.kex.SshKeyExchangeFactory",
      "com.sshtools.j2ssh.transport.publickey.rsa.SshRsaKeyPair",
      "com.sshtools.j2ssh.transport.AlgorithmInitializationException",
      "org.apache.log4j.or.DefaultRenderer",
      "com.sshtools.j2ssh.transport.publickey.rsa.SshRsaPublicKey",
      "com.sshtools.j2ssh.util.State",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "com.sshtools.j2ssh.configuration.ConfigurationLoader",
      "org.apache.log4j.PropertyWatchdog",
      "com.sshtools.j2ssh.transport.TransportProtocolState",
      "com.sshtools.j2ssh.net.SocketTransportProvider",
      "org.apache.log4j.PropertyConfigurator",
      "com.sshtools.j2ssh.forwarding.ForwardingListener",
      "com.sshtools.j2ssh.connection.ChannelInputStream",
      "org.apache.commons.logging.impl.Log4JLogger",
      "com.sshtools.j2ssh.transport.publickey.dsa.SshDssPublicKey",
      "org.apache.log4j.Appender",
      "com.sshtools.j2ssh.transport.hmac.HmacSha96",
      "com.sshtools.j2ssh.transport.cipher.SshCipher",
      "com.sshtools.j2ssh.sftp.SshFxpWrite",
      "com.sshtools.j2ssh.transport.cipher.BlowfishCbc",
      "com.sshtools.j2ssh.transport.SshMsgServiceAccept",
      "com.sshtools.j2ssh.transport.publickey.dsa.SshDssPrivateKey",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolException",
      "com.sshtools.j2ssh.forwarding.ForwardingClient",
      "com.sshtools.j2ssh.configuration.SshConnectionProperties",
      "org.apache.log4j.spi.AppenderAttachable",
      "com.sshtools.j2ssh.SshException",
      "org.apache.log4j.spi.LoggingEvent",
      "com.sshtools.j2ssh.session.SessionChannelClient",
      "com.sshtools.j2ssh.SftpClient",
      "com.sshtools.j2ssh.connection.SshMsgChannelWindowAdjust",
      "com.sshtools.j2ssh.SshRuntimeException",
      "com.sshtools.j2ssh.connection.SshMsgGlobalRequest",
      "com.sshtools.j2ssh.sftp.SshFxpRename",
      "com.sshtools.j2ssh.transport.hmac.SshHmacFactory",
      "org.apache.log4j.Priority",
      "com.sshtools.j2ssh.net.TransportProviderFactory",
      "com.sshtools.j2ssh.connection.IOChannel",
      "com.sshtools.j2ssh.connection.SocketChannel",
      "org.apache.log4j.spi.LoggerRepository",
      "com.sshtools.j2ssh.transport.TransportProtocolException",
      "org.apache.log4j.LogManager",
      "com.sshtools.j2ssh.transport.publickey.SshKeyPairFactory",
      "com.sshtools.j2ssh.configuration.ConfigurationContext",
      "com.sshtools.j2ssh.ScpClient$ScpInputStream",
      "com.sshtools.j2ssh.sftp.SftpFileInputStream"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SshLogin_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "com.sshtools.j2ssh.authentication.PasswordAuthenticationClient",
      "com.sshtools.j2ssh.SshClient",
      "com.sshtools.j2ssh.configuration.SshConnectionProperties",
      "com.sshtools.j2ssh.transport.cipher.SshCipher",
      "com.sshtools.j2ssh.transport.cipher.TripleDesCbc",
      "com.sshtools.j2ssh.transport.cipher.BlowfishCbc",
      "com.sshtools.j2ssh.configuration.ConfigurationLoader",
      "com.sshtools.j2ssh.transport.cipher.SshCipherFactory",
      "com.sshtools.j2ssh.transport.kex.DhGroup1Sha1",
      "com.sshtools.j2ssh.util.ExtensionClassLoader",
      "com.sshtools.j2ssh.transport.kex.SshKeyExchangeFactory",
      "com.sshtools.j2ssh.transport.publickey.SshKeyPairFactory",
      "com.sshtools.j2ssh.transport.compression.SshCompressionFactory",
      "com.sshtools.j2ssh.transport.hmac.HmacSha",
      "com.sshtools.j2ssh.transport.hmac.SshHmacFactory"
    );
  }
}
