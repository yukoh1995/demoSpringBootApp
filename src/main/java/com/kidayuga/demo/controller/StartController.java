package com.kidayuga.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class StartController {

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello World!!!";
    }
}
