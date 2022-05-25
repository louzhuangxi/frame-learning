package com.example.bootrabbit.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queues = "TestDirectQueue")
//消息监听类 绑定监听队列
//直流交换机 多个消费者同时监听同时监听同一队列 队列中的消息轮询消费 不存在被重复消费的情况
public class DirectReceiver {
    @RabbitHandler
    public void process(String saveMessage){
        System.out.println("DirectReceiver消费者监听到的消息为:"+saveMessage);
    }
}
