package com.example.demo.dao;

import com.example.demo.entity.Answer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @author LY
* @description 针对表【answer】的数据库操作Mapper
* @createDate 2024-04-11 16:43:45
* @Entity com.example.demo.entity.Answer
*/
@Mapper
public interface AnswerMapper {
    List<Answer> Answers(int id);
    List<Answer> anList0();
    List<Map<String, Object>> nameList(int id);
    List<Map<String, Object>> nameListAll();
   void insertList(@Param("mesid") int  mesid, @Param("an_mes") String an_mes, @Param("an_userid") int an_userid,  @Param("state") int state);
}




