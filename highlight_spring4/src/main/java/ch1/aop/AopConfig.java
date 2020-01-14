package ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("ch1.aop")
public class AopConfig {
}
