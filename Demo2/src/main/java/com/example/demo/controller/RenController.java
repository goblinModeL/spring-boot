package com.example.demo.controller;

import com.example.demo.config.GenerateToken;
import com.example.demo.entity.Page;
import com.example.demo.entity.Ren;
import com.example.demo.entity.Userinfo;
import com.example.demo.manage.ErrorCode;
import com.example.demo.manage.PageResult;
import com.example.demo.manage.Result;
import com.example.demo.manage.UniformTreatment;

import com.example.demo.service.PageService;
import com.example.demo.service.RenService;
import com.example.demo.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * (Ren)表控制层
 *
 * @author makejava
 * @since 2023-11-28 13:51:05
 */
@RestController
@CrossOrigin

@RequestMapping("/home")
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
    @Autowired
    private UserinfoService userinfoService;
    @GetMapping("/login")
    public Result begin(@RequestParam String  username, @RequestParam String password){
        Userinfo name=userinfoService.logininfoname(username);
              Userinfo mes= userinfoService.logininfo(username,password);
        if (mes == null &&name==null) {
            return new Result(ErrorCode.NULL_ERROR);

        }
        else if(mes == null){
            return new Result(201, "密码错误" );
        }
        GenerateToken tokenGenerator = new GenerateToken();
        mes.setToken(tokenGenerator.createToken(mes));
        System.out.println(mes);
        return new Result(200, "成功", mes);
    };
    @GetMapping("/insert")
    public Result INSERT(@RequestParam String  username, @RequestParam String password) {
        Userinfo name = userinfoService.logininfoname(username);
        if (name != null) {
            return new Result(201, "用户名已存在", null);
        } else {
         int mes = userinfoService.insertuser(username, password);
            return new Result(200, "注册成功", null);
        }
    }
    @Autowired
    private PageService pageService;
   @GetMapping("/ceshi")
   public PageResult ceshi(@RequestParam int  pagenum, @RequestParam int pagesize) {
       List<Page> value=pageService.countpage(pagenum,pagesize);
       return  new PageResult(200, "ok", value,pagesize,pagenum);
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

