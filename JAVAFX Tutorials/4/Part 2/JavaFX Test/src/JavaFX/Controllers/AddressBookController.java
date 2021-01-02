package JavaFX.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AddressBookController {

    @FXML
    public void openAddContact(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("../View/addContact.fxml"));
        stage.setTitle("Add Contact");
        stage.setScene(new Scene(root2, 500, 350));
        stage.show();

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.close();
    }

    @FXML
    public void openContacts() throws IOException {
        Stage stage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("../View/contacts.fxml"));
        stage.setTitle("Contacts");
        stage.setScene(new Scene(root2, 500, 350));
        stage.show();
    }

    @FXML
    public void close(ActionEvent actionEvent1) throws IOException {
        Stage previousStage = (Stage) ((Node) actionEvent1.getSource()).getScene().getWindow();
        previousStage.close();
    }
}
