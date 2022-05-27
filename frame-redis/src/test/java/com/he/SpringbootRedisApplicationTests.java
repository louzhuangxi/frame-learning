package com.he;


import com.he.modle.User;
import com.he.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
class SpringbootRedisApplicationTests {
@Autowired
@Qualifier("redisTemplate")
private RedisTemplate redisTemplate;

@Autowired
private RedisUtil redisUtil;
    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("mykey","hejl");
        System.out.println(redisTemplate.opsForValue().get("mykey"));

    }
    @Test
   public void  testUser(){
        redisUtil.set("name","张三");
        System.out.println(redisUtil.get("name"));






}
}
