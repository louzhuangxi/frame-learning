package com.frame.learning.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* 添加feign接口和方法
* name 指定调用rest接口所对应的服务名
* path 指定调用rest接口所在的StockController指定的@RequestMapping
* */
@FeignClient(name="frame-microservice-stock",path ="/stock")
public interface StockFeignService {

    // 声明需要调用的rest接口对应的方法
    @RequestMapping("/reduct")
    String reduct();
}
