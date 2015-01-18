package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by wshino on 2015/01/18.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "TODO index page.\n";
    }

    @RequestMapping("/hoge")
    public String hoge() {
        return "hoge";
    }

    @RequestMapping("/user")
    public HashMap<String, String> user() {
        HashMap<String, String> hoge = new HashMap<>();
        hoge.put("first_name", "taro");
        hoge.put("last_name", "tanaka");
        return hoge;
    }

}
