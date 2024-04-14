package com.example.demo.service;

import com.example.demo.entity.Guide;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author LY
* @description 针对表【guide】的数据库操作Service
* @createDate 2024-04-12 20:30:57
*/
public interface GuideService  {
    List<Guide> gui(int type,int pageNum, int pageSize);
    List<Guide> guiAll(int pageNum, int pageSize);
    void updateGuideNum(int id);
    List<Guide> guiid(int id);
}
