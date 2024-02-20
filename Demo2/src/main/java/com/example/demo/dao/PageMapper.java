package com.example.demo.dao;

import com.example.demo.entity.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author uht
* @description 针对表【page】的数据库操作Mapper
* @createDate 2024-02-20 13:40:42
* @Entity com.example.demo.entity.Page
*/
@Mapper
public interface PageMapper  {
   List<Page> PagingQuery();
}




