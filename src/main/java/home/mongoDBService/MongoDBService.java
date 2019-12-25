package home.mongoDBService;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import home.mongoClientConnector.MongoClientConnector;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.Date;

public class MongoDBService {
    public static void service(String result) {
        MongoDatabase database = MongoClientConnector.connect().getDatabase("test");
        MongoCollection<Document> collection = database.getCollection("openweathermap");
        Document document = new Document();
        document.put("response_date", new Date()); //need ISODate();
        //  document.put("response_status",database.runCommand()) ;
        document.put("response_body", result);
        //   UpdateOptions updateOptions=new UpdateOptions().upsert(true);
        //   collection.updateOne(Filters.eq("_id",new ObjectId("5e025fabac27135870c0df22")),document,updateOptions);
        collection.insertOne(document);
    }
}
