package idv.tim.example.hellosprintbootschedulejob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling // <--- 啟用排程
@SpringBootApplication
public class HelloSprintBootScheduleJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSprintBootScheduleJobApplication.class, args);
    }

}
