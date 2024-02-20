package com.example.demo.service;

import com.example.demo.entity.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author uht
* @description 针对表【page】的数据库操作Service
* @createDate 2024-02-20 13:40:42
*/
public interface PageService {

List<Page> countpage(int pageNum, int pageSize);
}
