package home;

import home.controller.OpenWeatherController;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ScheduledTasks {
    @Scheduled(cron = "*/600 * * * * *")
    public void schedule() {
        try {
            OpenWeatherController.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
