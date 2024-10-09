package com.tong.mybatisplus.utils;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Package:com.tong.mybatisplus.utils
 *
 * @ClassName:Result
 * @Create:2024/7/15 19:00
 **/
@Data
public class Result {
    private int code;
    private Object data;
    private String message;
    public static Result success(Object data){
        Result r = new Result();
        r.setData(data);
        r.setCode(200);
        r.setMessage("");
        return r;
    }
    public static Result fail(String msg){
        Result r = new Result();
        r.setMessage(msg);
        r.setData("");
        r.setCode(-1);
        return r;
    }
}
