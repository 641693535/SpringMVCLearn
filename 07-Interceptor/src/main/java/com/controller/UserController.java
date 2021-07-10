package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-08 22:45
 */
@Controller
@RequestMapping("/user")
public class UserController {

//    @RequestMapping("/toLogin")
//    public String toLogin() {
//        return "login";
//    }

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/Login")
    public String login(HttpSession session, String username, String password, Model model) {
        //如果用户已经登陆，还要进入Login页面，则重定向到main页面
        if (session.getAttribute("username") != null) {
            return "redirect:/user/main";
        }
        //如果传递的用户名和密码为空，则跳转到登陆页面
        if (username == null || password == null) {
            return "login";
        }
        //如果传入的为空字符，则重新登录
        if (username.length() <= 0 || password.length() <= 0) {
            return "login";
        }
        session.setAttribute("username", username);
        model.addAttribute("username", username);
        return "redirect:/user/main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session) {
        session.removeAttribute("username");
        return "redirect:/index.jsp";
    }
}
