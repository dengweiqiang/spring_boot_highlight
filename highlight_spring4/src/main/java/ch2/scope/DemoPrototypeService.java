package ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by dengweiqiang on 2020/1/14
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
