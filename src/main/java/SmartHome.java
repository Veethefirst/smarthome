import LightServer.LightServer;
import MotionServer.MotionServer;
import TemperatureServer.TemperatureServer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SmartHome extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SmartHome.fxml"));
        Parent root =loader.load();

        //
        Scene scene = new Scene(root);
        stage.setTitle("Smart Home");
        stage.setScene(scene);
        stage.show();

        Thread lightServerThread = new Thread(() -> {
            try {
                LightServer.main(new String[]{});
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        lightServerThread.start();

        Thread temperatureServerThread = new Thread(() -> {
            try {
                TemperatureServer.main(new String[]{});
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        temperatureServerThread.start();

        Thread motionServerThread = new Thread(() -> {
            try {
                MotionServer.main(new String[]{});
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        motionServerThread.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
