package com.example.bootrabbit.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class DirectRabbitConfig {

    @Bean
    //队列配置
    public Queue TestDirectQueue() {
        return new Queue("TestDirectQueue", true);
    }
    //Direct交换机配置
    @Bean
    DirectExchange TestDirectExchange() {
        return new DirectExchange("TestDirectExchange", true, false);
    }
    @Bean
    DirectExchange lonelyDirectExchange() {
        return new DirectExchange("lonelyDirectExchange");
    }

}
