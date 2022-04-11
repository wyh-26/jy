package com.wyh.jy.blogadminapi.vo;

import java.io.Serializable;

public class ResSuccess  implements Serializable{
    int code = 200;
    String msg = "上传成功";
    Data data = null;
    public ResSuccess(String path){
        this.data = new Data();
        this.data.src = path;
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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}

