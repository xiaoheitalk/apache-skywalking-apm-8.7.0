// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/JVMMetricCompat.proto

package org.apache.skywalking.apm.network.language.agent.v3.compat;

@java.lang.Deprecated public final class JVMMetricCompat {
  private JVMMetricCompat() {}
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
      "\n$language-agent/JVMMetricCompat.proto\032\023" +
      "common/Common.proto\032\036language-agent/JVMM" +
      "etric.proto2b\n\026JVMMetricReportService\022H\n" +
      "\007collect\022\".skywalking.v3.JVMMetricCollec" +
      "tion\032\027.skywalking.v3.Commands\"\000B\235\001\n:org." +
      "apache.skywalking.apm.network.language.a" +
      "gent.v3.compatP\001Z:skywalking.apache.org/" +
      "repo/goapi/collect/language/agent/v3\270\001\001\252" +
      "\002\035SkyWalking.NetworkProtocol.V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.Common.getDescriptor(),
          org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.getDescriptor(),
        });
    org.apache.skywalking.apm.network.common.v3.Common.getDescriptor();
    org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
