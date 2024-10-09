package com.tong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.tong.mapper")
public class Springboo3Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboo3Application.class, args);
    }

}
