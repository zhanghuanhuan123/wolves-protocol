// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: outpost_common1.proto

package com.wolves.outpost.pb;

public interface HwDiskStoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HwDiskStore)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string model = 1;</code>
   */
  java.lang.String getModel();
  /**
   * <code>string model = 1;</code>
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string serial = 3;</code>
   */
  java.lang.String getSerial();
  /**
   * <code>string serial = 3;</code>
   */
  com.google.protobuf.ByteString
      getSerialBytes();

  /**
   * <code>int64 size = 4;</code>
   */
  long getSize();

  /**
   * <code>int64 reads = 5;</code>
   */
  long getReads();

  /**
   * <code>int64 readBytes = 6;</code>
   */
  long getReadBytes();

  /**
   * <code>int64 writes = 7;</code>
   */
  long getWrites();

  /**
   * <code>int64 writeBytes = 8;</code>
   */
  long getWriteBytes();

  /**
   * <code>int64 transferTime = 9;</code>
   */
  long getTransferTime();

  /**
   * <code>repeated .HwPartition hwPartition = 10;</code>
   */
  java.util.List<com.wolves.outpost.pb.HwPartition> 
      getHwPartitionList();
  /**
   * <code>repeated .HwPartition hwPartition = 10;</code>
   */
  com.wolves.outpost.pb.HwPartition getHwPartition(int index);
  /**
   * <code>repeated .HwPartition hwPartition = 10;</code>
   */
  int getHwPartitionCount();
  /**
   * <code>repeated .HwPartition hwPartition = 10;</code>
   */
  java.util.List<? extends com.wolves.outpost.pb.HwPartitionOrBuilder> 
      getHwPartitionOrBuilderList();
  /**
   * <code>repeated .HwPartition hwPartition = 10;</code>
   */
  com.wolves.outpost.pb.HwPartitionOrBuilder getHwPartitionOrBuilder(
      int index);
}