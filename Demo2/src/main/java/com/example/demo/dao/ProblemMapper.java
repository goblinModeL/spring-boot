package com.example.demo.dao;

import com.example.demo.entity.Problem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* @author LY
* @description 针对表【problem】的数据库操作Mapper
* @createDate 2024-04-11 11:09:10
* @Entity com.example.demo.entity.Problem
*/
@Mapper
public interface ProblemMapper  {
     List<Problem> proList();
    List<Problem> proList0();
    List<Problem> proListnum(int id);
    void updateproList0(@Param("state")int state, @Param("mesid") int mesid);
     int proNum();
    List<Map<String, Object>> nameList();
    void deleteProblemByMesid( int mesid);
  void deleteAnswerByMesid(@Param("state")int state, @Param("an_id") int an_id);

}




