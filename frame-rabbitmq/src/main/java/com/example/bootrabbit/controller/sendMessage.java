package com.example.bootrabbit.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class sendMessage {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @RequestMapping("/sendMessageTest")
    public String sendMessageTest(){
        Map<String , Object> _map = new HashMap<>();
        String s = "aaa";
        _map.put("aaa",s);
        rabbitTemplate.convertAndSend("TestDirectExchange","TestDirectRouting",s);
        return "success";
    }
}
