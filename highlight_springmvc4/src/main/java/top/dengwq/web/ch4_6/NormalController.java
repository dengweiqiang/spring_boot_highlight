package top.dengwq.web.ch4_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.dengwq.service.DemoService;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@Controller
public class NormalController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/normal")
    public String testPage(Model model) {
        model.addAttribute("msg", demoService.saySomething());
        return "page";
    }

}
