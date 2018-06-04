// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/scan_config.proto

package com.google.cloud.websecurityscanner.v1alpha;

public final class ScanConfigProto {
  private ScanConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_GoogleAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_GoogleAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_CustomAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_CustomAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Schedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Schedule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/websecurityscanner/v1alph" +
      "a/scan_config.proto\022\'google.cloud.websec" +
      "urityscanner.v1alpha\032\034google/api/annotat" +
      "ions.proto\032\037google/protobuf/timestamp.pr" +
      "oto\"\334\010\n\nScanConfig\022\014\n\004name\030\001 \001(\t\022\024\n\014disp" +
      "lay_name\030\002 \001(\t\022\017\n\007max_qps\030\003 \001(\005\022\025\n\rstart" +
      "ing_urls\030\004 \003(\t\022Z\n\016authentication\030\005 \001(\0132B" +
      ".google.cloud.websecurityscanner.v1alpha" +
      ".ScanConfig.Authentication\022Q\n\nuser_agent" +
      "\030\006 \001(\0162=.google.cloud.websecurityscanner",
      ".v1alpha.ScanConfig.UserAgent\022\032\n\022blackli" +
      "st_patterns\030\007 \003(\t\022N\n\010schedule\030\010 \001(\0132<.go" +
      "ogle.cloud.websecurityscanner.v1alpha.Sc" +
      "anConfig.Schedule\022\\\n\020target_platforms\030\t " +
      "\003(\0162B.google.cloud.websecurityscanner.v1" +
      "alpha.ScanConfig.TargetPlatform\032\367\002\n\016Auth" +
      "entication\022j\n\016google_account\030\001 \001(\0132P.goo" +
      "gle.cloud.websecurityscanner.v1alpha.Sca" +
      "nConfig.Authentication.GoogleAccountH\000\022j" +
      "\n\016custom_account\030\002 \001(\0132P.google.cloud.we",
      "bsecurityscanner.v1alpha.ScanConfig.Auth" +
      "entication.CustomAccountH\000\0323\n\rGoogleAcco" +
      "unt\022\020\n\010username\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\032" +
      "F\n\rCustomAccount\022\020\n\010username\030\001 \001(\t\022\020\n\010pa" +
      "ssword\030\002 \001(\t\022\021\n\tlogin_url\030\003 \001(\tB\020\n\016authe" +
      "ntication\032]\n\010Schedule\0221\n\rschedule_time\030\001" +
      " \001(\0132\032.google.protobuf.Timestamp\022\036\n\026inte" +
      "rval_duration_days\030\002 \001(\005\"`\n\tUserAgent\022\032\n" +
      "\026USER_AGENT_UNSPECIFIED\020\000\022\020\n\014CHROME_LINU" +
      "X\020\001\022\022\n\016CHROME_ANDROID\020\002\022\021\n\rSAFARI_IPHONE",
      "\020\003\"N\n\016TargetPlatform\022\037\n\033TARGET_PLATFORM_" +
      "UNSPECIFIED\020\000\022\016\n\nAPP_ENGINE\020\001\022\013\n\007COMPUTE" +
      "\020\002B\233\001\n+com.google.cloud.websecurityscann" +
      "er.v1alphaB\017ScanConfigProtoP\001ZYgoogle.go" +
      "lang.org/genproto/googleapis/cloud/webse" +
      "curityscanner/v1alpha;websecurityscanner" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "MaxQps", "StartingUrls", "Authentication", "UserAgent", "BlacklistPatterns", "Schedule", "TargetPlatforms", });
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_descriptor =
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_descriptor,
        new java.lang.String[] { "GoogleAccount", "CustomAccount", "Authentication", });
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_GoogleAccount_descriptor =
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_GoogleAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_GoogleAccount_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_CustomAccount_descriptor =
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_CustomAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_CustomAccount_descriptor,
        new java.lang.String[] { "Username", "Password", "LoginUrl", });
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Schedule_descriptor =
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Schedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Schedule_descriptor,
        new java.lang.String[] { "ScheduleTime", "IntervalDurationDays", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}