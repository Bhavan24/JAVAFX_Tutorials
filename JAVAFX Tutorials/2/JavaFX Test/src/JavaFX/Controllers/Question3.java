package JavaFX.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Question3 {
    @FXML
    private Label lblAnswer;
    @FXML
    private TextField txtFirst;
    @FXML
    private TextField txtSecond;

    @FXML
    public void addNumbers() {
        int firstNumber, secondNumber, answer;
        firstNumber = Integer.parseInt(txtFirst.getText());
        secondNumber = Integer.parseInt(txtSecond.getText());
        answer = firstNumber + secondNumber;
        lblAnswer.setText("Answer is " + answer);

        //alert box
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Answer is " + answer);
        alert.showAndWait();
    }
}
