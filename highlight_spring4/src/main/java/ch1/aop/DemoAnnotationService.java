package ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的ADD操作")
    public void add(){}
}
