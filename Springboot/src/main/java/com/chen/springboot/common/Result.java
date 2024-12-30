package com.chen.springboot.common;

public class Result<T> {
    private String code;   //状态码
    private String message; //返回信息
    private Object data;         //返回数据

    public static Result success() {
        Result result = new Result();
        result.setCode("200");
        result.setMessage("请求成功");
        return result;
    }
    public static Result success(Object data) {
        Result result = success();
        result.setData(data);
        return result;
    }
    public static Result error() {
        Result result = new Result();
        result.setCode("500");
        result.setMessage("系统异常");
        return result;
    }
    public static Result error(String code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}