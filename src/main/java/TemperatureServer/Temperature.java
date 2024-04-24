package TemperatureServer;

public class Temperature {
    private  String sensorId;
    private  double temperature;
    private  String timestamp;

    public Temperature(String sensorId, double temperature, String timestamp) {
        this.sensorId = sensorId;
        this.temperature = temperature;
        this.timestamp = timestamp;
    }

    public String getSensorId() {
        return sensorId;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "TemperatureData{" +
                "sensorId='" + sensorId + '\'' +
                ", temperature=" + temperature +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
