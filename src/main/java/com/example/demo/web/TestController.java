package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wancheng on 2018/7/2.
 */
@Controller
public class TestController {


    @RequestMapping("/index.do")
    public String greeting( Model model) {
        model.addAttribute("name", "sdsd");
        return "index";
    }
}
