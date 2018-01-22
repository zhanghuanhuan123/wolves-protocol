// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin_common.proto

package com.wolves.admin.pb;

/**
 * Protobuf type {@code InterfaceStatus}
 */
public  final class InterfaceStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:InterfaceStatus)
    InterfaceStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InterfaceStatus.newBuilder() to construct.
  private InterfaceStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InterfaceStatus() {
    action_ = "";
    actVersion_ = "";
    jams_ = 0;
    avaiCostsPerMin_ = 0;
    avaiHitsPerMin_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InterfaceStatus(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            action_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            actVersion_ = s;
            break;
          }
          case 24: {

            jams_ = input.readInt32();
            break;
          }
          case 32: {

            avaiCostsPerMin_ = input.readInt32();
            break;
          }
          case 40: {

            avaiHitsPerMin_ = input.readInt32();
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
    return com.wolves.admin.pb.AdminCommon.internal_static_InterfaceStatus_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wolves.admin.pb.AdminCommon.internal_static_InterfaceStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wolves.admin.pb.InterfaceStatus.class, com.wolves.admin.pb.InterfaceStatus.Builder.class);
  }

  public static final int ACTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object action_;
  /**
   * <code>string action = 1;</code>
   */
  public java.lang.String getAction() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      action_ = s;
      return s;
    }
  }
  /**
   * <code>string action = 1;</code>
   */
  public com.google.protobuf.ByteString
      getActionBytes() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      action_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTVERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object actVersion_;
  /**
   * <code>string actVersion = 2;</code>
   */
  public java.lang.String getActVersion() {
    java.lang.Object ref = actVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      actVersion_ = s;
      return s;
    }
  }
  /**
   * <code>string actVersion = 2;</code>
   */
  public com.google.protobuf.ByteString
      getActVersionBytes() {
    java.lang.Object ref = actVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      actVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JAMS_FIELD_NUMBER = 3;
  private int jams_;
  /**
   * <code>int32 jams = 3;</code>
   */
  public int getJams() {
    return jams_;
  }

  public static final int AVAICOSTSPERMIN__FIELD_NUMBER = 4;
  private int avaiCostsPerMin_;
  /**
   * <code>int32 avaiCostsPerMin_ = 4;</code>
   */
  public int getAvaiCostsPerMin() {
    return avaiCostsPerMin_;
  }

  public static final int AVAIHITSPERMIN_FIELD_NUMBER = 5;
  private int avaiHitsPerMin_;
  /**
   * <code>int32 avaiHitsPerMin = 5;</code>
   */
  public int getAvaiHitsPerMin() {
    return avaiHitsPerMin_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getActionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, action_);
    }
    if (!getActVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, actVersion_);
    }
    if (jams_ != 0) {
      output.writeInt32(3, jams_);
    }
    if (avaiCostsPerMin_ != 0) {
      output.writeInt32(4, avaiCostsPerMin_);
    }
    if (avaiHitsPerMin_ != 0) {
      output.writeInt32(5, avaiHitsPerMin_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getActionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, action_);
    }
    if (!getActVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, actVersion_);
    }
    if (jams_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, jams_);
    }
    if (avaiCostsPerMin_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, avaiCostsPerMin_);
    }
    if (avaiHitsPerMin_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, avaiHitsPerMin_);
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
    if (!(obj instanceof com.wolves.admin.pb.InterfaceStatus)) {
      return super.equals(obj);
    }
    com.wolves.admin.pb.InterfaceStatus other = (com.wolves.admin.pb.InterfaceStatus) obj;

    boolean result = true;
    result = result && getAction()
        .equals(other.getAction());
    result = result && getActVersion()
        .equals(other.getActVersion());
    result = result && (getJams()
        == other.getJams());
    result = result && (getAvaiCostsPerMin()
        == other.getAvaiCostsPerMin());
    result = result && (getAvaiHitsPerMin()
        == other.getAvaiHitsPerMin());
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
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction().hashCode();
    hash = (37 * hash) + ACTVERSION_FIELD_NUMBER;
    hash = (53 * hash) + getActVersion().hashCode();
    hash = (37 * hash) + JAMS_FIELD_NUMBER;
    hash = (53 * hash) + getJams();
    hash = (37 * hash) + AVAICOSTSPERMIN__FIELD_NUMBER;
    hash = (53 * hash) + getAvaiCostsPerMin();
    hash = (37 * hash) + AVAIHITSPERMIN_FIELD_NUMBER;
    hash = (53 * hash) + getAvaiHitsPerMin();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wolves.admin.pb.InterfaceStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.InterfaceStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.InterfaceStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.InterfaceStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.InterfaceStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.InterfaceStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.InterfaceStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.InterfaceStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.InterfaceStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.InterfaceStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.InterfaceStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.InterfaceStatus parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wolves.admin.pb.InterfaceStatus prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code InterfaceStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:InterfaceStatus)
      com.wolves.admin.pb.InterfaceStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wolves.admin.pb.AdminCommon.internal_static_InterfaceStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wolves.admin.pb.AdminCommon.internal_static_InterfaceStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wolves.admin.pb.InterfaceStatus.class, com.wolves.admin.pb.InterfaceStatus.Builder.class);
    }

    // Construct using com.wolves.admin.pb.InterfaceStatus.newBuilder()
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
    public Builder clear() {
      super.clear();
      action_ = "";

      actVersion_ = "";

      jams_ = 0;

      avaiCostsPerMin_ = 0;

      avaiHitsPerMin_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wolves.admin.pb.AdminCommon.internal_static_InterfaceStatus_descriptor;
    }

    public com.wolves.admin.pb.InterfaceStatus getDefaultInstanceForType() {
      return com.wolves.admin.pb.InterfaceStatus.getDefaultInstance();
    }

    public com.wolves.admin.pb.InterfaceStatus build() {
      com.wolves.admin.pb.InterfaceStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wolves.admin.pb.InterfaceStatus buildPartial() {
      com.wolves.admin.pb.InterfaceStatus result = new com.wolves.admin.pb.InterfaceStatus(this);
      result.action_ = action_;
      result.actVersion_ = actVersion_;
      result.jams_ = jams_;
      result.avaiCostsPerMin_ = avaiCostsPerMin_;
      result.avaiHitsPerMin_ = avaiHitsPerMin_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wolves.admin.pb.InterfaceStatus) {
        return mergeFrom((com.wolves.admin.pb.InterfaceStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wolves.admin.pb.InterfaceStatus other) {
      if (other == com.wolves.admin.pb.InterfaceStatus.getDefaultInstance()) return this;
      if (!other.getAction().isEmpty()) {
        action_ = other.action_;
        onChanged();
      }
      if (!other.getActVersion().isEmpty()) {
        actVersion_ = other.actVersion_;
        onChanged();
      }
      if (other.getJams() != 0) {
        setJams(other.getJams());
      }
      if (other.getAvaiCostsPerMin() != 0) {
        setAvaiCostsPerMin(other.getAvaiCostsPerMin());
      }
      if (other.getAvaiHitsPerMin() != 0) {
        setAvaiHitsPerMin(other.getAvaiHitsPerMin());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.wolves.admin.pb.InterfaceStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wolves.admin.pb.InterfaceStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object action_ = "";
    /**
     * <code>string action = 1;</code>
     */
    public java.lang.String getAction() {
      java.lang.Object ref = action_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        action_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string action = 1;</code>
     */
    public com.google.protobuf.ByteString
        getActionBytes() {
      java.lang.Object ref = action_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        action_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string action = 1;</code>
     */
    public Builder setAction(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string action = 1;</code>
     */
    public Builder clearAction() {
      
      action_ = getDefaultInstance().getAction();
      onChanged();
      return this;
    }
    /**
     * <code>string action = 1;</code>
     */
    public Builder setActionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      action_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object actVersion_ = "";
    /**
     * <code>string actVersion = 2;</code>
     */
    public java.lang.String getActVersion() {
      java.lang.Object ref = actVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string actVersion = 2;</code>
     */
    public com.google.protobuf.ByteString
        getActVersionBytes() {
      java.lang.Object ref = actVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string actVersion = 2;</code>
     */
    public Builder setActVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      actVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string actVersion = 2;</code>
     */
    public Builder clearActVersion() {
      
      actVersion_ = getDefaultInstance().getActVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string actVersion = 2;</code>
     */
    public Builder setActVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      actVersion_ = value;
      onChanged();
      return this;
    }

    private int jams_ ;
    /**
     * <code>int32 jams = 3;</code>
     */
    public int getJams() {
      return jams_;
    }
    /**
     * <code>int32 jams = 3;</code>
     */
    public Builder setJams(int value) {
      
      jams_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 jams = 3;</code>
     */
    public Builder clearJams() {
      
      jams_ = 0;
      onChanged();
      return this;
    }

    private int avaiCostsPerMin_ ;
    /**
     * <code>int32 avaiCostsPerMin_ = 4;</code>
     */
    public int getAvaiCostsPerMin() {
      return avaiCostsPerMin_;
    }
    /**
     * <code>int32 avaiCostsPerMin_ = 4;</code>
     */
    public Builder setAvaiCostsPerMin(int value) {
      
      avaiCostsPerMin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 avaiCostsPerMin_ = 4;</code>
     */
    public Builder clearAvaiCostsPerMin() {
      
      avaiCostsPerMin_ = 0;
      onChanged();
      return this;
    }

    private int avaiHitsPerMin_ ;
    /**
     * <code>int32 avaiHitsPerMin = 5;</code>
     */
    public int getAvaiHitsPerMin() {
      return avaiHitsPerMin_;
    }
    /**
     * <code>int32 avaiHitsPerMin = 5;</code>
     */
    public Builder setAvaiHitsPerMin(int value) {
      
      avaiHitsPerMin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 avaiHitsPerMin = 5;</code>
     */
    public Builder clearAvaiHitsPerMin() {
      
      avaiHitsPerMin_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:InterfaceStatus)
  }

  // @@protoc_insertion_point(class_scope:InterfaceStatus)
  private static final com.wolves.admin.pb.InterfaceStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wolves.admin.pb.InterfaceStatus();
  }

  public static com.wolves.admin.pb.InterfaceStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InterfaceStatus>
      PARSER = new com.google.protobuf.AbstractParser<InterfaceStatus>() {
    public InterfaceStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new InterfaceStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InterfaceStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterfaceStatus> getParserForType() {
    return PARSER;
  }

  public com.wolves.admin.pb.InterfaceStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
