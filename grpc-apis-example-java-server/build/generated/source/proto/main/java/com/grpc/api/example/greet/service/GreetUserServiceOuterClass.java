// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet_user_service.proto

package com.grpc.api.example.greet.service;

public final class GreetUserServiceOuterClass {
  private GreetUserServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_api_example_GreetUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_api_example_GreetUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_api_example_GreetUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_api_example_GreetUserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030greet_user_service.proto\022\024com.grpc.api" +
      ".example\032\022user_message.proto\"<\n\020GreetUse" +
      "rRequest\022(\n\004user\030\001 \001(\0132\032.com.grpc.api.ex" +
      "ample.User\")\n\021GreetUserResponse\022\024\n\014greet" +
      "Message\030\001 \001(\t2\327\003\n\020GreetUserService\022d\n\017Gr" +
      "eetUser_Unary\022&.com.grpc.api.example.Gre" +
      "etUserRequest\032\'.com.grpc.api.example.Gre" +
      "etUserResponse\"\000\022p\n\031GreetUser_ServerStre" +
      "aming\022&.com.grpc.api.example.GreetUserRe" +
      "quest\032\'.com.grpc.api.example.GreetUserRe" +
      "sponse\"\0000\001\022p\n\031GreetUser_ClientStreaming\022" +
      "&.com.grpc.api.example.GreetUserRequest\032" +
      "\'.com.grpc.api.example.GreetUserResponse" +
      "\"\000(\001\022y\n GreetUser_BiDirectionalStreaming" +
      "\022&.com.grpc.api.example.GreetUserRequest" +
      "\032\'.com.grpc.api.example.GreetUserRespons" +
      "e\"\000(\0010\001B,\n\"com.grpc.api.example.greet.se" +
      "rviceP\001Z\004./pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.grpc.api.example.greet.model.UserMessage.getDescriptor(),
        });
    internal_static_com_grpc_api_example_GreetUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_grpc_api_example_GreetUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_api_example_GreetUserRequest_descriptor,
        new java.lang.String[] { "User", });
    internal_static_com_grpc_api_example_GreetUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_grpc_api_example_GreetUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_api_example_GreetUserResponse_descriptor,
        new java.lang.String[] { "GreetMessage", });
    com.grpc.api.example.greet.model.UserMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
