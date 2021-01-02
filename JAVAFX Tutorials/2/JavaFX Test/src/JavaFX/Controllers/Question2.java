package JavaFX.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Scanner;

public class Question2 {
    @FXML
    private Label lblText;

    @FXML
    public void printOnLabel() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Text");
        String userText = scan.next();
        lblText.setText(userText);
    }

    public void printOnConsole() {
        String txt = lblText.getText();
        System.out.println(txt);
    }
}
