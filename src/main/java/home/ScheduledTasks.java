package home;

import home.controller.OpenWeatherController;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * this class using to run application with a certain frequency
 */
@Component
public class ScheduledTasks {
    @Scheduled(cron = "${schedule.cron}")
    public void schedule() {
        try {
            OpenWeatherController.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
