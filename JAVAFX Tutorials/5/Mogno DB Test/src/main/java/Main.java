import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String id, ISBM_number, name, author, editor, publisher, publishedDate;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter id: ");
            id = scanner.nextLine();

            System.out.print("Enter ISBM_number: ");
            ISBM_number = scanner.nextLine();

            System.out.print("Enter name: ");
            name = scanner.nextLine();

            System.out.print("Enter author: ");
            author = scanner.nextLine();

            System.out.print("Enter editor: ");
            editor = scanner.nextLine();

            System.out.print("Enter publisher: ");
            publisher = scanner.nextLine();

            System.out.print("Enter published date(yyyy-mm-dd): ");
            publishedDate = scanner.nextLine();

            mongoDB(id, ISBM_number, name, author, editor, publisher, publishedDate);

            System.out.println("Successfully Added");
        }
        System.out.println("Program completed");
        System.out.println("----------------- Your database ------------");
        printAll();

    }

    public static void mongoDB(String id, String ISBM_number,
                               String name, String author,
                               String editor, String publisher,
                               String publishedDate) {

        MongoDatabase database = DbConnection.getDbConnection();
        MongoCollection<Document> collection = database.getCollection("book");

        Document document = new Document();
        document.put("id", id);
        document.put("ISBM_number", ISBM_number);
        document.put("name", name);
        document.put("author", author);
        document.put("editor", editor);
        document.put("publisher", publisher);
        document.put("publishedDate", publishedDate);

        collection.insertOne(document);
    }

    public static void printAll() {
        MongoDatabase database = DbConnection.getDbConnection();
        MongoCollection<Document> collection = database.getCollection("book");
        FindIterable<Document> findIterable = collection.find();
        for (Document document : findIterable) {
            System.out.println(document);
        }
    }
}
