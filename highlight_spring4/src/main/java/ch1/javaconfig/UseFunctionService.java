package ch1.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dengweiqiang on 2020/1/14
 */
public class UseFunctionService {

    FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
}
