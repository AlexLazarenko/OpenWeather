package home.controller;


import home.mongoDBService.MongoDBService;
import home.utils.PropertiesLoader;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;


import java.io.IOException;


/**
 * controller class using to provide HTTP endpoint
 */
public class OpenWeatherController {

    public static void execute() throws IOException {
        final Content getResult = Request.Get(PropertiesLoader.getProperty("api.request.url"))
                .execute().returnContent();
        MongoDBService.service(getResult.asString());
    }
}



