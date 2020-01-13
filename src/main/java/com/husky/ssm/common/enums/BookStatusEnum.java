package com.husky.ssm.common.enums;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/12
 */
public enum BookStatusEnum {
    /**
     * 图书状态
     */
    
    PURCHASE("PURCHASE","采购中"),
    AVAILABLE("AVAILABLE","可借"),
    BORROWED("BORROWED","已借"),
    LOSE("LOSE","丢失"),
    SYSTEM_ERROR("999999","系统错误"),
    ;

    private final String code;
    private final String desc;

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    BookStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static BookStatusEnum getStatusEnum(String code) {
        for (BookStatusEnum statusEnum : values()) {
            if (statusEnum.code.equals(code)) {
                return statusEnum;
            }
        }
        return SYSTEM_ERROR;
    }
}
