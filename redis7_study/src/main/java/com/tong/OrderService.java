package com.tong;

import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Package:com.tong
 *
 * @ClassName:OrderService
 * @Create:2024/7/6 18:10
 **/
public class OrderService {
    public static final String ORDER_KEY = "ord:";

    public static void main(String[] args) {
        int keyId = ThreadLocalRandom.current().nextInt(1000) + 1;
        String serialNo = UUID.randomUUID().toString();
        String key = ORDER_KEY+ keyId;
        String value="京东订单"+serialNo;
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        stringRedisTemplate.opsForValue().set(key,value);

        System.out.println(stringRedisTemplate.opsForValue().get(ORDER_KEY+keyId));

    }
}
