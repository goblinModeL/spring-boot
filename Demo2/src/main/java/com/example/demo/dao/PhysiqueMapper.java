package com.example.demo.dao;

import com.example.demo.entity.Physique;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author LY
* @description 针对表【physique】的数据库操作Mapper
* @createDate 2024-04-10 20:14:20
* @Entity com.example.demo.entity.Physique
*/
@Mapper
public interface PhysiqueMapper  {
   List<Physique> GetBody(int id);
   void updatePhysique(@Param("id")int id, @Param("body_type") int body_type);
}




