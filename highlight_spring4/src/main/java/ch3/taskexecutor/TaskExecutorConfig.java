package ch3.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@Configuration
@ComponentScan("ch3.taskexecutor")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {

    // 自定义线程池
    private static final BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue(25);
    private static final ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 10, 1,
            TimeUnit.MINUTES,blockingQueue);

    public static void closeExecutor() {
        poolExecutor.shutdown();
    }

    @Override
    public Executor getAsyncExecutor() {
//        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
//        taskExecutor.setCorePoolSize(5);
//        taskExecutor.setMaxPoolSize(10);
//        taskExecutor.setQueueCapacity(25);
//        taskExecutor.initialize();

        return poolExecutor;
    }


    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
