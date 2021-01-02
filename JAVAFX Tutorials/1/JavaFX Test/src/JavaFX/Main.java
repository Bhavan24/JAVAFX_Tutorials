package JavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("JavaFX Welcome!");
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();

        Parent root2 = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        Stage secondaryStage = new Stage();
        secondaryStage.setTitle("Signup!");
        secondaryStage.setScene(new Scene(root2, 425, 650));
        secondaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
