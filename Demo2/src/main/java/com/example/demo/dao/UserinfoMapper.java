package com.example.demo.dao;


import com.example.demo.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author uht
* @description 针对表【userinfo】的数据库操作Mapper
* @createDate 2023-12-11 15:34:10
* @Entity com.example.demo.entity.Userinfo
*/
@Mapper
public interface UserinfoMapper  {
  Userinfo login(@Param("username") String username, @Param("password") String password);//多个要加@Param
  Userinfo loginname(@Param("username") String username);
  int insert(@Param("username") String username, @Param("password") String password);
}




