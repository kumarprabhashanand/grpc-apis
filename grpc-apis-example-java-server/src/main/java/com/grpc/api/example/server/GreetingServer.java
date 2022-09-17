package com.grpc.api.example.server;

import com.grpc.api.example.service.GreetUserService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GreetingServer {
    private final int port;
    private final Server server;

    public GreetingServer(int port) {
        this(ServerBuilder.forPort(port), port);
    }

    public GreetingServer(ServerBuilder serverBuilder, int port) {
        this.port = port;
        GreetUserService greetUserService = new GreetUserService();

        server = serverBuilder.addService(greetUserService).build();
    }

    public void start() throws IOException {
        server.start();
        System.out.println("Server Started!!!");
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                try {
                    GreetingServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void stop() throws InterruptedException {
        if(server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    public void blockTillShutdown() throws InterruptedException {
        if(server!=null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        GreetingServer greetingServer = new GreetingServer(9090);
        greetingServer.start();
        greetingServer.blockTillShutdown();
    }
}
