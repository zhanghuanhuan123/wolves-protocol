// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin_com.proto

package com.wolves.admin.pb;

/**
 * Protobuf type {@code WhereIsRequest}
 */
public  final class WhereIsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:WhereIsRequest)
    WhereIsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WhereIsRequest.newBuilder() to construct.
  private WhereIsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WhereIsRequest() {
    ngLabel_ = "";
    ngVersion_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WhereIsRequest(
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

            ngLabel_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            ngVersion_ = s;
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
    return com.wolves.admin.pb.AdminCom.internal_static_WhereIsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wolves.admin.pb.AdminCom.internal_static_WhereIsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wolves.admin.pb.WhereIsRequest.class, com.wolves.admin.pb.WhereIsRequest.Builder.class);
  }

  public static final int NGLABEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object ngLabel_;
  /**
   * <code>string ngLabel = 1;</code>
   */
  public java.lang.String getNgLabel() {
    java.lang.Object ref = ngLabel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ngLabel_ = s;
      return s;
    }
  }
  /**
   * <code>string ngLabel = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNgLabelBytes() {
    java.lang.Object ref = ngLabel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ngLabel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NGVERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object ngVersion_;
  /**
   * <code>string ngVersion = 2;</code>
   */
  public java.lang.String getNgVersion() {
    java.lang.Object ref = ngVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ngVersion_ = s;
      return s;
    }
  }
  /**
   * <code>string ngVersion = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNgVersionBytes() {
    java.lang.Object ref = ngVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ngVersion_ = b;
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
    if (!getNgLabelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ngLabel_);
    }
    if (!getNgVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ngVersion_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNgLabelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ngLabel_);
    }
    if (!getNgVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ngVersion_);
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
    if (!(obj instanceof com.wolves.admin.pb.WhereIsRequest)) {
      return super.equals(obj);
    }
    com.wolves.admin.pb.WhereIsRequest other = (com.wolves.admin.pb.WhereIsRequest) obj;

    boolean result = true;
    result = result && getNgLabel()
        .equals(other.getNgLabel());
    result = result && getNgVersion()
        .equals(other.getNgVersion());
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
    hash = (37 * hash) + NGLABEL_FIELD_NUMBER;
    hash = (53 * hash) + getNgLabel().hashCode();
    hash = (37 * hash) + NGVERSION_FIELD_NUMBER;
    hash = (53 * hash) + getNgVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wolves.admin.pb.WhereIsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.WhereIsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.WhereIsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.WhereIsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.WhereIsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wolves.admin.pb.WhereIsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wolves.admin.pb.WhereIsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.WhereIsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.WhereIsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.WhereIsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wolves.admin.pb.WhereIsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wolves.admin.pb.WhereIsRequest parseFrom(
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
  public static Builder newBuilder(com.wolves.admin.pb.WhereIsRequest prototype) {
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
   * Protobuf type {@code WhereIsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:WhereIsRequest)
      com.wolves.admin.pb.WhereIsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wolves.admin.pb.AdminCom.internal_static_WhereIsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wolves.admin.pb.AdminCom.internal_static_WhereIsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wolves.admin.pb.WhereIsRequest.class, com.wolves.admin.pb.WhereIsRequest.Builder.class);
    }

    // Construct using com.wolves.admin.pb.WhereIsRequest.newBuilder()
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
      ngLabel_ = "";

      ngVersion_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wolves.admin.pb.AdminCom.internal_static_WhereIsRequest_descriptor;
    }

    public com.wolves.admin.pb.WhereIsRequest getDefaultInstanceForType() {
      return com.wolves.admin.pb.WhereIsRequest.getDefaultInstance();
    }

    public com.wolves.admin.pb.WhereIsRequest build() {
      com.wolves.admin.pb.WhereIsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wolves.admin.pb.WhereIsRequest buildPartial() {
      com.wolves.admin.pb.WhereIsRequest result = new com.wolves.admin.pb.WhereIsRequest(this);
      result.ngLabel_ = ngLabel_;
      result.ngVersion_ = ngVersion_;
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
      if (other instanceof com.wolves.admin.pb.WhereIsRequest) {
        return mergeFrom((com.wolves.admin.pb.WhereIsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wolves.admin.pb.WhereIsRequest other) {
      if (other == com.wolves.admin.pb.WhereIsRequest.getDefaultInstance()) return this;
      if (!other.getNgLabel().isEmpty()) {
        ngLabel_ = other.ngLabel_;
        onChanged();
      }
      if (!other.getNgVersion().isEmpty()) {
        ngVersion_ = other.ngVersion_;
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
      com.wolves.admin.pb.WhereIsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wolves.admin.pb.WhereIsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ngLabel_ = "";
    /**
     * <code>string ngLabel = 1;</code>
     */
    public java.lang.String getNgLabel() {
      java.lang.Object ref = ngLabel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ngLabel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ngLabel = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNgLabelBytes() {
      java.lang.Object ref = ngLabel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ngLabel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ngLabel = 1;</code>
     */
    public Builder setNgLabel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ngLabel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ngLabel = 1;</code>
     */
    public Builder clearNgLabel() {
      
      ngLabel_ = getDefaultInstance().getNgLabel();
      onChanged();
      return this;
    }
    /**
     * <code>string ngLabel = 1;</code>
     */
    public Builder setNgLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ngLabel_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ngVersion_ = "";
    /**
     * <code>string ngVersion = 2;</code>
     */
    public java.lang.String getNgVersion() {
      java.lang.Object ref = ngVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ngVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ngVersion = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNgVersionBytes() {
      java.lang.Object ref = ngVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ngVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ngVersion = 2;</code>
     */
    public Builder setNgVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ngVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ngVersion = 2;</code>
     */
    public Builder clearNgVersion() {
      
      ngVersion_ = getDefaultInstance().getNgVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string ngVersion = 2;</code>
     */
    public Builder setNgVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ngVersion_ = value;
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


    // @@protoc_insertion_point(builder_scope:WhereIsRequest)
  }

  // @@protoc_insertion_point(class_scope:WhereIsRequest)
  private static final com.wolves.admin.pb.WhereIsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wolves.admin.pb.WhereIsRequest();
  }

  public static com.wolves.admin.pb.WhereIsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WhereIsRequest>
      PARSER = new com.google.protobuf.AbstractParser<WhereIsRequest>() {
    public WhereIsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new WhereIsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WhereIsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WhereIsRequest> getParserForType() {
    return PARSER;
  }

  public com.wolves.admin.pb.WhereIsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

