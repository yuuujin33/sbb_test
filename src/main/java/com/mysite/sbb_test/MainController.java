package com.mysite.sbb_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/hi")
    public String hi () {
        return "hi";
    }

    @GetMapping("/")
    public String root () {
        return "article_list";
    }
}
