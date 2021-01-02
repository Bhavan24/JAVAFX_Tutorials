package JavaFX.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.Formatter;

public class AddContactController {

    @FXML
    private TextField txtName;
    @FXML
    private TextField txtNumber;
    @FXML
    private TextField txtEmail;

    @FXML
    public void goBack(ActionEvent actionEvent1) throws IOException {
        Stage stage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("../View/addressBook.fxml"));
        stage.setTitle("Address Book");
        stage.setScene(new Scene(root2, 500, 350));
        stage.show();

        Stage previousStage = (Stage) ((Node) actionEvent1.getSource()).getScene().getWindow();
        previousStage.close();
    }

    @FXML
    public void addContacts(ActionEvent actionEvent2) throws IOException {
        String name = txtName.getText();
        String number = txtNumber.getText();
        String email = txtEmail.getText();

        if (name.isEmpty() || number.isEmpty() || email.isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please Fill All the details").showAndWait();
        } else {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("src/JavaFX/Contacts.txt", true));
                writer.newLine();
                String text = String.format("%s %s %s", name, number, email);
                writer.write(text);
                writer.flush();
                writer.close();
                new Alert(Alert.AlertType.INFORMATION, "Contact added successfully!").showAndWait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        Stage stage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("../View/addressBook.fxml"));
        stage.setTitle("Address Book");
        stage.setScene(new Scene(root2, 500, 350));
        stage.show();

        Stage previousStage = (Stage) ((Node) actionEvent2.getSource()).getScene().getWindow();
        previousStage.close();
    }
}
