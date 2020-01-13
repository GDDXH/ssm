package com.husky.ssm.dao;

import com.alibaba.fastjson.JSON;
import com.husky.ssm.BaseTest;
import com.husky.ssm.request.BookPageRequest;
import com.husky.ssm.service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/15
 */
@Slf4j
public class BookServiceTest extends BaseTest {
    @Autowired
    private IBookService bookService;

    @Test
    public void BookPageQuery(){
        BookPageRequest req = new BookPageRequest();
        log.info(JSON.toJSONString(bookService.bookPageQuery(req)));
    }
}
