package com.example.demo.manage;

public class ResultUtils {

    /**
     * 成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getMessage(), data);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static Result error(ErrorCode errorCode) {
        return new Result<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code, message, description
     * @return
     */
    public static Result error(int code, String message, String description) {
        return new Result<>(code, message, description, null);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static Result error(ErrorCode errorCode, String message, String description) {
        return new Result<>(errorCode.getCode(), message, description);
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static Result<?> error(ErrorCode errorCode, String description) {
        System.out.println(errorCode.getCode());
        System.out.println(errorCode.getMessage());
        return new Result<>(errorCode.getCode(), errorCode.getMessage(), description);
    }

}
