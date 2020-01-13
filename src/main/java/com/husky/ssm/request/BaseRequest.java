package com.husky.ssm.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/12
 */
@Data
public abstract class BaseRequest implements Serializable {
    private static final long serialVersionUID = 1426272192190531773L;
    /**
     * IP
     */
    public String requestIp;

    /**
     * 请求时间
     */
    public String requestTime;
}
