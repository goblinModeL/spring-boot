package com.example.demo.controller;

import com.example.demo.config.GenerateToken;
import com.example.demo.dao.PhysiqueMapper;
import com.example.demo.entity.*;
import com.example.demo.manage.ErrorCode;
import com.example.demo.manage.PageResult;
import com.example.demo.manage.Result;
import com.example.demo.manage.UniformTreatment;

import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        if (ren != null && !ren.isEmpty()) {
            return UniformTreatment.success(ren);
        } else {
            return UniformTreatment.Erro();
        }
    }

    @Autowired
    private UserinfoService userinfoService;

    @GetMapping("/login")
    public Result begin(@RequestParam String username, @RequestParam String password) {
        Userinfo name = userinfoService.logininfoname(username);
        Userinfo mes = userinfoService.logininfo(username, password);
        if (mes == null && name == null) {
            return new Result(ErrorCode.NULL_ERROR);

        } else if (mes == null) {
            return new Result(201, "密码错误");
        }
        GenerateToken tokenGenerator = new GenerateToken();
        mes.setToken(tokenGenerator.createToken(mes));
        System.out.println(mes);
        return new Result(200, "成功", mes);
    }

    ;

    @GetMapping("/insert")
    public Result INSERT(@RequestParam String username, @RequestParam String password) {
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
//   @GetMapping("/ceshi")
//   public PageResult ceshi(@RequestParam int  pagenum, @RequestParam int pagesize) {
//       List<Page> value=pageService.countpage(pagenum,pagesize);
//       return  new PageResult(200, "ok", value,pagesize,pagenum);
//   }

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

    @Autowired
    private PhysiqueService physiqueService;

    @GetMapping("/orgtype")
    public Result getbodytype(@RequestParam int id) {
        List<Physique> list = physiqueService.GetBodys(id);
        if (list != null && !list.isEmpty()) {
            return new Result(200, "成功", list);

        } else
            return new Result(201, "暂未进行资质辨析", 0);

    }
    @GetMapping("/updateorg")
    public Result updatePhysique(@RequestParam int id, @RequestParam int body_type) {
       physiqueService.updatePhysique(id,body_type);

            return new Result(200, "成功");



    }

    @Autowired
    private ProblemService problemService;

    @GetMapping("/problem")
    public PageResult Prolist(@RequestParam int pagenum, @RequestParam int pagesize) {
        List<Problem> list = problemService.proList(pagenum, pagesize);
        List<Map<String, Object>> nameList=problemService.nameList(pagenum,pagesize);
        int i=0;
        for (Map<String, Object> nameMap : nameList) {
            nameMap.put("problemList", list.get(i++));
        }
        // 遍历 nameList
        int num = problemService.proNum();
        System.out.println(num);
        if (!list.isEmpty()) {
            return new PageResult(200, num, nameList, pagesize, pagenum);
        }
       else
            return new PageResult(500, num, null, pagesize, pagenum);

    }
    //用户个人问题表
    @GetMapping("/problem0")
    public Result proListnum(@RequestParam int id) {
        List<Problem> list = problemService.proListnum(id);

            return new Result(200, "成功", list);
    }
    //管理员问题
    @GetMapping("/problemnu0")
    public Result proList0() {
        List<Problem> list = problemService.proList0();

        return new Result(200, "成功", list);
    }
    //管理员问题审核
    @GetMapping("/problemnu1")
    public Result proList1(int state,int mesid) {
         problemService.updateproList0(state,mesid);
        return new Result(200, "通过审核");
    }
    //管理员回答


    //管理员通过回答
    @GetMapping("/anblemnu1")
    public Result deleteAnswerByMesid( int state,  int an_id) {
        System.out.println(state);
        problemService.deleteAnswerByMesid(state,an_id);
        return new Result(200, "通过审核");
    }
    @GetMapping("/delproblem")
    public Result deleteProblemByMesid(@RequestParam int mesid) {
         problemService.deleteProblemByMesid(mesid);

            return new Result(200, "删除成功", null);

    }
 @Autowired
    private  AnswerService answerService;
    @GetMapping("/AnswerList1")
    public Result anList0() {
        List<Answer> list =  answerService.anList0();
        List<Map<String, Object>> nameList=answerService.nameListAll();
        int i = 0;
        for (Map<String, Object> nameMap : nameList) {
            nameMap.put("problemList", list.get(i++));
        }
        return new Result(200, "成功",nameList);
    }
    @GetMapping("/AnswerList")
  public  Result AnList(@RequestParam int id,  @RequestParam int queid){
        List<Answer> list =answerService.Answers(id);
        if(list.isEmpty()){
            return new Result(200, "成功", null);
        }
        else {
            List<Map<String, Object>> nameList=answerService.nameList(id);
            System.out.println(nameList);
            System.out.println(list);
            int i = 0;
            for (Map<String, Object> nameMap : nameList) {
                nameMap.put("problemList", list.get(i++));
            }
            return new Result(200, "成功", nameList);
        }
    }
    @GetMapping("/insertList")
    public  Result  insertList( int mesid, @RequestParam String an_mes, @RequestParam int an_userid,@RequestParam int state){
        answerService.insertList( mesid,an_mes,an_userid,state);
            return new Result(200, "插入成功");

    }

    @Autowired
    private  GuideService guideService;
    @GetMapping("/GuiList")
    public  PageResult GuiList(@RequestParam(required=false, defaultValue = "0") int type,@RequestParam int pagenum, @RequestParam int pagesize){
        if(type==0){
          List<Guide> list =guideService.guiAll(pagenum, pagesize);
            int length = list.size();
            return  new PageResult(200, length,list,pagesize,pagenum);
        }
        else{
            List<Guide> list =guideService.gui(type ,pagenum,  pagesize);
            int length = list.size();
            return  new PageResult(200,length ,list,pagesize,pagenum);
        }

    }
    @GetMapping("/Guiupdata")
    public Result  GuiList(int id){
       guideService.updateGuideNum(id);
        List<Guide> list =guideService.guiid(id);
        return new Result(200, "成功",list);
    }
}
