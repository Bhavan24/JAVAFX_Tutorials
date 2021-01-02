package JavaFX.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Question3 {

    @FXML
    private Label lblAnswer;

    @FXML
    private TextField txtTitle;

    @FXML
    private TextField txtFirst;

    @FXML
    private TextField txtLast;

    @FXML
    void printName() {
        lblAnswer.setText(txtTitle.getText() + " " +  txtFirst.getText() + " " +  txtLast.getText());
    }
}
