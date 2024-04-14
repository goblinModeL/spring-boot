package com.example.demo.service;

import com.example.demo.entity.Page;
import com.example.demo.entity.Physique;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author LY
* @description 针对表【physique】的数据库操作Service
* @createDate 2024-04-10 20:14:20
*/
public interface PhysiqueService  {
    List<Physique> GetBodys(int id);
    void updatePhysique(int id,int body_type);
}
