// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: outpost_com.proto

package com.wolves.outpost.pb;

public interface GetProcessResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetProcessResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .OsProcess process = 1;</code>
   */
  java.util.List<com.wolves.outpost.pb.OsProcess> 
      getProcessList();
  /**
   * <code>repeated .OsProcess process = 1;</code>
   */
  com.wolves.outpost.pb.OsProcess getProcess(int index);
  /**
   * <code>repeated .OsProcess process = 1;</code>
   */
  int getProcessCount();
  /**
   * <code>repeated .OsProcess process = 1;</code>
   */
  java.util.List<? extends com.wolves.outpost.pb.OsProcessOrBuilder> 
      getProcessOrBuilderList();
  /**
   * <code>repeated .OsProcess process = 1;</code>
   */
  com.wolves.outpost.pb.OsProcessOrBuilder getProcessOrBuilder(
      int index);
}
