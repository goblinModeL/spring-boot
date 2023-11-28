package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Ren;
import com.example.demo.service.RenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Ren)表控制层
 *
 * @author makejava
 * @since 2023-11-28 13:51:05
 */
@RestController
@RequestMapping("/ren")
public class RenController {
    /**
     * 服务对象
     */
    @Autowired
    private RenService renService;


    @GetMapping("/list")
    public Ren getlist() {
        Ren ren = renService.queryById();
        return ren;
    }


    /**
     * 新增数据
     *
     * @param ren 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Ren> add(Ren ren) {
        return ResponseEntity.ok(this.renService.insert(ren));
    }

    /**
     * 编辑数据
     *
     * @param ren 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Ren> edit(Ren ren) {
        return ResponseEntity.ok(this.renService.update(ren));
    }

}

