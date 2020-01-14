package ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dengweiqiang on 2020/1/14
 */
public class WiselyAnnotationMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        DemoService demoService = context.getBean(DemoService.class);

        demoService.outputResult();

        context.close();
    }
}
