package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.AllActive;
import com.example.demo.service.AllActiveService;
import com.example.demo.dao.AllActiveMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author uht
* @description 针对表【all_active】的数据库操作Service实现
* @createDate 2024-01-17 15:54:55
*/
@Service
public class AllActiveServiceImpl implements AllActiveService{
    @Resource
    private  AllActiveMapper  activeMapper;
    @Override
    public List<AllActive> getActive() {
        System.out.println("222");;
//        System.out.println(activeMapper.activityList());;
        return activeMapper.activityList();
    }

}




