package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * Created by wshino on 2015/01/18.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "/index";
    }

}
