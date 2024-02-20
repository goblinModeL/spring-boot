package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.RenDao;
import com.example.demo.entity.Page;
import com.example.demo.service.PageService;
import com.example.demo.dao.PageMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author uht
* @description 针对表【page】的数据库操作Service实现
* @createDate 2024-02-20 13:40:42
*/
@Service
public class PageServiceImpl implements PageService{
    @Resource
    private PageMapper pageMapper;
    @Override
    public List<Page> countpage(int pageNum, int pageSize) {
        PageHelper.startPage(1, 10);
        List<Page> list = pageMapper.PagingQuery(pageNum,pageSize);

        return list;
    }
}




