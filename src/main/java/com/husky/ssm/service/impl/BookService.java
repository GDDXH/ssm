package com.husky.ssm.service.impl;

import com.husky.ssm.dao.entity.Book;
import com.husky.ssm.dao.mapper.BookMapper;
import com.husky.ssm.dto.BookDTO;
import com.husky.ssm.dto.ResultModel;
import com.husky.ssm.request.BookPageRequest;
import com.husky.ssm.service.IBookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/14
 */
@Service
public class BookService implements IBookService {
    @Autowired
    private BookMapper bookMapper;

    /**
     * 分页查询
     * @param req
     * @return
     */
    @Override
    public ResultModel<List<BookDTO>> bookPageQuery(BookPageRequest req) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", req.getId());
        map.put("bookId", req.getBookId());
        map.put("bookName",req.getBookName());
        map.put("status",req.getStatus());
        map.put("offset",req.getOffset());
        map.put("limit",req.getLimit());

        List<BookDTO> list = bookMapper.bookPageQuery(map);
        if(CollectionUtils.isEmpty(list)){
            list = new ArrayList<BookDTO>();
        }
        return new ResultModel<List<BookDTO>>().setSuccess(list);
    }

    /**
     * 新增
     * @param req
     */
    public void bookInsert(BookPageRequest req){
        Book book = new Book();
        BeanUtils.copyProperties(req, book);
        bookMapper.insert(book);
    }

    /**
     * 删除
     * @param req
     */
    public void bookDelete(BookPageRequest req){
        Book book = new Book();
        BeanUtils.copyProperties(req, book);
        bookMapper.delete(book);
    }

    /**
     * 更新
     * @param req
     */
    public void bookUpdate(BookPageRequest req){
        Book book = new Book();
        BeanUtils.copyProperties(req, book);
        bookMapper.updateByPrimaryKey(book);
    }
}
