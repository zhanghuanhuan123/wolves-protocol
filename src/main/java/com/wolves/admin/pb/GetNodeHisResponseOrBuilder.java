// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin_com.proto

package com.wolves.admin.pb;

public interface GetNodeHisResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetNodeHisResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .NodeStatus nodeStatuz = 1;</code>
   */
  java.util.List<com.wolves.admin.pb.NodeStatus> 
      getNodeStatuzList();
  /**
   * <code>repeated .NodeStatus nodeStatuz = 1;</code>
   */
  com.wolves.admin.pb.NodeStatus getNodeStatuz(int index);
  /**
   * <code>repeated .NodeStatus nodeStatuz = 1;</code>
   */
  int getNodeStatuzCount();
  /**
   * <code>repeated .NodeStatus nodeStatuz = 1;</code>
   */
  java.util.List<? extends com.wolves.admin.pb.NodeStatusOrBuilder> 
      getNodeStatuzOrBuilderList();
  /**
   * <code>repeated .NodeStatus nodeStatuz = 1;</code>
   */
  com.wolves.admin.pb.NodeStatusOrBuilder getNodeStatuzOrBuilder(
      int index);
}
