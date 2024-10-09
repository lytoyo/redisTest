package com.tong.springboot_redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package:com.tong.springboot_redis.controller
 *
 * @ClassName:RedisTestController
 * @Create:2024/7/14 9:39
 **/
@RestController
public class RedisTestController {


    @Autowired
    StringRedisTemplate redisTemplate;
    @GetMapping("/count")
    public String Count(){
        Long count = redisTemplate.opsForValue().increment("k1");


        return "访问了"+count+"次";
    }
}
