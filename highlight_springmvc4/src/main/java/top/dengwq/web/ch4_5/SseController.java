package top.dengwq.web.ch4_5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@Controller
public class SseController {

    @RequestMapping(value = "/push", produces = "text/event-stream")
//    @ResponseBody
    public void push(HttpServletResponse response) {

        response.setContentType("text/event-stream");
        response.setCharacterEncoding("utf-8");

        Random random = new Random();
        try {
            PrintWriter printWriter = response.getWriter();
            printWriter.print("data:Testing 1,2,3,  " + random.nextInt(100) + "\n\n");
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
