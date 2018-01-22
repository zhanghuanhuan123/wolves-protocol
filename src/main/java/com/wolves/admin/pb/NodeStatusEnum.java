// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin_common.proto

package com.wolves.admin.pb;

/**
 * Protobuf enum {@code NodeStatusEnum}
 */
public enum NodeStatusEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NA = 0;</code>
   */
  NA(0),
  /**
   * <code>OFF = 1;</code>
   */
  OFF(1),
  /**
   * <code>STANDBY = 2;</code>
   */
  STANDBY(2),
  /**
   * <code>READY = 3;</code>
   */
  READY(3),
  /**
   * <code>ON = 4;</code>
   */
  ON(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NA = 0;</code>
   */
  public static final int NA_VALUE = 0;
  /**
   * <code>OFF = 1;</code>
   */
  public static final int OFF_VALUE = 1;
  /**
   * <code>STANDBY = 2;</code>
   */
  public static final int STANDBY_VALUE = 2;
  /**
   * <code>READY = 3;</code>
   */
  public static final int READY_VALUE = 3;
  /**
   * <code>ON = 4;</code>
   */
  public static final int ON_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static NodeStatusEnum valueOf(int value) {
    return forNumber(value);
  }

  public static NodeStatusEnum forNumber(int value) {
    switch (value) {
      case 0: return NA;
      case 1: return OFF;
      case 2: return STANDBY;
      case 3: return READY;
      case 4: return ON;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NodeStatusEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NodeStatusEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NodeStatusEnum>() {
          public NodeStatusEnum findValueByNumber(int number) {
            return NodeStatusEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.wolves.admin.pb.AdminCommon.getDescriptor().getEnumTypes().get(0);
  }

  private static final NodeStatusEnum[] VALUES = values();

  public static NodeStatusEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NodeStatusEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:NodeStatusEnum)
}

