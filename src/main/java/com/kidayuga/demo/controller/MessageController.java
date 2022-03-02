package com.kidayuga.demo.controller;

import java.util.List;

import com.kidayuga.demo.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messages")
public class MessageController {
//    @Autowired
//    JdbcTemplate jdbcTemplate;

    @GetMapping
    public List<Message> getMessage() {
        return null;
    }
}
