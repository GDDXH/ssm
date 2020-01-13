package com.husky.ssm.common.enums;

/**
 * @author shency
 * @description: 通用返回结构枚举
 */
public enum CommonResultCodeEnum {
    /**
     * 运行成功
     */
    SUCCESS("000000"),
    /**
     * 系统错误
     */
    SYSTEM_ERROR("999999"),
    /**
     * 查询数据错误
     */
    QUERY_ERROR("900000"),
    /**
     * 插入数据错误
     */
    INSERT_ERROR("900001"),
    /**
     * 删除数据错误
     */
    DELETE_ERROR("900002"),
    /**
     * 更新数据错误
     */
    UPDATE_ERROR("900003"),
    ;
    private final String code;

    public String getCode() {
        return code;
    }

    CommonResultCodeEnum(String code) {
        this.code = code;
    }

    public static CommonResultCodeEnum getResultCode(String code) {
        for (CommonResultCodeEnum resultCode : values()) {
            if (resultCode.getCode().equals(code)) {
                return resultCode;
            }
        }
        return SYSTEM_ERROR;
    }
}
