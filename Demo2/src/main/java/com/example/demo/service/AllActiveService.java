package com.example.demo.service;

import com.example.demo.entity.AllActive;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author uht
* @description 针对表【all_active】的数据库操作Service
* @createDate 2024-01-17 15:54:55
*/
public interface AllActiveService  {
  List<AllActive> getActive();
}
