package home.mongoDBService;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import home.mongoClientConnector.MongoClientConnector;
import org.bson.Document;

import java.util.Date;

/**
 * this class using to save response in MongoDB
 */
public class MongoDBService {
    public static void service(String result) {
        MongoDatabase database = MongoClientConnector.connect().getDatabase("test");
        MongoCollection<Document> collection = database.getCollection("openweathermap");
        Document document = new Document();
        document.put("response_date", new Date());
        document.put("response_body", result);
        collection.insertOne(document);
    }
}
