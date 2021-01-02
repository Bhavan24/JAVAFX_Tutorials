package sample.Controllers;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.bson.Document;
import sample.DbConnection;

public class AddBooks {
    @FXML
    private TextField txtId;

    @FXML
    private TextField txtISBM;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtAuthor;

    @FXML
    private TextField txtEditor;

    @FXML
    private TextField txtPublisher;

    @FXML
    void add() {
        MongoDatabase db = DbConnection.getDbConnection();
        MongoCollection<Document> collection = db.getCollection("book");

        Document document = new Document();
        document.put("id", txtId.getText());
        document.put("ISBM_number", txtISBM.getText());
        document.put("name", txtName.getText());
        document.put("author", txtAuthor.getText());
        document.put("editor", txtEditor.getText());
        document.put("publisher", txtPublisher.getText());
        collection.insertOne(document);

        new Alert(Alert.AlertType.INFORMATION, "Successfully Added").showAndWait();
    }
}