package com.zzz.demo.ssm_web.core;


//import com.alibaba.fastjson.annotation.JSONField;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonInclude(Include.NON_EMPTY)
public class JsonResult {

    public JsonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @JsonProperty("Code")
    //@JSONField(name ="Code")
    private int code;

    private String msg;

    //@JsonIgnore
    private Object result;

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
