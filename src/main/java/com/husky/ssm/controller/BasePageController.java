package com.husky.ssm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author shency
 * @description: 通用路由页面
 */
@Controller
public class BasePageController {
    @GetMapping("/{first}/{second}.html")
    public String page(@PathVariable("first") String first,
                       @PathVariable("second") String second, HttpServletRequest request) {
        String url = first + "/" + second;
        return url;
    }

    @GetMapping("/{first}/{second}/{third}.html")
    public String page(@PathVariable("first") String first,
                       @PathVariable("second") String second,
                       @PathVariable("third") String third, HttpServletRequest request) {
        String url = first + "/" + second + "/" + third;
        return url;
    }
}
