package com.husky.ssm.common.exception;

import com.husky.ssm.common.enums.CommonResultCodeEnum;

import java.io.Serializable;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/12
 */
public class BizException extends RuntimeException implements Serializable {
    private String code;

    private String msg;

    private String detailMessage;

    public BizException() {
        super();
    }

    public BizException(CommonResultCodeEnum resultCode) {
        super();
        this.code = resultCode.getCode();
    }

    public BizException(String code, String message) {
        super();
        this.code = code;
        this.msg = message;
    }

    public BizException(CommonResultCodeEnum resultCode, String detailMessage) {
        super();
        this.code = resultCode.getCode();
        this.detailMessage = detailMessage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[BizException]");
        stringBuffer.append("code:");
        stringBuffer.append(code);
        stringBuffer.append(",detailMessage:");
        stringBuffer.append(detailMessage);

        return stringBuffer.toString();
    }
}
