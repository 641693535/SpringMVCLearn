package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-08 20:39
 */
@RestController
public class AjaxTest {

    @RequestMapping("/t1")
    public String testAjax() {
        return "test1";
    }

    @RequestMapping("/testa1")
    public String testA1(HttpServletResponse httpServletResponse, String name) throws IOException {
        if ("test".equalsIgnoreCase(name)) {
            httpServletResponse.getWriter().print("true");
        }else{
            httpServletResponse.getWriter().print("false");
        }
        return null;
    }
}
