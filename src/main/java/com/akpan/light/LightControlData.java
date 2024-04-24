// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LightSensorService.proto

package com.akpan.light;

/**
 * Protobuf type {@code com.akpan.light.LightControlData}
 */
public  final class LightControlData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.akpan.light.LightControlData)
    LightControlDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LightControlData.newBuilder() to construct.
  private LightControlData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LightControlData() {
    lightStatus_ = false;
    timeOfDay_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LightControlData(
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
          case 8: {

            lightStatus_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            timeOfDay_ = s;
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
    return com.akpan.light.LightSensorServiceProto.internal_static_com_akpan_light_LightControlData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akpan.light.LightSensorServiceProto.internal_static_com_akpan_light_LightControlData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akpan.light.LightControlData.class, com.akpan.light.LightControlData.Builder.class);
  }

  public static final int LIGHT_STATUS_FIELD_NUMBER = 1;
  private boolean lightStatus_;
  /**
   * <code>bool light_status = 1;</code>
   */
  public boolean getLightStatus() {
    return lightStatus_;
  }

  public static final int TIME_OF_DAY_FIELD_NUMBER = 2;
  private volatile java.lang.Object timeOfDay_;
  /**
   * <code>string time_of_day = 2;</code>
   */
  public java.lang.String getTimeOfDay() {
    java.lang.Object ref = timeOfDay_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timeOfDay_ = s;
      return s;
    }
  }
  /**
   * <code>string time_of_day = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTimeOfDayBytes() {
    java.lang.Object ref = timeOfDay_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timeOfDay_ = b;
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
    if (lightStatus_ != false) {
      output.writeBool(1, lightStatus_);
    }
    if (!getTimeOfDayBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, timeOfDay_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lightStatus_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, lightStatus_);
    }
    if (!getTimeOfDayBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, timeOfDay_);
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
    if (!(obj instanceof com.akpan.light.LightControlData)) {
      return super.equals(obj);
    }
    com.akpan.light.LightControlData other = (com.akpan.light.LightControlData) obj;

    boolean result = true;
    result = result && (getLightStatus()
        == other.getLightStatus());
    result = result && getTimeOfDay()
        .equals(other.getTimeOfDay());
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
    hash = (37 * hash) + LIGHT_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLightStatus());
    hash = (37 * hash) + TIME_OF_DAY_FIELD_NUMBER;
    hash = (53 * hash) + getTimeOfDay().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akpan.light.LightControlData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akpan.light.LightControlData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akpan.light.LightControlData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akpan.light.LightControlData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akpan.light.LightControlData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akpan.light.LightControlData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akpan.light.LightControlData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akpan.light.LightControlData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akpan.light.LightControlData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.akpan.light.LightControlData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akpan.light.LightControlData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akpan.light.LightControlData parseFrom(
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
  public static Builder newBuilder(com.akpan.light.LightControlData prototype) {
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
   * Protobuf type {@code com.akpan.light.LightControlData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.akpan.light.LightControlData)
      com.akpan.light.LightControlDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akpan.light.LightSensorServiceProto.internal_static_com_akpan_light_LightControlData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akpan.light.LightSensorServiceProto.internal_static_com_akpan_light_LightControlData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akpan.light.LightControlData.class, com.akpan.light.LightControlData.Builder.class);
    }

    // Construct using com.akpan.light.LightControlData.newBuilder()
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
      lightStatus_ = false;

      timeOfDay_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akpan.light.LightSensorServiceProto.internal_static_com_akpan_light_LightControlData_descriptor;
    }

    @java.lang.Override
    public com.akpan.light.LightControlData getDefaultInstanceForType() {
      return com.akpan.light.LightControlData.getDefaultInstance();
    }

    @java.lang.Override
    public com.akpan.light.LightControlData build() {
      com.akpan.light.LightControlData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akpan.light.LightControlData buildPartial() {
      com.akpan.light.LightControlData result = new com.akpan.light.LightControlData(this);
      result.lightStatus_ = lightStatus_;
      result.timeOfDay_ = timeOfDay_;
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
      if (other instanceof com.akpan.light.LightControlData) {
        return mergeFrom((com.akpan.light.LightControlData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akpan.light.LightControlData other) {
      if (other == com.akpan.light.LightControlData.getDefaultInstance()) return this;
      if (other.getLightStatus() != false) {
        setLightStatus(other.getLightStatus());
      }
      if (!other.getTimeOfDay().isEmpty()) {
        timeOfDay_ = other.timeOfDay_;
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
      com.akpan.light.LightControlData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.akpan.light.LightControlData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean lightStatus_ ;
    /**
     * <code>bool light_status = 1;</code>
     */
    public boolean getLightStatus() {
      return lightStatus_;
    }
    /**
     * <code>bool light_status = 1;</code>
     */
    public Builder setLightStatus(boolean value) {
      
      lightStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool light_status = 1;</code>
     */
    public Builder clearLightStatus() {
      
      lightStatus_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object timeOfDay_ = "";
    /**
     * <code>string time_of_day = 2;</code>
     */
    public java.lang.String getTimeOfDay() {
      java.lang.Object ref = timeOfDay_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timeOfDay_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string time_of_day = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTimeOfDayBytes() {
      java.lang.Object ref = timeOfDay_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timeOfDay_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string time_of_day = 2;</code>
     */
    public Builder setTimeOfDay(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      timeOfDay_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string time_of_day = 2;</code>
     */
    public Builder clearTimeOfDay() {
      
      timeOfDay_ = getDefaultInstance().getTimeOfDay();
      onChanged();
      return this;
    }
    /**
     * <code>string time_of_day = 2;</code>
     */
    public Builder setTimeOfDayBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      timeOfDay_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.akpan.light.LightControlData)
  }

  // @@protoc_insertion_point(class_scope:com.akpan.light.LightControlData)
  private static final com.akpan.light.LightControlData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akpan.light.LightControlData();
  }

  public static com.akpan.light.LightControlData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LightControlData>
      PARSER = new com.google.protobuf.AbstractParser<LightControlData>() {
    @java.lang.Override
    public LightControlData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LightControlData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LightControlData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LightControlData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akpan.light.LightControlData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
