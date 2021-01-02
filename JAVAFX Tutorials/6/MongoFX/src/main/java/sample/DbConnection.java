package sample;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {
    private static MongoDatabase database = null;

    private DbConnection(){
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE);
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        database = mongoClient.getDatabase("library");
    }

    public static MongoDatabase getDbConnection(){
        if(database == null){
            new DbConnection();
        }
        return database;
    }
}