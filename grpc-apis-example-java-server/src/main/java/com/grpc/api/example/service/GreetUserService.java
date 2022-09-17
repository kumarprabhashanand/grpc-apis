package com.grpc.api.example.service;

import com.grpc.api.example.greet.model.User;
import com.grpc.api.example.greet.service.GreetUserRequest;
import com.grpc.api.example.greet.service.GreetUserResponse;
import com.grpc.api.example.greet.service.GreetUserServiceGrpc;
import io.grpc.stub.StreamObserver;

public class GreetUserService extends GreetUserServiceGrpc.GreetUserServiceImplBase {

    @Override
    public void greetUserUnary(GreetUserRequest request, StreamObserver<GreetUserResponse> responseObserver) {
        User user = request.getUser();
        String greetMessage = createGreetMessage(user);
        GreetUserResponse userResponse = GreetUserResponse.newBuilder().setGreetMessage(greetMessage).build();
        responseObserver.onNext(userResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void greetUserServerStreaming(GreetUserRequest request, StreamObserver<GreetUserResponse> responseObserver) {
        User user = request.getUser();

        String message = helloUserMessage(user);
        GreetUserResponse userResponse = GreetUserResponse.newBuilder().setGreetMessage(message).build();
        responseObserver.onNext(userResponse);

        message = wishUserMessage(user);
        userResponse = GreetUserResponse.newBuilder().setGreetMessage(message).build();
        responseObserver.onNext(userResponse);

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<GreetUserRequest> greetUserClientStreaming(StreamObserver<GreetUserResponse> responseObserver) {
        return new StreamObserver<GreetUserRequest>() {
            StringBuffer stringBuffer = new StringBuffer();
            int i = 1;
            @Override
            public void onNext(GreetUserRequest value) {
                User user = value.getUser();
                String greetMessage = createGreetMessage(user);
                stringBuffer.append("\n").append(i++).append(" ").append(greetMessage);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Something went wrong while streaming request message!");
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                GreetUserResponse userResponse = GreetUserResponse.newBuilder().setGreetMessage(stringBuffer.toString()).build();
                responseObserver.onNext(userResponse);
                responseObserver.onCompleted();
            }
        };
    }@Override
    public StreamObserver<GreetUserRequest> greetUserBiDirectionalStreaming(StreamObserver<GreetUserResponse> responseObserver) {
        return new StreamObserver<GreetUserRequest>() {
            @Override
            public void onNext(GreetUserRequest value) {
                User user = value.getUser();
                String greetMessage = createGreetMessage(user);
                GreetUserResponse userResponse = GreetUserResponse.newBuilder().setGreetMessage(greetMessage).build();
                responseObserver.onNext(userResponse);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Something went wrong while streaming request and response message!");
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }



    private String createGreetMessage(User user) {
        return helloUserMessage(user) + " " + wishUserMessage(user);
    }

    private String helloUserMessage(User user) {
        return new StringBuilder().append("Hello, ")
                .append(user.getFirstName())
                .append(" "+user.getLastName())
                .append("!").toString();
    }

    private String wishUserMessage(User user) {
        String wishAge = user.hasAge() ? String.valueOf((user.getAge()+1)) : "next";
        return "Hope all your wishes come true on your "+wishAge+" birthday";
    }
}
