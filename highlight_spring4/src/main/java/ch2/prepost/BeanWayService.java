package ch2.prepost;

/**
 * Created by dengweiqiang on 2020/1/14
 */
public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destory-method");
    }
}
