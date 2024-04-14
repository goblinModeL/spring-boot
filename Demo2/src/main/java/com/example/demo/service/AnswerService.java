package com.example.demo.service;

import com.example.demo.entity.Answer;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* @author LY
* @description 针对表【answer】的数据库操作Service
* @createDate 2024-04-11 16:43:45
*/
public interface AnswerService  {
 List<Answer> Answers(int id);
 List<Answer> anList0();
 List<Map<String, Object>> nameList(int id);
 List<Map<String, Object>> nameListAll();
 void insertList(int  mesid,String an_mes,int an_userid,int state);
}
