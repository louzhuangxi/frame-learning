package com.example.bootrabbit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/saveMessageController")
public class saveMessageController {
    @RequestMapping("/saveMessage")
    public String saveMessage() {

        return "";
    }

}
