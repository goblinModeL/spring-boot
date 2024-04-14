package com.example.demo.controller;

import com.example.demo.entity.AllActive;
import com.example.demo.entity.Countpage;
import com.example.demo.manage.ApiResponse.Api;
import com.example.demo.manage.Result;
import com.example.demo.service.AllActiveService;

import com.example.demo.service.CountpageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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




}
