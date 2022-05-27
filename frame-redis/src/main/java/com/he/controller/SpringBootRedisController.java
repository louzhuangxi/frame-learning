package com.he.controller;

import com.he.service.ITestServie;
import com.he.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class SpringBootRedisController {
    @Autowired
    private ITestServie testServie;
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(value = "/test/{id}")
    public String testRedis(@PathVariable(value = "id") String id) {
//查询缓存中是否存在
        boolean hasKey = redisUtil.exists(id);
        String str = "";
        if (hasKey) {
            //获取缓存
            Object object = redisUtil.get(id);
            str = object.toString();
            System.out.println("从缓存获取的数据：" + str);
        } else {
            //从数据库中获取信息
            System.out.println("从数据库中获取数据");
            str = testServie.getName();
            redisUtil.set(id, str, 1000);
            System.out.println("数据插入缓存：" + str);
        }
        return str;
    }
}

