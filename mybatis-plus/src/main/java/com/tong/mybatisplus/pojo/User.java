package com.tong.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Package:com.tong.mybatisplus.pojo
 *
 * @ClassName:User
 * @Create:2024/7/15 18:53
 **/
@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Long uid;
    private String name;
    private Integer age;
    private String email;
}
