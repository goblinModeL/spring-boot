package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Physique;
import com.example.demo.service.PhysiqueService;
import com.example.demo.dao.PhysiqueMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
* @author LY
* @description 针对表【physique】的数据库操作Service实现
* @createDate 2024-04-10 20:14:20
*/
@Service
public class PhysiqueServiceImpl    implements PhysiqueService{
    @Resource
    private PhysiqueMapper physiqueMapper;
    @Override
    public List<Physique> GetBodys(@RequestParam  int id){
        return physiqueMapper.GetBody(id);
    }
    @Override
    public void updatePhysique(int id,int body_type){
        physiqueMapper.updatePhysique(id,body_type);
    }
}




