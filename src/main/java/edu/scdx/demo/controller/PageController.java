package edu.scdx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 */
@Controller
public class PageController {

    /**
     * 页面跳转方法
     */
    @RequestMapping("/page/{path}")
    public String showPage(@PathVariable String path){

        return path;
    }

}
