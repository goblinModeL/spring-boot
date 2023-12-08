package com.example.demo.controller;

import com.example.demo.entity.Ren;
import com.example.demo.manage.UniformTreatment;
import com.example.demo.service.RenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * (Ren)表控制层
 *
 * @author makejava
 * @since 2023-11-28 13:51:05
 */
@RestController
@CrossOrigin

@RequestMapping("/ren")
public class RenController {
    /**
     * 服务对象
     */
    @Autowired
    private RenService renService;

    @GetMapping("/list")
    public UniformTreatment getlist(@RequestParam String name) {
        List<Ren> ren = renService.queryById(name);
         if(ren != null && !ren.isEmpty()){
             return  UniformTreatment.success(ren);
         }else{
             return UniformTreatment.Erro();
         }


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

