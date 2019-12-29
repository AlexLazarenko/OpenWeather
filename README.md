# OpenWeather
This application periodically makes requests to the OpenWeatherMap API and saves responses to a MongoDB cloud.
## Built With
* 	[Maven](https://maven.apache.org/) - Dependency Management
* 	[OpenJDK](http://jdk.java.net/archive/) - Java™ Platform, Standard Edition Development Kit 
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
## Running the application locally
There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `home.MyApplication` class from your IDE.
Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
This application is using scheduled task with `@Scheduled(cron=". . .")` annotation to periodically makes requests and saves responses to a MongoDB cloud. Cron expression defines how often scheduled task run. You can change  cron expression in the `config.properties` file. There is https://docs.spring.io/spring/docs/{spring_version}/javadoc-api/org/springframework/scheduling/support/CronSequenceGenerator.html[`@Scheduled(cron=". . .")` expressions for more sophisticated task scheduling].
