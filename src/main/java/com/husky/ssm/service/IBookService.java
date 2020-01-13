package com.husky.ssm.service;

import com.husky.ssm.dto.BookDTO;
import com.husky.ssm.dto.ResultModel;
import com.husky.ssm.request.BookPageRequest;

import java.util.List;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/14
 */
public interface IBookService {
    ResultModel<List<BookDTO>> bookPageQuery(BookPageRequest req);
}
