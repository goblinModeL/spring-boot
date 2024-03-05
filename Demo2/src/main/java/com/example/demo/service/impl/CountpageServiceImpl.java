package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Countpage;
import com.example.demo.service.CountpageService;
import com.example.demo.dao.CountpageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author uht
* @description 针对表【countpage】的数据库操作Service实现
* @createDate 2024-03-05 09:24:42
*/
@Service
public class CountpageServiceImpl implements CountpageService{
    @Resource
  private CountpageMapper countpageMapper;
    @Override
    public int NumberOfUpdates(String router){


           countpageMapper.insertPage(router);
           int route=countpageMapper.selectPage(router);

       System.out.println(route);
        return route;
    }

}




