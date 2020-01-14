package ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置照样获得的bean");
    }

}
