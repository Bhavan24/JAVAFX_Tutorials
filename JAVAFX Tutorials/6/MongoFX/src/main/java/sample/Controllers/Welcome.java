package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Welcome {

    @FXML
    void addBook() throws IOException {
        Stage stage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("/addBooks.fxml"));
        stage.setTitle("Add Book");
        stage.setScene(new Scene(root2, 500, 350));
        stage.show();
    }

    @FXML
    void deleteBook() throws IOException {
        Stage stage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("/deleteBooks.fxml"));
        stage.setTitle("Delete Book");
        stage.setScene(new Scene(root2, 400, 200));
        stage.show();

    }

    @FXML
    void viewBook() throws IOException {
        Stage stage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("/viewBooks.fxml"));
        stage.setTitle("View Book");
        stage.setScene(new Scene(root2, 500, 350));
        stage.show();
    }
}
