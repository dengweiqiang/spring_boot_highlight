package ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@Configuration
@ComponentScan("ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
