package com.husky.ssm.controller;

import com.husky.ssm.dto.BookDTO;
import com.husky.ssm.dto.ResultModel;
import com.husky.ssm.request.BookPageRequest;
import com.husky.ssm.service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/11/14
 */
@Slf4j
@Controller
public class BookController {
    @Autowired
    private IBookService bookService;

    @ResponseBody
    @RequestMapping("/book/bookPageQuery.json")
    public ResultModel<List<BookDTO>> bookPageQuery(@RequestBody BookPageRequest req) {
        return bookService.bookPageQuery(req);
    }

    @RequestMapping("/book/test1")
    public ModelAndView bookPageQuery(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            String key = entry.getKey();
            String[] values = entry.getValue();
            log.info("key:" + key);
            log.info("value:");
            for (String s : values) {
                log.info(s);
            }
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("book/test1");
        String value1 = "value1";
        String value2 = "value2";
        modelAndView.addObject("value1", value1);
        modelAndView.addObject("value2", value2);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/book/test2.json")
    public ResultModel<List<BookDTO>> test2(BookPageRequest req) {
        log.info("req.getBookId():" + req.getBookId());
        return bookService.bookPageQuery(req);
    }

    @ResponseBody
    @RequestMapping("/book/test3")
    public ResultModel<List<BookDTO>> test3(String bookId, String bookName, String status) {
        log.info("bookId:" + bookId);
        log.info("bookName:" + bookName);
        log.info("status:" + status);
        BookPageRequest req = new BookPageRequest();
        return bookService.bookPageQuery(req);
    }

}
