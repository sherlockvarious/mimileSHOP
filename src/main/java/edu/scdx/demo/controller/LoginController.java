package edu.scdx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 27377-sun chao
 * @date 2020/7/21
 * @school SiChuan University
 */


@Controller
public class LoginController {

    @RequestMapping("/login")

    public String login() {
        return "login";
    }

}