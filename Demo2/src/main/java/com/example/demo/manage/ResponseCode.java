package com.example.demo.manage;

public enum ResponseCode  implements  BaseErrorInfoInterface{
        SUCCESS(200, "操作成功"),
        Error(500, "服务器异常，请联系管理员"),
        NoFind(404,"找不到页面");

        // 状态码和状态信息
        private final int code;
        private final String message;

        // 构造器
        private ResponseCode(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

}
