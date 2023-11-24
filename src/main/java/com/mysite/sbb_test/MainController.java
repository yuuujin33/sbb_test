package com.mysite.sbb_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/hi")
    @ResponseBody
    public String hi () {
        return "hi";
    }
}
