import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        try {
          Parent root = FXMLLoader.load(this.getClass().getResource("view/AddCustomer.fxml"));
          Scene scene = new Scene(root);
          primaryStage.setScene(scene);
          primaryStage.centerOnScreen();
          primaryStage.setTitle("Add Customer Form");
          primaryStage.setResizable(false);
          primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
