package top.dengwq.web.ch4_5;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.dengwq.domain.DemoObj;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@RestController
public class ConverterController {

    @RequestMapping(value = "/convert", produces = {"application/x-wisely"})
    public DemoObj convert(@RequestBody DemoObj demoObj) {
        return demoObj;
    }

}
