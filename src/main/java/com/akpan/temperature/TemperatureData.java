// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TemperatureSensorService.proto

package com.akpan.temperature;

/**
 * Protobuf type {@code com.akpan.temperature.TemperatureData}
 */
public  final class TemperatureData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.akpan.temperature.TemperatureData)
    TemperatureDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TemperatureData.newBuilder() to construct.
  private TemperatureData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TemperatureData() {
    sensorId_ = "";
    temperature_ = 0D;
    timestamp_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TemperatureData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sensorId_ = s;
            break;
          }
          case 17: {

            temperature_ = input.readDouble();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            timestamp_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akpan.temperature.TemperatureSensorServiceProto.internal_static_com_akpan_temperature_TemperatureData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akpan.temperature.TemperatureSensorServiceProto.internal_static_com_akpan_temperature_TemperatureData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akpan.temperature.TemperatureData.class, com.akpan.temperature.TemperatureData.Builder.class);
  }

  public static final int SENSOR_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object sensorId_;
  /**
   * <code>string sensor_id = 1;</code>
   */
  public java.lang.String getSensorId() {
    java.lang.Object ref = sensorId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sensorId_ = s;
      return s;
    }
  }
  /**
   * <code>string sensor_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSensorIdBytes() {
    java.lang.Object ref = sensorId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sensorId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEMPERATURE_FIELD_NUMBER = 2;
  private double temperature_;
  /**
   * <code>double temperature = 2;</code>
   */
  public double getTemperature() {
    return temperature_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private volatile java.lang.Object timestamp_;
  /**
   * <code>string timestamp = 3;</code>
   */
  public java.lang.String getTimestamp() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timestamp_ = s;
      return s;
    }
  }
  /**
   * <code>string timestamp = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTimestampBytes() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timestamp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSensorIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sensorId_);
    }
    if (temperature_ != 0D) {
      output.writeDouble(2, temperature_);
    }
    if (!getTimestampBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSensorIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sensorId_);
    }
    if (temperature_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, temperature_);
    }
    if (!getTimestampBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, timestamp_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.akpan.temperature.TemperatureData)) {
      return super.equals(obj);
    }
    com.akpan.temperature.TemperatureData other = (com.akpan.temperature.TemperatureData) obj;

    boolean result = true;
    result = result && getSensorId()
        .equals(other.getSensorId());
    result = result && (
        java.lang.Double.doubleToLongBits(getTemperature())
        == java.lang.Double.doubleToLongBits(
            other.getTemperature()));
    result = result && getTimestamp()
        .equals(other.getTimestamp());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SENSOR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSensorId().hashCode();
    hash = (37 * hash) + TEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTemperature()));
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akpan.temperature.TemperatureData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akpan.temperature.TemperatureData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akpan.temperature.TemperatureData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akpan.temperature.TemperatureData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akpan.temperature.TemperatureData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akpan.temperature.TemperatureData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akpan.temperature.TemperatureData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akpan.temperature.TemperatureData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akpan.temperature.TemperatureData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.akpan.temperature.TemperatureData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akpan.temperature.TemperatureData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akpan.temperature.TemperatureData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.akpan.temperature.TemperatureData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.akpan.temperature.TemperatureData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.akpan.temperature.TemperatureData)
      com.akpan.temperature.TemperatureDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akpan.temperature.TemperatureSensorServiceProto.internal_static_com_akpan_temperature_TemperatureData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akpan.temperature.TemperatureSensorServiceProto.internal_static_com_akpan_temperature_TemperatureData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akpan.temperature.TemperatureData.class, com.akpan.temperature.TemperatureData.Builder.class);
    }

    // Construct using com.akpan.temperature.TemperatureData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sensorId_ = "";

      temperature_ = 0D;

      timestamp_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akpan.temperature.TemperatureSensorServiceProto.internal_static_com_akpan_temperature_TemperatureData_descriptor;
    }

    @java.lang.Override
    public com.akpan.temperature.TemperatureData getDefaultInstanceForType() {
      return com.akpan.temperature.TemperatureData.getDefaultInstance();
    }

    @java.lang.Override
    public com.akpan.temperature.TemperatureData build() {
      com.akpan.temperature.TemperatureData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akpan.temperature.TemperatureData buildPartial() {
      com.akpan.temperature.TemperatureData result = new com.akpan.temperature.TemperatureData(this);
      result.sensorId_ = sensorId_;
      result.temperature_ = temperature_;
      result.timestamp_ = timestamp_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akpan.temperature.TemperatureData) {
        return mergeFrom((com.akpan.temperature.TemperatureData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akpan.temperature.TemperatureData other) {
      if (other == com.akpan.temperature.TemperatureData.getDefaultInstance()) return this;
      if (!other.getSensorId().isEmpty()) {
        sensorId_ = other.sensorId_;
        onChanged();
      }
      if (other.getTemperature() != 0D) {
        setTemperature(other.getTemperature());
      }
      if (!other.getTimestamp().isEmpty()) {
        timestamp_ = other.timestamp_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.akpan.temperature.TemperatureData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.akpan.temperature.TemperatureData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sensorId_ = "";
    /**
     * <code>string sensor_id = 1;</code>
     */
    public java.lang.String getSensorId() {
      java.lang.Object ref = sensorId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sensorId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sensor_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSensorIdBytes() {
      java.lang.Object ref = sensorId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sensorId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sensor_id = 1;</code>
     */
    public Builder setSensorId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sensorId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sensor_id = 1;</code>
     */
    public Builder clearSensorId() {
      
      sensorId_ = getDefaultInstance().getSensorId();
      onChanged();
      return this;
    }
    /**
     * <code>string sensor_id = 1;</code>
     */
    public Builder setSensorIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sensorId_ = value;
      onChanged();
      return this;
    }

    private double temperature_ ;
    /**
     * <code>double temperature = 2;</code>
     */
    public double getTemperature() {
      return temperature_;
    }
    /**
     * <code>double temperature = 2;</code>
     */
    public Builder setTemperature(double value) {
      
      temperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double temperature = 2;</code>
     */
    public Builder clearTemperature() {
      
      temperature_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object timestamp_ = "";
    /**
     * <code>string timestamp = 3;</code>
     */
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string timestamp = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string timestamp = 3;</code>
     */
    public Builder setTimestamp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string timestamp = 3;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = getDefaultInstance().getTimestamp();
      onChanged();
      return this;
    }
    /**
     * <code>string timestamp = 3;</code>
     */
    public Builder setTimestampBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.akpan.temperature.TemperatureData)
  }

  // @@protoc_insertion_point(class_scope:com.akpan.temperature.TemperatureData)
  private static final com.akpan.temperature.TemperatureData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akpan.temperature.TemperatureData();
  }

  public static com.akpan.temperature.TemperatureData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TemperatureData>
      PARSER = new com.google.protobuf.AbstractParser<TemperatureData>() {
    @java.lang.Override
    public TemperatureData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TemperatureData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TemperatureData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TemperatureData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akpan.temperature.TemperatureData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

