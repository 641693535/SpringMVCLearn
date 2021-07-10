package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-04 14:09
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /*使用旧的Get链接方法传递并收取数据
     * http://localhost:8080/03_Controller/user/t1?name=abc*/
    @RequestMapping("/t1")
    public String userTest1(String name, Model model) {
        System.out.println("收到前端发送的数据:" + name);

        model.addAttribute("msg", name);

        return "myjsp";
    }

    /*从前端接收名为username的参数，并命名为name
     * http://localhost:8080/03_Controller/user/t2?username=abc*/
    @RequestMapping("/t2")
    public String userTest2(@RequestParam("username") String name, Model model) {
        System.out.println("收到前端发送的数据:" + name);

        model.addAttribute("msg", name);

        return "myjsp";
    }

    /*前端接收对象
    * 如果前端传递的参数与类的属性名一致，则可以直接用类接收，不一致则为null
    * */
    @RequestMapping("/t3")
    public String userTest3(User user, Model model) {
        System.out.println(user);
        model.addAttribute("msg", user.toString());
        return "myjsp";
    }
}
