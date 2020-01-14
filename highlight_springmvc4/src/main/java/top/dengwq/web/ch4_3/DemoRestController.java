package top.dengwq.web.ch4_3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.dengwq.domain.DemoObj;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson", produces = {"application/json;charset=UTF-8"})
    public DemoObj getjson (DemoObj obj) {
        return new DemoObj(obj.getId(), obj.getName());
    }

    @RequestMapping(value = "/getxml", produces = {"application/xml;charset=UTF-8"})
    public DemoObj getxml (DemoObj obj) {
        return new DemoObj(obj.getId(), obj.getName());
    }

}
