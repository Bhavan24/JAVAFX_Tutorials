package JavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View/question1.fxml"));
        primaryStage.setTitle("Question1");
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();

        Parent root2 = FXMLLoader.load(getClass().getResource("View/question2.fxml"));
        Stage stage2 = new Stage();
        stage2.setTitle("Question2");
        stage2.setScene(new Scene(root2, 300, 200));
        stage2.show();

        Parent root3 = FXMLLoader.load(getClass().getResource("View/question3.fxml"));
        Stage stage3 = new Stage();
        stage3.setTitle("Question3");
        stage3.setScene(new Scene(root3, 300, 200));
        stage3.show();
    }
}