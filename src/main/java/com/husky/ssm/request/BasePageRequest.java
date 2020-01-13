package com.husky.ssm.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/12
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BasePageRequest extends BaseRequest {
    /**
     * 页码
     */
    private Integer page = 1;

    /**
     * 每页显示条数
     */
    private Integer limit = 10;

    /**
     * 查询开始时间
     */
    public String startTime;

    /**
     * 查询结束时间
     */
    public String endTime;

    /**
     * 偏移量
     */
    public Integer offset;

    public Integer getOffset() {
        return (page - 1) * limit;
    }
}
