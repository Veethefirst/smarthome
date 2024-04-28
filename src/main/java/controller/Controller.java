package controller;

import com.akpan.light.*;
import com.akpan.motion.*;
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
import javafx.scene.shape.Rectangle;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


public class Controller {


    public Button startTemperatureServerButton;
    public Label temperatureLabel;
    public Label sesnorIdLabel;
    public Label timeLabel;
    public ToggleButton toggleLightButton;
    public Circle lightSensorAction;
    public Button motionButton;
    public Rectangle motionLight;
    public Label motionLabel;

    private ManagedChannel temperatureChannel;
    private ManagedChannel lightChannel;
    private ManagedChannel motionChannel;
    private TemperatureControlServiceGrpc.TemperatureControlServiceStub temperatureStub;
    private LightControlServiceGrpc.LightControlServiceStub lightStub;
    private MotionSensorGrpc.MotionSensorStub motionStub;

    public void initialize() {
        //temperature channel
        temperatureChannel = ManagedChannelBuilder.forAddress("localhost", 3000)
                .usePlaintext()
                .build();
        temperatureStub = TemperatureControlServiceGrpc.newStub(temperatureChannel);

        //light channel
        lightChannel  = ManagedChannelBuilder.forAddress("localhost", 3001)
                .usePlaintext()
                .build();
        lightStub = LightControlServiceGrpc.newStub(lightChannel);

        //motion channel
        motionChannel  = ManagedChannelBuilder.forAddress("localhost", 3003)
                .usePlaintext()
                .build();
        motionStub = MotionSensorGrpc.newStub(motionChannel);
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

    public void motionButtonAction(ActionEvent actionEvent) throws InterruptedException {
        final CountDownLatch finishLatch = new CountDownLatch(1);

        StreamObserver<MotionRequest> requestObserver = motionStub.streamMotion(new StreamObserver<MotionResponse>() {
            @Override
            public void onNext(MotionResponse response) {
                System.out.println("Alarm is on: " + response.getIsAlarmOn());
                Platform.runLater(() -> {
                    if (response.getIsAlarmOn()) {
                        motionLight.setFill(Color.GREEN);
                    } else {
                        motionLight.setFill(Color.RED);
                    }
                });
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error in streaming motion: " + throwable.getMessage());
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                finishLatch.countDown();
            }
        });

        try {
            // Simulate motion detection
            for (int i = 0; i < 10; i++) {
                requestObserver.onNext(MotionRequest.newBuilder().setIsMotionDetected(i % 2 == 0).build());
                Thread.sleep(1000); // Simulate motion detection event
            }
        } catch (RuntimeException | InterruptedException e) {
            requestObserver.onError(e);
            throw e;
        }
        requestObserver.onCompleted();

        finishLatch.await(1, TimeUnit.MINUTES);
    }
}
