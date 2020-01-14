package ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
