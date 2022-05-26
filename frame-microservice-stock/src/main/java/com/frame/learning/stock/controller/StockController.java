package com.frame.learning.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengdayi
 * @ClassName: StockController
 * @Description:
 * @date 2022/5/25 下午4:54
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/reduct")
    public String reduct() {
        System.out.println("扣减库存");
        return "扣减库存" + port;
    }
}

