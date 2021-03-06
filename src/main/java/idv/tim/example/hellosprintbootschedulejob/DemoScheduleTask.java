package idv.tim.example.hellosprintbootschedulejob;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoScheduleTask {

    @Scheduled(initialDelay = 2000, fixedRate = 3000)
    public void printUnixEpochTime() {
        System.out.println(System.currentTimeMillis());
    }


}
