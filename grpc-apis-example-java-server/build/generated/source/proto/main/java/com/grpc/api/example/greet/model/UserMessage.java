// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_message.proto

package com.grpc.api.example.greet.model;

public final class UserMessage {
  private UserMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_api_example_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_api_example_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022user_message.proto\022\024com.grpc.api.examp" +
      "le\"E\n\004User\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010lastNam" +
      "e\030\002 \001(\t\022\020\n\003age\030\003 \001(\rH\000\210\001\001B\006\n\004_ageB*\n com" +
      ".grpc.api.example.greet.modelP\001Z\004./pbb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_grpc_api_example_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_grpc_api_example_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_api_example_User_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "Age", "Age", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
