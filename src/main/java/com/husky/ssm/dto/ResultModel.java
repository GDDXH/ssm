package com.husky.ssm.dto;

import com.husky.ssm.common.enums.CommonResultCodeEnum;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/14
 */
public class ResultModel<T> {
    private T result;

    private String code;

    public ResultModel() { }

    public ResultModel(String code, String msg) {
        this.code = code;
    }

    public ResultModel(T result, String code) {
        this.result = result;
    }

    public ResultModel<T> setSuccess(T result) {
        this.result = result;
        this.code = CommonResultCodeEnum.SUCCESS.getCode();
        return this;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
