package com.encoding;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-04 15:14
 */
@Controller
public class EncodingTest {

    @GetMapping("/e/t1")
    public String test1() {
        return "../../encodingtest";
    }

    @PostMapping("/e/t2")
    public String test2(@RequestParam("name") String name, Model model){
        model.addAttribute("msg", name);

        return "myjsp";
    }
}
