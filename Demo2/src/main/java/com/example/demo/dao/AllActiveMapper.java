package com.example.demo.dao;

import com.example.demo.entity.AllActive;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author uht
* @description 针对表【all_active】的数据库操作Mapper
* @createDate 2024-01-17 15:54:55
* @Entity com.example.demo.entity.AllActive
*/
@Mapper
public interface AllActiveMapper  {
    List<AllActive> activityList();
}




