// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: outpost_com.proto

package com.wolves.outpost.pb;

/**
 * Protobuf type {@code GetProcessResponse}
 */
public  final class GetProcessResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetProcessResponse)
    GetProcessResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetProcessResponse.newBuilder() to construct.
  private GetProcessResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetProcessResponse() {
    process_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetProcessResponse(
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
              process_ = new java.util.ArrayList<com.wolves.outpost.pb.OsProcess>();
              mutable_bitField0_ |= 0x00000001;
            }
            process_.add(
                input.readMessage(com.wolves.outpost.pb.OsProcess.parser(), extensionRegistry));
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
        process_ = java.util.Collections.unmodifiableList(process_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wolves.outpost.pb.OutpostCom.internal_static_GetProcessResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wolves.outpost.pb.OutpostCom.internal_static_GetProcessResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wolves.outpost.pb.GetProcessResponse.class, com.wolves.outpost.pb.GetProcessResponse.Builder.class);
  }

  public static final int PROCESS_FIELD_NUMBER = 1;
  private java.util.List<com.wolves.outpost.pb.OsProcess> process_;
  /**
   * <code>repeated .OsProcess process = 1;</code>
   */
  public java.util.List<com.wolves.outpost.pb.OsProcess> getProcessList() {
    return process_;
  }
  /**
   * <code>repeated .OsProcess process = 1;</code>
   */
  public java.util.List<? extends com.wolves.outpost.pb.OsProcessOrBuilder> 
      getProcessOrBuilderList() {
    return process_;
  }
  /**
   * <code>repeated .OsProcess process = 1;</code>
   */
  public int getProcessCount() {
    return process_.size();
  }
  /**
   * <code>repeated .OsProcess process = 1;</code>
   */
  public com.wolves.outpost.pb.OsProcess getProcess(int index) {
    return process_.get(index);
  }
  /**
   * <code>repeated .OsProcess process = 1;</code>
   */
  public com.wolves.outpost.pb.OsProcessOrBuilder getProcessOrBuilder(
      int index) {
    return process_.get(index);
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
    for (int i = 0; i < process_.size(); i++) {
      output.writeMessage(1, process_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < process_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, process_.get(i));
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
    if (!(obj instanceof com.wolves.outpost.pb.GetProcessResponse)) {
      return super.equals(obj);
    }
    com.wolves.outpost.pb.GetProcessResponse other = (com.wolves.outpost.pb.GetProcessResponse) obj;

    boolean result = true;
    result = result && getProcessList()
        .equals(other.getProcessList());
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
    if (getProcessCount() > 0) {
      hash = (37 * hash) + PROCESS_FIELD_NUMBER;
      hash = (53 * hash) + getProcessList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wolves.outpost.pb.GetProcessResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.outpost.pb.GetProcessResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.outpost.pb.GetProcessResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.outpost.pb.GetProcessResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.outpost.pb.GetProcessResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.outpost.pb.GetProcessResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.outpost.pb.GetProcessResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.outpost.pb.GetProcessResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.outpost.pb.GetProcessResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wolves.outpost.pb.GetProcessResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.outpost.pb.GetProcessResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.outpost.pb.GetProcessResponse parseFrom(
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
  public static Builder newBuilder(com.wolves.outpost.pb.GetProcessResponse prototype) {
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
   * Protobuf type {@code GetProcessResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetProcessResponse)
      com.wolves.outpost.pb.GetProcessResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wolves.outpost.pb.OutpostCom.internal_static_GetProcessResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wolves.outpost.pb.OutpostCom.internal_static_GetProcessResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wolves.outpost.pb.GetProcessResponse.class, com.wolves.outpost.pb.GetProcessResponse.Builder.class);
    }

    // Construct using com.wolves.outpost.pb.GetProcessResponse.newBuilder()
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
        getProcessFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (processBuilder_ == null) {
        process_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        processBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wolves.outpost.pb.OutpostCom.internal_static_GetProcessResponse_descriptor;
    }

    public com.wolves.outpost.pb.GetProcessResponse getDefaultInstanceForType() {
      return com.wolves.outpost.pb.GetProcessResponse.getDefaultInstance();
    }

    public com.wolves.outpost.pb.GetProcessResponse build() {
      com.wolves.outpost.pb.GetProcessResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wolves.outpost.pb.GetProcessResponse buildPartial() {
      com.wolves.outpost.pb.GetProcessResponse result = new com.wolves.outpost.pb.GetProcessResponse(this);
      int from_bitField0_ = bitField0_;
      if (processBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          process_ = java.util.Collections.unmodifiableList(process_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.process_ = process_;
      } else {
        result.process_ = processBuilder_.build();
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
      if (other instanceof com.wolves.outpost.pb.GetProcessResponse) {
        return mergeFrom((com.wolves.outpost.pb.GetProcessResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wolves.outpost.pb.GetProcessResponse other) {
      if (other == com.wolves.outpost.pb.GetProcessResponse.getDefaultInstance()) return this;
      if (processBuilder_ == null) {
        if (!other.process_.isEmpty()) {
          if (process_.isEmpty()) {
            process_ = other.process_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProcessIsMutable();
            process_.addAll(other.process_);
          }
          onChanged();
        }
      } else {
        if (!other.process_.isEmpty()) {
          if (processBuilder_.isEmpty()) {
            processBuilder_.dispose();
            processBuilder_ = null;
            process_ = other.process_;
            bitField0_ = (bitField0_ & ~0x00000001);
            processBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProcessFieldBuilder() : null;
          } else {
            processBuilder_.addAllMessages(other.process_);
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
      com.wolves.outpost.pb.GetProcessResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wolves.outpost.pb.GetProcessResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.wolves.outpost.pb.OsProcess> process_ =
      java.util.Collections.emptyList();
    private void ensureProcessIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        process_ = new java.util.ArrayList<com.wolves.outpost.pb.OsProcess>(process_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wolves.outpost.pb.OsProcess, com.wolves.outpost.pb.OsProcess.Builder, com.wolves.outpost.pb.OsProcessOrBuilder> processBuilder_;

    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public java.util.List<com.wolves.outpost.pb.OsProcess> getProcessList() {
      if (processBuilder_ == null) {
        return java.util.Collections.unmodifiableList(process_);
      } else {
        return processBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public int getProcessCount() {
      if (processBuilder_ == null) {
        return process_.size();
      } else {
        return processBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public com.wolves.outpost.pb.OsProcess getProcess(int index) {
      if (processBuilder_ == null) {
        return process_.get(index);
      } else {
        return processBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public Builder setProcess(
        int index, com.wolves.outpost.pb.OsProcess value) {
      if (processBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessIsMutable();
        process_.set(index, value);
        onChanged();
      } else {
        processBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public Builder setProcess(
        int index, com.wolves.outpost.pb.OsProcess.Builder builderForValue) {
      if (processBuilder_ == null) {
        ensureProcessIsMutable();
        process_.set(index, builderForValue.build());
        onChanged();
      } else {
        processBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public Builder addProcess(com.wolves.outpost.pb.OsProcess value) {
      if (processBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessIsMutable();
        process_.add(value);
        onChanged();
      } else {
        processBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public Builder addProcess(
        int index, com.wolves.outpost.pb.OsProcess value) {
      if (processBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessIsMutable();
        process_.add(index, value);
        onChanged();
      } else {
        processBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public Builder addProcess(
        com.wolves.outpost.pb.OsProcess.Builder builderForValue) {
      if (processBuilder_ == null) {
        ensureProcessIsMutable();
        process_.add(builderForValue.build());
        onChanged();
      } else {
        processBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public Builder addProcess(
        int index, com.wolves.outpost.pb.OsProcess.Builder builderForValue) {
      if (processBuilder_ == null) {
        ensureProcessIsMutable();
        process_.add(index, builderForValue.build());
        onChanged();
      } else {
        processBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public Builder addAllProcess(
        java.lang.Iterable<? extends com.wolves.outpost.pb.OsProcess> values) {
      if (processBuilder_ == null) {
        ensureProcessIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, process_);
        onChanged();
      } else {
        processBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public Builder clearProcess() {
      if (processBuilder_ == null) {
        process_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        processBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public Builder removeProcess(int index) {
      if (processBuilder_ == null) {
        ensureProcessIsMutable();
        process_.remove(index);
        onChanged();
      } else {
        processBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public com.wolves.outpost.pb.OsProcess.Builder getProcessBuilder(
        int index) {
      return getProcessFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public com.wolves.outpost.pb.OsProcessOrBuilder getProcessOrBuilder(
        int index) {
      if (processBuilder_ == null) {
        return process_.get(index);  } else {
        return processBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public java.util.List<? extends com.wolves.outpost.pb.OsProcessOrBuilder> 
         getProcessOrBuilderList() {
      if (processBuilder_ != null) {
        return processBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(process_);
      }
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public com.wolves.outpost.pb.OsProcess.Builder addProcessBuilder() {
      return getProcessFieldBuilder().addBuilder(
          com.wolves.outpost.pb.OsProcess.getDefaultInstance());
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public com.wolves.outpost.pb.OsProcess.Builder addProcessBuilder(
        int index) {
      return getProcessFieldBuilder().addBuilder(
          index, com.wolves.outpost.pb.OsProcess.getDefaultInstance());
    }
    /**
     * <code>repeated .OsProcess process = 1;</code>
     */
    public java.util.List<com.wolves.outpost.pb.OsProcess.Builder> 
         getProcessBuilderList() {
      return getProcessFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wolves.outpost.pb.OsProcess, com.wolves.outpost.pb.OsProcess.Builder, com.wolves.outpost.pb.OsProcessOrBuilder> 
        getProcessFieldBuilder() {
      if (processBuilder_ == null) {
        processBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.wolves.outpost.pb.OsProcess, com.wolves.outpost.pb.OsProcess.Builder, com.wolves.outpost.pb.OsProcessOrBuilder>(
                process_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        process_ = null;
      }
      return processBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GetProcessResponse)
  }

  // @@protoc_insertion_point(class_scope:GetProcessResponse)
  private static final com.wolves.outpost.pb.GetProcessResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wolves.outpost.pb.GetProcessResponse();
  }

  public static com.wolves.outpost.pb.GetProcessResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetProcessResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetProcessResponse>() {
    public GetProcessResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetProcessResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetProcessResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetProcessResponse> getParserForType() {
    return PARSER;
  }

  public com.wolves.outpost.pb.GetProcessResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
