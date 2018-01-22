// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin_com.proto

package com.wolves.admin.pb;

/**
 * Protobuf type {@code GetNodeHisResponse}
 */
public  final class GetNodeHisResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetNodeHisResponse)
    GetNodeHisResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetNodeHisResponse.newBuilder() to construct.
  private GetNodeHisResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetNodeHisResponse() {
    nodeStatuz_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetNodeHisResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              nodeStatuz_ = new java.util.ArrayList<com.wolves.admin.pb.NodeStatus>();
              mutable_bitField0_ |= 0x00000001;
            }
            nodeStatuz_.add(
                input.readMessage(com.wolves.admin.pb.NodeStatus.parser(), extensionRegistry));
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
        nodeStatuz_ = java.util.Collections.unmodifiableList(nodeStatuz_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wolves.admin.pb.AdminCom.internal_static_GetNodeHisResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wolves.admin.pb.AdminCom.internal_static_GetNodeHisResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wolves.admin.pb.GetNodeHisResponse.class, com.wolves.admin.pb.GetNodeHisResponse.Builder.class);
  }

  public static final int NODESTATUZ_FIELD_NUMBER = 1;
  private java.util.List<com.wolves.admin.pb.NodeStatus> nodeStatuz_;
  /**
   * <code>repeated .NodeStatus nodeStatuz = 1;</code>
   */
  public java.util.List<com.wolves.admin.pb.NodeStatus> getNodeStatuzList() {
    return nodeStatuz_;
  }
  /**
   * <code>repeated .NodeStatus nodeStatuz = 1;</code>
   */
  public java.util.List<? extends com.wolves.admin.pb.NodeStatusOrBuilder> 
      getNodeStatuzOrBuilderList() {
    return nodeStatuz_;
  }
  /**
   * <code>repeated .NodeStatus nodeStatuz = 1;</code>
   */
  public int getNodeStatuzCount() {
    return nodeStatuz_.size();
  }
  /**
   * <code>repeated .NodeStatus nodeStatuz = 1;</code>
   */
  public com.wolves.admin.pb.NodeStatus getNodeStatuz(int index) {
    return nodeStatuz_.get(index);
  }
  /**
   * <code>repeated .NodeStatus nodeStatuz = 1;</code>
   */
  public com.wolves.admin.pb.NodeStatusOrBuilder getNodeStatuzOrBuilder(
      int index) {
    return nodeStatuz_.get(index);
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
    for (int i = 0; i < nodeStatuz_.size(); i++) {
      output.writeMessage(1, nodeStatuz_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nodeStatuz_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nodeStatuz_.get(i));
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
    if (!(obj instanceof com.wolves.admin.pb.GetNodeHisResponse)) {
      return super.equals(obj);
    }
    com.wolves.admin.pb.GetNodeHisResponse other = (com.wolves.admin.pb.GetNodeHisResponse) obj;

    boolean result = true;
    result = result && getNodeStatuzList()
        .equals(other.getNodeStatuzList());
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
    if (getNodeStatuzCount() > 0) {
      hash = (37 * hash) + NODESTATUZ_FIELD_NUMBER;
      hash = (53 * hash) + getNodeStatuzList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wolves.admin.pb.GetNodeHisResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.GetNodeHisResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetNodeHisResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.GetNodeHisResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetNodeHisResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.GetNodeHisResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetNodeHisResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.GetNodeHisResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetNodeHisResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.GetNodeHisResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetNodeHisResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.GetNodeHisResponse parseFrom(
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
  public static Builder newBuilder(com.wolves.admin.pb.GetNodeHisResponse prototype) {
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
   * Protobuf type {@code GetNodeHisResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetNodeHisResponse)
      com.wolves.admin.pb.GetNodeHisResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wolves.admin.pb.AdminCom.internal_static_GetNodeHisResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wolves.admin.pb.AdminCom.internal_static_GetNodeHisResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wolves.admin.pb.GetNodeHisResponse.class, com.wolves.admin.pb.GetNodeHisResponse.Builder.class);
    }

    // Construct using com.wolves.admin.pb.GetNodeHisResponse.newBuilder()
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
        getNodeStatuzFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (nodeStatuzBuilder_ == null) {
        nodeStatuz_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        nodeStatuzBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wolves.admin.pb.AdminCom.internal_static_GetNodeHisResponse_descriptor;
    }

    public com.wolves.admin.pb.GetNodeHisResponse getDefaultInstanceForType() {
      return com.wolves.admin.pb.GetNodeHisResponse.getDefaultInstance();
    }

    public com.wolves.admin.pb.GetNodeHisResponse build() {
      com.wolves.admin.pb.GetNodeHisResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wolves.admin.pb.GetNodeHisResponse buildPartial() {
      com.wolves.admin.pb.GetNodeHisResponse result = new com.wolves.admin.pb.GetNodeHisResponse(this);
      int from_bitField0_ = bitField0_;
      if (nodeStatuzBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          nodeStatuz_ = java.util.Collections.unmodifiableList(nodeStatuz_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nodeStatuz_ = nodeStatuz_;
      } else {
        result.nodeStatuz_ = nodeStatuzBuilder_.build();
      }
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
      if (other instanceof com.wolves.admin.pb.GetNodeHisResponse) {
        return mergeFrom((com.wolves.admin.pb.GetNodeHisResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wolves.admin.pb.GetNodeHisResponse other) {
      if (other == com.wolves.admin.pb.GetNodeHisResponse.getDefaultInstance()) return this;
      if (nodeStatuzBuilder_ == null) {
        if (!other.nodeStatuz_.isEmpty()) {
          if (nodeStatuz_.isEmpty()) {
            nodeStatuz_ = other.nodeStatuz_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNodeStatuzIsMutable();
            nodeStatuz_.addAll(other.nodeStatuz_);
          }
          onChanged();
        }
      } else {
        if (!other.nodeStatuz_.isEmpty()) {
          if (nodeStatuzBuilder_.isEmpty()) {
            nodeStatuzBuilder_.dispose();
            nodeStatuzBuilder_ = null;
            nodeStatuz_ = other.nodeStatuz_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nodeStatuzBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNodeStatuzFieldBuilder() : null;
          } else {
            nodeStatuzBuilder_.addAllMessages(other.nodeStatuz_);
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
      com.wolves.admin.pb.GetNodeHisResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wolves.admin.pb.GetNodeHisResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.wolves.admin.pb.NodeStatus> nodeStatuz_ =
      java.util.Collections.emptyList();
    private void ensureNodeStatuzIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        nodeStatuz_ = new java.util.ArrayList<com.wolves.admin.pb.NodeStatus>(nodeStatuz_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wolves.admin.pb.NodeStatus, com.wolves.admin.pb.NodeStatus.Builder, com.wolves.admin.pb.NodeStatusOrBuilder> nodeStatuzBuilder_;

    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public java.util.List<com.wolves.admin.pb.NodeStatus> getNodeStatuzList() {
      if (nodeStatuzBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nodeStatuz_);
      } else {
        return nodeStatuzBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public int getNodeStatuzCount() {
      if (nodeStatuzBuilder_ == null) {
        return nodeStatuz_.size();
      } else {
        return nodeStatuzBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public com.wolves.admin.pb.NodeStatus getNodeStatuz(int index) {
      if (nodeStatuzBuilder_ == null) {
        return nodeStatuz_.get(index);
      } else {
        return nodeStatuzBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public Builder setNodeStatuz(
        int index, com.wolves.admin.pb.NodeStatus value) {
      if (nodeStatuzBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodeStatuzIsMutable();
        nodeStatuz_.set(index, value);
        onChanged();
      } else {
        nodeStatuzBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public Builder setNodeStatuz(
        int index, com.wolves.admin.pb.NodeStatus.Builder builderForValue) {
      if (nodeStatuzBuilder_ == null) {
        ensureNodeStatuzIsMutable();
        nodeStatuz_.set(index, builderForValue.build());
        onChanged();
      } else {
        nodeStatuzBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public Builder addNodeStatuz(com.wolves.admin.pb.NodeStatus value) {
      if (nodeStatuzBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodeStatuzIsMutable();
        nodeStatuz_.add(value);
        onChanged();
      } else {
        nodeStatuzBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public Builder addNodeStatuz(
        int index, com.wolves.admin.pb.NodeStatus value) {
      if (nodeStatuzBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodeStatuzIsMutable();
        nodeStatuz_.add(index, value);
        onChanged();
      } else {
        nodeStatuzBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public Builder addNodeStatuz(
        com.wolves.admin.pb.NodeStatus.Builder builderForValue) {
      if (nodeStatuzBuilder_ == null) {
        ensureNodeStatuzIsMutable();
        nodeStatuz_.add(builderForValue.build());
        onChanged();
      } else {
        nodeStatuzBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public Builder addNodeStatuz(
        int index, com.wolves.admin.pb.NodeStatus.Builder builderForValue) {
      if (nodeStatuzBuilder_ == null) {
        ensureNodeStatuzIsMutable();
        nodeStatuz_.add(index, builderForValue.build());
        onChanged();
      } else {
        nodeStatuzBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public Builder addAllNodeStatuz(
        java.lang.Iterable<? extends com.wolves.admin.pb.NodeStatus> values) {
      if (nodeStatuzBuilder_ == null) {
        ensureNodeStatuzIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nodeStatuz_);
        onChanged();
      } else {
        nodeStatuzBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public Builder clearNodeStatuz() {
      if (nodeStatuzBuilder_ == null) {
        nodeStatuz_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nodeStatuzBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public Builder removeNodeStatuz(int index) {
      if (nodeStatuzBuilder_ == null) {
        ensureNodeStatuzIsMutable();
        nodeStatuz_.remove(index);
        onChanged();
      } else {
        nodeStatuzBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public com.wolves.admin.pb.NodeStatus.Builder getNodeStatuzBuilder(
        int index) {
      return getNodeStatuzFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public com.wolves.admin.pb.NodeStatusOrBuilder getNodeStatuzOrBuilder(
        int index) {
      if (nodeStatuzBuilder_ == null) {
        return nodeStatuz_.get(index);  } else {
        return nodeStatuzBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public java.util.List<? extends com.wolves.admin.pb.NodeStatusOrBuilder> 
         getNodeStatuzOrBuilderList() {
      if (nodeStatuzBuilder_ != null) {
        return nodeStatuzBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nodeStatuz_);
      }
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public com.wolves.admin.pb.NodeStatus.Builder addNodeStatuzBuilder() {
      return getNodeStatuzFieldBuilder().addBuilder(
          com.wolves.admin.pb.NodeStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public com.wolves.admin.pb.NodeStatus.Builder addNodeStatuzBuilder(
        int index) {
      return getNodeStatuzFieldBuilder().addBuilder(
          index, com.wolves.admin.pb.NodeStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .NodeStatus nodeStatuz = 1;</code>
     */
    public java.util.List<com.wolves.admin.pb.NodeStatus.Builder> 
         getNodeStatuzBuilderList() {
      return getNodeStatuzFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wolves.admin.pb.NodeStatus, com.wolves.admin.pb.NodeStatus.Builder, com.wolves.admin.pb.NodeStatusOrBuilder> 
        getNodeStatuzFieldBuilder() {
      if (nodeStatuzBuilder_ == null) {
        nodeStatuzBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.wolves.admin.pb.NodeStatus, com.wolves.admin.pb.NodeStatus.Builder, com.wolves.admin.pb.NodeStatusOrBuilder>(
                nodeStatuz_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        nodeStatuz_ = null;
      }
      return nodeStatuzBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GetNodeHisResponse)
  }

  // @@protoc_insertion_point(class_scope:GetNodeHisResponse)
  private static final com.wolves.admin.pb.GetNodeHisResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wolves.admin.pb.GetNodeHisResponse();
  }

  public static com.wolves.admin.pb.GetNodeHisResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNodeHisResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetNodeHisResponse>() {
    public GetNodeHisResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetNodeHisResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetNodeHisResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNodeHisResponse> getParserForType() {
    return PARSER;
  }

  public com.wolves.admin.pb.GetNodeHisResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

