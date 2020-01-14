package top.dengwq.web.ch4_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.dengwq.service.DemoService;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@RestController
public class MyRestController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/testRest", produces = "text/plain;charset=UTF-8")
    public String testRest() {
        return demoService.saySomething();
    }
}
