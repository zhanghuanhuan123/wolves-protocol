// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin_com.proto

package com.wolves.admin.pb;

/**
 * Protobuf type {@code GetPortRequest}
 */
public  final class GetPortRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetPortRequest)
    GetPortRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPortRequest.newBuilder() to construct.
  private GetPortRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPortRequest() {
    localip_ = "";
    failedPorts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetPortRequest(
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

            localip_ = s;
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              failedPorts_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            failedPorts_.add(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
              failedPorts_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              failedPorts_.add(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        failedPorts_ = java.util.Collections.unmodifiableList(failedPorts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wolves.admin.pb.AdminCom.internal_static_GetPortRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wolves.admin.pb.AdminCom.internal_static_GetPortRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wolves.admin.pb.GetPortRequest.class, com.wolves.admin.pb.GetPortRequest.Builder.class);
  }

  private int bitField0_;
  public static final int LOCALIP_FIELD_NUMBER = 1;
  private volatile java.lang.Object localip_;
  /**
   * <code>string localip = 1;</code>
   */
  public java.lang.String getLocalip() {
    java.lang.Object ref = localip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      localip_ = s;
      return s;
    }
  }
  /**
   * <code>string localip = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLocalipBytes() {
    java.lang.Object ref = localip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      localip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FAILEDPORTS_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> failedPorts_;
  /**
   * <code>repeated int32 failedPorts = 2;</code>
   */
  public java.util.List<java.lang.Integer>
      getFailedPortsList() {
    return failedPorts_;
  }
  /**
   * <code>repeated int32 failedPorts = 2;</code>
   */
  public int getFailedPortsCount() {
    return failedPorts_.size();
  }
  /**
   * <code>repeated int32 failedPorts = 2;</code>
   */
  public int getFailedPorts(int index) {
    return failedPorts_.get(index);
  }
  private int failedPortsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (!getLocalipBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, localip_);
    }
    if (getFailedPortsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(failedPortsMemoizedSerializedSize);
    }
    for (int i = 0; i < failedPorts_.size(); i++) {
      output.writeInt32NoTag(failedPorts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLocalipBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, localip_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < failedPorts_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(failedPorts_.get(i));
      }
      size += dataSize;
      if (!getFailedPortsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      failedPortsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.wolves.admin.pb.GetPortRequest)) {
      return super.equals(obj);
    }
    com.wolves.admin.pb.GetPortRequest other = (com.wolves.admin.pb.GetPortRequest) obj;

    boolean result = true;
    result = result && getLocalip()
        .equals(other.getLocalip());
    result = result && getFailedPortsList()
        .equals(other.getFailedPortsList());
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
    hash = (37 * hash) + LOCALIP_FIELD_NUMBER;
    hash = (53 * hash) + getLocalip().hashCode();
    if (getFailedPortsCount() > 0) {
      hash = (37 * hash) + FAILEDPORTS_FIELD_NUMBER;
      hash = (53 * hash) + getFailedPortsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wolves.admin.pb.GetPortRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.GetPortRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetPortRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.GetPortRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetPortRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.GetPortRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetPortRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.GetPortRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetPortRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.GetPortRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetPortRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.GetPortRequest parseFrom(
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
  public static Builder newBuilder(com.wolves.admin.pb.GetPortRequest prototype) {
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
   * Protobuf type {@code GetPortRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetPortRequest)
      com.wolves.admin.pb.GetPortRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wolves.admin.pb.AdminCom.internal_static_GetPortRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wolves.admin.pb.AdminCom.internal_static_GetPortRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wolves.admin.pb.GetPortRequest.class, com.wolves.admin.pb.GetPortRequest.Builder.class);
    }

    // Construct using com.wolves.admin.pb.GetPortRequest.newBuilder()
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
      localip_ = "";

      failedPorts_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wolves.admin.pb.AdminCom.internal_static_GetPortRequest_descriptor;
    }

    public com.wolves.admin.pb.GetPortRequest getDefaultInstanceForType() {
      return com.wolves.admin.pb.GetPortRequest.getDefaultInstance();
    }

    public com.wolves.admin.pb.GetPortRequest build() {
      com.wolves.admin.pb.GetPortRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wolves.admin.pb.GetPortRequest buildPartial() {
      com.wolves.admin.pb.GetPortRequest result = new com.wolves.admin.pb.GetPortRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.localip_ = localip_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        failedPorts_ = java.util.Collections.unmodifiableList(failedPorts_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.failedPorts_ = failedPorts_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.wolves.admin.pb.GetPortRequest) {
        return mergeFrom((com.wolves.admin.pb.GetPortRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wolves.admin.pb.GetPortRequest other) {
      if (other == com.wolves.admin.pb.GetPortRequest.getDefaultInstance()) return this;
      if (!other.getLocalip().isEmpty()) {
        localip_ = other.localip_;
        onChanged();
      }
      if (!other.failedPorts_.isEmpty()) {
        if (failedPorts_.isEmpty()) {
          failedPorts_ = other.failedPorts_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureFailedPortsIsMutable();
          failedPorts_.addAll(other.failedPorts_);
        }
        onChanged();
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
      com.wolves.admin.pb.GetPortRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wolves.admin.pb.GetPortRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object localip_ = "";
    /**
     * <code>string localip = 1;</code>
     */
    public java.lang.String getLocalip() {
      java.lang.Object ref = localip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        localip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string localip = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLocalipBytes() {
      java.lang.Object ref = localip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        localip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string localip = 1;</code>
     */
    public Builder setLocalip(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      localip_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string localip = 1;</code>
     */
    public Builder clearLocalip() {
      
      localip_ = getDefaultInstance().getLocalip();
      onChanged();
      return this;
    }
    /**
     * <code>string localip = 1;</code>
     */
    public Builder setLocalipBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      localip_ = value;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> failedPorts_ = java.util.Collections.emptyList();
    private void ensureFailedPortsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        failedPorts_ = new java.util.ArrayList<java.lang.Integer>(failedPorts_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 failedPorts = 2;</code>
     */
    public java.util.List<java.lang.Integer>
        getFailedPortsList() {
      return java.util.Collections.unmodifiableList(failedPorts_);
    }
    /**
     * <code>repeated int32 failedPorts = 2;</code>
     */
    public int getFailedPortsCount() {
      return failedPorts_.size();
    }
    /**
     * <code>repeated int32 failedPorts = 2;</code>
     */
    public int getFailedPorts(int index) {
      return failedPorts_.get(index);
    }
    /**
     * <code>repeated int32 failedPorts = 2;</code>
     */
    public Builder setFailedPorts(
        int index, int value) {
      ensureFailedPortsIsMutable();
      failedPorts_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 failedPorts = 2;</code>
     */
    public Builder addFailedPorts(int value) {
      ensureFailedPortsIsMutable();
      failedPorts_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 failedPorts = 2;</code>
     */
    public Builder addAllFailedPorts(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureFailedPortsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, failedPorts_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 failedPorts = 2;</code>
     */
    public Builder clearFailedPorts() {
      failedPorts_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:GetPortRequest)
  }

  // @@protoc_insertion_point(class_scope:GetPortRequest)
  private static final com.wolves.admin.pb.GetPortRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wolves.admin.pb.GetPortRequest();
  }

  public static com.wolves.admin.pb.GetPortRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPortRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetPortRequest>() {
    public GetPortRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetPortRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPortRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPortRequest> getParserForType() {
    return PARSER;
  }

  public com.wolves.admin.pb.GetPortRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

