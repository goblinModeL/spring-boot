package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Ren;
import com.example.demo.entity.Userinfo;
import com.example.demo.service.UserinfoService;
import com.example.demo.dao.UserinfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
* @author uht
* @description 针对表【userinfo】的数据库操作Service实现
* @createDate 2023-12-11 15:34:10
*/
@Service
public class UserinfoServiceImpl implements UserinfoService{
    @Resource
    private  UserinfoMapper userinfoMapper;
    @Override
    public Userinfo logininfo( String username,   String password){
        Userinfo user = userinfoMapper.login(username,password);
        return user;
    };

    @Override
    public Userinfo logininfoname( String username){
        Userinfo user = userinfoMapper.loginname(username);
        return user;
    };
    @Override
    public  int insertuser(String username, String password ){
        int user = userinfoMapper.insert(username,password);
        return user;
    }
}




