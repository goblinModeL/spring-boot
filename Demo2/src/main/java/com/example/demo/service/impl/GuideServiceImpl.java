package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.CountpageMapper;
import com.example.demo.entity.Guide;
import com.example.demo.service.GuideService;
import com.example.demo.dao.GuideMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author LY
* @description 针对表【guide】的数据库操作Service实现
* @createDate 2024-04-12 20:30:57
*/
@Service
public class GuideServiceImpl implements GuideService{
    @Resource
    private GuideMapper guideMapper;
    @Override
  public  List<Guide> gui(int type,int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return guideMapper.gui(type);
    }
    @Override
  public   List<Guide> guiAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return guideMapper.guiAll();
    }
    @Override
public    void updateGuideNum(int id){
       guideMapper.updateGuideNum(id);
}
    @Override
    public   List<Guide> guiid(int id){
        return guideMapper.guiid(id);
    }

}




