// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TemperatureSensorService.proto

package com.akpan.temperature;

public final class TemperatureSensorServiceProto {
  private TemperatureSensorServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akpan_temperature_TemperatureRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akpan_temperature_TemperatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akpan_temperature_TemperatureData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akpan_temperature_TemperatureData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036TemperatureSensorService.proto\022\025com.ak" +
      "pan.temperature\"\024\n\022TemperatureRequest\"L\n" +
      "\017TemperatureData\022\021\n\tsensor_id\030\001 \001(\t\022\023\n\013t" +
      "emperature\030\002 \001(\001\022\021\n\ttimestamp\030\003 \001(\t2\205\001\n\031" +
      "TemperatureControlService\022h\n\021StreamTempe" +
      "rature\022).com.akpan.temperature.Temperatu" +
      "reRequest\032&.com.akpan.temperature.Temper" +
      "atureData0\001B8\n\025com.akpan.temperatureB\035Te" +
      "mperatureSensorServiceProtoP\001b\006proto3"
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
    internal_static_com_akpan_temperature_TemperatureRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_akpan_temperature_TemperatureRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akpan_temperature_TemperatureRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_akpan_temperature_TemperatureData_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_akpan_temperature_TemperatureData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akpan_temperature_TemperatureData_descriptor,
        new java.lang.String[] { "SensorId", "Temperature", "Timestamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
