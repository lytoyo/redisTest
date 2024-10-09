package com.tong.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tong.mybatisplus.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Package:com.tong.mybatisplus.mapper
 *
 * @ClassName:UserMapper
 * @Create:2024/7/15 18:55
 **/
@Repository
public interface UserMapper extends BaseMapper<User> {

}
