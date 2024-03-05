package com.example.demo.service;

import com.example.demo.entity.Countpage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author uht
* @description 针对表【countpage】的数据库操作Service
* @createDate 2024-03-05 09:24:42
*/
public interface CountpageService  {

    int NumberOfUpdates(String router);
}
