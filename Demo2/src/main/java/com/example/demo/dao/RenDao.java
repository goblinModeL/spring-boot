package com.example.demo.dao;

import com.example.demo.entity.Ren;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Pageable;
import java.util.List;
//数据库
/**
 * (Ren)表数据库访问层
 *
 * @author makejava
 * @since 2023-11-28 13:51:07
 */
@Mapper
public interface RenDao {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    List<Ren> queryByIdss(String name);


    /**
     * 统计总行数
     *
     * @param ren 查询条件
     * @return 总行数
     */




}

