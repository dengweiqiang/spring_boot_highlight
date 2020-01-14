package ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dengweiqiang on 2020/1/14
 */
public class DiMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("di"));

        context.close();
    }
}
