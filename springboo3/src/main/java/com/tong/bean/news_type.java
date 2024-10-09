package com.tong.bean;

import lombok.Data;

/**
 * Package:com.tong.bean
 *
 * @ClassName:news_type
 * @Create:2024/7/11 9:59
 **/
@Data
public class news_type {
    private int tid;
    private  String tname;
    private int version;
    int is_deleted;

}
