package com.grpc.api.example.greet.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: greet_user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreetUserServiceGrpc {

  private GreetUserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.api.example.GreetUserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.api.example.greet.service.GreetUserRequest,
      com.grpc.api.example.greet.service.GreetUserResponse> getGreetUserUnaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetUser_Unary",
      requestType = com.grpc.api.example.greet.service.GreetUserRequest.class,
      responseType = com.grpc.api.example.greet.service.GreetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.api.example.greet.service.GreetUserRequest,
      com.grpc.api.example.greet.service.GreetUserResponse> getGreetUserUnaryMethod() {
    io.grpc.MethodDescriptor<com.grpc.api.example.greet.service.GreetUserRequest, com.grpc.api.example.greet.service.GreetUserResponse> getGreetUserUnaryMethod;
    if ((getGreetUserUnaryMethod = GreetUserServiceGrpc.getGreetUserUnaryMethod) == null) {
      synchronized (GreetUserServiceGrpc.class) {
        if ((getGreetUserUnaryMethod = GreetUserServiceGrpc.getGreetUserUnaryMethod) == null) {
          GreetUserServiceGrpc.getGreetUserUnaryMethod = getGreetUserUnaryMethod =
              io.grpc.MethodDescriptor.<com.grpc.api.example.greet.service.GreetUserRequest, com.grpc.api.example.greet.service.GreetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetUser_Unary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.api.example.greet.service.GreetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.api.example.greet.service.GreetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetUserServiceMethodDescriptorSupplier("GreetUser_Unary"))
              .build();
        }
      }
    }
    return getGreetUserUnaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.api.example.greet.service.GreetUserRequest,
      com.grpc.api.example.greet.service.GreetUserResponse> getGreetUserServerStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetUser_ServerStreaming",
      requestType = com.grpc.api.example.greet.service.GreetUserRequest.class,
      responseType = com.grpc.api.example.greet.service.GreetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.api.example.greet.service.GreetUserRequest,
      com.grpc.api.example.greet.service.GreetUserResponse> getGreetUserServerStreamingMethod() {
    io.grpc.MethodDescriptor<com.grpc.api.example.greet.service.GreetUserRequest, com.grpc.api.example.greet.service.GreetUserResponse> getGreetUserServerStreamingMethod;
    if ((getGreetUserServerStreamingMethod = GreetUserServiceGrpc.getGreetUserServerStreamingMethod) == null) {
      synchronized (GreetUserServiceGrpc.class) {
        if ((getGreetUserServerStreamingMethod = GreetUserServiceGrpc.getGreetUserServerStreamingMethod) == null) {
          GreetUserServiceGrpc.getGreetUserServerStreamingMethod = getGreetUserServerStreamingMethod =
              io.grpc.MethodDescriptor.<com.grpc.api.example.greet.service.GreetUserRequest, com.grpc.api.example.greet.service.GreetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetUser_ServerStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.api.example.greet.service.GreetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.api.example.greet.service.GreetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetUserServiceMethodDescriptorSupplier("GreetUser_ServerStreaming"))
              .build();
        }
      }
    }
    return getGreetUserServerStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.api.example.greet.service.GreetUserRequest,
      com.grpc.api.example.greet.service.GreetUserResponse> getGreetUserClientStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetUser_ClientStreaming",
      requestType = com.grpc.api.example.greet.service.GreetUserRequest.class,
      responseType = com.grpc.api.example.greet.service.GreetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.api.example.greet.service.GreetUserRequest,
      com.grpc.api.example.greet.service.GreetUserResponse> getGreetUserClientStreamingMethod() {
    io.grpc.MethodDescriptor<com.grpc.api.example.greet.service.GreetUserRequest, com.grpc.api.example.greet.service.GreetUserResponse> getGreetUserClientStreamingMethod;
    if ((getGreetUserClientStreamingMethod = GreetUserServiceGrpc.getGreetUserClientStreamingMethod) == null) {
      synchronized (GreetUserServiceGrpc.class) {
        if ((getGreetUserClientStreamingMethod = GreetUserServiceGrpc.getGreetUserClientStreamingMethod) == null) {
          GreetUserServiceGrpc.getGreetUserClientStreamingMethod = getGreetUserClientStreamingMethod =
              io.grpc.MethodDescriptor.<com.grpc.api.example.greet.service.GreetUserRequest, com.grpc.api.example.greet.service.GreetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetUser_ClientStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.api.example.greet.service.GreetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.api.example.greet.service.GreetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetUserServiceMethodDescriptorSupplier("GreetUser_ClientStreaming"))
              .build();
        }
      }
    }
    return getGreetUserClientStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.api.example.greet.service.GreetUserRequest,
      com.grpc.api.example.greet.service.GreetUserResponse> getGreetUserBiDirectionalStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetUser_BiDirectionalStreaming",
      requestType = com.grpc.api.example.greet.service.GreetUserRequest.class,
      responseType = com.grpc.api.example.greet.service.GreetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.api.example.greet.service.GreetUserRequest,
      com.grpc.api.example.greet.service.GreetUserResponse> getGreetUserBiDirectionalStreamingMethod() {
    io.grpc.MethodDescriptor<com.grpc.api.example.greet.service.GreetUserRequest, com.grpc.api.example.greet.service.GreetUserResponse> getGreetUserBiDirectionalStreamingMethod;
    if ((getGreetUserBiDirectionalStreamingMethod = GreetUserServiceGrpc.getGreetUserBiDirectionalStreamingMethod) == null) {
      synchronized (GreetUserServiceGrpc.class) {
        if ((getGreetUserBiDirectionalStreamingMethod = GreetUserServiceGrpc.getGreetUserBiDirectionalStreamingMethod) == null) {
          GreetUserServiceGrpc.getGreetUserBiDirectionalStreamingMethod = getGreetUserBiDirectionalStreamingMethod =
              io.grpc.MethodDescriptor.<com.grpc.api.example.greet.service.GreetUserRequest, com.grpc.api.example.greet.service.GreetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetUser_BiDirectionalStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.api.example.greet.service.GreetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.api.example.greet.service.GreetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetUserServiceMethodDescriptorSupplier("GreetUser_BiDirectionalStreaming"))
              .build();
        }
      }
    }
    return getGreetUserBiDirectionalStreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetUserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetUserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetUserServiceStub>() {
        @java.lang.Override
        public GreetUserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetUserServiceStub(channel, callOptions);
        }
      };
    return GreetUserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetUserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetUserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetUserServiceBlockingStub>() {
        @java.lang.Override
        public GreetUserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetUserServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetUserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetUserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetUserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetUserServiceFutureStub>() {
        @java.lang.Override
        public GreetUserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetUserServiceFutureStub(channel, callOptions);
        }
      };
    return GreetUserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreetUserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greetUserUnary(com.grpc.api.example.greet.service.GreetUserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetUserUnaryMethod(), responseObserver);
    }

    /**
     */
    public void greetUserServerStreaming(com.grpc.api.example.greet.service.GreetUserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetUserServerStreamingMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserRequest> greetUserClientStreaming(
        io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetUserClientStreamingMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserRequest> greetUserBiDirectionalStreaming(
        io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetUserBiDirectionalStreamingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetUserUnaryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.grpc.api.example.greet.service.GreetUserRequest,
                com.grpc.api.example.greet.service.GreetUserResponse>(
                  this, METHODID_GREET_USER_UNARY)))
          .addMethod(
            getGreetUserServerStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.grpc.api.example.greet.service.GreetUserRequest,
                com.grpc.api.example.greet.service.GreetUserResponse>(
                  this, METHODID_GREET_USER_SERVER_STREAMING)))
          .addMethod(
            getGreetUserClientStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.grpc.api.example.greet.service.GreetUserRequest,
                com.grpc.api.example.greet.service.GreetUserResponse>(
                  this, METHODID_GREET_USER_CLIENT_STREAMING)))
          .addMethod(
            getGreetUserBiDirectionalStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.grpc.api.example.greet.service.GreetUserRequest,
                com.grpc.api.example.greet.service.GreetUserResponse>(
                  this, METHODID_GREET_USER_BI_DIRECTIONAL_STREAMING)))
          .build();
    }
  }

  /**
   */
  public static final class GreetUserServiceStub extends io.grpc.stub.AbstractAsyncStub<GreetUserServiceStub> {
    private GreetUserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetUserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetUserServiceStub(channel, callOptions);
    }

    /**
     */
    public void greetUserUnary(com.grpc.api.example.greet.service.GreetUserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetUserUnaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void greetUserServerStreaming(com.grpc.api.example.greet.service.GreetUserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGreetUserServerStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserRequest> greetUserClientStreaming(
        io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getGreetUserClientStreamingMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserRequest> greetUserBiDirectionalStreaming(
        io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGreetUserBiDirectionalStreamingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GreetUserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreetUserServiceBlockingStub> {
    private GreetUserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetUserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetUserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.api.example.greet.service.GreetUserResponse greetUserUnary(com.grpc.api.example.greet.service.GreetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetUserUnaryMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.grpc.api.example.greet.service.GreetUserResponse> greetUserServerStreaming(
        com.grpc.api.example.greet.service.GreetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGreetUserServerStreamingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetUserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreetUserServiceFutureStub> {
    private GreetUserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetUserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetUserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.api.example.greet.service.GreetUserResponse> greetUserUnary(
        com.grpc.api.example.greet.service.GreetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetUserUnaryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET_USER_UNARY = 0;
  private static final int METHODID_GREET_USER_SERVER_STREAMING = 1;
  private static final int METHODID_GREET_USER_CLIENT_STREAMING = 2;
  private static final int METHODID_GREET_USER_BI_DIRECTIONAL_STREAMING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetUserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetUserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET_USER_UNARY:
          serviceImpl.greetUserUnary((com.grpc.api.example.greet.service.GreetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserResponse>) responseObserver);
          break;
        case METHODID_GREET_USER_SERVER_STREAMING:
          serviceImpl.greetUserServerStreaming((com.grpc.api.example.greet.service.GreetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET_USER_CLIENT_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetUserClientStreaming(
              (io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserResponse>) responseObserver);
        case METHODID_GREET_USER_BI_DIRECTIONAL_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetUserBiDirectionalStreaming(
              (io.grpc.stub.StreamObserver<com.grpc.api.example.greet.service.GreetUserResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetUserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.api.example.greet.service.GreetUserServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetUserService");
    }
  }

  private static final class GreetUserServiceFileDescriptorSupplier
      extends GreetUserServiceBaseDescriptorSupplier {
    GreetUserServiceFileDescriptorSupplier() {}
  }

  private static final class GreetUserServiceMethodDescriptorSupplier
      extends GreetUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetUserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetUserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetUserServiceFileDescriptorSupplier())
              .addMethod(getGreetUserUnaryMethod())
              .addMethod(getGreetUserServerStreamingMethod())
              .addMethod(getGreetUserClientStreamingMethod())
              .addMethod(getGreetUserBiDirectionalStreamingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
