// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LightSensorService.proto

package com.akpan.light;

public final class LightSensorServiceProto {
  private LightSensorServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akpan_light_LightControlRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akpan_light_LightControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akpan_light_LightControlData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akpan_light_LightControlData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akpan_light_ToggleLightRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akpan_light_ToggleLightRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030LightSensorService.proto\022\017com.akpan.li" +
      "ght\"&\n\023LightControlRequest\022\017\n\007command\030\001 " +
      "\001(\t\"=\n\020LightControlData\022\024\n\014light_status\030" +
      "\001 \001(\010\022\023\n\013time_of_day\030\002 \001(\t\"\'\n\022ToggleLigh" +
      "tRequest\022\021\n\ttoggle_on\030\001 \001(\0102\314\001\n\023LightCon" +
      "trolService\022^\n\021StreamTemperature\022$.com.a" +
      "kpan.light.LightControlRequest\032!.com.akp" +
      "an.light.LightControlData0\001\022U\n\013ToggleLig" +
      "ht\022#.com.akpan.light.ToggleLightRequest\032" +
      "!.com.akpan.light.LightControlDataB,\n\017co" +
      "m.akpan.lightB\027LightSensorServiceProtoP\001" +
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
        }, assigner);
    internal_static_com_akpan_light_LightControlRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_akpan_light_LightControlRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akpan_light_LightControlRequest_descriptor,
        new java.lang.String[] { "Command", });
    internal_static_com_akpan_light_LightControlData_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_akpan_light_LightControlData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akpan_light_LightControlData_descriptor,
        new java.lang.String[] { "LightStatus", "TimeOfDay", });
    internal_static_com_akpan_light_ToggleLightRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_akpan_light_ToggleLightRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akpan_light_ToggleLightRequest_descriptor,
        new java.lang.String[] { "ToggleOn", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
