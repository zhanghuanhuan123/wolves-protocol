// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin_com.proto

package com.wolves.admin.pb;

/**
 * Protobuf type {@code GetConfigResponse}
 */
public  final class GetConfigResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetConfigResponse)
    GetConfigResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetConfigResponse.newBuilder() to construct.
  private GetConfigResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetConfigResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetConfigResponse(
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
            com.wolves.admin.pb.BaseNodeConfig.Builder subBuilder = null;
            if (nodeConfig_ != null) {
              subBuilder = nodeConfig_.toBuilder();
            }
            nodeConfig_ = input.readMessage(com.wolves.admin.pb.BaseNodeConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nodeConfig_);
              nodeConfig_ = subBuilder.buildPartial();
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
    return com.wolves.admin.pb.AdminCom.internal_static_GetConfigResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wolves.admin.pb.AdminCom.internal_static_GetConfigResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wolves.admin.pb.GetConfigResponse.class, com.wolves.admin.pb.GetConfigResponse.Builder.class);
  }

  public static final int NODECONFIG_FIELD_NUMBER = 1;
  private com.wolves.admin.pb.BaseNodeConfig nodeConfig_;
  /**
   * <code>.BaseNodeConfig nodeConfig = 1;</code>
   */
  public boolean hasNodeConfig() {
    return nodeConfig_ != null;
  }
  /**
   * <code>.BaseNodeConfig nodeConfig = 1;</code>
   */
  public com.wolves.admin.pb.BaseNodeConfig getNodeConfig() {
    return nodeConfig_ == null ? com.wolves.admin.pb.BaseNodeConfig.getDefaultInstance() : nodeConfig_;
  }
  /**
   * <code>.BaseNodeConfig nodeConfig = 1;</code>
   */
  public com.wolves.admin.pb.BaseNodeConfigOrBuilder getNodeConfigOrBuilder() {
    return getNodeConfig();
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
    if (nodeConfig_ != null) {
      output.writeMessage(1, getNodeConfig());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodeConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNodeConfig());
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
    if (!(obj instanceof com.wolves.admin.pb.GetConfigResponse)) {
      return super.equals(obj);
    }
    com.wolves.admin.pb.GetConfigResponse other = (com.wolves.admin.pb.GetConfigResponse) obj;

    boolean result = true;
    result = result && (hasNodeConfig() == other.hasNodeConfig());
    if (hasNodeConfig()) {
      result = result && getNodeConfig()
          .equals(other.getNodeConfig());
    }
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
    if (hasNodeConfig()) {
      hash = (37 * hash) + NODECONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getNodeConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wolves.admin.pb.GetConfigResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.GetConfigResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetConfigResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.GetConfigResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetConfigResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.GetConfigResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetConfigResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.GetConfigResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetConfigResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.GetConfigResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.GetConfigResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.GetConfigResponse parseFrom(
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
  public static Builder newBuilder(com.wolves.admin.pb.GetConfigResponse prototype) {
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
   * Protobuf type {@code GetConfigResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetConfigResponse)
      com.wolves.admin.pb.GetConfigResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wolves.admin.pb.AdminCom.internal_static_GetConfigResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wolves.admin.pb.AdminCom.internal_static_GetConfigResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wolves.admin.pb.GetConfigResponse.class, com.wolves.admin.pb.GetConfigResponse.Builder.class);
    }

    // Construct using com.wolves.admin.pb.GetConfigResponse.newBuilder()
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
      if (nodeConfigBuilder_ == null) {
        nodeConfig_ = null;
      } else {
        nodeConfig_ = null;
        nodeConfigBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wolves.admin.pb.AdminCom.internal_static_GetConfigResponse_descriptor;
    }

    public com.wolves.admin.pb.GetConfigResponse getDefaultInstanceForType() {
      return com.wolves.admin.pb.GetConfigResponse.getDefaultInstance();
    }

    public com.wolves.admin.pb.GetConfigResponse build() {
      com.wolves.admin.pb.GetConfigResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wolves.admin.pb.GetConfigResponse buildPartial() {
      com.wolves.admin.pb.GetConfigResponse result = new com.wolves.admin.pb.GetConfigResponse(this);
      if (nodeConfigBuilder_ == null) {
        result.nodeConfig_ = nodeConfig_;
      } else {
        result.nodeConfig_ = nodeConfigBuilder_.build();
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
      if (other instanceof com.wolves.admin.pb.GetConfigResponse) {
        return mergeFrom((com.wolves.admin.pb.GetConfigResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wolves.admin.pb.GetConfigResponse other) {
      if (other == com.wolves.admin.pb.GetConfigResponse.getDefaultInstance()) return this;
      if (other.hasNodeConfig()) {
        mergeNodeConfig(other.getNodeConfig());
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
      com.wolves.admin.pb.GetConfigResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wolves.admin.pb.GetConfigResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.wolves.admin.pb.BaseNodeConfig nodeConfig_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wolves.admin.pb.BaseNodeConfig, com.wolves.admin.pb.BaseNodeConfig.Builder, com.wolves.admin.pb.BaseNodeConfigOrBuilder> nodeConfigBuilder_;
    /**
     * <code>.BaseNodeConfig nodeConfig = 1;</code>
     */
    public boolean hasNodeConfig() {
      return nodeConfigBuilder_ != null || nodeConfig_ != null;
    }
    /**
     * <code>.BaseNodeConfig nodeConfig = 1;</code>
     */
    public com.wolves.admin.pb.BaseNodeConfig getNodeConfig() {
      if (nodeConfigBuilder_ == null) {
        return nodeConfig_ == null ? com.wolves.admin.pb.BaseNodeConfig.getDefaultInstance() : nodeConfig_;
      } else {
        return nodeConfigBuilder_.getMessage();
      }
    }
    /**
     * <code>.BaseNodeConfig nodeConfig = 1;</code>
     */
    public Builder setNodeConfig(com.wolves.admin.pb.BaseNodeConfig value) {
      if (nodeConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nodeConfig_ = value;
        onChanged();
      } else {
        nodeConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.BaseNodeConfig nodeConfig = 1;</code>
     */
    public Builder setNodeConfig(
        com.wolves.admin.pb.BaseNodeConfig.Builder builderForValue) {
      if (nodeConfigBuilder_ == null) {
        nodeConfig_ = builderForValue.build();
        onChanged();
      } else {
        nodeConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.BaseNodeConfig nodeConfig = 1;</code>
     */
    public Builder mergeNodeConfig(com.wolves.admin.pb.BaseNodeConfig value) {
      if (nodeConfigBuilder_ == null) {
        if (nodeConfig_ != null) {
          nodeConfig_ =
            com.wolves.admin.pb.BaseNodeConfig.newBuilder(nodeConfig_).mergeFrom(value).buildPartial();
        } else {
          nodeConfig_ = value;
        }
        onChanged();
      } else {
        nodeConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.BaseNodeConfig nodeConfig = 1;</code>
     */
    public Builder clearNodeConfig() {
      if (nodeConfigBuilder_ == null) {
        nodeConfig_ = null;
        onChanged();
      } else {
        nodeConfig_ = null;
        nodeConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.BaseNodeConfig nodeConfig = 1;</code>
     */
    public com.wolves.admin.pb.BaseNodeConfig.Builder getNodeConfigBuilder() {
      
      onChanged();
      return getNodeConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.BaseNodeConfig nodeConfig = 1;</code>
     */
    public com.wolves.admin.pb.BaseNodeConfigOrBuilder getNodeConfigOrBuilder() {
      if (nodeConfigBuilder_ != null) {
        return nodeConfigBuilder_.getMessageOrBuilder();
      } else {
        return nodeConfig_ == null ?
            com.wolves.admin.pb.BaseNodeConfig.getDefaultInstance() : nodeConfig_;
      }
    }
    /**
     * <code>.BaseNodeConfig nodeConfig = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wolves.admin.pb.BaseNodeConfig, com.wolves.admin.pb.BaseNodeConfig.Builder, com.wolves.admin.pb.BaseNodeConfigOrBuilder> 
        getNodeConfigFieldBuilder() {
      if (nodeConfigBuilder_ == null) {
        nodeConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.wolves.admin.pb.BaseNodeConfig, com.wolves.admin.pb.BaseNodeConfig.Builder, com.wolves.admin.pb.BaseNodeConfigOrBuilder>(
                getNodeConfig(),
                getParentForChildren(),
                isClean());
        nodeConfig_ = null;
      }
      return nodeConfigBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GetConfigResponse)
  }

  // @@protoc_insertion_point(class_scope:GetConfigResponse)
  private static final com.wolves.admin.pb.GetConfigResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wolves.admin.pb.GetConfigResponse();
  }

  public static com.wolves.admin.pb.GetConfigResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetConfigResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetConfigResponse>() {
    public GetConfigResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetConfigResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetConfigResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetConfigResponse> getParserForType() {
    return PARSER;
  }

  public com.wolves.admin.pb.GetConfigResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

