package com.husky.ssm.request;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/12
 */
@Setter
@Getter
public class BookPageRequest extends BasePageRequest {
    /**
     * ID
     */
    private Long id;

    /**
     * 图书ID
     */
    private String bookId;

    /**
     * 图书名称
     */
    private String bookName;

    /**
     * 状态
     * PURCHASE:采购中
     * AVAILABLE:可借
     * BORROWED:已借
     * LOSE:丢失
     */
    private String status;
}
