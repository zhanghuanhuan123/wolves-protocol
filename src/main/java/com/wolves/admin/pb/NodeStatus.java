// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin_common.proto

package com.wolves.admin.pb;

/**
 * Protobuf type {@code NodeStatus}
 */
public  final class NodeStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:NodeStatus)
    NodeStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeStatus.newBuilder() to construct.
  private NodeStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeStatus() {
    collectTime_ = 0L;
    nodeStatus_ = 0;
    interfaceStatus_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NodeStatus(
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
          case 8: {

            collectTime_ = input.readInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            nodeStatus_ = rawValue;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              interfaceStatus_ = new java.util.ArrayList<com.wolves.admin.pb.InterfaceStatus>();
              mutable_bitField0_ |= 0x00000004;
            }
            interfaceStatus_.add(
                input.readMessage(com.wolves.admin.pb.InterfaceStatus.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        interfaceStatus_ = java.util.Collections.unmodifiableList(interfaceStatus_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wolves.admin.pb.AdminCommon.internal_static_NodeStatus_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wolves.admin.pb.AdminCommon.internal_static_NodeStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wolves.admin.pb.NodeStatus.class, com.wolves.admin.pb.NodeStatus.Builder.class);
  }

  private int bitField0_;
  public static final int COLLECTTIME_FIELD_NUMBER = 1;
  private long collectTime_;
  /**
   * <code>int64 collectTime = 1;</code>
   */
  public long getCollectTime() {
    return collectTime_;
  }

  public static final int NODESTATUS_FIELD_NUMBER = 2;
  private int nodeStatus_;
  /**
   * <code>.NodeStatusEnum nodeStatus = 2;</code>
   */
  public int getNodeStatusValue() {
    return nodeStatus_;
  }
  /**
   * <code>.NodeStatusEnum nodeStatus = 2;</code>
   */
  public com.wolves.admin.pb.NodeStatusEnum getNodeStatus() {
    com.wolves.admin.pb.NodeStatusEnum result = com.wolves.admin.pb.NodeStatusEnum.valueOf(nodeStatus_);
    return result == null ? com.wolves.admin.pb.NodeStatusEnum.UNRECOGNIZED : result;
  }

  public static final int INTERFACESTATUS_FIELD_NUMBER = 3;
  private java.util.List<com.wolves.admin.pb.InterfaceStatus> interfaceStatus_;
  /**
   * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
   */
  public java.util.List<com.wolves.admin.pb.InterfaceStatus> getInterfaceStatusList() {
    return interfaceStatus_;
  }
  /**
   * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
   */
  public java.util.List<? extends com.wolves.admin.pb.InterfaceStatusOrBuilder> 
      getInterfaceStatusOrBuilderList() {
    return interfaceStatus_;
  }
  /**
   * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
   */
  public int getInterfaceStatusCount() {
    return interfaceStatus_.size();
  }
  /**
   * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
   */
  public com.wolves.admin.pb.InterfaceStatus getInterfaceStatus(int index) {
    return interfaceStatus_.get(index);
  }
  /**
   * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
   */
  public com.wolves.admin.pb.InterfaceStatusOrBuilder getInterfaceStatusOrBuilder(
      int index) {
    return interfaceStatus_.get(index);
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
    if (collectTime_ != 0L) {
      output.writeInt64(1, collectTime_);
    }
    if (nodeStatus_ != com.wolves.admin.pb.NodeStatusEnum.NA.getNumber()) {
      output.writeEnum(2, nodeStatus_);
    }
    for (int i = 0; i < interfaceStatus_.size(); i++) {
      output.writeMessage(3, interfaceStatus_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (collectTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, collectTime_);
    }
    if (nodeStatus_ != com.wolves.admin.pb.NodeStatusEnum.NA.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, nodeStatus_);
    }
    for (int i = 0; i < interfaceStatus_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, interfaceStatus_.get(i));
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
    if (!(obj instanceof com.wolves.admin.pb.NodeStatus)) {
      return super.equals(obj);
    }
    com.wolves.admin.pb.NodeStatus other = (com.wolves.admin.pb.NodeStatus) obj;

    boolean result = true;
    result = result && (getCollectTime()
        == other.getCollectTime());
    result = result && nodeStatus_ == other.nodeStatus_;
    result = result && getInterfaceStatusList()
        .equals(other.getInterfaceStatusList());
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
    hash = (37 * hash) + COLLECTTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCollectTime());
    hash = (37 * hash) + NODESTATUS_FIELD_NUMBER;
    hash = (53 * hash) + nodeStatus_;
    if (getInterfaceStatusCount() > 0) {
      hash = (37 * hash) + INTERFACESTATUS_FIELD_NUMBER;
      hash = (53 * hash) + getInterfaceStatusList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wolves.admin.pb.NodeStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.NodeStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.NodeStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.NodeStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.NodeStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.NodeStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.NodeStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.NodeStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.NodeStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.NodeStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.NodeStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.NodeStatus parseFrom(
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
  public static Builder newBuilder(com.wolves.admin.pb.NodeStatus prototype) {
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
   * Protobuf type {@code NodeStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:NodeStatus)
      com.wolves.admin.pb.NodeStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wolves.admin.pb.AdminCommon.internal_static_NodeStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wolves.admin.pb.AdminCommon.internal_static_NodeStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wolves.admin.pb.NodeStatus.class, com.wolves.admin.pb.NodeStatus.Builder.class);
    }

    // Construct using com.wolves.admin.pb.NodeStatus.newBuilder()
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
        getInterfaceStatusFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      collectTime_ = 0L;

      nodeStatus_ = 0;

      if (interfaceStatusBuilder_ == null) {
        interfaceStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        interfaceStatusBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wolves.admin.pb.AdminCommon.internal_static_NodeStatus_descriptor;
    }

    public com.wolves.admin.pb.NodeStatus getDefaultInstanceForType() {
      return com.wolves.admin.pb.NodeStatus.getDefaultInstance();
    }

    public com.wolves.admin.pb.NodeStatus build() {
      com.wolves.admin.pb.NodeStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wolves.admin.pb.NodeStatus buildPartial() {
      com.wolves.admin.pb.NodeStatus result = new com.wolves.admin.pb.NodeStatus(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.collectTime_ = collectTime_;
      result.nodeStatus_ = nodeStatus_;
      if (interfaceStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          interfaceStatus_ = java.util.Collections.unmodifiableList(interfaceStatus_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.interfaceStatus_ = interfaceStatus_;
      } else {
        result.interfaceStatus_ = interfaceStatusBuilder_.build();
      }
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
      if (other instanceof com.wolves.admin.pb.NodeStatus) {
        return mergeFrom((com.wolves.admin.pb.NodeStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wolves.admin.pb.NodeStatus other) {
      if (other == com.wolves.admin.pb.NodeStatus.getDefaultInstance()) return this;
      if (other.getCollectTime() != 0L) {
        setCollectTime(other.getCollectTime());
      }
      if (other.nodeStatus_ != 0) {
        setNodeStatusValue(other.getNodeStatusValue());
      }
      if (interfaceStatusBuilder_ == null) {
        if (!other.interfaceStatus_.isEmpty()) {
          if (interfaceStatus_.isEmpty()) {
            interfaceStatus_ = other.interfaceStatus_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureInterfaceStatusIsMutable();
            interfaceStatus_.addAll(other.interfaceStatus_);
          }
          onChanged();
        }
      } else {
        if (!other.interfaceStatus_.isEmpty()) {
          if (interfaceStatusBuilder_.isEmpty()) {
            interfaceStatusBuilder_.dispose();
            interfaceStatusBuilder_ = null;
            interfaceStatus_ = other.interfaceStatus_;
            bitField0_ = (bitField0_ & ~0x00000004);
            interfaceStatusBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInterfaceStatusFieldBuilder() : null;
          } else {
            interfaceStatusBuilder_.addAllMessages(other.interfaceStatus_);
          }
        }
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
      com.wolves.admin.pb.NodeStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wolves.admin.pb.NodeStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long collectTime_ ;
    /**
     * <code>int64 collectTime = 1;</code>
     */
    public long getCollectTime() {
      return collectTime_;
    }
    /**
     * <code>int64 collectTime = 1;</code>
     */
    public Builder setCollectTime(long value) {
      
      collectTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 collectTime = 1;</code>
     */
    public Builder clearCollectTime() {
      
      collectTime_ = 0L;
      onChanged();
      return this;
    }

    private int nodeStatus_ = 0;
    /**
     * <code>.NodeStatusEnum nodeStatus = 2;</code>
     */
    public int getNodeStatusValue() {
      return nodeStatus_;
    }
    /**
     * <code>.NodeStatusEnum nodeStatus = 2;</code>
     */
    public Builder setNodeStatusValue(int value) {
      nodeStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.NodeStatusEnum nodeStatus = 2;</code>
     */
    public com.wolves.admin.pb.NodeStatusEnum getNodeStatus() {
      com.wolves.admin.pb.NodeStatusEnum result = com.wolves.admin.pb.NodeStatusEnum.valueOf(nodeStatus_);
      return result == null ? com.wolves.admin.pb.NodeStatusEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.NodeStatusEnum nodeStatus = 2;</code>
     */
    public Builder setNodeStatus(com.wolves.admin.pb.NodeStatusEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      nodeStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.NodeStatusEnum nodeStatus = 2;</code>
     */
    public Builder clearNodeStatus() {
      
      nodeStatus_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.wolves.admin.pb.InterfaceStatus> interfaceStatus_ =
      java.util.Collections.emptyList();
    private void ensureInterfaceStatusIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        interfaceStatus_ = new java.util.ArrayList<com.wolves.admin.pb.InterfaceStatus>(interfaceStatus_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wolves.admin.pb.InterfaceStatus, com.wolves.admin.pb.InterfaceStatus.Builder, com.wolves.admin.pb.InterfaceStatusOrBuilder> interfaceStatusBuilder_;

    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public java.util.List<com.wolves.admin.pb.InterfaceStatus> getInterfaceStatusList() {
      if (interfaceStatusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(interfaceStatus_);
      } else {
        return interfaceStatusBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public int getInterfaceStatusCount() {
      if (interfaceStatusBuilder_ == null) {
        return interfaceStatus_.size();
      } else {
        return interfaceStatusBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public com.wolves.admin.pb.InterfaceStatus getInterfaceStatus(int index) {
      if (interfaceStatusBuilder_ == null) {
        return interfaceStatus_.get(index);
      } else {
        return interfaceStatusBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public Builder setInterfaceStatus(
        int index, com.wolves.admin.pb.InterfaceStatus value) {
      if (interfaceStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterfaceStatusIsMutable();
        interfaceStatus_.set(index, value);
        onChanged();
      } else {
        interfaceStatusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public Builder setInterfaceStatus(
        int index, com.wolves.admin.pb.InterfaceStatus.Builder builderForValue) {
      if (interfaceStatusBuilder_ == null) {
        ensureInterfaceStatusIsMutable();
        interfaceStatus_.set(index, builderForValue.build());
        onChanged();
      } else {
        interfaceStatusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public Builder addInterfaceStatus(com.wolves.admin.pb.InterfaceStatus value) {
      if (interfaceStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterfaceStatusIsMutable();
        interfaceStatus_.add(value);
        onChanged();
      } else {
        interfaceStatusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public Builder addInterfaceStatus(
        int index, com.wolves.admin.pb.InterfaceStatus value) {
      if (interfaceStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterfaceStatusIsMutable();
        interfaceStatus_.add(index, value);
        onChanged();
      } else {
        interfaceStatusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public Builder addInterfaceStatus(
        com.wolves.admin.pb.InterfaceStatus.Builder builderForValue) {
      if (interfaceStatusBuilder_ == null) {
        ensureInterfaceStatusIsMutable();
        interfaceStatus_.add(builderForValue.build());
        onChanged();
      } else {
        interfaceStatusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public Builder addInterfaceStatus(
        int index, com.wolves.admin.pb.InterfaceStatus.Builder builderForValue) {
      if (interfaceStatusBuilder_ == null) {
        ensureInterfaceStatusIsMutable();
        interfaceStatus_.add(index, builderForValue.build());
        onChanged();
      } else {
        interfaceStatusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public Builder addAllInterfaceStatus(
        java.lang.Iterable<? extends com.wolves.admin.pb.InterfaceStatus> values) {
      if (interfaceStatusBuilder_ == null) {
        ensureInterfaceStatusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, interfaceStatus_);
        onChanged();
      } else {
        interfaceStatusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public Builder clearInterfaceStatus() {
      if (interfaceStatusBuilder_ == null) {
        interfaceStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        interfaceStatusBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public Builder removeInterfaceStatus(int index) {
      if (interfaceStatusBuilder_ == null) {
        ensureInterfaceStatusIsMutable();
        interfaceStatus_.remove(index);
        onChanged();
      } else {
        interfaceStatusBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public com.wolves.admin.pb.InterfaceStatus.Builder getInterfaceStatusBuilder(
        int index) {
      return getInterfaceStatusFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public com.wolves.admin.pb.InterfaceStatusOrBuilder getInterfaceStatusOrBuilder(
        int index) {
      if (interfaceStatusBuilder_ == null) {
        return interfaceStatus_.get(index);  } else {
        return interfaceStatusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public java.util.List<? extends com.wolves.admin.pb.InterfaceStatusOrBuilder> 
         getInterfaceStatusOrBuilderList() {
      if (interfaceStatusBuilder_ != null) {
        return interfaceStatusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(interfaceStatus_);
      }
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public com.wolves.admin.pb.InterfaceStatus.Builder addInterfaceStatusBuilder() {
      return getInterfaceStatusFieldBuilder().addBuilder(
          com.wolves.admin.pb.InterfaceStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public com.wolves.admin.pb.InterfaceStatus.Builder addInterfaceStatusBuilder(
        int index) {
      return getInterfaceStatusFieldBuilder().addBuilder(
          index, com.wolves.admin.pb.InterfaceStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .InterfaceStatus interfaceStatus = 3;</code>
     */
    public java.util.List<com.wolves.admin.pb.InterfaceStatus.Builder> 
         getInterfaceStatusBuilderList() {
      return getInterfaceStatusFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wolves.admin.pb.InterfaceStatus, com.wolves.admin.pb.InterfaceStatus.Builder, com.wolves.admin.pb.InterfaceStatusOrBuilder> 
        getInterfaceStatusFieldBuilder() {
      if (interfaceStatusBuilder_ == null) {
        interfaceStatusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.wolves.admin.pb.InterfaceStatus, com.wolves.admin.pb.InterfaceStatus.Builder, com.wolves.admin.pb.InterfaceStatusOrBuilder>(
                interfaceStatus_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        interfaceStatus_ = null;
      }
      return interfaceStatusBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:NodeStatus)
  }

  // @@protoc_insertion_point(class_scope:NodeStatus)
  private static final com.wolves.admin.pb.NodeStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wolves.admin.pb.NodeStatus();
  }

  public static com.wolves.admin.pb.NodeStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeStatus>
      PARSER = new com.google.protobuf.AbstractParser<NodeStatus>() {
    public NodeStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new NodeStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NodeStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeStatus> getParserForType() {
    return PARSER;
  }

  public com.wolves.admin.pb.NodeStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

