package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-04 13:12
 */
@Controller
public class RestFulController {

    @RequestMapping("/add")
    public String addNum(int a, int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为：" + res);

        return "myjsp";
    }

//    @RequestMapping("/restfuladd/{a}/{b}")
    @RequestMapping(value = "/restfuladd/{a}/{b}",method = RequestMethod.GET)
    public String addRestFul(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为：" + res);

        return "myjsp";
    }
}
