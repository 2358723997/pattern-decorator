package com.gupau.edu.vip.pattern.decorate.passport;

import lombok.Data;

/**
 * ResultMsg类
 *
 * @author wangjixue
 * @date 2019-08-24 14:15
 */
@Data
public class  ResultMsg<T> {
    private int code;
    private boolean success;
    private String msg;
    private T data;

    public ResultMsg(int code, boolean success, String msg, T data) {
        this.code = code;
        this.success = success;
        this.msg = msg;
        this.data = data;
    }
}
