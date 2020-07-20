package edu.scdx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 27377-sun chao
 * @date 2020/7/19
 * @school SiChuan University
 */

@Controller
public class RegisterController {
    @RequestMapping("/register")
    public String register(String path){
        return "index";
    }
}