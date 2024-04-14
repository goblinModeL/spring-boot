package com.example.demo.service;

import com.example.demo.entity.Problem;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* @author LY
* @description 针对表【problem】的数据库操作Service
* @createDate 2024-04-11 11:09:10
*/
public interface ProblemService  {
   List<Problem> proList(int pageNum, int pageSize);
    void updateproList0(int state,int mesid);
    List<Problem> proList0();
   int proNum();
    List<Map<String, Object>>  nameList(int pageNum, int pageSize);
    List<Problem> proListnum(int id);
    void deleteProblemByMesid( int mesid);
    void deleteAnswerByMesid(int state,int mesid);
}
