package ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by dengweiqiang on 2020/1/14
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = -482523558307405787L;

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
