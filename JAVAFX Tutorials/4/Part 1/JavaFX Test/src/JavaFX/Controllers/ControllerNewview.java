package JavaFX.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerNewview {
    @FXML
    public void openPreWindow(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("../View/welcome.fxml"));
        stage.setTitle("First Window");
        stage.setScene(new Scene(root2, 500, 250));
        stage.show();

        Stage previousStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        previousStage.close();
    }
}
