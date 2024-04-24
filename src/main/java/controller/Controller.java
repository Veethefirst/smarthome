package controller;

import com.akpan.light.*;
import com.akpan.temperature.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Controller {


    public Button startTemperatureServerButton;
    public Label temperatureLabel;
    public Label sesnorIdLabel;
    public Label timeLabel;
    public ToggleButton toggleLightButton;
    public Circle lightSensorAction;

    private ManagedChannel temperatureChannel;
    private ManagedChannel lightChannel;
    private TemperatureControlServiceGrpc.TemperatureControlServiceStub temperatureStub;
    private LightControlServiceGrpc.LightControlServiceStub lightStub;

    public void initialize() {
        //temp channel
        temperatureChannel = ManagedChannelBuilder.forAddress("localhost", 3000)
                .usePlaintext()
                .build();
        temperatureStub = TemperatureControlServiceGrpc.newStub(temperatureChannel);

        //light channel
        lightChannel  = ManagedChannelBuilder.forAddress("localhost", 3001)
                .usePlaintext()
                .build();
        lightStub = LightControlServiceGrpc.newStub(lightChannel);
    }


    public void startTemperatureServerAction(ActionEvent actionEvent) {
        // Stream temperature data and update labels
        TemperatureRequest request = TemperatureRequest.newBuilder().build();
        temperatureStub.streamTemperature(request, new StreamObserver<TemperatureData>() {
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
        if (temperatureChannel != null && !temperatureChannel.isShutdown()) {
            temperatureChannel.shutdown();
        }
    }

    public void toggleLightAction(ActionEvent actionEvent) {
        ToggleLightRequest request = ToggleLightRequest.newBuilder()
                .setToggleOn(toggleLightButton.isSelected())
                .build();

        lightStub.toggleLight(request, new StreamObserver<LightControlData>() {
            @Override
            public void onNext(LightControlData lightControlData) {
                // Update UI on JavaFX application thread
                Platform.runLater(() -> {

                    if (lightControlData.getLightStatus()) {
                       toggleLightButton.setText("OFF");
                        lightSensorAction.setFill(Color.GREEN);
                    } else {
                        toggleLightButton.setText("ON");
                        lightSensorAction.setFill(Color.RED);
                    }
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
}
