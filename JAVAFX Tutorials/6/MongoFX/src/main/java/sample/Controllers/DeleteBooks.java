package sample.Controllers;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.bson.Document;
import sample.DbConnection;

public class DeleteBooks {
    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    void delete() {
        String id = txtId.getText();
        String name = txtName.getText();
        MongoDatabase db = DbConnection.getDbConnection();
        db.getCollection("book");
        MongoCollection<Document> collection = db.getCollection("book");

        if (id.isEmpty()){
            collection.deleteOne(new Document("name", name));
            new Alert(Alert.AlertType.INFORMATION, "Successfully Deleted").showAndWait();
        }
        else if (name.isEmpty()){
            collection.deleteOne(new Document("id", id));
            new Alert(Alert.AlertType.INFORMATION, "Successfully Deleted").showAndWait();
        }
        else if (name.isEmpty() && id.isEmpty()){
            new Alert(Alert.AlertType.INFORMATION, "Please Fill one field").showAndWait();
        }
        else{
            collection.deleteOne(new Document("id", id));
            new Alert(Alert.AlertType.INFORMATION, "Successfully Deleted").showAndWait();
        }
    }
}
