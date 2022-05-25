package com.example.bootrabbit.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SendMessageController {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @RequestMapping("/sendMessageTest")
    public String sendMessageTest(){
        String s = "aaa";
        rabbitTemplate.convertAndSend("TestDirectExchange","TestDirectRouting",s);
        return "success";
    }
}
