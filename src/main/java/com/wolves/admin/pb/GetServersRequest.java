// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin_com.proto

package com.wolves.admin.pb;

/**
 * Protobuf type {@code GetServersRequest}
 */
public  final class GetServersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetServersRequest)
    GetServersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetServersRequest.newBuilder() to construct.
  private GetServersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetServersRequest() {
    ips_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetServersRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              ips_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            ips_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        ips_ = ips_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wolves.admin.pb.AdminCom.internal_static_GetServersRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wolves.admin.pb.AdminCom.internal_static_GetServersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wolves.admin.pb.GetServersRequest.class, com.wolves.admin.pb.GetServersRequest.Builder.class);
  }

  public static final int IPS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList ips_;
  /**
   * <code>repeated string ips = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getIpsList() {
    return ips_;
  }
  /**
   * <code>repeated string ips = 1;</code>
   */
  public int getIpsCount() {
    return ips_.size();
  }
  /**
   * <code>repeated string ips = 1;</code>
   */
  public java.lang.String getIps(int index) {
    return ips_.get(index);
  }
  /**
   * <code>repeated string ips = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIpsBytes(int index) {
    return ips_.getByteString(index);
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
    for (int i = 0; i < ips_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ips_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ips_.size(); i++) {
        dataSize += computeStringSizeNoTag(ips_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIpsList().size();
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
    if (!(obj instanceof com.wolves.admin.pb.GetServersRequest)) {
      return super.equals(obj);
    }
    com.wolves.admin.pb.GetServersRequest other = (com.wolves.admin.pb.GetServersRequest) obj;

    boolean result = true;
    result = result && getIpsList()
        .equals(other.getIpsList());
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
    if (getIpsCount() > 0) {
      hash = (37 * hash) + IPS_FIELD_NUMBER;
      hash = (53 * hash) + getIpsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wolves.admin.pb.GetServersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.GetServersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetServersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.GetServersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetServersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.GetServersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetServersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.GetServersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetServersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.GetServersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetServersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.GetServersRequest parseFrom(
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
  public static Builder newBuilder(com.wolves.admin.pb.GetServersRequest prototype) {
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
   * Protobuf type {@code GetServersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetServersRequest)
      com.wolves.admin.pb.GetServersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wolves.admin.pb.AdminCom.internal_static_GetServersRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wolves.admin.pb.AdminCom.internal_static_GetServersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wolves.admin.pb.GetServersRequest.class, com.wolves.admin.pb.GetServersRequest.Builder.class);
    }

    // Construct using com.wolves.admin.pb.GetServersRequest.newBuilder()
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
      ips_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wolves.admin.pb.AdminCom.internal_static_GetServersRequest_descriptor;
    }

    public com.wolves.admin.pb.GetServersRequest getDefaultInstanceForType() {
      return com.wolves.admin.pb.GetServersRequest.getDefaultInstance();
    }

    public com.wolves.admin.pb.GetServersRequest build() {
      com.wolves.admin.pb.GetServersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wolves.admin.pb.GetServersRequest buildPartial() {
      com.wolves.admin.pb.GetServersRequest result = new com.wolves.admin.pb.GetServersRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        ips_ = ips_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ips_ = ips_;
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
      if (other instanceof com.wolves.admin.pb.GetServersRequest) {
        return mergeFrom((com.wolves.admin.pb.GetServersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wolves.admin.pb.GetServersRequest other) {
      if (other == com.wolves.admin.pb.GetServersRequest.getDefaultInstance()) return this;
      if (!other.ips_.isEmpty()) {
        if (ips_.isEmpty()) {
          ips_ = other.ips_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIpsIsMutable();
          ips_.addAll(other.ips_);
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
      com.wolves.admin.pb.GetServersRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wolves.admin.pb.GetServersRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList ips_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureIpsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        ips_ = new com.google.protobuf.LazyStringArrayList(ips_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string ips = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getIpsList() {
      return ips_.getUnmodifiableView();
    }
    /**
     * <code>repeated string ips = 1;</code>
     */
    public int getIpsCount() {
      return ips_.size();
    }
    /**
     * <code>repeated string ips = 1;</code>
     */
    public java.lang.String getIps(int index) {
      return ips_.get(index);
    }
    /**
     * <code>repeated string ips = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIpsBytes(int index) {
      return ips_.getByteString(index);
    }
    /**
     * <code>repeated string ips = 1;</code>
     */
    public Builder setIps(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIpsIsMutable();
      ips_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ips = 1;</code>
     */
    public Builder addIps(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIpsIsMutable();
      ips_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ips = 1;</code>
     */
    public Builder addAllIps(
        java.lang.Iterable<java.lang.String> values) {
      ensureIpsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ips_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ips = 1;</code>
     */
    public Builder clearIps() {
      ips_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ips = 1;</code>
     */
    public Builder addIpsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureIpsIsMutable();
      ips_.add(value);
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


    // @@protoc_insertion_point(builder_scope:GetServersRequest)
  }

  // @@protoc_insertion_point(class_scope:GetServersRequest)
  private static final com.wolves.admin.pb.GetServersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wolves.admin.pb.GetServersRequest();
  }

  public static com.wolves.admin.pb.GetServersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetServersRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetServersRequest>() {
    public GetServersRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetServersRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetServersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetServersRequest> getParserForType() {
    return PARSER;
  }

  public com.wolves.admin.pb.GetServersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
