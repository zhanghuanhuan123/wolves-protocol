// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin_com.proto

package com.wolves.admin.pb;

public interface GetPortRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetPortRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string localip = 1;</code>
   */
  java.lang.String getLocalip();
  /**
   * <code>string localip = 1;</code>
   */
  com.google.protobuf.ByteString
      getLocalipBytes();

  /**
   * <code>repeated int32 failedPorts = 2;</code>
   */
  java.util.List<java.lang.Integer> getFailedPortsList();
  /**
   * <code>repeated int32 failedPorts = 2;</code>
   */
  int getFailedPortsCount();
  /**
   * <code>repeated int32 failedPorts = 2;</code>
   */
  int getFailedPorts(int index);
}