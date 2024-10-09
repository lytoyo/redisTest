package com.tong.mybatisplus.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tong.mybatisplus.Service.UserService;
import com.tong.mybatisplus.mapper.UserMapper;
import com.tong.mybatisplus.pojo.User;
import com.tong.mybatisplus.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Package:com.tong.mybatisplus.Service.Impl
 *
 * @ClassName:UserServiceImpl
 * @Create:2024/7/15 19:05
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Autowired
    UserMapper userMapper;
    public Result selectUser(){
        List<User> list = userMapper.selectList(null);
        return Result.success(list);
    }
}
