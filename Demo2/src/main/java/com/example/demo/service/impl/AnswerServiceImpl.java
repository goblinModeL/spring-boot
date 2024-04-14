package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Answer;
import com.example.demo.service.AnswerService;
import com.example.demo.dao.AnswerMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* @author LY
* @description 针对表【answer】的数据库操作Service实现
* @createDate 2024-04-11 16:43:45
*/
@Service
public class AnswerServiceImpl implements AnswerService{

    @Resource
    private AnswerMapper answerMapper;
    @Override
   public List<Answer> Answers(int id){

         return answerMapper.Answers(id);
    }
    @Override
    public List<Answer> anList0(){

        return answerMapper.anList0();
    }
    @Override
    public  List<Map<String, Object>> nameList(int id){
        return answerMapper.nameList(id);
    }
    @Override
    public  List<Map<String, Object>> nameListAll(){
        return answerMapper.nameListAll();
    }
    @Override
    public   void insertList(int  mesid,String an_mes,int an_userid,int state){
        answerMapper.insertList(mesid,an_mes,an_userid,state);
    }
}




