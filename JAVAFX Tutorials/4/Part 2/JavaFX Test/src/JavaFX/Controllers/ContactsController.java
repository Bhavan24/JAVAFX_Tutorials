package JavaFX.Controllers;

import JavaFX.Contacts;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.util.Scanner;

public class ContactsController {

    @FXML
    private Button closeBtn;

    @FXML
    private TableView<Contacts> contactsTable;

    @FXML
    private TableColumn<Contacts, String> nameColumn;

    @FXML
    private TableColumn<Contacts, String> numberColumn;

    @FXML
    private TableColumn<Contacts, String> emailColumn;

    ObservableList<Contacts> contacts = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        try{
            Scanner scanner = new Scanner(new File("src/JavaFX/Contacts.txt"));
            while (scanner.hasNext()){
                String name = scanner.next();
                String number = scanner.next();
                String email = scanner.next();
                contacts.add(new Contacts(name,number,email));
            }
            scanner.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        numberColumn.setCellValueFactory(new PropertyValueFactory<>("number"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        contactsTable.setItems(contacts);
    }

    @FXML
    void close() {
        Stage stage = (Stage) closeBtn.getScene().getWindow();
        stage.close();
    }
}
