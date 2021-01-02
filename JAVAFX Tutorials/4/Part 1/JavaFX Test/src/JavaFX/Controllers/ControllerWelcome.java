package JavaFX.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerWelcome {
    @FXML
    public void openWindow(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("../View/newView.fxml"));
        stage.setTitle("New Window");
        stage.setScene(new Scene(root2, 350, 350));
        stage.show();

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.close();
    }

    @FXML
    public void openSettings() throws IOException {
        Stage stage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("../View/settings.fxml"));
        stage.setTitle("Settings");
        stage.setScene(new Scene(root2, 250, 250));
        stage.show();
    }

    @FXML
    public void close(ActionEvent actionEvent1) throws IOException {
        Stage previousStage = (Stage) ((Node) actionEvent1.getSource()).getScene().getWindow();
        previousStage.close();
    }
}
