package main

import (
	"context"
	"grpc-apis-example-go-client/pb"
	"io"
	"log"
	"time"

	"google.golang.org/grpc"
)

func main() {
	log.Println("-----Starting Client In Go-----")
	serverAddress := "localhost:9090"
	log.Println("Connecting to ", serverAddress)

	conn, err := grpc.Dial(serverAddress, grpc.WithInsecure())
	if err != nil {
		log.Fatalln("Error while connecting to server : ", err)
	}
	defer conn.Close()

	client := pb.NewGreetUserServiceClient(conn)
	ctx, cancel := context.WithTimeout(context.Background(), time.Second)
	defer cancel()

	log.Println("=============================Unary API=============================")
	callUnaryAPI(client, ctx)
	log.Println("=============================Server Streaming API=============================")
	callServerStreamingAPI(client, ctx)
	log.Println("=============================Client Streaming API=============================")
	callClientStreamingAPI(client, ctx)
	log.Println("=============================Bi-Directional Streaming API=============================")
	callBiDirectionalStreamingAPI(client, ctx)
	log.Println("-----Shutting Down Client In Go-----")
}

func callUnaryAPI(client pb.GreetUserServiceClient, ctx context.Context) {
	req := createUserRequest("Doe", "John", 28)

	res, err := client.GreetUser_Unary(ctx, &req)
	if err != nil {
		log.Fatalln("Error while making request to server : ", err)
	}

	log.Println("Response From Server : ", res.GetGreetMessage())
}

func callServerStreamingAPI(client pb.GreetUserServiceClient, ctx context.Context) {
	req := createUserRequest("Doe", "John", 28)

	stream, err := client.GreetUser_ServerStreaming(ctx, &req)
	if err != nil {
		log.Fatalln("Error while making request to server : ", err)
	}

	log.Println("Starting Response Streaming")
	for {
		res, err := stream.Recv()
		if err == io.EOF {
			break
		}
		if err != nil {
			log.Fatalln("Error while receiving stream : ", err)
		}
		log.Println("Response From Server - In Stream : ", res.GetGreetMessage())
	}
	log.Println("All data received! Streaming Finished.")
}

func callClientStreamingAPI(client pb.GreetUserServiceClient, ctx context.Context) {
	users := createUserList()
	stream, err := client.GreetUser_ClientStreaming(ctx)
	if err != nil {
		log.Fatalln("Error while making request to server : ", err)
	}
	log.Println("Starting Request Streaming")
	for _, u := range users {
		log.Println("Sending Stream : ", u)
		stream.Send(u)
	}
	log.Println("All data sent! Streaming Finished.")

	res, err := stream.CloseAndRecv()
	if err != nil {
		log.Fatalln("Error while making receiving response from server : ", err)
	}
	log.Println("Response From Server : ", res.GetGreetMessage())
}

func callBiDirectionalStreamingAPI(client pb.GreetUserServiceClient, ctx context.Context) {
	users := createUserList()
	stream, err := client.GreetUser_BiDirectionalStreaming(ctx)
	if err != nil {
		log.Fatalln("Error while making request to server : ", err)
	}
	log.Println("Starting Bi-Directional Streaming - in two different go routine")
	waitForFinish := make(chan struct{})
	go func() {
		log.Println("Starting Response Streaming")
		for {
			res, err := stream.Recv()
			if err == io.EOF {
				break
			}
			if err != nil {
				log.Fatalln("Error while receiving stream : ", err)
			}
			log.Println("Response From Server - In Stream : ", res.GetGreetMessage())
		}
		log.Println("All data received! Streaming Finished.")
		close(waitForFinish)
	}()
	go func() {
		log.Println("Starting Request Streaming")
		for _, u := range users {
			log.Println("Sending Stream : ", u)
			stream.Send(u)
		}
		stream.CloseSend()
		log.Println("All data sent! Streaming Finished.")
	}()
	<-waitForFinish
}

func createUserRequest(lastName string, firstName string, age uint32) pb.GreetUserRequest {
	user := pb.User{FirstName: firstName, LastName: lastName, Age: &age}
	return pb.GreetUserRequest{User: &user}
}

func createUserList() []*pb.GreetUserRequest {
	var users []*pb.GreetUserRequest
	u1 := createUserRequest("Doe", "John", 28)
	users = append(users, &u1)
	u2 := createUserRequest("Kumar", "Prabhash", 27)
	users = append(users, &u2)
	u3 := createUserRequest("User", "Test", 30)
	users = append(users, &u3)
	return users
}
