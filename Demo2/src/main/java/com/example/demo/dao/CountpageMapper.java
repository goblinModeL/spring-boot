package com.example.demo.dao;

import com.example.demo.entity.AllActive;
import com.example.demo.entity.Countpage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author uht
* @description 针对表【countpage】的数据库操作Mapper
* @createDate 2024-03-05 09:24:42
* @Entity com.example.demo.entity.Countpage
*/
@Mapper
public interface CountpageMapper{
    int selectPage(@Param("routeName") String routeName) ;



    int insertPage(@Param("routeName") String routeName);
}




