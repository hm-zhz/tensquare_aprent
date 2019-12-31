package com.sz.tencent.common;

/**
 * 功能描述: 统一返回提示信息；
 *
 * @author Tony.Min
 * @date 2019/10/25 15:29
 */
public class ResultBean {

    private int code = 0;
    private String msg = "操作成功！";

    public ResultBean() {
    }

    public ResultBean(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
