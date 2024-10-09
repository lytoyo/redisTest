package com.tong.mybatisplus.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tong.mybatisplus.mapper.UserMapper;
import com.tong.mybatisplus.pojo.User;
import com.tong.mybatisplus.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Package:com.tong.mybatisplus.Service
 *
 * @ClassName:UserService
 * @Create:2024/7/15 18:57
 **/

public interface UserService extends IService<User> {
    public Result selectUser();
}
