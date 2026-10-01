# grpc-apis

All four types of gRPC APIs in one small example: unary, server streaming, client streaming and bi-directional streaming. The server is in Java and the client is in Go, talking over the same `.proto` files.

Companion code for my article [4 Types of gRPC APIs with Go and Java Example](https://towardsdev.com/4-types-of-grpc-apis-with-go-and-java-example-dc4db630fc83).

## Run it

1. Start the server: run `GreetingServer` in `grpc-apis-example-java-server` from your IDE. It listens on `localhost:9090`.
2. Run the client:
   ```
   cd grpc-apis-example-go-client
   go run .
   ```
   It calls all four APIs one after another and logs the responses.

Java 17, Go 1.18, grpc-java 1.45.
