package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.PageMapper;
import com.example.demo.entity.Page;
import com.example.demo.entity.Problem;
import com.example.demo.service.ProblemService;
import com.example.demo.dao.ProblemMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* @author LY
* @description 针对表【problem】的数据库操作Service实现
* @createDate 2024-04-11 11:09:10
*/
@Service
public class ProblemServiceImpl implements ProblemService{
    @Resource
    private ProblemMapper ProblemMapper;
    @Override
    public List<Problem> proList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Problem> list = ProblemMapper.proList();
        return list;
    }
    @Override
    public int proNum(){
        return ProblemMapper.proNum();
    }
    @Override
    public  List<Map<String, Object>> nameList(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return ProblemMapper.nameList();
    }
    @Override
    public List<Problem> proListnum(int id){
       return ProblemMapper.proListnum(id);
    }
    @Override
   public void deleteProblemByMesid( int mesid){
        ProblemMapper.deleteProblemByMesid(mesid);
    }
    @Override
    public void deleteAnswerByMesid(int state,int mesid){
        ProblemMapper.deleteAnswerByMesid(state,mesid);
    }
    @Override
    public  List<Problem> proList0(){
        return ProblemMapper.proList0();
    }
    @Override
    public void updateproList0(int state,int mesid){
        ProblemMapper.updateproList0(state,mesid);
    }

}




