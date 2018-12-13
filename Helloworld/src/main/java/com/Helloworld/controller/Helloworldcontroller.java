package com.Helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Helloworldcontroller {

    @RequestMapping("/")
    @ResponseBody
    String index() {
        return "Hello, World!";
    }

}
