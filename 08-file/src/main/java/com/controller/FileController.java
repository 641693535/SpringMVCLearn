package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-09 13:26
 */
@RestController
public class FileController {

    @RequestMapping("/upload")
    public String upload(){
        return "Hello";
    }

}
