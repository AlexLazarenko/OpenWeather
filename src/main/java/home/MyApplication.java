package home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Main class using to start application
 * <p>
 * application makes a  request to the configured API
 * request URL, save the response to MongoDB Atlas(cloud)
 *
 * @author Alex Lazarenko
 * @since 2019-12-26
 */
@SpringBootApplication
@EnableScheduling
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class);
    }
}
