// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logging/Logging.proto

package org.apache.skywalking.apm.network.logging.v3;

public final class Logging {
  private Logging() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_LogData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_LogData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_LogDataBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_LogDataBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_TextLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_TextLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_JSONLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_JSONLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_YAMLLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_YAMLLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_TraceContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_TraceContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_LogTags_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_LogTags_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025logging/Logging.proto\022\rskywalking.v3\032\023" +
      "common/Common.proto\"\333\001\n\007LogData\022\021\n\ttimes" +
      "tamp\030\001 \001(\003\022\017\n\007service\030\002 \001(\t\022\027\n\017serviceIn" +
      "stance\030\003 \001(\t\022\020\n\010endpoint\030\004 \001(\t\022(\n\004body\030\005" +
      " \001(\0132\032.skywalking.v3.LogDataBody\0221\n\014trac" +
      "eContext\030\006 \001(\0132\033.skywalking.v3.TraceCont" +
      "ext\022$\n\004tags\030\007 \001(\0132\026.skywalking.v3.LogTag" +
      "s\"\236\001\n\013LogDataBody\022\014\n\004type\030\001 \001(\t\022&\n\004text\030" +
      "\002 \001(\0132\026.skywalking.v3.TextLogH\000\022&\n\004json\030" +
      "\003 \001(\0132\026.skywalking.v3.JSONLogH\000\022&\n\004yaml\030" +
      "\004 \001(\0132\026.skywalking.v3.YAMLLogH\000B\t\n\007conte" +
      "nt\"\027\n\007TextLog\022\014\n\004text\030\001 \001(\t\"\027\n\007JSONLog\022\014" +
      "\n\004json\030\001 \001(\t\"\027\n\007YAMLLog\022\014\n\004yaml\030\001 \001(\t\"G\n" +
      "\014TraceContext\022\017\n\007traceId\030\001 \001(\t\022\026\n\016traceS" +
      "egmentId\030\002 \001(\t\022\016\n\006spanId\030\003 \001(\005\":\n\007LogTag" +
      "s\022/\n\004data\030\001 \003(\0132!.skywalking.v3.KeyStrin" +
      "gValuePair2R\n\020LogReportService\022>\n\007collec" +
      "t\022\026.skywalking.v3.LogData\032\027.skywalking.v" +
      "3.Commands\"\000(\001B\205\001\n,org.apache.skywalking" +
      ".apm.network.logging.v3P\001Z3skywalking.ap" +
      "ache.org/repo/goapi/collect/logging/v3\252\002" +
      "\035SkyWalking.NetworkProtocol.V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.Common.getDescriptor(),
        });
    internal_static_skywalking_v3_LogData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_skywalking_v3_LogData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_LogData_descriptor,
        new java.lang.String[] { "Timestamp", "Service", "ServiceInstance", "Endpoint", "Body", "TraceContext", "Tags", });
    internal_static_skywalking_v3_LogDataBody_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_skywalking_v3_LogDataBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_LogDataBody_descriptor,
        new java.lang.String[] { "Type", "Text", "Json", "Yaml", "Content", });
    internal_static_skywalking_v3_TextLog_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_skywalking_v3_TextLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_TextLog_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_skywalking_v3_JSONLog_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_skywalking_v3_JSONLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_JSONLog_descriptor,
        new java.lang.String[] { "Json", });
    internal_static_skywalking_v3_YAMLLog_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_skywalking_v3_YAMLLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_YAMLLog_descriptor,
        new java.lang.String[] { "Yaml", });
    internal_static_skywalking_v3_TraceContext_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_skywalking_v3_TraceContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_TraceContext_descriptor,
        new java.lang.String[] { "TraceId", "TraceSegmentId", "SpanId", });
    internal_static_skywalking_v3_LogTags_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_skywalking_v3_LogTags_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_LogTags_descriptor,
        new java.lang.String[] { "Data", });
    org.apache.skywalking.apm.network.common.v3.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
