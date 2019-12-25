package home.mongoClientConnector;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import home.utils.PropertiesLoader;

public class MongoClientConnector {
    public static MongoClient connect() {
        MongoClientURI uri = new MongoClientURI(PropertiesLoader.getProperty("mongodb.uri"));
        return new MongoClient(uri);
    }
}
