package top.dengwq.web.ch4_4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import top.dengwq.domain.DemoObj;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomething (@ModelAttribute("msg") String msg, DemoObj obj) {
        throw new IllegalArgumentException("非常抱歉，参数有误----" + "来自@ModelAttribut: " + msg);
    }

}
