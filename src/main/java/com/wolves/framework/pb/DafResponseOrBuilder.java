// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base.proto

package com.wolves.framework.pb;

public interface DafResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DafResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string code = 1;</code>
   */
  java.lang.String getCode();
  /**
   * <code>string code = 1;</code>
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <code>string desc = 2;</code>
   */
  java.lang.String getDesc();
  /**
   * <code>string desc = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescBytes();

  /**
   * <code>.TimeStack responseTimeStack = 3;</code>
   */
  boolean hasResponseTimeStack();
  /**
   * <code>.TimeStack responseTimeStack = 3;</code>
   */
  com.wolves.framework.pb.TimeStack getResponseTimeStack();
  /**
   * <code>.TimeStack responseTimeStack = 3;</code>
   */
  com.wolves.framework.pb.TimeStackOrBuilder getResponseTimeStackOrBuilder();

  /**
   * <code>.google.protobuf.Any body = 4;</code>
   */
  boolean hasBody();
  /**
   * <code>.google.protobuf.Any body = 4;</code>
   */
  com.google.protobuf.Any getBody();
  /**
   * <code>.google.protobuf.Any body = 4;</code>
   */
  com.google.protobuf.AnyOrBuilder getBodyOrBuilder();
}
