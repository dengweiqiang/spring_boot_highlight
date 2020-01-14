package ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by dengweiqiang on 2020/1/14
 */
public class JSR250WayService {

    @PostConstruct
    public void init() {
        System.out.println("JSR250-init-method");
    }

    public JSR250WayService() {
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JSR250-destory-method");
    }

}
