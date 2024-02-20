package com.example.demo.manage;

import java.io.Serializable;

public class Result<T>  implements Serializable {
    /**
     * 状态码
     */
    private int code;

    /**
     * 消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    /**
     * 描述
     */
    public String description;

    public Result(int code, String message, String description, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.description = description;
    }

    public Result(int code, String message, T data) {
        this(code, message, "", data);
    }

    public Result(int code, T data) {
        this(code, "", "", data);
    }

    public Result(ErrorCode errorCode) {
        this(errorCode.getCode(), errorCode.getMessage(), errorCode.getDescription(), null);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public String getDescription() {
        return description;
    }
}
