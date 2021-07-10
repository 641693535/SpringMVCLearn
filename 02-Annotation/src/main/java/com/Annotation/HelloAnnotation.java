package com.Annotation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-03 22:55
 */
//@RestController //Json解析器，类直接返回json字符串，而并非再调用jsp文件
@Controller
@RequestMapping("/annotation")//此时类中所有的url地址前都需要加上了/annotation
public class HelloAnnotation {

    @RequestMapping("/hellomvc")
    public String helloMVC(Model model){
        //封装数据
        model.addAttribute("msg", "Hello,SpringMVC-Annotation!");
        //返回给视图控制器
        return "hello";
    }

    @RequestMapping("/himvc")
    public String hiMVC(Model model){
        //封装数据
        model.addAttribute("msg", "Hi,SpringMVC-Annotation!");
        //返回给视图控制器
        return "Hi";
    }

}
