// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: profile/ProfileCompat.proto

package org.apache.skywalking.apm.network.language.profile.v3.compat;

@java.lang.Deprecated public final class ProfileCompat {
  private ProfileCompat() {}
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
      "\n\033profile/ProfileCompat.proto\032\023common/Co" +
      "mmon.proto\032\025profile/Profile.proto2\220\002\n\013Pr" +
      "ofileTask\022[\n\026getProfileTaskCommands\022&.sk" +
      "ywalking.v3.ProfileTaskCommandQuery\032\027.sk" +
      "ywalking.v3.Commands\"\000\022M\n\017collectSnapsho" +
      "t\022\035.skywalking.v3.ThreadSnapshot\032\027.skywa" +
      "lking.v3.Commands\"\000(\001\022U\n\020reportTaskFinis" +
      "h\022&.skywalking.v3.ProfileTaskFinishRepor" +
      "t\032\027.skywalking.v3.Commands\"\000B\241\001\n<org.apa" +
      "che.skywalking.apm.network.language.prof" +
      "ile.v3.compatP\001Z<skywalking.apache.org/r" +
      "epo/goapi/collect/language/profile/v3\270\001\001" +
      "\252\002\035SkyWalking.NetworkProtocol.V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.Common.getDescriptor(),
          org.apache.skywalking.apm.network.language.profile.v3.Profile.getDescriptor(),
        });
    org.apache.skywalking.apm.network.common.v3.Common.getDescriptor();
    org.apache.skywalking.apm.network.language.profile.v3.Profile.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}