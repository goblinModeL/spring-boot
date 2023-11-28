package com.example.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Ren;
import org.springframework.data.domain.PageRequest;

/**
 * (Ren)表服务接口
 *
 * @author makejava
 * @since 2023-11-28 13:51:13
 */
public interface RenService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    Ren queryById();

    /**
     * 分页查询
     *
     * @param ren 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Ren> queryByPage(Ren ren, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ren 实例对象
     * @return 实例对象
     */
    Ren insert(Ren ren);

    /**
     * 修改数据
     *
     * @param ren 实例对象
     * @return 实例对象
     */
    Ren update(Ren ren);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}
