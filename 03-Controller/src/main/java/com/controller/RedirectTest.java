package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-04 13:52
 */
@Controller
public class RedirectTest {

    @RequestMapping(value = "/redirect")
    public String redirectTest(Model model){
        model.addAttribute("msg", "HelloTest1");

        //转发
//        return "myjsp";

        //重定向
        return "redirect:index.jsp";
    }
}
