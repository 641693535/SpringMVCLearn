package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-04 12:55
 */
@Controller
public class MyController {

    @RequestMapping("/jsp")
    public String myJSP(Model model) {
        model.addAttribute("msg", "Hello,MyControllerJSP!");
        return "myjsp";
    }

}
