package com.husky.ssm.dao.mapper;

import com.husky.ssm.dao.entity.Book;
import com.husky.ssm.dto.BookDTO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface BookMapper extends Mapper<Book> {
    /**
     * 图书分页查询
     * @param map
     * @return
     */
    List<BookDTO> bookPageQuery(Map<String,Object> map);
}