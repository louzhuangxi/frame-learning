package com.frame.learning.order.controller;

import com.frame.learning.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengdayi
 * @ClassName: OrderController
 * @Description:
 * @date 2022/5/25 下午4:50
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    StockFeignService stockFeignService;

    @RequestMapping("/add")
    public String add() {
        System.out.println("下单成功");
        String msg = stockFeignService.reduct();
        return "Hello OpenFeign" + msg;
    }
}
