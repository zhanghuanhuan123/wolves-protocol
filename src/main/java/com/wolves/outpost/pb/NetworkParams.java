// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: outpost_common1.proto

package com.wolves.outpost.pb;

/**
 * Protobuf type {@code NetworkParams}
 */
public  final class NetworkParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:NetworkParams)
    NetworkParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NetworkParams.newBuilder() to construct.
  private NetworkParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NetworkParams() {
    hostName_ = "";
    domainName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    dnsServers_ = "";
    ipv4DefaultGateway_ = "";
    ipv6DefaultGateway_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NetworkParams(
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

            hostName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              domainName_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            domainName_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dnsServers_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            ipv4DefaultGateway_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            ipv6DefaultGateway_ = s;
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
        domainName_ = domainName_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wolves.outpost.pb.OutpostCommon1.internal_static_NetworkParams_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wolves.outpost.pb.OutpostCommon1.internal_static_NetworkParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wolves.outpost.pb.NetworkParams.class, com.wolves.outpost.pb.NetworkParams.Builder.class);
  }

  private int bitField0_;
  public static final int HOSTNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object hostName_;
  /**
   * <code>string hostName = 1;</code>
   */
  public java.lang.String getHostName() {
    java.lang.Object ref = hostName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostName_ = s;
      return s;
    }
  }
  /**
   * <code>string hostName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getHostNameBytes() {
    java.lang.Object ref = hostName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOMAINNAME_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList domainName_;
  /**
   * <code>repeated string domainName = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getDomainNameList() {
    return domainName_;
  }
  /**
   * <code>repeated string domainName = 2;</code>
   */
  public int getDomainNameCount() {
    return domainName_.size();
  }
  /**
   * <code>repeated string domainName = 2;</code>
   */
  public java.lang.String getDomainName(int index) {
    return domainName_.get(index);
  }
  /**
   * <code>repeated string domainName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDomainNameBytes(int index) {
    return domainName_.getByteString(index);
  }

  public static final int DNSSERVERS_FIELD_NUMBER = 3;
  private volatile java.lang.Object dnsServers_;
  /**
   * <code>string dnsServers = 3;</code>
   */
  public java.lang.String getDnsServers() {
    java.lang.Object ref = dnsServers_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dnsServers_ = s;
      return s;
    }
  }
  /**
   * <code>string dnsServers = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDnsServersBytes() {
    java.lang.Object ref = dnsServers_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dnsServers_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IPV4DEFAULTGATEWAY_FIELD_NUMBER = 4;
  private volatile java.lang.Object ipv4DefaultGateway_;
  /**
   * <code>string ipv4DefaultGateway = 4;</code>
   */
  public java.lang.String getIpv4DefaultGateway() {
    java.lang.Object ref = ipv4DefaultGateway_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipv4DefaultGateway_ = s;
      return s;
    }
  }
  /**
   * <code>string ipv4DefaultGateway = 4;</code>
   */
  public com.google.protobuf.ByteString
      getIpv4DefaultGatewayBytes() {
    java.lang.Object ref = ipv4DefaultGateway_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipv4DefaultGateway_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IPV6DEFAULTGATEWAY_FIELD_NUMBER = 5;
  private volatile java.lang.Object ipv6DefaultGateway_;
  /**
   * <code>string ipv6DefaultGateway = 5;</code>
   */
  public java.lang.String getIpv6DefaultGateway() {
    java.lang.Object ref = ipv6DefaultGateway_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipv6DefaultGateway_ = s;
      return s;
    }
  }
  /**
   * <code>string ipv6DefaultGateway = 5;</code>
   */
  public com.google.protobuf.ByteString
      getIpv6DefaultGatewayBytes() {
    java.lang.Object ref = ipv6DefaultGateway_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipv6DefaultGateway_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getHostNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hostName_);
    }
    for (int i = 0; i < domainName_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, domainName_.getRaw(i));
    }
    if (!getDnsServersBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dnsServers_);
    }
    if (!getIpv4DefaultGatewayBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, ipv4DefaultGateway_);
    }
    if (!getIpv6DefaultGatewayBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, ipv6DefaultGateway_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHostNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hostName_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < domainName_.size(); i++) {
        dataSize += computeStringSizeNoTag(domainName_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDomainNameList().size();
    }
    if (!getDnsServersBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dnsServers_);
    }
    if (!getIpv4DefaultGatewayBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, ipv4DefaultGateway_);
    }
    if (!getIpv6DefaultGatewayBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, ipv6DefaultGateway_);
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
    if (!(obj instanceof com.wolves.outpost.pb.NetworkParams)) {
      return super.equals(obj);
    }
    com.wolves.outpost.pb.NetworkParams other = (com.wolves.outpost.pb.NetworkParams) obj;

    boolean result = true;
    result = result && getHostName()
        .equals(other.getHostName());
    result = result && getDomainNameList()
        .equals(other.getDomainNameList());
    result = result && getDnsServers()
        .equals(other.getDnsServers());
    result = result && getIpv4DefaultGateway()
        .equals(other.getIpv4DefaultGateway());
    result = result && getIpv6DefaultGateway()
        .equals(other.getIpv6DefaultGateway());
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
    hash = (37 * hash) + HOSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getHostName().hashCode();
    if (getDomainNameCount() > 0) {
      hash = (37 * hash) + DOMAINNAME_FIELD_NUMBER;
      hash = (53 * hash) + getDomainNameList().hashCode();
    }
    hash = (37 * hash) + DNSSERVERS_FIELD_NUMBER;
    hash = (53 * hash) + getDnsServers().hashCode();
    hash = (37 * hash) + IPV4DEFAULTGATEWAY_FIELD_NUMBER;
    hash = (53 * hash) + getIpv4DefaultGateway().hashCode();
    hash = (37 * hash) + IPV6DEFAULTGATEWAY_FIELD_NUMBER;
    hash = (53 * hash) + getIpv6DefaultGateway().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wolves.outpost.pb.NetworkParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.outpost.pb.NetworkParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.outpost.pb.NetworkParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.outpost.pb.NetworkParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.outpost.pb.NetworkParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.outpost.pb.NetworkParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.outpost.pb.NetworkParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.outpost.pb.NetworkParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.outpost.pb.NetworkParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wolves.outpost.pb.NetworkParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.outpost.pb.NetworkParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.outpost.pb.NetworkParams parseFrom(
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
  public static Builder newBuilder(com.wolves.outpost.pb.NetworkParams prototype) {
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
   * Protobuf type {@code NetworkParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:NetworkParams)
      com.wolves.outpost.pb.NetworkParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wolves.outpost.pb.OutpostCommon1.internal_static_NetworkParams_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wolves.outpost.pb.OutpostCommon1.internal_static_NetworkParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wolves.outpost.pb.NetworkParams.class, com.wolves.outpost.pb.NetworkParams.Builder.class);
    }

    // Construct using com.wolves.outpost.pb.NetworkParams.newBuilder()
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
      hostName_ = "";

      domainName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      dnsServers_ = "";

      ipv4DefaultGateway_ = "";

      ipv6DefaultGateway_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wolves.outpost.pb.OutpostCommon1.internal_static_NetworkParams_descriptor;
    }

    public com.wolves.outpost.pb.NetworkParams getDefaultInstanceForType() {
      return com.wolves.outpost.pb.NetworkParams.getDefaultInstance();
    }

    public com.wolves.outpost.pb.NetworkParams build() {
      com.wolves.outpost.pb.NetworkParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wolves.outpost.pb.NetworkParams buildPartial() {
      com.wolves.outpost.pb.NetworkParams result = new com.wolves.outpost.pb.NetworkParams(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.hostName_ = hostName_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        domainName_ = domainName_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.domainName_ = domainName_;
      result.dnsServers_ = dnsServers_;
      result.ipv4DefaultGateway_ = ipv4DefaultGateway_;
      result.ipv6DefaultGateway_ = ipv6DefaultGateway_;
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
      if (other instanceof com.wolves.outpost.pb.NetworkParams) {
        return mergeFrom((com.wolves.outpost.pb.NetworkParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wolves.outpost.pb.NetworkParams other) {
      if (other == com.wolves.outpost.pb.NetworkParams.getDefaultInstance()) return this;
      if (!other.getHostName().isEmpty()) {
        hostName_ = other.hostName_;
        onChanged();
      }
      if (!other.domainName_.isEmpty()) {
        if (domainName_.isEmpty()) {
          domainName_ = other.domainName_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureDomainNameIsMutable();
          domainName_.addAll(other.domainName_);
        }
        onChanged();
      }
      if (!other.getDnsServers().isEmpty()) {
        dnsServers_ = other.dnsServers_;
        onChanged();
      }
      if (!other.getIpv4DefaultGateway().isEmpty()) {
        ipv4DefaultGateway_ = other.ipv4DefaultGateway_;
        onChanged();
      }
      if (!other.getIpv6DefaultGateway().isEmpty()) {
        ipv6DefaultGateway_ = other.ipv6DefaultGateway_;
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
      com.wolves.outpost.pb.NetworkParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wolves.outpost.pb.NetworkParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object hostName_ = "";
    /**
     * <code>string hostName = 1;</code>
     */
    public java.lang.String getHostName() {
      java.lang.Object ref = hostName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hostName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHostNameBytes() {
      java.lang.Object ref = hostName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hostName = 1;</code>
     */
    public Builder setHostName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hostName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hostName = 1;</code>
     */
    public Builder clearHostName() {
      
      hostName_ = getDefaultInstance().getHostName();
      onChanged();
      return this;
    }
    /**
     * <code>string hostName = 1;</code>
     */
    public Builder setHostNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hostName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList domainName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDomainNameIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        domainName_ = new com.google.protobuf.LazyStringArrayList(domainName_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string domainName = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getDomainNameList() {
      return domainName_.getUnmodifiableView();
    }
    /**
     * <code>repeated string domainName = 2;</code>
     */
    public int getDomainNameCount() {
      return domainName_.size();
    }
    /**
     * <code>repeated string domainName = 2;</code>
     */
    public java.lang.String getDomainName(int index) {
      return domainName_.get(index);
    }
    /**
     * <code>repeated string domainName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDomainNameBytes(int index) {
      return domainName_.getByteString(index);
    }
    /**
     * <code>repeated string domainName = 2;</code>
     */
    public Builder setDomainName(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDomainNameIsMutable();
      domainName_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string domainName = 2;</code>
     */
    public Builder addDomainName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDomainNameIsMutable();
      domainName_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string domainName = 2;</code>
     */
    public Builder addAllDomainName(
        java.lang.Iterable<java.lang.String> values) {
      ensureDomainNameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, domainName_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string domainName = 2;</code>
     */
    public Builder clearDomainName() {
      domainName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string domainName = 2;</code>
     */
    public Builder addDomainNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDomainNameIsMutable();
      domainName_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object dnsServers_ = "";
    /**
     * <code>string dnsServers = 3;</code>
     */
    public java.lang.String getDnsServers() {
      java.lang.Object ref = dnsServers_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dnsServers_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dnsServers = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDnsServersBytes() {
      java.lang.Object ref = dnsServers_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dnsServers_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dnsServers = 3;</code>
     */
    public Builder setDnsServers(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dnsServers_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dnsServers = 3;</code>
     */
    public Builder clearDnsServers() {
      
      dnsServers_ = getDefaultInstance().getDnsServers();
      onChanged();
      return this;
    }
    /**
     * <code>string dnsServers = 3;</code>
     */
    public Builder setDnsServersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dnsServers_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ipv4DefaultGateway_ = "";
    /**
     * <code>string ipv4DefaultGateway = 4;</code>
     */
    public java.lang.String getIpv4DefaultGateway() {
      java.lang.Object ref = ipv4DefaultGateway_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipv4DefaultGateway_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ipv4DefaultGateway = 4;</code>
     */
    public com.google.protobuf.ByteString
        getIpv4DefaultGatewayBytes() {
      java.lang.Object ref = ipv4DefaultGateway_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipv4DefaultGateway_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ipv4DefaultGateway = 4;</code>
     */
    public Builder setIpv4DefaultGateway(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipv4DefaultGateway_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ipv4DefaultGateway = 4;</code>
     */
    public Builder clearIpv4DefaultGateway() {
      
      ipv4DefaultGateway_ = getDefaultInstance().getIpv4DefaultGateway();
      onChanged();
      return this;
    }
    /**
     * <code>string ipv4DefaultGateway = 4;</code>
     */
    public Builder setIpv4DefaultGatewayBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ipv4DefaultGateway_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ipv6DefaultGateway_ = "";
    /**
     * <code>string ipv6DefaultGateway = 5;</code>
     */
    public java.lang.String getIpv6DefaultGateway() {
      java.lang.Object ref = ipv6DefaultGateway_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipv6DefaultGateway_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ipv6DefaultGateway = 5;</code>
     */
    public com.google.protobuf.ByteString
        getIpv6DefaultGatewayBytes() {
      java.lang.Object ref = ipv6DefaultGateway_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipv6DefaultGateway_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ipv6DefaultGateway = 5;</code>
     */
    public Builder setIpv6DefaultGateway(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipv6DefaultGateway_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ipv6DefaultGateway = 5;</code>
     */
    public Builder clearIpv6DefaultGateway() {
      
      ipv6DefaultGateway_ = getDefaultInstance().getIpv6DefaultGateway();
      onChanged();
      return this;
    }
    /**
     * <code>string ipv6DefaultGateway = 5;</code>
     */
    public Builder setIpv6DefaultGatewayBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ipv6DefaultGateway_ = value;
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


    // @@protoc_insertion_point(builder_scope:NetworkParams)
  }

  // @@protoc_insertion_point(class_scope:NetworkParams)
  private static final com.wolves.outpost.pb.NetworkParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wolves.outpost.pb.NetworkParams();
  }

  public static com.wolves.outpost.pb.NetworkParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkParams>
      PARSER = new com.google.protobuf.AbstractParser<NetworkParams>() {
    public NetworkParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new NetworkParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NetworkParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkParams> getParserForType() {
    return PARSER;
  }

  public com.wolves.outpost.pb.NetworkParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

