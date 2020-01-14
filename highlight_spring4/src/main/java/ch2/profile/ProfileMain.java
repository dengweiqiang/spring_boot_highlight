package ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dengweiqiang on 2020/1/14
 */
public class ProfileMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // 将活动的Profile设置为development
        context.getEnvironment().setActiveProfiles("dev");
        // 后置注册Bean配置类，不然会报Bean未定义的错误
        context.register(ProfileConfig.class);
        // 刷新容器
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
