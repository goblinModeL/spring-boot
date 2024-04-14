package com.example.demo.manage;

import java.io.Serializable;

public class PageResult<T>  implements Serializable {
    private int code;

    /**
     * 消息
     */
    private String message;
    private T data;
    private  int PageSize;
    private  int PageNum;
    private  int Sum;

    public int getSum() {
        return Sum;
    }

    public PageResult(int code, int Sum , T data, int PageSize, int PageNum) {
        this.code = code;
        this.Sum=Sum;
        this.data = data;
        this.PageNum=PageNum;
        this.PageSize=PageSize;
    }


//    public PageResult(int code,int Sum ,T data ,int PageSize,int PageNum) {
//        this(code, Sum, data,PageSize,PageNum);
//    }


    public int getCode() {
        return code;
    }

    public int getPageSize() {
        return PageSize;
    }

    public int getPageNum() {
        return PageNum;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }


}
