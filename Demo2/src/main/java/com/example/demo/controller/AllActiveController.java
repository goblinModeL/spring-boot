package com.example.demo.controller;

import com.example.demo.entity.AllActive;
import com.example.demo.entity.Countpage;
import com.example.demo.entity.SysResult;
import com.example.demo.manage.ApiResponse.Api;
import com.example.demo.manage.Result;
import com.example.demo.service.AllActiveService;

import com.example.demo.service.CountpageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/getActive")

public class AllActiveController {
    @Autowired
     private AllActiveService  AllActiveService;

    @GetMapping("/all")
     public Api getAll(){

            List<AllActive> allActive = AllActiveService.getActive();

            return  new Api("200", "成功", allActive);


    }
    @Autowired
    private CountpageService  countpageService;
    @GetMapping("/count")
    public Result getRouteCount(@RequestParam String  route){

        int allActive = countpageService.NumberOfUpdates(route);

        if(allActive!=0){

        return  new Result(200, "成功", allActive);}
        else
        {
            return  new Result(500, "未知异常");
        }


    }
    @PostMapping("/upload")
    public SysResult uploadAvatarHandler(@RequestParam("file") MultipartFile uploadFile ) throws IOException {


        // 开发环境 resources 目录：可永久保存
        String resourcesPath = System.getProperty("user.dir") + "/Demo2/src/main/resources/static/img";
        // System.out.printf("resources目录路径：" + resourcesPath);
        File path = new File(resourcesPath);
        System.out.println("[上传的文件名]：" + uploadFile);
        //获得项目的类路径

        if ( uploadFile != null) {
            //获得上传文件的文件名
            String oldName = uploadFile.getOriginalFilename();
            System.out.println("[上传的文件名]：" + oldName);
            //我的文件保存在static目录下的avatar/user
            File avatar = new File(path, oldName);
            try {
                //保存图片
                uploadFile.transferTo(avatar);
                //返回成功结果，附带文件的相对路径
                return SysResult.ok("上传成功","/static/img"+oldName);
            }catch (IOException e) {
                e.printStackTrace();
                return SysResult.error("上传失败");
            }
        }else {
            System.out.println("上传的文件为空");
            return SysResult.error("文件传输错误");
        }

    }



}
