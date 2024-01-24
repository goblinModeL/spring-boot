package com.example.demo.controller;

import com.example.demo.entity.AllActive;
import com.example.demo.manage.ApiResponse.Api;
import com.example.demo.service.AllActiveService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
