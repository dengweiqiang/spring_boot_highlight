package ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dengweiqiang on 2020/1/14
 */
public class EventMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("hello application event");

        context.close();
    }
}
