package com.example.demo.service;

import com.example.demo.entity.Userinfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author uht
* @description 针对表【userinfo】的数据库操作Service
* @createDate 2023-12-11 15:34:10
*/
public interface UserinfoService  {
  Userinfo logininfo(String username, String password);
    Userinfo logininfoname(String username);
    int  insertuser(String username,String password);
}
