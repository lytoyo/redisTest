package com.tong.mybatisplus.controller;

import com.tong.mybatisplus.Service.UserService;
import com.tong.mybatisplus.pojo.User;
import com.tong.mybatisplus.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Package:com.tong.mybatisplus.controller
 *
 * @ClassName:UserController
 * @Create:2024/7/15 18:49
 **/
@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("select")
    public Result selectList(){
        Result r = userService.selectUser();
        return r;
    }
}
