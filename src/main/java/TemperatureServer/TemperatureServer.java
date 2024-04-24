package TemperatureServer;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import com.akpan.temperature.*;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;
import io.grpc.stub.StreamObserver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TemperatureServer {
    private Server server;

    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 3000;
        server = ServerBuilder.forPort(port)
                .addService(new TemperatureServerImpl())
                .build()
                .start();
        System.out.println("Server started, listening on " + port);

        // Register server to Consul
        registerToConsul();

        // Add shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            TemperatureServer.this.stop();
            System.err.println("*** server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private void registerToConsul() {
        System.out.println("Registering server to Consul...");

        // Load Consul configuration from consul.properties file
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/temperature.properties")) {
            props.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Extract Consul configuration properties
        String consulHost = props.getProperty("consul.host");
        int consulPort = Integer.parseInt(props.getProperty("consul.port"));
        String serviceName = props.getProperty("consul.service.name");
        int servicePort = Integer.parseInt(props.getProperty("consul.service.port"));
        String healthCheckInterval = props.getProperty("consul.service.healthCheckInterval");

        // Get host address
        String hostAddress;
        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return;
        }

        // Create a Consul client
        ConsulClient consulClient = new ConsulClient(consulHost, consulPort);

        // Define service details
        NewService newService = new NewService();
        newService.setName(serviceName);
        newService.setPort(servicePort);
        newService.setAddress(hostAddress); // Set host address

        // Register service with Consul
        consulClient.agentServiceRegister(newService);

        // Print registration success message
        System.out.println("Server registered to Consul successfully. Host: " + hostAddress);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final TemperatureServer server = new TemperatureServer();
        server.start();
        server.blockUntilShutdown();
    }

    static class TemperatureServerImpl extends TemperatureControlServiceGrpc.TemperatureControlServiceImplBase{
        private  final List<Temperature> temperatureList = new ArrayList<>();

        public  TemperatureServerImpl(){
            temperatureList.add(new Temperature("sensorA", 20, "2024-04-24"));
            temperatureList.add(new Temperature("sensorB", 30, "2024-04-21"));
            temperatureList.add(new Temperature("sensorC", 23, "2024-04-21"));
            temperatureList.add(new Temperature("sensorD", 31, "2024-04-21"));
            temperatureList.add(new Temperature("sensorE", 29, "2024-04-21"));
            temperatureList.add(new Temperature("sensorF", 27, "2024-04-21"));
            temperatureList.add(new Temperature("sensorG", 27, "2024-04-21"));
        }

        @Override
        public void streamTemperature(TemperatureRequest request, StreamObserver<TemperatureData> responseObserver) {
            for (Temperature data : temperatureList) {
                TemperatureData result = TemperatureData.newBuilder()
                        .setTemperature(data.getTemperature())
                        .setSensorId(data.getSensorId())
                        .setTimestamp(data.getTimestamp())
                        .build();
                // Stream temperature data
                responseObserver.onNext(result);

                // Sleep for 2 seconds
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds (2000 milliseconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
            // Notify completion after streaming all data
            responseObserver.onCompleted();
        }
    }
}
