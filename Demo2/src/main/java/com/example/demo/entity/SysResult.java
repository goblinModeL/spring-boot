package com.example.demo.entity;

/*
* 系统返回结果 类
* status：状态码 200成功、500失败
* msg：消息提示
* obj：返回数据
* */
public class SysResult {
    private Integer status;
    private String msg;
    private Object obj;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
//省略get/set和ok/error方法
    public SysResult (int status,String msg,Object obj){
        this.msg=msg;
        this.obj=obj;
    }
    public SysResult (String msg){
        this.msg=msg;
    }
    public static SysResult ok(String msg, Object obj) {
        return new SysResult(200, msg, obj);
    }

    // 返回失败结果
    public static SysResult error(String msg) {
        return new SysResult(msg);
    }
}
