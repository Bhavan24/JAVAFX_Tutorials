package JavaFX.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Question1 {
    @FXML
    private Label lblHello;
    @FXML
    private TextField txtName;

    @FXML
    public void printHello() {
        lblHello.setText("Hello World");
    }

    @FXML
    public void clear() {
        lblHello.setText("");
    }

    @FXML
    public void printHelloName() {
        lblHello.setText("Hello " + txtName.getText());
    }
}
