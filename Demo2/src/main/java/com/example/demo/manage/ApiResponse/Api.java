package com.example.demo.manage.ApiResponse;

import java.util.HashMap;


public class Api  extends HashMap<String,Object> {
    private  String code;
    private  String mes;

    public Api(String code, String mes,Object data) {
        this.code = code;
        this.mes = mes;
        super.put("status", code);
        super.put("message", mes);
        if(data!=null){
            super.put("data",data);
        }
    }
}
