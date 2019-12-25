package home.mongoClientConnector;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import home.utils.PropertiesLoader;

/**
 * Connector class using to connect to MongoDB
 */
public class MongoClientConnector {
    public static MongoClient connect() {
        MongoClientURI uri = new MongoClientURI(PropertiesLoader.getProperty("mongodb.uri"));
        return new MongoClient(uri);
    }
}
