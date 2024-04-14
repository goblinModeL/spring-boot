package com.example.demo.dao;

import com.example.demo.entity.Guide;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author LY
* @description 针对表【guide】的数据库操作Mapper
* @createDate 2024-04-12 20:30:57
* @Entity com.example.demo.entity.Guide
*/
@Mapper
public interface GuideMapper  {
   List<Guide> gui(int type);
   List<Guide> guiAll();

   void updateGuideNum(int id);
   List<Guide> guiid(int id);
}




