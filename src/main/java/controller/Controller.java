package controller;

import com.akpan.temperature.TemperatureControlServiceGrpc;
import com.akpan.temperature.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {


    public Button startTemperatureServerButton;
    public Label temperatureLabel;
    public Label sesnorIdLabel;
    public Label timeLabel;

    private ManagedChannel channel;
    private TemperatureControlServiceGrpc.TemperatureControlServiceStub asyncStub;

    public void initialize() {
        // Initialize gRPC channel and stub
        channel = ManagedChannelBuilder.forAddress("localhost", 3000)
                .usePlaintext()
                .build();
        asyncStub = TemperatureControlServiceGrpc.newStub(channel);
    }


    public void startTemperatureServerAction(ActionEvent actionEvent) {
        System.out.println("HEllo");
        // Stream temperature data and update labels
        TemperatureRequest request = TemperatureRequest.newBuilder().build();
        asyncStub.streamTemperature(request, new StreamObserver<TemperatureData>() {
            @Override
            public void onNext(TemperatureData temperatureData) {
                // Update UI on JavaFX application thread
                Platform.runLater(() -> {
                    temperatureLabel.setText(String.valueOf(temperatureData.getTemperature()));
                    sesnorIdLabel.setText(temperatureData.getSensorId());
                    timeLabel.setText(temperatureData.getTimestamp());
                });
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                // Handle completion if needed
            }
        });
    }

    public void shutdown() {
        // Shutdown gRPC channel when application exits
        if (channel != null && !channel.isShutdown()) {
            channel.shutdown();
        }
    }
}
