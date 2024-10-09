package com.tong.mapper;

import com.tong.bean.news_type;
import org.apache.ibatis.annotations.Param;

/**
 * Package:com.tong
 *
 * @ClassName:news_typeMapper
 * @Create:2024/7/11 10:01
 **/
public interface news_typeMapper {
    public news_type getNews_type(@Param("id") int id);

}
