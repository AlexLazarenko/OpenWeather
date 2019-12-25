package home;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * Main class using to start application
 * <p>
 * Application that assist user with getting reduced form
 * for arbitrary set of page numbers that user would like to print.
 *
 * @author Alex Lazarenko
 * @since 2019-12-11
 */

@SpringBootApplication
@EnableScheduling
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class);
    }
}
