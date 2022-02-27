package com.kidayuga.demo.controller;

import java.util.List;
import java.util.Locale;

import com.kidayuga.demo.dto.UserMasterDto;
import com.kidayuga.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    MessageSource messageSource;

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(Model model, Locale locale) {
        List<UserMasterDto> dtos = userService.fetchAllUsers();
        model.addAttribute("dtos", dtos);
        model.addAttribute("hello", "Hello World!!");
        return "hello";
    }
}
