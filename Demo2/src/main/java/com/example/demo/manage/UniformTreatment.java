package com.example.demo.manage;

import java.util.HashMap;

public class UniformTreatment {
   private  int code;
   private  String message;
   private Object data;

    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }



    public Object getData() {
        return data;
    }


    public UniformTreatment(int code, String message, Object data){
    this.code=code;
    this.message=message;
    this.data=data;
    }
    public UniformTreatment(int code, String message){
        this.code=code;
        this.message=message;
    }
//成功
  public static UniformTreatment success(Object data) {
         return new UniformTreatment(
                 ResponseCode.SUCCESS.getCode(),
                 ResponseCode.SUCCESS.getMessage(),
                 data
         );
  }
//404
public static   UniformTreatment NOfind(Object data) {
    return new UniformTreatment(
            ResponseCode.NoFind.getCode(),
            ResponseCode.NoFind.getMessage(),
            data
    );
}
//500
public static UniformTreatment Erro() {
    return new UniformTreatment(
            ResponseCode.Error.getCode(),
            ResponseCode.Error.getMessage()
    );
}
}
