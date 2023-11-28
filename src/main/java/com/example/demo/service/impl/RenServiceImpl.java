package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.RenDao;
import com.example.demo.entity.Ren;
import com.example.demo.service.RenService;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Ren)表服务实现类
 *
 * @author makejava
 * @since 2023-11-28 13:51:17
 */
@Service
public class RenServiceImpl implements RenService {
    @Resource
    private RenDao renDao;


    @Override
    public Ren queryById() {
       Ren ren = renDao.queryByIdss();
        return ren;
    }

    @Override
    public Page<Ren> queryByPage(Ren ren, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Ren insert(Ren ren) {
        return null;
    }

    @Override
    public Ren update(Ren ren) {
        return null;
    }

    @Override
    public boolean deleteById() {
        return false;
    }
}
