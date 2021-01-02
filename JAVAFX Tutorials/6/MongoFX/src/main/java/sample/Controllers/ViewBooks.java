package sample.Controllers;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.bson.Document;
import sample.Books;
import sample.DbConnection;

import java.util.Iterator;

public class ViewBooks {

    @FXML
    private TableView<Books> tableBooks;

    @FXML
    private TableColumn<Books, String> col_id;

    @FXML
    private TableColumn<Books, String> col_isbm;

    @FXML
    private TableColumn<Books, String> col_name;

    @FXML
    private TableColumn<Books, String> col_author;

    @FXML
    private TableColumn<Books, String> col_editor;

    @FXML
    private TableColumn<Books, String> col_publisher;

    ObservableList<Books> list = FXCollections.observableArrayList();

    @FXML
    void view() {
        MongoDatabase db = DbConnection.getDbConnection();
        db.getCollection("book");
        MongoCollection<Document> collection = db.getCollection("book");
        FindIterable<Document> iterDoc = collection.find();
        Iterator it = iterDoc.iterator();
        list.clear();
        while (it.hasNext()) {
            Document document = (Document) it.next();
            list.add(new Books(document.getString("id"),document.getString("ISBM_number"),document.getString("name"),document.getString("author"),document.getString("editor"),document.getString("publisher")));
        }

        col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_isbm.setCellValueFactory(new PropertyValueFactory<>("ISBM_number"));
        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_author.setCellValueFactory(new PropertyValueFactory<>("author"));
        col_editor.setCellValueFactory(new PropertyValueFactory<>("editor"));
        col_publisher.setCellValueFactory(new PropertyValueFactory<>("publisher"));

        tableBooks.setItems(list);

    }
}
