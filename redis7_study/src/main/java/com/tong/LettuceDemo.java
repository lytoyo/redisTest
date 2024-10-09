package com.tong;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

/**
 * Package:com.tong
 *
 * @ClassName:LettuceDemo
 * @Create:2024/7/6 16:35
 **/
public class LettuceDemo {
    public static void main(String[] args) {
//         使用构建器链式编程来builder我们的redisURI
        RedisURI uri = RedisURI.builder().
                       redis("8.138.88.55").
                       withPort(6379).
                        withAuthentication("default","abc123").
                        build();
        //创建客户端
        RedisClient redisClient = RedisClient.create(uri);
        StatefulRedisConnection connect = redisClient.connect();

//      通过connection创建操作command
        RedisCommands sync = connect.sync();

        sync.set("k3","v3");
        System.out.println(sync.keys("*"));



//        关闭释放资源
        connect.close();
        redisClient.shutdown();
    }
}
