// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/BrowserPerfCompat.proto

package org.apache.skywalking.apm.network.language.agent.v3.compat;

@java.lang.Deprecated public final class BrowserPerfCompat {
  private BrowserPerfCompat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037browser/BrowserPerfCompat.proto\032\023commo" +
      "n/Common.proto\032\031browser/BrowserPerf.prot" +
      "o2\263\001\n\022BrowserPerfService\022L\n\017collectPerfD" +
      "ata\022\036.skywalking.v3.BrowserPerfData\032\027.sk" +
      "ywalking.v3.Commands\"\000\022O\n\020collectErrorLo" +
      "gs\022\036.skywalking.v3.BrowserErrorLog\032\027.sky" +
      "walking.v3.Commands\"\000(\001B\235\001\n:org.apache.s" +
      "kywalking.apm.network.language.agent.v3." +
      "compatP\001Z:skywalking.apache.org/repo/goa" +
      "pi/collect/language/agent/v3\270\001\001\252\002\035SkyWal" +
      "king.NetworkProtocol.V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.Common.getDescriptor(),
          org.apache.skywalking.apm.network.language.agent.v3.BrowserPerf.getDescriptor(),
        });
    org.apache.skywalking.apm.network.common.v3.Common.getDescriptor();
    org.apache.skywalking.apm.network.language.agent.v3.BrowserPerf.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
